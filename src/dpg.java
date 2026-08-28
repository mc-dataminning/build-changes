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

public class dpg extends dpj {
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
   private final List<dpg.a> i = Lists.newArrayList();
   @Nullable
   private iz j;

   public dpg(iz $$0, dse $$1) {
      super(dpl.H, $$0, $$1);
   }

   @Override
   public void e() {
      if (this.b()) {
         this.a(null, this.n.a_(this.ay_()), dpg.b.c);
      }

      super.e();
   }

   public boolean b() {
      if (this.n == null) {
         return false;
      } else {
         for (iz $$0 : iz.c(this.o.b(-1, -1, -1), this.o.b(1, 1, 1))) {
            if (this.n.a_($$0).b() instanceof dib) {
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

   public void a(@Nullable cmz $$0, dse $$1, dpg.b $$2) {
      List<bsw> $$3 = this.a($$1, $$2);
      if ($$0 != null) {
         for (bsw $$4 : $$3) {
            if ($$4 instanceof cfi) {
               cfi $$5 = (cfi)$$4;
               if ($$0.dn().g($$4.dn()) <= 16.0) {
                  if (!this.j()) {
                     $$5.h($$0);
                  } else {
                     $$5.u(400);
                  }
               }
            }
         }
      }
   }

   private List<bsw> a(dse $$0, dpg.b $$1) {
      List<bsw> $$2 = Lists.newArrayList();
      this.i.removeIf($$3 -> a(this.n, this.o, $$0, $$3.b(), $$2, $$1, this.j));
      if (!$$2.isEmpty()) {
         super.e();
      }

      return $$2;
   }

   @bad
   public int f() {
      return this.i.size();
   }

   public static int a(dse $$0) {
      return $$0.c(dev.c);
   }

   @bad
   public boolean j() {
      return dfp.a(this.n, this.ay_());
   }

   public void a(bsw $$0) {
      if (this.i.size() < 3) {
         $$0.ac();
         $$0.bH();
         this.a(dpg.c.a($$0));
         if (this.n != null) {
            if ($$0 instanceof cfi $$1 && $$1.u() && (!this.k() || this.n.z.h())) {
               this.j = $$1.s();
            }

            iz $$2 = this.ay_();
            this.n.a(null, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awa.bV, awb.e, 1.0F, 1.0F);
            this.n.a(dwx.c, $$2, dwx.a.a($$0, this.n()));
         }

         $$0.ao();
         super.e();
      }
   }

   public void a(dpg.c $$0) {
      this.i.add(new dpg.a($$0));
   }

   private static boolean a(dca $$0, iz $$1, dse $$2, dpg.c $$3, @Nullable List<bsw> $$4, dpg.b $$5, @Nullable iz $$6) {
      if (($$0.S() || $$0.ad()) && $$5 != dpg.b.c) {
         return false;
      } else {
         je $$7 = $$2.c(dev.b);
         iz $$8 = $$1.a($$7);
         boolean $$9 = !$$0.a_($$8).k($$0, $$8).c();
         if ($$9 && $$5 != dpg.b.c) {
            return false;
         } else {
            bsw $$10 = $$3.a($$0, $$1);
            if ($$10 != null) {
               if ($$10 instanceof cfi $$11) {
                  if ($$6 != null && !$$11.u() && $$0.z.i() < 0.9F) {
                     $$11.i($$6);
                  }

                  if ($$5 == dpg.b.a) {
                     $$11.gE();
                     if ($$2.a(awp.aG, $$0x -> $$0x.b(dev.c))) {
                        int $$12 = a($$2);
                        if ($$12 < 5) {
                           int $$13 = $$0.z.a(100) == 0 ? 2 : 1;
                           if ($$12 + $$13 > 5) {
                              $$13--;
                           }

                           $$0.b($$1, $$2.a(dev.c, Integer.valueOf($$12 + $$13)));
                        }
                     }
                  }

                  if ($$4 != null) {
                     $$4.add($$11);
                  }

                  float $$14 = $$10.dj();
                  double $$15 = $$9 ? 0.0 : 0.55 + (double)($$14 / 2.0F);
                  double $$16 = (double)$$1.u() + 0.5 + $$15 * (double)$$7.j();
                  double $$17 = (double)$$1.v() + 0.5 - (double)($$10.dk() / 2.0F);
                  double $$18 = (double)$$1.w() + 0.5 + $$15 * (double)$$7.l();
                  $$10.b($$16, $$17, $$18, $$10.dF(), $$10.dH());
               }

               $$0.a(null, $$1, awa.bW, awb.e, 1.0F, 1.0F);
               $$0.a(dwx.c, $$1, dwx.a.a($$10, $$0.a_($$1)));
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

   private static void a(dca $$0, iz $$1, dse $$2, List<dpg.a> $$3, @Nullable iz $$4) {
      boolean $$5 = false;
      Iterator<dpg.a> $$6 = $$3.iterator();

      while ($$6.hasNext()) {
         dpg.a $$7 = $$6.next();
         if ($$7.a()) {
            dpg.b $$8 = $$7.c() ? dpg.b.a : dpg.b.b;
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

   public static void a(dca $$0, iz $$1, dse $$2, dpg $$3) {
      a($$0, $$1, $$2, $$3.i, $$3.j);
      if (!$$3.i.isEmpty() && $$0.E_().j() < 0.005) {
         double $$4 = (double)$$1.u() + 0.5;
         double $$5 = (double)$$1.v();
         double $$6 = (double)$$1.w() + 0.5;
         $$0.a(null, $$4, $$5, $$6, awa.bY, awb.e, 1.0F, 1.0F);
      }

      agt.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(us $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.i.clear();
      if ($$0.e("bees")) {
         dpg.c.b.parse(vg.a, $$0.c("bees")).resultOrPartial($$0x -> c.error("Failed to parse bees: '{}'", $$0x)).ifPresent($$0x -> $$0x.forEach(this::a));
      }

      this.j = vh.a($$0, "flower_pos").orElse(null);
   }

   @Override
   protected void b(us $$0, jk.a $$1) {
      super.b($$0, $$1);
      $$0.a("bees", (vp)dpg.c.b.encodeStart(vg.a, this.l()).getOrThrow());
      if (this.k()) {
         $$0.a("flower_pos", vh.a(this.j));
      }
   }

   @Override
   protected void a(dpj.b $$0) {
      super.a($$0);
      this.i.clear();
      List<dpg.c> $$1 = $$0.a(km.ac, List.of());
      $$1.forEach(this::a);
   }

   @Override
   protected void a(ki.a $$0) {
      super.a($$0);
      $$0.a(km.ac, this.l());
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      $$0.r("bees");
   }

   private List<dpg.c> l() {
      return this.i.stream().map(dpg.a::b).toList();
   }

   static class a {
      private final dpg.c a;
      private int b;

      a(dpg.c $$0) {
         this.a = $$0;
         this.b = $$0.b();
      }

      public boolean a() {
         return this.b++ > this.a.f;
      }

      public dpg.c b() {
         return new dpg.c(this.a.d, this.b, this.a.f);
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

   public static record c(cxg d, int e, int f) {
      public static final Codec<dpg.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cxg.b.optionalFieldOf("entity_data", cxg.a).forGetter(dpg.c::a),
                  Codec.INT.fieldOf("ticks_in_hive").forGetter(dpg.c::b),
                  Codec.INT.fieldOf("min_ticks_in_hive").forGetter(dpg.c::c)
               )
               .apply($$0, dpg.c::new)
      );
      public static final Codec<List<dpg.c>> b = a.listOf();
      public static final zn<ByteBuf, dpg.c> c = zn.a(cxg.d, dpg.c::a, zl.g, dpg.c::b, zl.g, dpg.c::c, dpg.c::new);

      public static dpg.c a(bsw $$0) {
         us $$1 = new us();
         $$0.e($$1);
         dpg.f.forEach($$1::r);
         boolean $$2 = $$1.q("HasNectar");
         return new dpg.c(cxg.a($$1), 0, $$2 ? 2400 : 600);
      }

      public static dpg.c a(int $$0) {
         us $$1 = new us();
         $$1.a("id", lp.g.b(btc.h).toString());
         return new dpg.c(cxg.a($$1), $$0, 600);
      }

      @Nullable
      public bsw a(dca $$0, iz $$1) {
         us $$2 = this.d.c();
         dpg.f.forEach($$2::r);
         bsw $$3 = btc.a($$2, $$0, $$0x -> $$0x);
         if ($$3 != null && $$3.ak().a(awt.e)) {
            $$3.f(true);
            if ($$3 instanceof cfi $$4) {
               $$4.j($$1);
               a(this.e, $$4);
            }

            return $$3;
         } else {
            return null;
         }
      }

      private static void a(int $$0, cfi $$1) {
         int $$2 = $$1.g();
         if ($$2 < 0) {
            $$1.c_(Math.min(0, $$2 + $$0));
         } else if ($$2 > 0) {
            $$1.c_(Math.max(0, $$2 - $$0));
         }

         $$1.t(Math.max(0, $$1.gs() - $$0));
      }

      public cxg a() {
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
