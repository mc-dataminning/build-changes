import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dnj extends dnm {
   private static final Logger c = LogUtils.getLogger();
   private static final String d = "flower_pos";
   private static final String e = "bees";
   static final List<String> f = Arrays.asList(
      "Air",
      "ArmorDropChances",
      "ArmorItems",
      "Brain",
      "CanPickUpLoot",
      "DeathTime",
      "FallDistance",
      "FallFlying",
      "Fire",
      "HandDropChances",
      "HandItems",
      "HurtByTimestamp",
      "HurtTime",
      "LeftHanded",
      "Motion",
      "NoGravity",
      "OnGround",
      "PortalCooldown",
      "Pos",
      "Rotation",
      "CannotEnterHiveTicks",
      "TicksSincePollination",
      "CropsGrownSincePollination",
      "hive_pos",
      "Passengers",
      "leash",
      "UUID"
   );
   public static final int a = 3;
   private static final int g = 400;
   private static final int h = 2400;
   public static final int b = 600;
   private final List<dnj.a> i = Lists.newArrayList();
   @Nullable
   private in j;

   public dnj(in $$0, dqh $$1) {
      super(dno.H, $$0, $$1);
   }

   @Override
   public void e() {
      if (this.b()) {
         this.a(null, this.n.a_(this.az_()), dnj.b.c);
      }

      super.e();
   }

   public boolean b() {
      if (this.n == null) {
         return false;
      } else {
         for (in $$0 : in.c(this.o.b(-1, -1, -1), this.o.b(1, 1, 1))) {
            if (this.n.a_($$0).b() instanceof dge) {
               return true;
            }
         }

         return false;
      }
   }

   public boolean c() {
      return this.i.isEmpty();
   }

   public boolean d() {
      return this.i.size() == 3;
   }

   public void a(@Nullable clh $$0, dqh $$1, dnj.b $$2) {
      List<brh> $$3 = this.a($$1, $$2);
      if ($$0 != null) {
         for (brh $$4 : $$3) {
            if ($$4 instanceof cdq) {
               cdq $$5 = (cdq)$$4;
               if ($$0.dl().g($$4.dl()) <= 16.0) {
                  if (!this.j()) {
                     $$5.h($$0);
                  } else {
                     $$5.u(400);
                  }
               }
            }
         }
      }
   }

   private List<brh> a(dqh $$0, dnj.b $$1) {
      List<brh> $$2 = Lists.newArrayList();
      this.i.removeIf($$3 -> a(this.n, this.o, $$0, $$3.b(), $$2, $$1, this.j));
      if (!$$2.isEmpty()) {
         super.e();
      }

      return $$2;
   }

   @azc
   public int f() {
      return this.i.size();
   }

   public static int a(dqh $$0) {
      return $$0.c(dcy.c);
   }

   @azc
   public boolean j() {
      return dds.a(this.n, this.az_());
   }

   public void a(brh $$0) {
      if (this.i.size() < 3) {
         $$0.ac();
         $$0.bF();
         this.a(dnj.c.a($$0));
         if (this.n != null) {
            if ($$0 instanceof cdq $$1 && $$1.u() && (!this.k() || this.n.z.h())) {
               this.j = $$1.r();
            }

            in $$2 = this.az_();
            this.n.a(null, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), avc.bV, avd.e, 1.0F, 1.0F);
            this.n.a(dva.c, $$2, dva.a.a($$0, this.n()));
         }

         $$0.am();
         super.e();
      }
   }

   public void a(dnj.c $$0) {
      this.i.add(new dnj.a($$0));
   }

   private static boolean a(dad $$0, in $$1, dqh $$2, dnj.c $$3, @Nullable List<brh> $$4, dnj.b $$5, @Nullable in $$6) {
      if (($$0.R() || $$0.ac()) && $$5 != dnj.b.c) {
         return false;
      } else {
         is $$7 = $$2.c(dcy.b);
         in $$8 = $$1.a($$7);
         boolean $$9 = !$$0.a_($$8).k($$0, $$8).c();
         if ($$9 && $$5 != dnj.b.c) {
            return false;
         } else {
            brh $$10 = $$3.a($$0, $$1);
            if ($$10 != null) {
               if ($$10 instanceof cdq $$11) {
                  if ($$6 != null && !$$11.u() && $$0.z.i() < 0.9F) {
                     $$11.i($$6);
                  }

                  if ($$5 == dnj.b.a) {
                     $$11.gD();
                     if ($$2.a(avr.aG, $$0x -> $$0x.b(dcy.c))) {
                        int $$12 = a($$2);
                        if ($$12 < 5) {
                           int $$13 = $$0.z.a(100) == 0 ? 2 : 1;
                           if ($$12 + $$13 > 5) {
                              $$13--;
                           }

                           $$0.b($$1, $$2.a(dcy.c, Integer.valueOf($$12 + $$13)));
                        }
                     }
                  }

                  if ($$4 != null) {
                     $$4.add($$11);
                  }

                  float $$14 = $$10.dh();
                  double $$15 = $$9 ? 0.0 : 0.55 + (double)($$14 / 2.0F);
                  double $$16 = (double)$$1.u() + 0.5 + $$15 * (double)$$7.j();
                  double $$17 = (double)$$1.v() + 0.5 - (double)($$10.di() / 2.0F);
                  double $$18 = (double)$$1.w() + 0.5 + $$15 * (double)$$7.l();
                  $$10.b($$16, $$17, $$18, $$10.dD(), $$10.dF());
               }

               $$0.a(null, $$1, avc.bW, avd.e, 1.0F, 1.0F);
               $$0.a(dva.c, $$1, dva.a.a($$10, $$0.a_($$1)));
               return $$0.b($$10);
            } else {
               return false;
            }
         }
      }
   }

   private boolean k() {
      return this.j != null;
   }

   private static void a(dad $$0, in $$1, dqh $$2, List<dnj.a> $$3, @Nullable in $$4) {
      boolean $$5 = false;
      Iterator<dnj.a> $$6 = $$3.iterator();

      while ($$6.hasNext()) {
         dnj.a $$7 = $$6.next();
         if ($$7.a()) {
            dnj.b $$8 = $$7.c() ? dnj.b.a : dnj.b.b;
            if (a($$0, $$1, $$2, $$7.b(), null, $$8, $$4)) {
               $$5 = true;
               $$6.remove();
            }
         }
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dad $$0, in $$1, dqh $$2, dnj $$3) {
      a($$0, $$1, $$2, $$3.i, $$3.j);
      if (!$$3.i.isEmpty() && $$0.E_().j() < 0.005) {
         double $$4 = (double)$$1.u() + 0.5;
         double $$5 = (double)$$1.v();
         double $$6 = (double)$$1.w() + 0.5;
         $$0.a(null, $$4, $$5, $$6, avc.bY, avd.e, 1.0F, 1.0F);
      }

      afw.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ua $$0, iy.a $$1) {
      super.a($$0, $$1);
      this.i.clear();
      if ($$0.e("bees")) {
         dnj.c.b.parse(uo.a, $$0.c("bees")).resultOrPartial($$0x -> c.error("Failed to parse bees: '{}'", $$0x)).ifPresent($$0x -> $$0x.forEach(this::a));
      }

      this.j = up.a($$0, "flower_pos").orElse(null);
   }

   @Override
   protected void b(ua $$0, iy.a $$1) {
      super.b($$0, $$1);
      $$0.a("bees", ac.a(dnj.c.b.encodeStart(uo.a, this.l()), IllegalStateException::new));
      if (this.k()) {
         $$0.a("flower_pos", up.a(this.j));
      }
   }

   @Override
   public void a(jw $$0) {
      super.a($$0);
      this.i.clear();
      List<dnj.c> $$1 = $$0.a(ka.Z, List.of());
      $$1.forEach(this::a);
   }

   @Override
   public void a(jw.a $$0) {
      super.a($$0);
      $$0.a(ka.Z, this.l());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      $$0.r("bees");
   }

   private List<dnj.c> l() {
      return this.i.stream().map(dnj.a::b).toList();
   }

   static class a {
      private final dnj.c a;
      private int b;

      a(dnj.c $$0) {
         this.a = $$0;
         this.b = $$0.b();
      }

      public boolean a() {
         return this.b++ > this.a.f;
      }

      public dnj.c b() {
         return new dnj.c(this.a.d, this.b, this.a.f);
      }

      public boolean c() {
         return this.a.d.d().q("HasNectar");
      }
   }

   public static enum b {
      a,
      b,
      c;
   }

   public static record c(cvm d, int e, int f) {
      public static final Codec<dnj.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axh.a(cvm.b, "entity_data", cvm.a).forGetter(dnj.c::a),
                  Codec.INT.fieldOf("ticks_in_hive").forGetter(dnj.c::b),
                  Codec.INT.fieldOf("min_ticks_in_hive").forGetter(dnj.c::c)
               )
               .apply($$0, dnj.c::new)
      );
      public static final Codec<List<dnj.c>> b = a.listOf();
      public static final ys<ByteBuf, dnj.c> c = ys.a(cvm.d, dnj.c::a, yq.f, dnj.c::b, yq.f, dnj.c::c, dnj.c::new);

      public static dnj.c a(brh $$0) {
         ua $$1 = new ua();
         $$0.e($$1);
         dnj.f.forEach($$1::r);
         boolean $$2 = $$1.q("HasNectar");
         return new dnj.c(cvm.a($$1), 0, $$2 ? 2400 : 600);
      }

      public static dnj.c a(int $$0) {
         ua $$1 = new ua();
         $$1.a("id", ld.g.b(brn.h).toString());
         return new dnj.c(cvm.a($$1), $$0, 600);
      }

      @Nullable
      public brh a(dad $$0, in $$1) {
         ua $$2 = this.d.c();
         dnj.f.forEach($$2::r);
         brh $$3 = brn.a($$2, $$0, $$0x -> $$0x);
         if ($$3 != null && $$3.ai().a(avu.e)) {
            $$3.f(true);
            if ($$3 instanceof cdq $$4) {
               $$4.j($$1);
               a(this.e, $$4);
            }

            return $$3;
         } else {
            return null;
         }
      }

      private static void a(int $$0, cdq $$1) {
         int $$2 = $$1.g();
         if ($$2 < 0) {
            $$1.c_(Math.min(0, $$2 + $$0));
         } else if ($$2 > 0) {
            $$1.c_(Math.max(0, $$2 - $$0));
         }

         $$1.t(Math.max(0, $$1.gr() - $$0));
      }

      public cvm a() {
         return this.d;
      }

      public int b() {
         return this.e;
      }

      public int c() {
         return this.f;
      }
   }
}
