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

public class dqc extends dqf {
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
   private final List<dqc.a> i = Lists.newArrayList();
   @Nullable
   private jd j;

   public dqc(jd $$0, dta $$1) {
      super(dqh.H, $$0, $$1);
   }

   @Override
   public void e() {
      if (this.b()) {
         this.a(null, this.n.a_(this.az_()), dqc.b.c);
      }

      super.e();
   }

   public boolean b() {
      if (this.n == null) {
         return false;
      } else {
         for (jd $$0 : jd.c(this.o.b(-1, -1, -1), this.o.b(1, 1, 1))) {
            if (this.n.a_($$0).b() instanceof diw) {
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

   public void a(@Nullable cmv $$0, dta $$1, dqc.b $$2) {
      List<bsq> $$3 = this.a($$1, $$2);
      if ($$0 != null) {
         for (bsq $$4 : $$3) {
            if ($$4 instanceof cfd) {
               cfd $$5 = (cfd)$$4;
               if ($$0.do().g($$4.do()) <= 16.0) {
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

   private List<bsq> a(dta $$0, dqc.b $$1) {
      List<bsq> $$2 = Lists.newArrayList();
      this.i.removeIf($$3 -> a(this.n, this.o, $$0, $$3.b(), $$2, $$1, this.j));
      if (!$$2.isEmpty()) {
         super.e();
      }

      return $$2;
   }

   @azs
   public int f() {
      return this.i.size();
   }

   public static int a(dta $$0) {
      return $$0.c(dfq.c);
   }

   @azs
   public boolean j() {
      return dgk.a(this.n, this.az_());
   }

   public void a(bsq $$0) {
      if (this.i.size() < 3) {
         $$0.ad();
         $$0.bI();
         this.a(dqc.c.a($$0));
         if (this.n != null) {
            if ($$0 instanceof cfd $$1 && $$1.t() && (!this.k() || this.n.z.h())) {
               this.j = $$1.s();
            }

            jd $$2 = this.az_();
            this.n.a(null, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), avo.bV, avp.e, 1.0F, 1.0F);
            this.n.a(dxw.c, $$2, dxw.a.a($$0, this.n()));
         }

         $$0.aq();
         super.e();
      }
   }

   public void a(dqc.c $$0) {
      this.i.add(new dqc.a($$0));
   }

   private static boolean a(dcu $$0, jd $$1, dta $$2, dqc.c $$3, @Nullable List<bsq> $$4, dqc.b $$5, @Nullable jd $$6) {
      if (($$0.S() || $$0.ad()) && $$5 != dqc.b.c) {
         return false;
      } else {
         ji $$7 = $$2.c(dfq.b);
         jd $$8 = $$1.a($$7);
         boolean $$9 = !$$0.a_($$8).k($$0, $$8).c();
         if ($$9 && $$5 != dqc.b.c) {
            return false;
         } else {
            bsq $$10 = $$3.a($$0, $$1);
            if ($$10 != null) {
               if ($$10 instanceof cfd $$11) {
                  if ($$6 != null && !$$11.t() && $$0.z.i() < 0.9F) {
                     $$11.g($$6);
                  }

                  if ($$5 == dqc.b.a) {
                     $$11.gA();
                     if ($$2.a(awd.aG, $$0x -> $$0x.b(dfq.c))) {
                        int $$12 = a($$2);
                        if ($$12 < 5) {
                           int $$13 = $$0.z.a(100) == 0 ? 2 : 1;
                           if ($$12 + $$13 > 5) {
                              $$13--;
                           }

                           $$0.b($$1, $$2.a(dfq.c, Integer.valueOf($$12 + $$13)));
                        }
                     }
                  }

                  if ($$4 != null) {
                     $$4.add($$11);
                  }

                  float $$14 = $$10.dk();
                  double $$15 = $$9 ? 0.0 : 0.55 + (double)($$14 / 2.0F);
                  double $$16 = (double)$$1.u() + 0.5 + $$15 * (double)$$7.j();
                  double $$17 = (double)$$1.v() + 0.5 - (double)($$10.dl() / 2.0F);
                  double $$18 = (double)$$1.w() + 0.5 + $$15 * (double)$$7.l();
                  $$10.b($$16, $$17, $$18, $$10.dG(), $$10.dI());
               }

               $$0.a(null, $$1, avo.bW, avp.e, 1.0F, 1.0F);
               $$0.a(dxw.c, $$1, dxw.a.a($$10, $$0.a_($$1)));
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

   private static void a(dcu $$0, jd $$1, dta $$2, List<dqc.a> $$3, @Nullable jd $$4) {
      boolean $$5 = false;
      Iterator<dqc.a> $$6 = $$3.iterator();

      while ($$6.hasNext()) {
         dqc.a $$7 = $$6.next();
         if ($$7.a()) {
            dqc.b $$8 = $$7.c() ? dqc.b.a : dqc.b.b;
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

   public static void a(dcu $$0, jd $$1, dta $$2, dqc $$3) {
      a($$0, $$1, $$2, $$3.i, $$3.j);
      if (!$$3.i.isEmpty() && $$0.E_().j() < 0.005) {
         double $$4 = (double)$$1.u() + 0.5;
         double $$5 = (double)$$1.v();
         double $$6 = (double)$$1.w() + 0.5;
         $$0.a(null, $$4, $$5, $$6, avo.bY, avp.e, 1.0F, 1.0F);
      }

      age.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ua $$0, jo.a $$1) {
      super.a($$0, $$1);
      this.i.clear();
      if ($$0.e("bees")) {
         dqc.c.b.parse(uo.a, $$0.c("bees")).resultOrPartial($$0x -> c.error("Failed to parse bees: '{}'", $$0x)).ifPresent($$0x -> $$0x.forEach(this::a));
      }

      this.j = up.a($$0, "flower_pos").orElse(null);
   }

   @Override
   protected void b(ua $$0, jo.a $$1) {
      super.b($$0, $$1);
      $$0.a("bees", (ux)dqc.c.b.encodeStart(uo.a, this.l()).getOrThrow());
      if (this.k()) {
         $$0.a("flower_pos", up.a(this.j));
      }
   }

   @Override
   protected void a(dqf.b $$0) {
      super.a($$0);
      this.i.clear();
      List<dqc.c> $$1 = $$0.a(kq.ad, List.of());
      $$1.forEach(this::a);
   }

   @Override
   protected void a(km.a $$0) {
      super.a($$0);
      $$0.a(kq.ad, this.l());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      $$0.r("bees");
   }

   private List<dqc.c> l() {
      return this.i.stream().map(dqc.a::b).toList();
   }

   static class a {
      private final dqc.c a;
      private int b;

      a(dqc.c $$0) {
         this.a = $$0;
         this.b = $$0.b();
      }

      public boolean a() {
         return this.b++ > this.a.f;
      }

      public dqc.c b() {
         return new dqc.c(this.a.d, this.b, this.a.f);
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

   public static record c(cxf d, int e, int f) {
      public static final Codec<dqc.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cxf.b.optionalFieldOf("entity_data", cxf.a).forGetter(dqc.c::a),
                  Codec.INT.fieldOf("ticks_in_hive").forGetter(dqc.c::b),
                  Codec.INT.fieldOf("min_ticks_in_hive").forGetter(dqc.c::c)
               )
               .apply($$0, dqc.c::new)
      );
      public static final Codec<List<dqc.c>> b = a.listOf();
      public static final yw<ByteBuf, dqc.c> c = yw.a(cxf.d, dqc.c::a, yu.g, dqc.c::b, yu.g, dqc.c::c, dqc.c::new);

      public static dqc.c a(bsq $$0) {
         ua $$1 = new ua();
         $$0.e($$1);
         dqc.f.forEach($$1::r);
         boolean $$2 = $$1.q("HasNectar");
         return new dqc.c(cxf.a($$1), 0, $$2 ? 2400 : 600);
      }

      public static dqc.c a(int $$0) {
         ua $$1 = new ua();
         $$1.a("id", lt.f.b(bsw.h).toString());
         return new dqc.c(cxf.a($$1), $$0, 600);
      }

      @Nullable
      public bsq a(dcu $$0, jd $$1) {
         ua $$2 = this.d.c();
         dqc.f.forEach($$2::r);
         bsq $$3 = bsw.a($$2, $$0, $$0x -> $$0x);
         if ($$3 != null && $$3.am().a(awh.e)) {
            $$3.g(true);
            if ($$3 instanceof cfd $$4) {
               $$4.h($$1);
               a(this.e, $$4);
            }

            return $$3;
         } else {
            return null;
         }
      }

      private static void a(int $$0, cfd $$1) {
         int $$2 = $$1.g();
         if ($$2 < 0) {
            $$1.c_(Math.min(0, $$2 + $$0));
         } else if ($$2 > 0) {
            $$1.c_(Math.max(0, $$2 - $$0));
         }

         $$1.s(Math.max(0, $$1.gs() - $$0));
      }

      public cxf a() {
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
