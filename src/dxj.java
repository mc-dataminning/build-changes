import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class dxj extends dxm {
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
   private final List<dxj.a> h = Lists.newArrayList();
   @Nullable
   private iv i;

   public dxj(iv $$0, eao $$1) {
      super(dxo.I, $$0, $$1);
   }

   @Override
   public void e() {
      if (this.a()) {
         this.a(null, this.n.a_(this.ax_()), dxj.b.c);
      }

      super.e();
   }

   public boolean a() {
      if (this.n == null) {
         return false;
      } else {
         for (iv $$0 : iv.c(this.o.b(-1, -1, -1), this.o.b(1, 1, 1))) {
            if (this.n.a_($$0).b() instanceof dpo) {
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

   public void a(@Nullable crj $$0, eao $$1, dxj.b $$2) {
      List<bwi> $$3 = this.a($$1, $$2);
      if ($$0 != null) {
         for (bwi $$4 : $$3) {
            if ($$4 instanceof cja) {
               cja $$5 = (cja)$$4;
               if ($$0.ds().g($$4.ds()) <= 16.0) {
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

   private List<bwi> a(eao $$0, dxj.b $$1) {
      List<bwi> $$2 = Lists.newArrayList();
      this.h.removeIf($$3 -> a(this.n, this.o, $$0, $$3.b(), $$2, $$1, this.i));
      if (!$$2.isEmpty()) {
         super.e();
      }

      return $$2;
   }

   @bav
   public int f() {
      return this.h.size();
   }

   public static int a(eao $$0) {
      return $$0.c(dmg.c);
   }

   @bav
   public boolean j() {
      return dnc.a(this.n, this.ax_());
   }

   public void a(cja $$0) {
      if (this.h.size() < 3) {
         $$0.bN();
         $$0.bM();
         $$0.y();
         this.a(dxj.c.a($$0));
         if (this.n != null) {
            if ($$0.t() && (!this.k() || this.n.A.h())) {
               this.i = $$0.q();
            }

            iv $$1 = this.ax_();
            this.n.a(null, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), awn.bV, awo.e, 1.0F, 1.0F);
            this.n.a(efo.c, $$1, efo.a.a($$0, this.m()));
         }

         $$0.aq();
         super.e();
      }
   }

   public void a(dxj.c $$0) {
      this.h.add(new dxj.a($$0));
   }

   private static boolean a(djh $$0, iv $$1, eao $$2, dxj.c $$3, @Nullable List<bwi> $$4, dxj.b $$5, @Nullable iv $$6) {
      if (cja.c($$0) && $$5 != dxj.b.c) {
         return false;
      } else {
         jb $$7 = $$2.c(dmg.b);
         iv $$8 = $$1.a($$7);
         boolean $$9 = !$$0.a_($$8).g($$0, $$8).c();
         if ($$9 && $$5 != dxj.b.c) {
            return false;
         } else {
            bwi $$10 = $$3.a($$0, $$1);
            if ($$10 != null) {
               if ($$10 instanceof cja $$11) {
                  if ($$6 != null && !$$11.t() && $$0.A.i() < 0.9F) {
                     $$11.h($$6);
                  }

                  if ($$5 == dxj.b.a) {
                     $$11.gJ();
                     if ($$2.a(axc.aJ, $$0x -> $$0x.b(dmg.c))) {
                        int $$12 = a($$2);
                        if ($$12 < 5) {
                           int $$13 = $$0.A.a(100) == 0 ? 2 : 1;
                           if ($$12 + $$13 > 5) {
                              $$13--;
                           }

                           $$0.b($$1, $$2.b(dmg.c, Integer.valueOf($$12 + $$13)));
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

               $$0.a(null, $$1, awn.bW, awo.e, 1.0F, 1.0F);
               $$0.a(efo.c, $$1, efo.a.a($$10, $$0.a_($$1)));
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

   private static void a(djh $$0, iv $$1, eao $$2, List<dxj.a> $$3, @Nullable iv $$4) {
      boolean $$5 = false;
      Iterator<dxj.a> $$6 = $$3.iterator();

      while ($$6.hasNext()) {
         dxj.a $$7 = $$6.next();
         if ($$7.a()) {
            dxj.b $$8 = $$7.c() ? dxj.b.a : dxj.b.b;
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

   public static void a(djh $$0, iv $$1, eao $$2, dxj $$3) {
      a($$0, $$1, $$2, $$3.h, $$3.i);
      if (!$$3.h.isEmpty() && $$0.C_().j() < 0.005) {
         double $$4 = (double)$$1.u() + 0.5;
         double $$5 = (double)$$1.v();
         double $$6 = (double)$$1.w() + 0.5;
         $$0.a(null, $$4, $$5, $$6, awn.bY, awo.e, 1.0F, 1.0F);
      }

      agm.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.h.clear();
      $$0.<List>a("bees", dxj.c.b).orElse(List.of()).forEach(this::a);
      this.i = $$0.<iv>a("flower_pos", iv.a).orElse(null);
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      super.b($$0, $$1);
      $$0.a("bees", dxj.c.b, this.s());
      $$0.b("flower_pos", iv.a, this.i);
   }

   @Override
   protected void a(kf $$0) {
      super.a($$0);
      this.h.clear();
      List<dxj.c> $$1 = $$0.a(kk.ar, dbj.c).a();
      $$1.forEach(this::a);
   }

   @Override
   protected void a(kh.a $$0) {
      super.a($$0);
      $$0.a(kk.ar, new dbj(this.s()));
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      $$0.p("bees");
   }

   private List<dxj.c> s() {
      return this.h.stream().map(dxj.a::b).toList();
   }

   static class a {
      private final dxj.c a;
      private int b;

      a(dxj.c $$0) {
         this.a = $$0;
         this.b = $$0.b();
      }

      public boolean a() {
         return this.b++ > this.a.f;
      }

      public dxj.c b() {
         return new dxj.c(this.a.d, this.b, this.a.f);
      }

      public boolean c() {
         return this.a.d.e().o("HasNectar");
      }
   }

   public static enum b {
      a,
      b,
      c;
   }

   public static record c(dbs d, int e, int f) {
      public static final Codec<dxj.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dbs.b.optionalFieldOf("entity_data", dbs.a).forGetter(dxj.c::a),
                  Codec.INT.fieldOf("ticks_in_hive").forGetter(dxj.c::b),
                  Codec.INT.fieldOf("min_ticks_in_hive").forGetter(dxj.c::c)
               )
               .apply($$0, dxj.c::new)
      );
      public static final Codec<List<dxj.c>> b = a.listOf();
      public static final yw<ByteBuf, dxj.c> c = yw.a(dbs.d, dxj.c::a, yu.h, dxj.c::b, yu.h, dxj.c::c, dxj.c::new);

      public static dxj.c a(bwi $$0) {
         tz $$1 = new tz();
         $$0.e($$1);
         dxj.e.forEach($$1::p);
         boolean $$2 = $$1.o("HasNectar");
         return new dxj.c(dbs.a($$1), 0, $$2 ? 2400 : 600);
      }

      public static dxj.c a(int $$0) {
         tz $$1 = new tz();
         $$1.a("id", mg.f.b(bwr.l).toString());
         return new dxj.c(dbs.a($$1), $$0, 600);
      }

      @Nullable
      public bwi a(djh $$0, iv $$1) {
         tz $$2 = this.d.d();
         dxj.e.forEach($$2::p);
         bwi $$3 = bwr.a($$2, $$0, bwq.r, $$0x -> $$0x);
         if ($$3 != null && $$3.an().a(axf.e)) {
            $$3.f(true);
            if ($$3 instanceof cja $$4) {
               $$4.i($$1);
               a(this.e, $$4);
            }

            return $$3;
         } else {
            return null;
         }
      }

      private static void a(int $$0, cja $$1) {
         int $$2 = $$1.g();
         if ($$2 < 0) {
            $$1.c_(Math.min(0, $$2 + $$0));
         } else if ($$2 > 0) {
            $$1.c_(Math.max(0, $$2 - $$0));
         }

         $$1.r(Math.max(0, $$1.gB() - $$0));
      }

      public dbs a() {
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
