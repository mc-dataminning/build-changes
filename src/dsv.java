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

public class dsv extends dsy {
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
   private final List<dsv.a> i = Lists.newArrayList();
   @Nullable
   private jh j;

   public dsv(jh $$0, dvv $$1) {
      super(dta.H, $$0, $$1);
   }

   @Override
   public void e() {
      if (this.b()) {
         this.a(null, this.o.a_(this.aA_()), dsv.b.c);
      }

      super.e();
   }

   public boolean b() {
      if (this.o == null) {
         return false;
      } else {
         for (jh $$0 : jh.c(this.p.b(-1, -1, -1), this.p.b(1, 1, 1))) {
            if (this.o.a_($$0).b() instanceof dlp) {
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

   public void a(@Nullable cou $$0, dvv $$1, dsv.b $$2) {
      List<bul> $$3 = this.a($$1, $$2);
      if ($$0 != null) {
         for (bul $$4 : $$3) {
            if ($$4 instanceof cgz) {
               cgz $$5 = (cgz)$$4;
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

   private List<bul> a(dvv $$0, dsv.b $$1) {
      List<bul> $$2 = Lists.newArrayList();
      this.i.removeIf($$3 -> a(this.o, this.p, $$0, $$3.b(), $$2, $$1, this.j));
      if (!$$2.isEmpty()) {
         super.e();
      }

      return $$2;
   }

   @bat
   public int f() {
      return this.i.size();
   }

   public static int a(dvv $$0) {
      return $$0.c(dik.c);
   }

   @bat
   public boolean j() {
      return dje.a(this.o, this.aA_());
   }

   public void a(bul $$0) {
      if (this.i.size() < 3) {
         $$0.ae();
         $$0.bP();
         this.a(dsv.c.a($$0));
         if (this.o != null) {
            if ($$0 instanceof cgz $$1 && $$1.q() && (!this.k() || this.o.A.h())) {
               this.j = $$1.n();
            }

            jh $$2 = this.aA_();
            this.o.a(null, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awn.bV, awo.e, 1.0F, 1.0F);
            this.o.a(ear.c, $$2, ear.a.a($$0, this.m()));
         }

         $$0.at();
         super.e();
      }
   }

   public void a(dsv.c $$0) {
      this.i.add(new dsv.a($$0));
   }

   private static boolean a(dfm $$0, jh $$1, dvv $$2, dsv.c $$3, @Nullable List<bul> $$4, dsv.b $$5, @Nullable jh $$6) {
      if (cgz.c($$0) && $$5 != dsv.b.c) {
         return false;
      } else {
         jm $$7 = $$2.c(dik.b);
         jh $$8 = $$1.a($$7);
         boolean $$9 = !$$0.a_($$8).g($$0, $$8).c();
         if ($$9 && $$5 != dsv.b.c) {
            return false;
         } else {
            bul $$10 = $$3.a($$0, $$1);
            if ($$10 != null) {
               if ($$10 instanceof cgz $$11) {
                  if ($$6 != null && !$$11.q() && $$0.A.i() < 0.9F) {
                     $$11.h($$6);
                  }

                  if ($$5 == dsv.b.a) {
                     $$11.gC();
                     if ($$2.a(axc.aI, $$0x -> $$0x.b(dik.c))) {
                        int $$12 = a($$2);
                        if ($$12 < 5) {
                           int $$13 = $$0.A.a(100) == 0 ? 2 : 1;
                           if ($$12 + $$13 > 5) {
                              $$13--;
                           }

                           $$0.b($$1, $$2.b(dik.c, Integer.valueOf($$12 + $$13)));
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

               $$0.a(null, $$1, awn.bW, awo.e, 1.0F, 1.0F);
               $$0.a(ear.c, $$1, ear.a.a($$10, $$0.a_($$1)));
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

   private static void a(dfm $$0, jh $$1, dvv $$2, List<dsv.a> $$3, @Nullable jh $$4) {
      boolean $$5 = false;
      Iterator<dsv.a> $$6 = $$3.iterator();

      while ($$6.hasNext()) {
         dsv.a $$7 = $$6.next();
         if ($$7.a()) {
            dsv.b $$8 = $$7.c() ? dsv.b.a : dsv.b.b;
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

   public static void a(dfm $$0, jh $$1, dvv $$2, dsv $$3) {
      a($$0, $$1, $$2, $$3.i, $$3.j);
      if (!$$3.i.isEmpty() && $$0.G_().j() < 0.005) {
         double $$4 = (double)$$1.u() + 0.5;
         double $$5 = (double)$$1.v();
         double $$6 = (double)$$1.w() + 0.5;
         $$0.a(null, $$4, $$5, $$6, awn.bY, awo.e, 1.0F, 1.0F);
      }

      agt.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ul $$0, js.a $$1) {
      super.a($$0, $$1);
      this.i.clear();
      if ($$0.e("bees")) {
         dsv.c.b.parse(uz.a, $$0.c("bees")).resultOrPartial($$0x -> c.error("Failed to parse bees: '{}'", $$0x)).ifPresent($$0x -> $$0x.forEach(this::a));
      }

      this.j = va.a($$0, "flower_pos").orElse(null);
   }

   @Override
   protected void b(ul $$0, js.a $$1) {
      super.b($$0, $$1);
      $$0.a("bees", (vi)dsv.c.b.encodeStart(uz.a, this.t()).getOrThrow());
      if (this.k()) {
         $$0.a("flower_pos", va.a(this.j));
      }
   }

   @Override
   protected void a(dsy.b $$0) {
      super.a($$0);
      this.i.clear();
      List<dsv.c> $$1 = $$0.a(ku.an, List.of());
      $$1.forEach(this::a);
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      $$0.a(ku.an, this.t());
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      $$0.r("bees");
   }

   private List<dsv.c> t() {
      return this.i.stream().map(dsv.a::b).toList();
   }

   static class a {
      private final dsv.c a;
      private int b;

      a(dsv.c $$0) {
         this.a = $$0;
         this.b = $$0.b();
      }

      public boolean a() {
         return this.b++ > this.a.f;
      }

      public dsv.c b() {
         return new dsv.c(this.a.d, this.b, this.a.f);
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

   public static record c(cyv d, int e, int f) {
      public static final Codec<dsv.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cyv.b.optionalFieldOf("entity_data", cyv.a).forGetter(dsv.c::a),
                  Codec.INT.fieldOf("ticks_in_hive").forGetter(dsv.c::b),
                  Codec.INT.fieldOf("min_ticks_in_hive").forGetter(dsv.c::c)
               )
               .apply($$0, dsv.c::new)
      );
      public static final Codec<List<dsv.c>> b = a.listOf();
      public static final zh<ByteBuf, dsv.c> c = zh.a(cyv.d, dsv.c::a, zf.h, dsv.c::b, zf.h, dsv.c::c, dsv.c::new);

      public static dsv.c a(bul $$0) {
         ul $$1 = new ul();
         $$0.e($$1);
         dsv.f.forEach($$1::r);
         boolean $$2 = $$1.q("HasNectar");
         return new dsv.c(cyv.a($$1), 0, $$2 ? 2400 : 600);
      }

      public static dsv.c a(int $$0) {
         ul $$1 = new ul();
         $$1.a("id", lz.f.b(bus.l).toString());
         return new dsv.c(cyv.a($$1), $$0, 600);
      }

      @Nullable
      public bul a(dfm $$0, jh $$1) {
         ul $$2 = this.d.c();
         dsv.f.forEach($$2::r);
         bul $$3 = bus.a($$2, $$0, bur.r, $$0x -> $$0x);
         if ($$3 != null && $$3.aq().a(axg.e)) {
            $$3.f(true);
            if ($$3 instanceof cgz $$4) {
               $$4.i($$1);
               a(this.e, $$4);
            }

            return $$3;
         } else {
            return null;
         }
      }

      private static void a(int $$0, cgz $$1) {
         int $$2 = $$1.X_();
         if ($$2 < 0) {
            $$1.c_(Math.min(0, $$2 + $$0));
         } else if ($$2 > 0) {
            $$1.c_(Math.max(0, $$2 - $$0));
         }

         $$1.r(Math.max(0, $$1.gu() - $$0));
      }

      public cyv a() {
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
