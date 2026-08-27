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

public class dml extends dmo {
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
   private final List<dml.a> i = Lists.newArrayList();
   @Nullable
   private id j;

   public dml(id $$0, dpi $$1) {
      super(dmq.H, $$0, $$1);
   }

   @Override
   public void e() {
      if (this.b()) {
         this.a(null, this.o.a_(this.az_()), dml.b.c);
      }

      super.e();
   }

   public boolean b() {
      if (this.o == null) {
         return false;
      } else {
         for (id $$0 : id.a(this.p.b(-1, -1, -1), this.p.b(1, 1, 1))) {
            if (this.o.a_($$0).b() instanceof dfh) {
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

   public void a(@Nullable cka $$0, dpi $$1, dml.b $$2) {
      List<bqa> $$3 = this.a($$1, $$2);
      if ($$0 != null) {
         for (bqa $$4 : $$3) {
            if ($$4 instanceof ccj) {
               ccj $$5 = (ccj)$$4;
               if ($$0.dk().g($$4.dk()) <= 16.0) {
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

   private List<bqa> a(dpi $$0, dml.b $$1) {
      List<bqa> $$2 = Lists.newArrayList();
      this.i.removeIf($$3 -> a(this.o, this.p, $$0, $$3.b(), $$2, $$1, this.j));
      if (!$$2.isEmpty()) {
         super.e();
      }

      return $$2;
   }

   @ayp
   public int f() {
      return this.i.size();
   }

   public static int a(dpi $$0) {
      return $$0.c(dcb.c);
   }

   @ayp
   public boolean j() {
      return dcv.a(this.o, this.az_());
   }

   public void a(bqa $$0) {
      if (this.i.size() < 3) {
         $$0.ac();
         $$0.bE();
         this.a(dml.c.a($$0));
         if (this.o != null) {
            if ($$0 instanceof ccj $$1 && $$1.u() && (!this.k() || this.o.z.h())) {
               this.j = $$1.r();
            }

            id $$2 = this.az_();
            this.o.a(null, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), auo.bV, aup.e, 1.0F, 1.0F);
            this.o.a(dub.c, $$2, dub.a.a($$0, this.n()));
         }

         $$0.am();
         super.e();
      }
   }

   public void a(dml.c $$0) {
      this.i.add(new dml.a($$0));
   }

   private static boolean a(czg $$0, id $$1, dpi $$2, dml.c $$3, @Nullable List<bqa> $$4, dml.b $$5, @Nullable id $$6) {
      if (($$0.R() || $$0.ac()) && $$5 != dml.b.c) {
         return false;
      } else {
         ij $$7 = $$2.c(dcb.b);
         id $$8 = $$1.a($$7);
         boolean $$9 = !$$0.a_($$8).k($$0, $$8).c();
         if ($$9 && $$5 != dml.b.c) {
            return false;
         } else {
            bqa $$10 = $$3.a($$0, $$1);
            if ($$10 != null) {
               if ($$10 instanceof ccj $$11) {
                  if ($$6 != null && !$$11.u() && $$0.z.i() < 0.9F) {
                     $$11.i($$6);
                  }

                  if ($$5 == dml.b.a) {
                     $$11.gB();
                     if ($$2.a(ave.aG, $$0x -> $$0x.b(dcb.c))) {
                        int $$12 = a($$2);
                        if ($$12 < 5) {
                           int $$13 = $$0.z.a(100) == 0 ? 2 : 1;
                           if ($$12 + $$13 > 5) {
                              $$13--;
                           }

                           $$0.b($$1, $$2.a(dcb.c, Integer.valueOf($$12 + $$13)));
                        }
                     }
                  }

                  if ($$4 != null) {
                     $$4.add($$11);
                  }

                  float $$14 = $$10.dg();
                  double $$15 = $$9 ? 0.0 : 0.55 + (double)($$14 / 2.0F);
                  double $$16 = (double)$$1.u() + 0.5 + $$15 * (double)$$7.j();
                  double $$17 = (double)$$1.v() + 0.5 - (double)($$10.dh() / 2.0F);
                  double $$18 = (double)$$1.w() + 0.5 + $$15 * (double)$$7.l();
                  $$10.b($$16, $$17, $$18, $$10.dC(), $$10.dE());
               }

               $$0.a(null, $$1, auo.bW, aup.e, 1.0F, 1.0F);
               $$0.a(dub.c, $$1, dub.a.a($$10, $$0.a_($$1)));
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

   private static void a(czg $$0, id $$1, dpi $$2, List<dml.a> $$3, @Nullable id $$4) {
      boolean $$5 = false;
      Iterator<dml.a> $$6 = $$3.iterator();

      while ($$6.hasNext()) {
         dml.a $$7 = $$6.next();
         if ($$7.a()) {
            dml.b $$8 = $$7.c() ? dml.b.a : dml.b.b;
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

   public static void a(czg $$0, id $$1, dpi $$2, dml $$3) {
      a($$0, $$1, $$2, $$3.i, $$3.j);
      if (!$$3.i.isEmpty() && $$0.E_().j() < 0.005) {
         double $$4 = (double)$$1.u() + 0.5;
         double $$5 = (double)$$1.v();
         double $$6 = (double)$$1.w() + 0.5;
         $$0.a(null, $$4, $$5, $$6, auo.bY, aup.e, 1.0F, 1.0F);
      }

      afk.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(to $$0, ip.a $$1) {
      super.a($$0, $$1);
      this.i.clear();
      if ($$0.e("bees")) {
         dml.c.b.parse(uc.a, $$0.c("bees")).resultOrPartial($$0x -> c.error("Failed to parse bees: '{}'", $$0x)).ifPresent($$0x -> $$0x.forEach(this::a));
      }

      this.j = ud.a($$0, "flower_pos").orElse(null);
   }

   @Override
   protected void b(to $$0, ip.a $$1) {
      super.b($$0, $$1);
      $$0.a("bees", ac.a(dml.c.b.encodeStart(uc.a, this.l()), IllegalStateException::new));
      if (this.k()) {
         $$0.a("flower_pos", ud.a(this.j));
      }
   }

   @Override
   public void a(jn $$0) {
      super.a($$0);
      this.i.clear();
      List<dml.c> $$1 = $$0.a(jr.S, List.of());
      $$1.forEach(this::a);
   }

   @Override
   public void a(jn.a $$0) {
      super.a($$0);
      $$0.a(jr.S, this.l());
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      $$0.r("bees");
   }

   private List<dml.c> l() {
      return this.i.stream().map(dml.a::b).toList();
   }

   static class a {
      private final dml.c a;
      private int b;

      a(dml.c $$0) {
         this.a = $$0;
         this.b = $$0.b();
      }

      public boolean a() {
         return this.b++ > this.a.f;
      }

      public dml.c b() {
         return new dml.c(this.a.d, this.b, this.a.f);
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

   public static record c(cuc d, int e, int f) {
      public static final Codec<dml.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  awu.a(cuc.b, "entity_data", cuc.a).forGetter(dml.c::a),
                  Codec.INT.fieldOf("ticks_in_hive").forGetter(dml.c::b),
                  Codec.INT.fieldOf("min_ticks_in_hive").forGetter(dml.c::c)
               )
               .apply($$0, dml.c::new)
      );
      public static final Codec<List<dml.c>> b = a.listOf();
      public static final yg<ByteBuf, dml.c> c = yg.a(cuc.d, dml.c::a, ye.f, dml.c::b, ye.f, dml.c::c, dml.c::new);

      public static dml.c a(bqa $$0) {
         to $$1 = new to();
         $$0.e($$1);
         dml.f.forEach($$1::r);
         boolean $$2 = $$1.q("HasNectar");
         return new dml.c(cuc.a($$1), 0, $$2 ? 2400 : 600);
      }

      public static dml.c a(int $$0) {
         to $$1 = new to();
         $$1.a("id", kt.g.b(bqg.h).toString());
         return new dml.c(cuc.a($$1), $$0, 600);
      }

      @Nullable
      public bqa a(czg $$0, id $$1) {
         to $$2 = this.d.c();
         dml.f.forEach($$2::r);
         bqa $$3 = bqg.a($$2, $$0, $$0x -> $$0x);
         if ($$3 != null && $$3.ai().a(avh.e)) {
            $$3.e(true);
            if ($$3 instanceof ccj $$4) {
               $$4.j($$1);
               a(this.e, $$4);
            }

            return $$3;
         } else {
            return null;
         }
      }

      private static void a(int $$0, ccj $$1) {
         int $$2 = $$1.g();
         if ($$2 < 0) {
            $$1.c_(Math.min(0, $$2 + $$0));
         } else if ($$2 > 0) {
            $$1.c_(Math.max(0, $$2 - $$0));
         }

         $$1.t(Math.max(0, $$1.gp() - $$0));
      }

      public cuc a() {
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
