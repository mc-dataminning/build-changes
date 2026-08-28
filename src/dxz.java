import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class dxz extends dyc {
   private static final String c = "flower_pos";
   private static final String d = "bees";
   static final List<String> e = Arrays.asList(
      "Air",
      "drop_chances",
      "ArmorItems",
      "Brain",
      "CanPickUpLoot",
      "DeathTime",
      "fall_distance",
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
   private static final int f = 400;
   private static final int g = 2400;
   public static final int b = 600;
   private final List<dxz.a> h = Lists.newArrayList();
   @Nullable
   private iv i;

   public dxz(iv $$0, ebe $$1) {
      super(dye.I, $$0, $$1);
   }

   @Override
   public void e() {
      if (this.a()) {
         this.a(null, this.n.a_(this.aB_()), dxz.b.c);
      }

      super.e();
   }

   public boolean a() {
      if (this.n == null) {
         return false;
      } else {
         for (iv $$0 : iv.c(this.o.b(-1, -1, -1), this.o.b(1, 1, 1))) {
            if (this.n.a_($$0).b() instanceof dqe) {
               return true;
            }
         }

         return false;
      }
   }

   public boolean c() {
      return this.h.isEmpty();
   }

   public boolean d() {
      return this.h.size() == 3;
   }

   public void a(@Nullable crx $$0, ebe $$1, dxz.b $$2) {
      List<bwt> $$3 = this.a($$1, $$2);
      if ($$0 != null) {
         for (bwt $$4 : $$3) {
            if ($$4 instanceof cjl) {
               cjl $$5 = (cjl)$$4;
               if ($$0.dt().g($$4.dt()) <= 16.0) {
                  if (!this.j()) {
                     $$5.g($$0);
                  } else {
                     $$5.s(400);
                  }
               }
            }
         }
      }
   }

   private List<bwt> a(ebe $$0, dxz.b $$1) {
      List<bwt> $$2 = Lists.newArrayList();
      this.h.removeIf($$3 -> a(this.n, this.o, $$0, $$3.b(), $$2, $$1, this.i));
      if (!$$2.isEmpty()) {
         super.e();
      }

      return $$2;
   }

   @bax
   public int f() {
      return this.h.size();
   }

   public static int a(ebe $$0) {
      return $$0.c(dmw.c);
   }

   @bax
   public boolean j() {
      return dns.a(this.n, this.aB_());
   }

   public void a(cjl $$0) {
      if (this.h.size() < 3) {
         $$0.bO();
         $$0.bN();
         $$0.y();
         this.a(dxz.c.a($$0));
         if (this.n != null) {
            if ($$0.t() && (!this.k() || this.n.A.h())) {
               this.i = $$0.q();
            }

            iv $$1 = this.aB_();
            this.n.a(null, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), awp.bV, awq.e, 1.0F, 1.0F);
            this.n.a(ege.c, $$1, ege.a.a($$0, this.m()));
         }

         $$0.aq();
         super.e();
      }
   }

   public void a(dxz.c $$0) {
      this.h.add(new dxz.a($$0));
   }

   private static boolean a(djx $$0, iv $$1, ebe $$2, dxz.c $$3, @Nullable List<bwt> $$4, dxz.b $$5, @Nullable iv $$6) {
      if (cjl.c($$0) && $$5 != dxz.b.c) {
         return false;
      } else {
         jb $$7 = $$2.c(dmw.b);
         iv $$8 = $$1.a($$7);
         boolean $$9 = !$$0.a_($$8).g($$0, $$8).c();
         if ($$9 && $$5 != dxz.b.c) {
            return false;
         } else {
            bwt $$10 = $$3.a($$0, $$1);
            if ($$10 != null) {
               if ($$10 instanceof cjl $$11) {
                  if ($$6 != null && !$$11.t() && $$0.A.i() < 0.9F) {
                     $$11.h($$6);
                  }

                  if ($$5 == dxz.b.a) {
                     $$11.gK();
                     if ($$2.a(axe.aJ, $$0x -> $$0x.b(dmw.c))) {
                        int $$12 = a($$2);
                        if ($$12 < 5) {
                           int $$13 = $$0.A.a(100) == 0 ? 2 : 1;
                           if ($$12 + $$13 > 5) {
                              $$13--;
                           }

                           $$0.b($$1, $$2.b(dmw.c, Integer.valueOf($$12 + $$13)));
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

               $$0.a(null, $$1, awp.bW, awq.e, 1.0F, 1.0F);
               $$0.a(ege.c, $$1, ege.a.a($$10, $$0.a_($$1)));
               return $$0.b($$10);
            } else {
               return false;
            }
         }
      }
   }

   private boolean k() {
      return this.i != null;
   }

   private static void a(djx $$0, iv $$1, ebe $$2, List<dxz.a> $$3, @Nullable iv $$4) {
      boolean $$5 = false;
      Iterator<dxz.a> $$6 = $$3.iterator();

      while ($$6.hasNext()) {
         dxz.a $$7 = $$6.next();
         if ($$7.a()) {
            dxz.b $$8 = $$7.c() ? dxz.b.a : dxz.b.b;
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

   public static void a(djx $$0, iv $$1, ebe $$2, dxz $$3) {
      a($$0, $$1, $$2, $$3.h, $$3.i);
      if (!$$3.h.isEmpty() && $$0.G_().j() < 0.005) {
         double $$4 = (double)$$1.u() + 0.5;
         double $$5 = (double)$$1.v();
         double $$6 = (double)$$1.w() + 0.5;
         $$0.a(null, $$4, $$5, $$6, awp.bY, awq.e, 1.0F, 1.0F);
      }

      ago.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.h.clear();
      $$0.<List>a("bees", dxz.c.b).orElse(List.of()).forEach(this::a);
      this.i = $$0.<iv>a("flower_pos", iv.a).orElse(null);
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      $$0.a("bees", dxz.c.b, this.s());
      $$0.b("flower_pos", iv.a, this.i);
   }

   @Override
   protected void a(kf $$0) {
      super.a($$0);
      this.h.clear();
      List<dxz.c> $$1 = $$0.a(kk.ar, dbx.c).a();
      $$1.forEach(this::a);
   }

   @Override
   protected void a(kh.a $$0) {
      super.a($$0);
      $$0.a(kk.ar, new dbx(this.s()));
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      $$0.r("bees");
   }

   private List<dxz.c> s() {
      return this.h.stream().map(dxz.a::b).toList();
   }

   static class a {
      private final dxz.c a;
      private int b;

      a(dxz.c $$0) {
         this.a = $$0;
         this.b = $$0.b();
      }

      public boolean a() {
         return this.b++ > this.a.f;
      }

      public dxz.c b() {
         return new dxz.c(this.a.d, this.b, this.a.f);
      }

      public boolean c() {
         return this.a.d.e().b("HasNectar", false);
      }
   }

   public static enum b {
      a,
      b,
      c;
   }

   public static record c(dcg d, int e, int f) {
      public static final Codec<dxz.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dcg.b.optionalFieldOf("entity_data", dcg.a).forGetter(dxz.c::a),
                  Codec.INT.fieldOf("ticks_in_hive").forGetter(dxz.c::b),
                  Codec.INT.fieldOf("min_ticks_in_hive").forGetter(dxz.c::c)
               )
               .apply($$0, dxz.c::new)
      );
      public static final Codec<List<dxz.c>> b = a.listOf();
      public static final yy<ByteBuf, dxz.c> c = yy.a(dcg.d, dxz.c::a, yw.h, dxz.c::b, yw.h, dxz.c::c, dxz.c::new);

      public static dxz.c a(bwt $$0) {
         tz $$1 = new tz();
         $$0.g($$1);
         dxz.e.forEach($$1::r);
         boolean $$2 = $$1.b("HasNectar", false);
         return new dxz.c(dcg.a($$1), 0, $$2 ? 2400 : 600);
      }

      public static dxz.c a(int $$0) {
         tz $$1 = new tz();
         $$1.a("id", mg.f.b(bxc.m).toString());
         return new dxz.c(dcg.a($$1), $$0, 600);
      }

      @Nullable
      public bwt a(djx $$0, iv $$1) {
         tz $$2 = this.d.d();
         dxz.e.forEach($$2::r);
         bwt $$3 = bxc.a($$2, $$0, bxb.r, $$0x -> $$0x);
         if ($$3 != null && $$3.an().a(axh.e)) {
            $$3.f(true);
            if ($$3 instanceof cjl $$4) {
               $$4.i($$1);
               a(this.e, $$4);
            }

            return $$3;
         } else {
            return null;
         }
      }

      private static void a(int $$0, cjl $$1) {
         int $$2 = $$1.g();
         if ($$2 < 0) {
            $$1.c_(Math.min(0, $$2 + $$0));
         } else if ($$2 > 0) {
            $$1.c_(Math.max(0, $$2 - $$0));
         }

         $$1.r(Math.max(0, $$1.gC() - $$0));
      }

      public dcg a() {
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
