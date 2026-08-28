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

public class duu extends dux {
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
   private final List<duu.a> i = Lists.newArrayList();
   @Nullable
   private jh j;

   public duu(jh $$0, dxv $$1) {
      super(duz.I, $$0, $$1);
   }

   @Override
   public void e() {
      if (this.b()) {
         this.a(null, this.o.a_(this.aB_()), duu.b.c);
      }

      super.e();
   }

   public boolean b() {
      if (this.o == null) {
         return false;
      } else {
         for (jh $$0 : jh.c(this.p.b(-1, -1, -1), this.p.b(1, 1, 1))) {
            if (this.o.a_($$0).b() instanceof dnn) {
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

   public void a(@Nullable cpx $$0, dxv $$1, duu.b $$2) {
      List<bvk> $$3 = this.a($$1, $$2);
      if ($$0 != null) {
         for (bvk $$4 : $$3) {
            if ($$4 instanceof chy) {
               chy $$5 = (chy)$$4;
               if ($$0.du().g($$4.du()) <= 16.0) {
                  if (!this.j()) {
                     $$5.h($$0);
                  } else {
                     $$5.s(400);
                  }
               }
            }
         }
      }
   }

   private List<bvk> a(dxv $$0, duu.b $$1) {
      List<bvk> $$2 = Lists.newArrayList();
      this.i.removeIf($$3 -> a(this.o, this.p, $$0, $$3.b(), $$2, $$1, this.j));
      if (!$$2.isEmpty()) {
         super.e();
      }

      return $$2;
   }

   @bbl
   public int f() {
      return this.i.size();
   }

   public static int a(dxv $$0) {
      return $$0.c(dkg.c);
   }

   @bbl
   public boolean j() {
      return dlb.a(this.o, this.aB_());
   }

   public void a(bvk $$0) {
      if (this.i.size() < 3) {
         $$0.ae();
         $$0.bP();
         this.a(duu.c.a($$0));
         if (this.o != null) {
            if ($$0 instanceof chy $$1 && $$1.t() && (!this.k() || this.o.A.h())) {
               this.j = $$1.p();
            }

            jh $$2 = this.aB_();
            this.o.a(null, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), axf.bV, axg.e, 1.0F, 1.0F);
            this.o.a(ecr.c, $$2, ecr.a.a($$0, this.m()));
         }

         $$0.at();
         super.e();
      }
   }

   public void a(duu.c $$0) {
      this.i.add(new duu.a($$0));
   }

   private static boolean a(dhi $$0, jh $$1, dxv $$2, duu.c $$3, @Nullable List<bvk> $$4, duu.b $$5, @Nullable jh $$6) {
      if (chy.c($$0) && $$5 != duu.b.c) {
         return false;
      } else {
         jm $$7 = $$2.c(dkg.b);
         jh $$8 = $$1.a($$7);
         boolean $$9 = !$$0.a_($$8).g($$0, $$8).c();
         if ($$9 && $$5 != duu.b.c) {
            return false;
         } else {
            bvk $$10 = $$3.a($$0, $$1);
            if ($$10 != null) {
               if ($$10 instanceof chy $$11) {
                  if ($$6 != null && !$$11.t() && $$0.A.i() < 0.9F) {
                     $$11.h($$6);
                  }

                  if ($$5 == duu.b.a) {
                     $$11.gE();
                     if ($$2.a(axu.aJ, $$0x -> $$0x.b(dkg.c))) {
                        int $$12 = a($$2);
                        if ($$12 < 5) {
                           int $$13 = $$0.A.a(100) == 0 ? 2 : 1;
                           if ($$12 + $$13 > 5) {
                              $$13--;
                           }

                           $$0.b($$1, $$2.b(dkg.c, Integer.valueOf($$12 + $$13)));
                        }
                     }
                  }

                  if ($$4 != null) {
                     $$4.add($$11);
                  }

                  float $$14 = $$10.dr();
                  double $$15 = $$9 ? 0.0 : 0.55 + (double)($$14 / 2.0F);
                  double $$16 = (double)$$1.u() + 0.5 + $$15 * (double)$$7.j();
                  double $$17 = (double)$$1.v() + 0.5 - (double)($$10.ds() / 2.0F);
                  double $$18 = (double)$$1.w() + 0.5 + $$15 * (double)$$7.l();
                  $$10.b($$16, $$17, $$18, $$10.dM(), $$10.dO());
               }

               $$0.a(null, $$1, axf.bW, axg.e, 1.0F, 1.0F);
               $$0.a(ecr.c, $$1, ecr.a.a($$10, $$0.a_($$1)));
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

   private static void a(dhi $$0, jh $$1, dxv $$2, List<duu.a> $$3, @Nullable jh $$4) {
      boolean $$5 = false;
      Iterator<duu.a> $$6 = $$3.iterator();

      while ($$6.hasNext()) {
         duu.a $$7 = $$6.next();
         if ($$7.a()) {
            duu.b $$8 = $$7.c() ? duu.b.a : duu.b.b;
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

   public static void a(dhi $$0, jh $$1, dxv $$2, duu $$3) {
      a($$0, $$1, $$2, $$3.i, $$3.j);
      if (!$$3.i.isEmpty() && $$0.H_().j() < 0.005) {
         double $$4 = (double)$$1.u() + 0.5;
         double $$5 = (double)$$1.v();
         double $$6 = (double)$$1.w() + 0.5;
         $$0.a(null, $$4, $$5, $$6, axf.bY, axg.e, 1.0F, 1.0F);
      }

      ahj.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ux $$0, js.a $$1) {
      super.a($$0, $$1);
      this.i.clear();
      if ($$0.e("bees")) {
         duu.c.b.parse(vl.a, $$0.c("bees")).resultOrPartial($$0x -> c.error("Failed to parse bees: '{}'", $$0x)).ifPresent($$0x -> $$0x.forEach(this::a));
      }

      this.j = vm.a($$0, "flower_pos").orElse(null);
   }

   @Override
   protected void b(ux $$0, js.a $$1) {
      super.b($$0, $$1);
      $$0.a("bees", (vu)duu.c.b.encodeStart(vl.a, this.t()).getOrThrow());
      if (this.k()) {
         $$0.a("flower_pos", vm.a(this.j));
      }
   }

   @Override
   protected void a(dux.b $$0) {
      super.a($$0);
      this.i.clear();
      List<duu.c> $$1 = $$0.a(ku.an, List.of());
      $$1.forEach(this::a);
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      $$0.a(ku.an, this.t());
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      $$0.r("bees");
   }

   private List<duu.c> t() {
      return this.i.stream().map(duu.a::b).toList();
   }

   static class a {
      private final duu.c a;
      private int b;

      a(duu.c $$0) {
         this.a = $$0;
         this.b = $$0.b();
      }

      public boolean a() {
         return this.b++ > this.a.f;
      }

      public duu.c b() {
         return new duu.c(this.a.d, this.b, this.a.f);
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

   public static record c(czy d, int e, int f) {
      public static final Codec<duu.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  czy.b.optionalFieldOf("entity_data", czy.a).forGetter(duu.c::a),
                  Codec.INT.fieldOf("ticks_in_hive").forGetter(duu.c::b),
                  Codec.INT.fieldOf("min_ticks_in_hive").forGetter(duu.c::c)
               )
               .apply($$0, duu.c::new)
      );
      public static final Codec<List<duu.c>> b = a.listOf();
      public static final zt<ByteBuf, duu.c> c = zt.a(czy.d, duu.c::a, zr.h, duu.c::b, zr.h, duu.c::c, duu.c::new);

      public static duu.c a(bvk $$0) {
         ux $$1 = new ux();
         $$0.e($$1);
         duu.f.forEach($$1::r);
         boolean $$2 = $$1.q("HasNectar");
         return new duu.c(czy.a($$1), 0, $$2 ? 2400 : 600);
      }

      public static duu.c a(int $$0) {
         ux $$1 = new ux();
         $$1.a("id", ma.f.b(bvr.l).toString());
         return new duu.c(czy.a($$1), $$0, 600);
      }

      @Nullable
      public bvk a(dhi $$0, jh $$1) {
         ux $$2 = this.d.c();
         duu.f.forEach($$2::r);
         bvk $$3 = bvr.a($$2, $$0, bvq.r, $$0x -> $$0x);
         if ($$3 != null && $$3.aq().a(axy.e)) {
            $$3.f(true);
            if ($$3 instanceof chy $$4) {
               $$4.i($$1);
               a(this.e, $$4);
            }

            return $$3;
         } else {
            return null;
         }
      }

      private static void a(int $$0, chy $$1) {
         int $$2 = $$1.Z_();
         if ($$2 < 0) {
            $$1.c_(Math.min(0, $$2 + $$0));
         } else if ($$2 > 0) {
            $$1.c_(Math.max(0, $$2 - $$0));
         }

         $$1.r(Math.max(0, $$1.gw() - $$0));
      }

      public czy a() {
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
