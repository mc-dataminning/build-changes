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

public class dsj extends dsm {
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
   private final List<dsj.a> i = Lists.newArrayList();
   @Nullable
   private jh j;

   public dsj(jh $$0, dvj $$1) {
      super(dso.H, $$0, $$1);
   }

   @Override
   public void e() {
      if (this.b()) {
         this.a(null, this.o.a_(this.aB_()), dsj.b.c);
      }

      super.e();
   }

   public boolean b() {
      if (this.o == null) {
         return false;
      } else {
         for (jh $$0 : jh.c(this.p.b(-1, -1, -1), this.p.b(1, 1, 1))) {
            if (this.o.a_($$0).b() instanceof dld) {
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

   public void a(@Nullable com $$0, dvj $$1, dsj.b $$2) {
      List<bue> $$3 = this.a($$1, $$2);
      if ($$0 != null) {
         for (bue $$4 : $$3) {
            if ($$4 instanceof cgs) {
               cgs $$5 = (cgs)$$4;
               if ($$0.dv().g($$4.dv()) <= 16.0) {
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

   private List<bue> a(dvj $$0, dsj.b $$1) {
      List<bue> $$2 = Lists.newArrayList();
      this.i.removeIf($$3 -> a(this.o, this.p, $$0, $$3.b(), $$2, $$1, this.j));
      if (!$$2.isEmpty()) {
         super.e();
      }

      return $$2;
   }

   @baq
   public int f() {
      return this.i.size();
   }

   public static int a(dvj $$0) {
      return $$0.c(dhy.c);
   }

   @baq
   public boolean j() {
      return dis.a(this.o, this.aB_());
   }

   public void a(bue $$0) {
      if (this.i.size() < 3) {
         $$0.af();
         $$0.bQ();
         this.a(dsj.c.a($$0));
         if (this.o != null) {
            if ($$0 instanceof cgs $$1 && $$1.t() && (!this.k() || this.o.A.h())) {
               this.j = $$1.q();
            }

            jh $$2 = this.aB_();
            this.o.a(null, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awl.bV, awm.e, 1.0F, 1.0F);
            this.o.a(eag.c, $$2, eag.a.a($$0, this.m()));
         }

         $$0.av();
         super.e();
      }
   }

   public void a(dsj.c $$0) {
      this.i.add(new dsj.a($$0));
   }

   private static boolean a(dfb $$0, jh $$1, dvj $$2, dsj.c $$3, @Nullable List<bue> $$4, dsj.b $$5, @Nullable jh $$6) {
      if (cgs.c($$0) && $$5 != dsj.b.c) {
         return false;
      } else {
         jm $$7 = $$2.c(dhy.b);
         jh $$8 = $$1.a($$7);
         boolean $$9 = !$$0.a_($$8).g($$0, $$8).c();
         if ($$9 && $$5 != dsj.b.c) {
            return false;
         } else {
            bue $$10 = $$3.a($$0, $$1);
            if ($$10 != null) {
               if ($$10 instanceof cgs $$11) {
                  if ($$6 != null && !$$11.t() && $$0.A.i() < 0.9F) {
                     $$11.h($$6);
                  }

                  if ($$5 == dsj.b.a) {
                     $$11.gK();
                     if ($$2.a(axa.aH, $$0x -> $$0x.b(dhy.c))) {
                        int $$12 = a($$2);
                        if ($$12 < 5) {
                           int $$13 = $$0.A.a(100) == 0 ? 2 : 1;
                           if ($$12 + $$13 > 5) {
                              $$13--;
                           }

                           $$0.b($$1, $$2.b(dhy.c, Integer.valueOf($$12 + $$13)));
                        }
                     }
                  }

                  if ($$4 != null) {
                     $$4.add($$11);
                  }

                  float $$14 = $$10.ds();
                  double $$15 = $$9 ? 0.0 : 0.55 + (double)($$14 / 2.0F);
                  double $$16 = (double)$$1.u() + 0.5 + $$15 * (double)$$7.j();
                  double $$17 = (double)$$1.v() + 0.5 - (double)($$10.dt() / 2.0F);
                  double $$18 = (double)$$1.w() + 0.5 + $$15 * (double)$$7.l();
                  $$10.b($$16, $$17, $$18, $$10.dN(), $$10.dP());
               }

               $$0.a(null, $$1, awl.bW, awm.e, 1.0F, 1.0F);
               $$0.a(eag.c, $$1, eag.a.a($$10, $$0.a_($$1)));
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

   private static void a(dfb $$0, jh $$1, dvj $$2, List<dsj.a> $$3, @Nullable jh $$4) {
      boolean $$5 = false;
      Iterator<dsj.a> $$6 = $$3.iterator();

      while ($$6.hasNext()) {
         dsj.a $$7 = $$6.next();
         if ($$7.a()) {
            dsj.b $$8 = $$7.c() ? dsj.b.a : dsj.b.b;
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

   public static void a(dfb $$0, jh $$1, dvj $$2, dsj $$3) {
      a($$0, $$1, $$2, $$3.i, $$3.j);
      if (!$$3.i.isEmpty() && $$0.E_().j() < 0.005) {
         double $$4 = (double)$$1.u() + 0.5;
         double $$5 = (double)$$1.v();
         double $$6 = (double)$$1.w() + 0.5;
         $$0.a(null, $$4, $$5, $$6, awl.bY, awm.e, 1.0F, 1.0F);
      }

      ags.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(uk $$0, js.a $$1) {
      super.a($$0, $$1);
      this.i.clear();
      if ($$0.e("bees")) {
         dsj.c.b.parse(uy.a, $$0.c("bees")).resultOrPartial($$0x -> c.error("Failed to parse bees: '{}'", $$0x)).ifPresent($$0x -> $$0x.forEach(this::a));
      }

      this.j = uz.a($$0, "flower_pos").orElse(null);
   }

   @Override
   protected void b(uk $$0, js.a $$1) {
      super.b($$0, $$1);
      $$0.a("bees", (vh)dsj.c.b.encodeStart(uy.a, this.t()).getOrThrow());
      if (this.k()) {
         $$0.a("flower_pos", uz.a(this.j));
      }
   }

   @Override
   protected void a(dsm.b $$0) {
      super.a($$0);
      this.i.clear();
      List<dsj.c> $$1 = $$0.a(ku.an, List.of());
      $$1.forEach(this::a);
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      $$0.a(ku.an, this.t());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      $$0.r("bees");
   }

   private List<dsj.c> t() {
      return this.i.stream().map(dsj.a::b).toList();
   }

   static class a {
      private final dsj.c a;
      private int b;

      a(dsj.c $$0) {
         this.a = $$0;
         this.b = $$0.b();
      }

      public boolean a() {
         return this.b++ > this.a.f;
      }

      public dsj.c b() {
         return new dsj.c(this.a.d, this.b, this.a.f);
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

   public static record c(cyk d, int e, int f) {
      public static final Codec<dsj.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cyk.b.optionalFieldOf("entity_data", cyk.a).forGetter(dsj.c::a),
                  Codec.INT.fieldOf("ticks_in_hive").forGetter(dsj.c::b),
                  Codec.INT.fieldOf("min_ticks_in_hive").forGetter(dsj.c::c)
               )
               .apply($$0, dsj.c::new)
      );
      public static final Codec<List<dsj.c>> b = a.listOf();
      public static final zg<ByteBuf, dsj.c> c = zg.a(cyk.d, dsj.c::a, ze.h, dsj.c::b, ze.h, dsj.c::c, dsj.c::new);

      public static dsj.c a(bue $$0) {
         uk $$1 = new uk();
         $$0.e($$1);
         dsj.f.forEach($$1::r);
         boolean $$2 = $$1.q("HasNectar");
         return new dsj.c(cyk.a($$1), 0, $$2 ? 2400 : 600);
      }

      public static dsj.c a(int $$0) {
         uk $$1 = new uk();
         $$1.a("id", ly.f.b(bul.h).toString());
         return new dsj.c(cyk.a($$1), $$0, 600);
      }

      @Nullable
      public bue a(dfb $$0, jh $$1) {
         uk $$2 = this.d.c();
         dsj.f.forEach($$2::r);
         bue $$3 = bul.a($$2, $$0, buk.r, $$0x -> $$0x);
         if ($$3 != null && $$3.ar().a(axe.e)) {
            $$3.f(true);
            if ($$3 instanceof cgs $$4) {
               $$4.i($$1);
               a(this.e, $$4);
            }

            return $$3;
         } else {
            return null;
         }
      }

      private static void a(int $$0, cgs $$1) {
         int $$2 = $$1.g();
         if ($$2 < 0) {
            $$1.c_(Math.min(0, $$2 + $$0));
         } else if ($$2 > 0) {
            $$1.c_(Math.max(0, $$2 - $$0));
         }

         $$1.s(Math.max(0, $$1.gC() - $$0));
      }

      public cyk a() {
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
