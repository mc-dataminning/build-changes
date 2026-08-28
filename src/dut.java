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

public class dut extends duw {
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
   private final List<dut.a> i = Lists.newArrayList();
   @Nullable
   private jh j;

   public dut(jh $$0, dxu $$1) {
      super(duy.I, $$0, $$1);
   }

   @Override
   public void e() {
      if (this.b()) {
         this.a(null, this.o.a_(this.aB_()), dut.b.c);
      }

      super.e();
   }

   public boolean b() {
      if (this.o == null) {
         return false;
      } else {
         for (jh $$0 : jh.c(this.p.b(-1, -1, -1), this.p.b(1, 1, 1))) {
            if (this.o.a_($$0).b() instanceof dnm) {
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

   public void a(@Nullable cpw $$0, dxu $$1, dut.b $$2) {
      List<bvj> $$3 = this.a($$1, $$2);
      if ($$0 != null) {
         for (bvj $$4 : $$3) {
            if ($$4 instanceof chx) {
               chx $$5 = (chx)$$4;
               if ($$0.dt().g($$4.dt()) <= 16.0) {
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

   private List<bvj> a(dxu $$0, dut.b $$1) {
      List<bvj> $$2 = Lists.newArrayList();
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

   public static int a(dxu $$0) {
      return $$0.c(dkf.c);
   }

   @bbl
   public boolean j() {
      return dla.a(this.o, this.aB_());
   }

   public void a(bvj $$0) {
      if (this.i.size() < 3) {
         $$0.ae();
         $$0.bP();
         this.a(dut.c.a($$0));
         if (this.o != null) {
            if ($$0 instanceof chx $$1 && $$1.t() && (!this.k() || this.o.A.h())) {
               this.j = $$1.p();
            }

            jh $$2 = this.aB_();
            this.o.a(null, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), axf.bV, axg.e, 1.0F, 1.0F);
            this.o.a(ecq.c, $$2, ecq.a.a($$0, this.m()));
         }

         $$0.at();
         super.e();
      }
   }

   public void a(dut.c $$0) {
      this.i.add(new dut.a($$0));
   }

   private static boolean a(dhh $$0, jh $$1, dxu $$2, dut.c $$3, @Nullable List<bvj> $$4, dut.b $$5, @Nullable jh $$6) {
      if (chx.c($$0) && $$5 != dut.b.c) {
         return false;
      } else {
         jm $$7 = $$2.c(dkf.b);
         jh $$8 = $$1.a($$7);
         boolean $$9 = !$$0.a_($$8).g($$0, $$8).c();
         if ($$9 && $$5 != dut.b.c) {
            return false;
         } else {
            bvj $$10 = $$3.a($$0, $$1);
            if ($$10 != null) {
               if ($$10 instanceof chx $$11) {
                  if ($$6 != null && !$$11.t() && $$0.A.i() < 0.9F) {
                     $$11.h($$6);
                  }

                  if ($$5 == dut.b.a) {
                     $$11.gC();
                     if ($$2.a(axu.aJ, $$0x -> $$0x.b(dkf.c))) {
                        int $$12 = a($$2);
                        if ($$12 < 5) {
                           int $$13 = $$0.A.a(100) == 0 ? 2 : 1;
                           if ($$12 + $$13 > 5) {
                              $$13--;
                           }

                           $$0.b($$1, $$2.b(dkf.c, Integer.valueOf($$12 + $$13)));
                        }
                     }
                  }

                  if ($$4 != null) {
                     $$4.add($$11);
                  }

                  float $$14 = $$10.dq();
                  double $$15 = $$9 ? 0.0 : 0.55 + (double)($$14 / 2.0F);
                  double $$16 = (double)$$1.u() + 0.5 + $$15 * (double)$$7.j();
                  double $$17 = (double)$$1.v() + 0.5 - (double)($$10.dr() / 2.0F);
                  double $$18 = (double)$$1.w() + 0.5 + $$15 * (double)$$7.l();
                  $$10.b($$16, $$17, $$18, $$10.dL(), $$10.dN());
               }

               $$0.a(null, $$1, axf.bW, axg.e, 1.0F, 1.0F);
               $$0.a(ecq.c, $$1, ecq.a.a($$10, $$0.a_($$1)));
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

   private static void a(dhh $$0, jh $$1, dxu $$2, List<dut.a> $$3, @Nullable jh $$4) {
      boolean $$5 = false;
      Iterator<dut.a> $$6 = $$3.iterator();

      while ($$6.hasNext()) {
         dut.a $$7 = $$6.next();
         if ($$7.a()) {
            dut.b $$8 = $$7.c() ? dut.b.a : dut.b.b;
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

   public static void a(dhh $$0, jh $$1, dxu $$2, dut $$3) {
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
         dut.c.b.parse(vl.a, $$0.c("bees")).resultOrPartial($$0x -> c.error("Failed to parse bees: '{}'", $$0x)).ifPresent($$0x -> $$0x.forEach(this::a));
      }

      this.j = vm.a($$0, "flower_pos").orElse(null);
   }

   @Override
   protected void b(ux $$0, js.a $$1) {
      super.b($$0, $$1);
      $$0.a("bees", (vu)dut.c.b.encodeStart(vl.a, this.t()).getOrThrow());
      if (this.k()) {
         $$0.a("flower_pos", vm.a(this.j));
      }
   }

   @Override
   protected void a(duw.b $$0) {
      super.a($$0);
      this.i.clear();
      List<dut.c> $$1 = $$0.a(ku.an, List.of());
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

   private List<dut.c> t() {
      return this.i.stream().map(dut.a::b).toList();
   }

   static class a {
      private final dut.c a;
      private int b;

      a(dut.c $$0) {
         this.a = $$0;
         this.b = $$0.b();
      }

      public boolean a() {
         return this.b++ > this.a.f;
      }

      public dut.c b() {
         return new dut.c(this.a.d, this.b, this.a.f);
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

   public static record c(czx d, int e, int f) {
      public static final Codec<dut.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  czx.b.optionalFieldOf("entity_data", czx.a).forGetter(dut.c::a),
                  Codec.INT.fieldOf("ticks_in_hive").forGetter(dut.c::b),
                  Codec.INT.fieldOf("min_ticks_in_hive").forGetter(dut.c::c)
               )
               .apply($$0, dut.c::new)
      );
      public static final Codec<List<dut.c>> b = a.listOf();
      public static final zt<ByteBuf, dut.c> c = zt.a(czx.d, dut.c::a, zr.h, dut.c::b, zr.h, dut.c::c, dut.c::new);

      public static dut.c a(bvj $$0) {
         ux $$1 = new ux();
         $$0.e($$1);
         dut.f.forEach($$1::r);
         boolean $$2 = $$1.q("HasNectar");
         return new dut.c(czx.a($$1), 0, $$2 ? 2400 : 600);
      }

      public static dut.c a(int $$0) {
         ux $$1 = new ux();
         $$1.a("id", ma.f.b(bvq.l).toString());
         return new dut.c(czx.a($$1), $$0, 600);
      }

      @Nullable
      public bvj a(dhh $$0, jh $$1) {
         ux $$2 = this.d.c();
         dut.f.forEach($$2::r);
         bvj $$3 = bvq.a($$2, $$0, bvp.r, $$0x -> $$0x);
         if ($$3 != null && $$3.aq().a(axy.e)) {
            $$3.f(true);
            if ($$3 instanceof chx $$4) {
               $$4.i($$1);
               a(this.e, $$4);
            }

            return $$3;
         } else {
            return null;
         }
      }

      private static void a(int $$0, chx $$1) {
         int $$2 = $$1.Z_();
         if ($$2 < 0) {
            $$1.c_(Math.min(0, $$2 + $$0));
         } else if ($$2 > 0) {
            $$1.c_(Math.max(0, $$2 - $$0));
         }

         $$1.r(Math.max(0, $$1.gu() - $$0));
      }

      public czx a() {
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
