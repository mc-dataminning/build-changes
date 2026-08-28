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

public class dup extends dus {
   private static final Logger c = LogUtils.getLogger();
   private static final String d = "flower_pos";
   private static final String e = "bees";
   static final List<String> f = Arrays.asList(
      "Air",
      "drop_chances",
      "ArmorItems",
      "Brain",
      "CanPickUpLoot",
      "DeathTime",
      "FallDistance",
      "FallFlying",
      "Fire",
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
   private final List<dup.a> i = Lists.newArrayList();
   @Nullable
   private ji j;

   public dup(ji $$0, dxq $$1) {
      super(duu.I, $$0, $$1);
   }

   @Override
   public void e() {
      if (this.b()) {
         this.a(null, this.n.a_(this.aA_()), dup.b.c);
      }

      super.e();
   }

   public boolean b() {
      if (this.n == null) {
         return false;
      } else {
         for (ji $$0 : ji.c(this.o.b(-1, -1, -1), this.o.b(1, 1, 1))) {
            if (this.n.a_($$0).b() instanceof dnf) {
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

   public void a(@Nullable cpr $$0, dxq $$1, dup.b $$2) {
      List<bva> $$3 = this.a($$1, $$2);
      if ($$0 != null) {
         for (bva $$4 : $$3) {
            if ($$4 instanceof chq) {
               chq $$5 = (chq)$$4;
               if ($$0.ds().g($$4.ds()) <= 16.0) {
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

   private List<bva> a(dxq $$0, dup.b $$1) {
      List<bva> $$2 = Lists.newArrayList();
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

   public static int a(dxq $$0) {
      return $$0.c(djy.c);
   }

   @bag
   public boolean j() {
      return dkt.a(this.n, this.aA_());
   }

   public void a(chq $$0) {
      if (this.i.size() < 3) {
         $$0.bO();
         $$0.bN();
         $$0.y();
         this.a(dup.c.a($$0));
         if (this.n != null) {
            if ($$0.t() && (!this.k() || this.n.A.h())) {
               this.j = $$0.q();
            }

            ji $$1 = this.aA_();
            this.n.a(null, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), awa.bV, awb.e, 1.0F, 1.0F);
            this.n.a(ecp.c, $$1, ecp.a.a($$0, this.m()));
         }

         $$0.at();
         super.e();
      }
   }

   public void a(dup.c $$0) {
      this.i.add(new dup.a($$0));
   }

   private static boolean a(dgz $$0, ji $$1, dxq $$2, dup.c $$3, @Nullable List<bva> $$4, dup.b $$5, @Nullable ji $$6) {
      if (chq.c($$0) && $$5 != dup.b.c) {
         return false;
      } else {
         jn $$7 = $$2.c(djy.b);
         ji $$8 = $$1.a($$7);
         boolean $$9 = !$$0.a_($$8).g($$0, $$8).c();
         if ($$9 && $$5 != dup.b.c) {
            return false;
         } else {
            bva $$10 = $$3.a($$0, $$1);
            if ($$10 != null) {
               if ($$10 instanceof chq $$11) {
                  if ($$6 != null && !$$11.t() && $$0.A.i() < 0.9F) {
                     $$11.i($$6);
                  }

                  if ($$5 == dup.b.a) {
                     $$11.gI();
                     if ($$2.a(awp.aJ, $$0x -> $$0x.b(djy.c))) {
                        int $$12 = a($$2);
                        if ($$12 < 5) {
                           int $$13 = $$0.A.a(100) == 0 ? 2 : 1;
                           if ($$12 + $$13 > 5) {
                              $$13--;
                           }

                           $$0.b($$1, $$2.b(djy.c, Integer.valueOf($$12 + $$13)));
                        }
                     }
                  }

                  if ($$4 != null) {
                     $$4.add($$11);
                  }

                  float $$14 = $$10.dp();
                  double $$15 = $$9 ? 0.0 : 0.55 + (double)($$14 / 2.0F);
                  double $$16 = (double)$$1.u() + 0.5 + $$15 * (double)$$7.j();
                  double $$17 = (double)$$1.v() + 0.5 - (double)($$10.dq() / 2.0F);
                  double $$18 = (double)$$1.w() + 0.5 + $$15 * (double)$$7.l();
                  $$10.b($$16, $$17, $$18, $$10.dK(), $$10.dM());
               }

               $$0.a(null, $$1, awa.bW, awb.e, 1.0F, 1.0F);
               $$0.a(ecp.c, $$1, ecp.a.a($$10, $$0.a_($$1)));
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

   private static void a(dgz $$0, ji $$1, dxq $$2, List<dup.a> $$3, @Nullable ji $$4) {
      boolean $$5 = false;
      Iterator<dup.a> $$6 = $$3.iterator();

      while ($$6.hasNext()) {
         dup.a $$7 = $$6.next();
         if ($$7.a()) {
            dup.b $$8 = $$7.c() ? dup.b.a : dup.b.b;
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

   public static void a(dgz $$0, ji $$1, dxq $$2, dup $$3) {
      a($$0, $$1, $$2, $$3.i, $$3.j);
      if (!$$3.i.isEmpty() && $$0.C_().j() < 0.005) {
         double $$4 = (double)$$1.u() + 0.5;
         double $$5 = (double)$$1.v();
         double $$6 = (double)$$1.w() + 0.5;
         $$0.a(null, $$4, $$5, $$6, awa.bY, awb.e, 1.0F, 1.0F);
      }

      agc.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.i.clear();
      if ($$0.e("bees")) {
         dup.c.b.parse(ue.a, $$0.c("bees")).resultOrPartial($$0x -> c.error("Failed to parse bees: '{}'", $$0x)).ifPresent($$0x -> $$0x.forEach(this::a));
      }

      this.j = uf.a($$0, "flower_pos").orElse(null);
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      $$0.a("bees", (un)dup.c.b.encodeStart(ue.a, this.s()).getOrThrow());
      if (this.k()) {
         $$0.a("flower_pos", uf.a(this.j));
      }
   }

   @Override
   protected void a(dus.b $$0) {
      super.a($$0);
      this.i.clear();
      List<dup.c> $$1 = $$0.a(kv.ap, List.of());
      $$1.forEach(this::a);
   }

   @Override
   protected void a(kr.a $$0) {
      super.a($$0);
      $$0.a(kv.ap, this.s());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      $$0.r("bees");
   }

   private List<dup.c> s() {
      return this.i.stream().map(dup.a::b).toList();
   }

   static class a {
      private final dup.c a;
      private int b;

      a(dup.c $$0) {
         this.a = $$0;
         this.b = $$0.b();
      }

      public boolean a() {
         return this.b++ > this.a.f;
      }

      public dup.c b() {
         return new dup.c(this.a.d, this.b, this.a.f);
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

   public static record c(czo d, int e, int f) {
      public static final Codec<dup.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  czo.b.optionalFieldOf("entity_data", czo.a).forGetter(dup.c::a),
                  Codec.INT.fieldOf("ticks_in_hive").forGetter(dup.c::b),
                  Codec.INT.fieldOf("min_ticks_in_hive").forGetter(dup.c::c)
               )
               .apply($$0, dup.c::new)
      );
      public static final Codec<List<dup.c>> b = a.listOf();
      public static final yn<ByteBuf, dup.c> c = yn.a(czo.d, dup.c::a, yl.h, dup.c::b, yl.h, dup.c::c, dup.c::new);

      public static dup.c a(bva $$0) {
         tq $$1 = new tq();
         $$0.e($$1);
         dup.f.forEach($$1::r);
         boolean $$2 = $$1.q("HasNectar");
         return new dup.c(czo.a($$1), 0, $$2 ? 2400 : 600);
      }

      public static dup.c a(int $$0) {
         tq $$1 = new tq();
         $$1.a("id", mb.f.b(bvi.l).toString());
         return new dup.c(czo.a($$1), $$0, 600);
      }

      @Nullable
      public bva a(dgz $$0, ji $$1) {
         tq $$2 = this.d.d();
         dup.f.forEach($$2::r);
         bva $$3 = bvi.a($$2, $$0, bvh.r, $$0x -> $$0x);
         if ($$3 != null && $$3.aq().a(awt.e)) {
            $$3.f(true);
            if ($$3 instanceof chq $$4) {
               $$4.j($$1);
               a(this.e, $$4);
            }

            return $$3;
         } else {
            return null;
         }
      }

      private static void a(int $$0, chq $$1) {
         int $$2 = $$1.g();
         if ($$2 < 0) {
            $$1.c_(Math.min(0, $$2 + $$0));
         } else if ($$2 > 0) {
            $$1.c_(Math.max(0, $$2 - $$0));
         }

         $$1.r(Math.max(0, $$1.gA() - $$0));
      }

      public czo a() {
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
