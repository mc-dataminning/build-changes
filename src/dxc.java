import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class dxc extends dxf {
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
   private final List<dxc.a> h = Lists.newArrayList();
   @Nullable
   private iu i;

   public dxc(iu $$0, eah $$1) {
      super(dxh.I, $$0, $$1);
   }

   @Override
   public void e() {
      if (this.a()) {
         this.a(null, this.n.a_(this.ax_()), dxc.b.c);
      }

      super.e();
   }

   public boolean a() {
      if (this.n == null) {
         return false;
      } else {
         for (iu $$0 : iu.c(this.o.b(-1, -1, -1), this.o.b(1, 1, 1))) {
            if (this.n.a_($$0).b() instanceof dph) {
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

   public void a(@Nullable crc $$0, eah $$1, dxc.b $$2) {
      List<bwf> $$3 = this.a($$1, $$2);
      if ($$0 != null) {
         for (bwf $$4 : $$3) {
            if ($$4 instanceof civ) {
               civ $$5 = (civ)$$4;
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

   private List<bwf> a(eah $$0, dxc.b $$1) {
      List<bwf> $$2 = Lists.newArrayList();
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

   public static int a(eah $$0) {
      return $$0.c(dlz.c);
   }

   @bav
   public boolean j() {
      return dmv.a(this.n, this.ax_());
   }

   public void a(civ $$0) {
      if (this.h.size() < 3) {
         $$0.bP();
         $$0.bO();
         $$0.y();
         this.a(dxc.c.a($$0));
         if (this.n != null) {
            if ($$0.t() && (!this.k() || this.n.A.h())) {
               this.i = $$0.q();
            }

            iu $$1 = this.ax_();
            this.n.a(null, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), awn.bV, awo.e, 1.0F, 1.0F);
            this.n.a(efh.c, $$1, efh.a.a($$0, this.m()));
         }

         $$0.at();
         super.e();
      }
   }

   public void a(dxc.c $$0) {
      this.h.add(new dxc.a($$0));
   }

   private static boolean a(dja $$0, iu $$1, eah $$2, dxc.c $$3, @Nullable List<bwf> $$4, dxc.b $$5, @Nullable iu $$6) {
      if (civ.c($$0) && $$5 != dxc.b.c) {
         return false;
      } else {
         ja $$7 = $$2.c(dlz.b);
         iu $$8 = $$1.a($$7);
         boolean $$9 = !$$0.a_($$8).g($$0, $$8).c();
         if ($$9 && $$5 != dxc.b.c) {
            return false;
         } else {
            bwf $$10 = $$3.a($$0, $$1);
            if ($$10 != null) {
               if ($$10 instanceof civ $$11) {
                  if ($$6 != null && !$$11.t() && $$0.A.i() < 0.9F) {
                     $$11.h($$6);
                  }

                  if ($$5 == dxc.b.a) {
                     $$11.gH();
                     if ($$2.a(axc.aJ, $$0x -> $$0x.b(dlz.c))) {
                        int $$12 = a($$2);
                        if ($$12 < 5) {
                           int $$13 = $$0.A.a(100) == 0 ? 2 : 1;
                           if ($$12 + $$13 > 5) {
                              $$13--;
                           }

                           $$0.b($$1, $$2.b(dlz.c, Integer.valueOf($$12 + $$13)));
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
               $$0.a(efh.c, $$1, efh.a.a($$10, $$0.a_($$1)));
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

   private static void a(dja $$0, iu $$1, eah $$2, List<dxc.a> $$3, @Nullable iu $$4) {
      boolean $$5 = false;
      Iterator<dxc.a> $$6 = $$3.iterator();

      while ($$6.hasNext()) {
         dxc.a $$7 = $$6.next();
         if ($$7.a()) {
            dxc.b $$8 = $$7.c() ? dxc.b.a : dxc.b.b;
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

   public static void a(dja $$0, iu $$1, eah $$2, dxc $$3) {
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
   protected void a(tz $$0, jg.a $$1) {
      super.a($$0, $$1);
      this.h.clear();
      $$0.<List>a("bees", dxc.c.b).orElse(List.of()).forEach(this::a);
      this.i = uo.a($$0, "flower_pos").orElse(null);
   }

   @Override
   protected void b(tz $$0, jg.a $$1) {
      super.b($$0, $$1);
      $$0.a("bees", dxc.c.b, this.s());
      if (this.k()) {
         $$0.a("flower_pos", uo.a(this.i));
      }
   }

   @Override
   protected void a(ke $$0) {
      super.a($$0);
      this.h.clear();
      List<dxc.c> $$1 = $$0.a(kj.ar, dbc.c).a();
      $$1.forEach(this::a);
   }

   @Override
   protected void a(kg.a $$0) {
      super.a($$0);
      $$0.a(kj.ar, new dbc(this.s()));
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      $$0.r("bees");
   }

   private List<dxc.c> s() {
      return this.h.stream().map(dxc.a::b).toList();
   }

   static class a {
      private final dxc.c a;
      private int b;

      a(dxc.c $$0) {
         this.a = $$0;
         this.b = $$0.b();
      }

      public boolean a() {
         return this.b++ > this.a.f;
      }

      public dxc.c b() {
         return new dxc.c(this.a.d, this.b, this.a.f);
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

   public static record c(dbl d, int e, int f) {
      public static final Codec<dxc.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dbl.b.optionalFieldOf("entity_data", dbl.a).forGetter(dxc.c::a),
                  Codec.INT.fieldOf("ticks_in_hive").forGetter(dxc.c::b),
                  Codec.INT.fieldOf("min_ticks_in_hive").forGetter(dxc.c::c)
               )
               .apply($$0, dxc.c::new)
      );
      public static final Codec<List<dxc.c>> b = a.listOf();
      public static final yw<ByteBuf, dxc.c> c = yw.a(dbl.d, dxc.c::a, yu.h, dxc.c::b, yu.h, dxc.c::c, dxc.c::new);

      public static dxc.c a(bwf $$0) {
         tz $$1 = new tz();
         $$0.e($$1);
         dxc.e.forEach($$1::r);
         boolean $$2 = $$1.q("HasNectar");
         return new dxc.c(dbl.a($$1), 0, $$2 ? 2400 : 600);
      }

      public static dxc.c a(int $$0) {
         tz $$1 = new tz();
         $$1.a("id", mf.f.b(bwo.l).toString());
         return new dxc.c(dbl.a($$1), $$0, 600);
      }

      @Nullable
      public bwf a(dja $$0, iu $$1) {
         tz $$2 = this.d.d();
         dxc.e.forEach($$2::r);
         bwf $$3 = bwo.a($$2, $$0, bwn.r, $$0x -> $$0x);
         if ($$3 != null && $$3.aq().a(axf.e)) {
            $$3.f(true);
            if ($$3 instanceof civ $$4) {
               $$4.i($$1);
               a(this.e, $$4);
            }

            return $$3;
         } else {
            return null;
         }
      }

      private static void a(int $$0, civ $$1) {
         int $$2 = $$1.g();
         if ($$2 < 0) {
            $$1.c_(Math.min(0, $$2 + $$0));
         } else if ($$2 > 0) {
            $$1.c_(Math.max(0, $$2 - $$0));
         }

         $$1.r(Math.max(0, $$1.gz() - $$0));
      }

      public dbl a() {
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
