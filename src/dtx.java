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

public class dtx extends dua {
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
   private final List<dtx.a> i = Lists.newArrayList();
   @Nullable
   private ji j;

   public dtx(ji $$0, dwy $$1) {
      super(duc.I, $$0, $$1);
   }

   @Override
   public void e() {
      if (this.b()) {
         this.a(null, this.n.a_(this.aA_()), dtx.b.c);
      }

      super.e();
   }

   public boolean b() {
      if (this.n == null) {
         return false;
      } else {
         for (ji $$0 : ji.c(this.o.b(-1, -1, -1), this.o.b(1, 1, 1))) {
            if (this.n.a_($$0).b() instanceof dmo) {
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

   public void a(@Nullable coy $$0, dwy $$1, dtx.b $$2) {
      List<bum> $$3 = this.a($$1, $$2);
      if ($$0 != null) {
         for (bum $$4 : $$3) {
            if ($$4 instanceof cha) {
               cha $$5 = (cha)$$4;
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

   private List<bum> a(dwy $$0, dtx.b $$1) {
      List<bum> $$2 = Lists.newArrayList();
      this.i.removeIf($$3 -> a(this.n, this.o, $$0, $$3.b(), $$2, $$1, this.j));
      if (!$$2.isEmpty()) {
         super.e();
      }

      return $$2;
   }

   @bag
   public int f() {
      return this.i.size();
   }

   public static int a(dwy $$0) {
      return $$0.c(djh.c);
   }

   @bag
   public boolean j() {
      return dkc.a(this.n, this.aA_());
   }

   public void a(cha $$0) {
      if (this.i.size() < 3) {
         $$0.ae();
         $$0.bP();
         $$0.z();
         this.a(dtx.c.a($$0));
         if (this.n != null) {
            if ($$0.t() && (!this.k() || this.n.A.h())) {
               this.j = $$0.p();
            }

            ji $$1 = this.aA_();
            this.n.a(null, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), awa.bV, awb.e, 1.0F, 1.0F);
            this.n.a(ebu.c, $$1, ebu.a.a($$0, this.m()));
         }

         $$0.at();
         super.e();
      }
   }

   public void a(dtx.c $$0) {
      this.i.add(new dtx.a($$0));
   }

   private static boolean a(dgj $$0, ji $$1, dwy $$2, dtx.c $$3, @Nullable List<bum> $$4, dtx.b $$5, @Nullable ji $$6) {
      if (cha.c($$0) && $$5 != dtx.b.c) {
         return false;
      } else {
         jn $$7 = $$2.c(djh.b);
         ji $$8 = $$1.a($$7);
         boolean $$9 = !$$0.a_($$8).g($$0, $$8).c();
         if ($$9 && $$5 != dtx.b.c) {
            return false;
         } else {
            bum $$10 = $$3.a($$0, $$1);
            if ($$10 != null) {
               if ($$10 instanceof cha $$11) {
                  if ($$6 != null && !$$11.t() && $$0.A.i() < 0.9F) {
                     $$11.h($$6);
                  }

                  if ($$5 == dtx.b.a) {
                     $$11.gI();
                     if ($$2.a(awp.aJ, $$0x -> $$0x.b(djh.c))) {
                        int $$12 = a($$2);
                        if ($$12 < 5) {
                           int $$13 = $$0.A.a(100) == 0 ? 2 : 1;
                           if ($$12 + $$13 > 5) {
                              $$13--;
                           }

                           $$0.b($$1, $$2.b(djh.c, Integer.valueOf($$12 + $$13)));
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

               $$0.a(null, $$1, awa.bW, awb.e, 1.0F, 1.0F);
               $$0.a(ebu.c, $$1, ebu.a.a($$10, $$0.a_($$1)));
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

   private static void a(dgj $$0, ji $$1, dwy $$2, List<dtx.a> $$3, @Nullable ji $$4) {
      boolean $$5 = false;
      Iterator<dtx.a> $$6 = $$3.iterator();

      while ($$6.hasNext()) {
         dtx.a $$7 = $$6.next();
         if ($$7.a()) {
            dtx.b $$8 = $$7.c() ? dtx.b.a : dtx.b.b;
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

   public static void a(dgj $$0, ji $$1, dwy $$2, dtx $$3) {
      a($$0, $$1, $$2, $$3.i, $$3.j);
      if (!$$3.i.isEmpty() && $$0.H_().j() < 0.005) {
         double $$4 = (double)$$1.u() + 0.5;
         double $$5 = (double)$$1.v();
         double $$6 = (double)$$1.w() + 0.5;
         $$0.a(null, $$4, $$5, $$6, awa.bY, awb.e, 1.0F, 1.0F);
      }

      agd.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.i.clear();
      if ($$0.e("bees")) {
         dtx.c.b.parse(ue.a, $$0.c("bees")).resultOrPartial($$0x -> c.error("Failed to parse bees: '{}'", $$0x)).ifPresent($$0x -> $$0x.forEach(this::a));
      }

      this.j = uf.a($$0, "flower_pos").orElse(null);
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      $$0.a("bees", (un)dtx.c.b.encodeStart(ue.a, this.s()).getOrThrow());
      if (this.k()) {
         $$0.a("flower_pos", uf.a(this.j));
      }
   }

   @Override
   protected void a(dua.b $$0) {
      super.a($$0);
      this.i.clear();
      List<dtx.c> $$1 = $$0.a(kv.an, List.of());
      $$1.forEach(this::a);
   }

   @Override
   protected void a(kr.a $$0) {
      super.a($$0);
      $$0.a(kv.an, this.s());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      $$0.r("bees");
   }

   private List<dtx.c> s() {
      return this.i.stream().map(dtx.a::b).toList();
   }

   static class a {
      private final dtx.c a;
      private int b;

      a(dtx.c $$0) {
         this.a = $$0;
         this.b = $$0.b();
      }

      public boolean a() {
         return this.b++ > this.a.f;
      }

      public dtx.c b() {
         return new dtx.c(this.a.d, this.b, this.a.f);
      }

      public boolean c() {
         return this.a.d.e().q("HasNectar");
      }
   }

   public static enum b {
      a,
      b,
      c;
   }

   public static record c(cyz d, int e, int f) {
      public static final Codec<dtx.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cyz.b.optionalFieldOf("entity_data", cyz.a).forGetter(dtx.c::a),
                  Codec.INT.fieldOf("ticks_in_hive").forGetter(dtx.c::b),
                  Codec.INT.fieldOf("min_ticks_in_hive").forGetter(dtx.c::c)
               )
               .apply($$0, dtx.c::new)
      );
      public static final Codec<List<dtx.c>> b = a.listOf();
      public static final yn<ByteBuf, dtx.c> c = yn.a(cyz.d, dtx.c::a, yl.h, dtx.c::b, yl.h, dtx.c::c, dtx.c::new);

      public static dtx.c a(bum $$0) {
         tq $$1 = new tq();
         $$0.e($$1);
         dtx.f.forEach($$1::r);
         boolean $$2 = $$1.q("HasNectar");
         return new dtx.c(cyz.a($$1), 0, $$2 ? 2400 : 600);
      }

      public static dtx.c a(int $$0) {
         tq $$1 = new tq();
         $$1.a("id", mb.f.b(but.l).toString());
         return new dtx.c(cyz.a($$1), $$0, 600);
      }

      @Nullable
      public bum a(dgj $$0, ji $$1) {
         tq $$2 = this.d.d();
         dtx.f.forEach($$2::r);
         bum $$3 = but.a($$2, $$0, bus.r, $$0x -> $$0x);
         if ($$3 != null && $$3.aq().a(awt.e)) {
            $$3.f(true);
            if ($$3 instanceof cha $$4) {
               $$4.i($$1);
               a(this.e, $$4);
            }

            return $$3;
         } else {
            return null;
         }
      }

      private static void a(int $$0, cha $$1) {
         int $$2 = $$1.Y_();
         if ($$2 < 0) {
            $$1.c_(Math.min(0, $$2 + $$0));
         } else if ($$2 > 0) {
            $$1.c_(Math.max(0, $$2 - $$0));
         }

         $$1.r(Math.max(0, $$1.gA() - $$0));
      }

      public cyz a() {
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
