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

public class dmc extends dmf {
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
   private final List<dmc.a> i = Lists.newArrayList();
   @Nullable
   private ib j;

   public dmc(ib $$0, doz $$1) {
      super(dmh.H, $$0, $$1);
   }

   @Override
   public void e() {
      if (this.b()) {
         this.a(null, this.o.a_(this.aA_()), dmc.b.c);
      }

      super.e();
   }

   public boolean b() {
      if (this.o == null) {
         return false;
      } else {
         for (ib $$0 : ib.a(this.p.b(-1, -1, -1), this.p.b(1, 1, 1))) {
            if (this.o.a_($$0).b() instanceof dey) {
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

   public void a(@Nullable cjt $$0, doz $$1, dmc.b $$2) {
      List<bpv> $$3 = this.a($$1, $$2);
      if ($$0 != null) {
         for (bpv $$4 : $$3) {
            if ($$4 instanceof cce) {
               cce $$5 = (cce)$$4;
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

   private List<bpv> a(doz $$0, dmc.b $$1) {
      List<bpv> $$2 = Lists.newArrayList();
      this.i.removeIf($$3 -> a(this.o, this.p, $$0, $$3.b(), $$2, $$1, this.j));
      if (!$$2.isEmpty()) {
         super.e();
      }

      return $$2;
   }

   @ayn
   public int f() {
      return this.i.size();
   }

   public static int a(doz $$0) {
      return $$0.c(dbs.c);
   }

   @ayn
   public boolean j() {
      return dcm.a(this.o, this.aA_());
   }

   public void a(bpv $$0) {
      if (this.i.size() < 3) {
         $$0.ac();
         $$0.bE();
         this.a(dmc.c.a($$0));
         if (this.o != null) {
            if ($$0 instanceof cce $$1 && $$1.u() && (!this.k() || this.o.z.h())) {
               this.j = $$1.r();
            }

            ib $$2 = this.aA_();
            this.o.a(null, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), aum.bV, aun.e, 1.0F, 1.0F);
            this.o.a(dts.c, $$2, dts.a.a($$0, this.n()));
         }

         $$0.am();
         super.e();
      }
   }

   public void a(dmc.c $$0) {
      this.i.add(new dmc.a($$0));
   }

   private static boolean a(cyx $$0, ib $$1, doz $$2, dmc.c $$3, @Nullable List<bpv> $$4, dmc.b $$5, @Nullable ib $$6) {
      if (($$0.R() || $$0.ac()) && $$5 != dmc.b.c) {
         return false;
      } else {
         ih $$7 = $$2.c(dbs.b);
         ib $$8 = $$1.a($$7);
         boolean $$9 = !$$0.a_($$8).k($$0, $$8).c();
         if ($$9 && $$5 != dmc.b.c) {
            return false;
         } else {
            bpv $$10 = $$3.a($$0, $$1);
            if ($$10 != null) {
               if ($$10 instanceof cce $$11) {
                  if ($$6 != null && !$$11.u() && $$0.z.i() < 0.9F) {
                     $$11.i($$6);
                  }

                  if ($$5 == dmc.b.a) {
                     $$11.gB();
                     if ($$2.a(avc.aG, $$0x -> $$0x.b(dbs.c))) {
                        int $$12 = a($$2);
                        if ($$12 < 5) {
                           int $$13 = $$0.z.a(100) == 0 ? 2 : 1;
                           if ($$12 + $$13 > 5) {
                              $$13--;
                           }

                           $$0.b($$1, $$2.a(dbs.c, Integer.valueOf($$12 + $$13)));
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

               $$0.a(null, $$1, aum.bW, aun.e, 1.0F, 1.0F);
               $$0.a(dts.c, $$1, dts.a.a($$10, $$0.a_($$1)));
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

   private static void a(cyx $$0, ib $$1, doz $$2, List<dmc.a> $$3, @Nullable ib $$4) {
      boolean $$5 = false;
      Iterator<dmc.a> $$6 = $$3.iterator();

      while ($$6.hasNext()) {
         dmc.a $$7 = $$6.next();
         if ($$7.a()) {
            dmc.b $$8 = $$7.c() ? dmc.b.a : dmc.b.b;
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

   public static void a(cyx $$0, ib $$1, doz $$2, dmc $$3) {
      a($$0, $$1, $$2, $$3.i, $$3.j);
      if (!$$3.i.isEmpty() && $$0.E_().j() < 0.005) {
         double $$4 = (double)$$1.u() + 0.5;
         double $$5 = (double)$$1.v();
         double $$6 = (double)$$1.w() + 0.5;
         $$0.a(null, $$4, $$5, $$6, aum.bY, aun.e, 1.0F, 1.0F);
      }

      afi.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(tm $$0, in.a $$1) {
      super.a($$0, $$1);
      this.i.clear();
      if ($$0.e("bees")) {
         dmc.c.b.parse(ua.a, $$0.c("bees")).resultOrPartial($$0x -> c.error("Failed to parse bees: '{}'", $$0x)).ifPresent($$0x -> $$0x.forEach(this::a));
      }

      this.j = ub.a($$0, "flower_pos").orElse(null);
   }

   @Override
   protected void b(tm $$0, in.a $$1) {
      super.b($$0, $$1);
      $$0.a("bees", ac.a(dmc.c.b.encodeStart(ua.a, this.l()), IllegalStateException::new));
      if (this.k()) {
         $$0.a("flower_pos", ub.a(this.j));
      }
   }

   @Override
   public void a(jl $$0) {
      super.a($$0);
      this.i.clear();
      List<dmc.c> $$1 = $$0.a(jp.S, List.of());
      $$1.forEach(this::a);
   }

   @Override
   public void a(jl.a $$0) {
      super.a($$0);
      $$0.a(jp.S, this.l());
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      $$0.r("bees");
   }

   private List<dmc.c> l() {
      return this.i.stream().map(dmc.a::b).toList();
   }

   static class a {
      private final dmc.c a;
      private int b;

      a(dmc.c $$0) {
         this.a = $$0;
         this.b = $$0.b();
      }

      public boolean a() {
         return this.b++ > this.a.f;
      }

      public dmc.c b() {
         return new dmc.c(this.a.d, this.b, this.a.f);
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

   public static record c(ctt d, int e, int f) {
      public static final Codec<dmc.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aws.a(ctt.b, "entity_data", ctt.a).forGetter(dmc.c::a),
                  Codec.INT.fieldOf("ticks_in_hive").forGetter(dmc.c::b),
                  Codec.INT.fieldOf("min_ticks_in_hive").forGetter(dmc.c::c)
               )
               .apply($$0, dmc.c::new)
      );
      public static final Codec<List<dmc.c>> b = a.listOf();
      public static final ye<ByteBuf, dmc.c> c = ye.a(ctt.d, dmc.c::a, yc.f, dmc.c::b, yc.f, dmc.c::c, dmc.c::new);

      public static dmc.c a(bpv $$0) {
         tm $$1 = new tm();
         $$0.e($$1);
         dmc.f.forEach($$1::r);
         boolean $$2 = $$1.q("HasNectar");
         return new dmc.c(ctt.a($$1), 0, $$2 ? 2400 : 600);
      }

      public static dmc.c a(int $$0) {
         tm $$1 = new tm();
         $$1.a("id", kr.g.b(bqb.h).toString());
         return new dmc.c(ctt.a($$1), $$0, 600);
      }

      @Nullable
      public bpv a(cyx $$0, ib $$1) {
         tm $$2 = this.d.c();
         dmc.f.forEach($$2::r);
         bpv $$3 = bqb.a($$2, $$0, $$0x -> $$0x);
         if ($$3 != null && $$3.ai().a(avf.e)) {
            $$3.e(true);
            if ($$3 instanceof cce $$4) {
               $$4.j($$1);
               a(this.e, $$4);
            }

            return $$3;
         } else {
            return null;
         }
      }

      private static void a(int $$0, cce $$1) {
         int $$2 = $$1.g();
         if ($$2 < 0) {
            $$1.c_(Math.min(0, $$2 + $$0));
         } else if ($$2 > 0) {
            $$1.c_(Math.max(0, $$2 - $$0));
         }

         $$1.t(Math.max(0, $$1.gp() - $$0));
      }

      public ctt a() {
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
