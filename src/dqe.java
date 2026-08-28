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

public class dqe extends dqh {
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
      "SleepingX",
      "SleepingY",
      "SleepingZ",
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
   private final List<dqe.a> i = Lists.newArrayList();
   @Nullable
   private jd j;

   public dqe(jd $$0, dtc $$1) {
      super(dqj.H, $$0, $$1);
   }

   @Override
   public void e() {
      if (this.b()) {
         this.a(null, this.n.a_(this.aD_()), dqe.b.c);
      }

      super.e();
   }

   public boolean b() {
      if (this.n == null) {
         return false;
      } else {
         for (jd $$0 : jd.c(this.o.b(-1, -1, -1), this.o.b(1, 1, 1))) {
            if (this.n.a_($$0).b() instanceof diy) {
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

   public void a(@Nullable cmx $$0, dtc $$1, dqe.b $$2) {
      List<bsr> $$3 = this.a($$1, $$2);
      if ($$0 != null) {
         for (bsr $$4 : $$3) {
            if ($$4 instanceof cff) {
               cff $$5 = (cff)$$4;
               if ($$0.dm().g($$4.dm()) <= 16.0) {
                  if (!this.j()) {
                     $$5.h($$0);
                  } else {
                     $$5.t(400);
                  }
               }
            }
         }
      }
   }

   private List<bsr> a(dtc $$0, dqe.b $$1) {
      List<bsr> $$2 = Lists.newArrayList();
      this.i.removeIf($$3 -> a(this.n, this.o, $$0, $$3.b(), $$2, $$1, this.j));
      if (!$$2.isEmpty()) {
         super.e();
      }

      return $$2;
   }

   @azt
   public int f() {
      return this.i.size();
   }

   public static int a(dtc $$0) {
      return $$0.c(dfs.c);
   }

   @azt
   public boolean j() {
      return dgm.a(this.n, this.aD_());
   }

   public void a(bsr $$0) {
      if (this.i.size() < 3) {
         $$0.ad();
         $$0.bI();
         this.a(dqe.c.a($$0));
         if (this.n != null) {
            if ($$0 instanceof cff $$1 && $$1.t() && (!this.k() || this.n.z.h())) {
               this.j = $$1.s();
            }

            jd $$2 = this.aD_();
            this.n.a(null, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), avp.bV, avq.e, 1.0F, 1.0F);
            this.n.a(dxz.c, $$2, dxz.a.a($$0, this.n()));
         }

         $$0.aq();
         super.e();
      }
   }

   public void a(dqe.c $$0) {
      this.i.add(new dqe.a($$0));
   }

   private static boolean a(dcw $$0, jd $$1, dtc $$2, dqe.c $$3, @Nullable List<bsr> $$4, dqe.b $$5, @Nullable jd $$6) {
      if (($$0.S() || $$0.ad()) && $$5 != dqe.b.c) {
         return false;
      } else {
         ji $$7 = $$2.c(dfs.b);
         jd $$8 = $$1.a($$7);
         boolean $$9 = !$$0.a_($$8).k($$0, $$8).c();
         if ($$9 && $$5 != dqe.b.c) {
            return false;
         } else {
            bsr $$10 = $$3.a($$0, $$1);
            if ($$10 != null) {
               if ($$10 instanceof cff $$11) {
                  if ($$6 != null && !$$11.t() && $$0.z.i() < 0.9F) {
                     $$11.h($$6);
                  }

                  if ($$5 == dqe.b.a) {
                     $$11.gy();
                     if ($$2.a(awe.aH, $$0x -> $$0x.b(dfs.c))) {
                        int $$12 = a($$2);
                        if ($$12 < 5) {
                           int $$13 = $$0.z.a(100) == 0 ? 2 : 1;
                           if ($$12 + $$13 > 5) {
                              $$13--;
                           }

                           $$0.b($$1, $$2.a(dfs.c, Integer.valueOf($$12 + $$13)));
                        }
                     }
                  }

                  if ($$4 != null) {
                     $$4.add($$11);
                  }

                  float $$14 = $$10.dj();
                  double $$15 = $$9 ? 0.0 : 0.55 + (double)($$14 / 2.0F);
                  double $$16 = (double)$$1.u() + 0.5 + $$15 * (double)$$7.j();
                  double $$17 = (double)$$1.v() + 0.5 - (double)($$10.dk() / 2.0F);
                  double $$18 = (double)$$1.w() + 0.5 + $$15 * (double)$$7.l();
                  $$10.b($$16, $$17, $$18, $$10.dE(), $$10.dG());
               }

               $$0.a(null, $$1, avp.bW, avq.e, 1.0F, 1.0F);
               $$0.a(dxz.c, $$1, dxz.a.a($$10, $$0.a_($$1)));
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

   private static void a(dcw $$0, jd $$1, dtc $$2, List<dqe.a> $$3, @Nullable jd $$4) {
      boolean $$5 = false;
      Iterator<dqe.a> $$6 = $$3.iterator();

      while ($$6.hasNext()) {
         dqe.a $$7 = $$6.next();
         if ($$7.a()) {
            dqe.b $$8 = $$7.c() ? dqe.b.a : dqe.b.b;
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

   public static void a(dcw $$0, jd $$1, dtc $$2, dqe $$3) {
      a($$0, $$1, $$2, $$3.i, $$3.j);
      if (!$$3.i.isEmpty() && $$0.E_().j() < 0.005) {
         double $$4 = (double)$$1.u() + 0.5;
         double $$5 = (double)$$1.v();
         double $$6 = (double)$$1.w() + 0.5;
         $$0.a(null, $$4, $$5, $$6, avp.bY, avq.e, 1.0F, 1.0F);
      }

      agf.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ub $$0, jo.a $$1) {
      super.a($$0, $$1);
      this.i.clear();
      if ($$0.e("bees")) {
         dqe.c.b.parse(up.a, $$0.c("bees")).resultOrPartial($$0x -> c.error("Failed to parse bees: '{}'", $$0x)).ifPresent($$0x -> $$0x.forEach(this::a));
      }

      this.j = uq.a($$0, "flower_pos").orElse(null);
   }

   @Override
   protected void b(ub $$0, jo.a $$1) {
      super.b($$0, $$1);
      $$0.a("bees", (uy)dqe.c.b.encodeStart(up.a, this.l()).getOrThrow());
      if (this.k()) {
         $$0.a("flower_pos", uq.a(this.j));
      }
   }

   @Override
   protected void a(dqh.b $$0) {
      super.a($$0);
      this.i.clear();
      List<dqe.c> $$1 = $$0.a(kq.ad, List.of());
      $$1.forEach(this::a);
   }

   @Override
   protected void a(km.a $$0) {
      super.a($$0);
      $$0.a(kq.ad, this.l());
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      $$0.r("bees");
   }

   private List<dqe.c> l() {
      return this.i.stream().map(dqe.a::b).toList();
   }

   static class a {
      private final dqe.c a;
      private int b;

      a(dqe.c $$0) {
         this.a = $$0;
         this.b = $$0.b();
      }

      public boolean a() {
         return this.b++ > this.a.f;
      }

      public dqe.c b() {
         return new dqe.c(this.a.d, this.b, this.a.f);
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

   public static record c(cxh d, int e, int f) {
      public static final Codec<dqe.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cxh.b.optionalFieldOf("entity_data", cxh.a).forGetter(dqe.c::a),
                  Codec.INT.fieldOf("ticks_in_hive").forGetter(dqe.c::b),
                  Codec.INT.fieldOf("min_ticks_in_hive").forGetter(dqe.c::c)
               )
               .apply($$0, dqe.c::new)
      );
      public static final Codec<List<dqe.c>> b = a.listOf();
      public static final yx<ByteBuf, dqe.c> c = yx.a(cxh.d, dqe.c::a, yv.g, dqe.c::b, yv.g, dqe.c::c, dqe.c::new);

      public static dqe.c a(bsr $$0) {
         ub $$1 = new ub();
         $$0.e($$1);
         dqe.f.forEach($$1::r);
         boolean $$2 = $$1.q("HasNectar");
         return new dqe.c(cxh.a($$1), 0, $$2 ? 2400 : 600);
      }

      public static dqe.c a(int $$0) {
         ub $$1 = new ub();
         $$1.a("id", lt.f.b(bsx.h).toString());
         return new dqe.c(cxh.a($$1), $$0, 600);
      }

      @Nullable
      public bsr a(dcw $$0, jd $$1) {
         ub $$2 = this.d.c();
         dqe.f.forEach($$2::r);
         bsr $$3 = bsx.a($$2, $$0, $$0x -> $$0x);
         if ($$3 != null && $$3.am().a(awi.e)) {
            $$3.f(true);
            if ($$3 instanceof cff $$4) {
               $$4.i($$1);
               a(this.e, $$4);
            }

            return $$3;
         } else {
            return null;
         }
      }

      private static void a(int $$0, cff $$1) {
         int $$2 = $$1.g();
         if ($$2 < 0) {
            $$1.c_(Math.min(0, $$2 + $$0));
         } else if ($$2 > 0) {
            $$1.c_(Math.max(0, $$2 - $$0));
         }

         $$1.s(Math.max(0, $$1.gq() - $$0));
      }

      public cxh a() {
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
