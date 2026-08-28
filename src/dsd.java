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

public class dsd extends dsg {
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
   private final List<dsd.a> i = Lists.newArrayList();
   @Nullable
   private jg j;

   public dsd(jg $$0, dvd $$1) {
      super(dsi.H, $$0, $$1);
   }

   @Override
   public void e() {
      if (this.b()) {
         this.a(null, this.o.a_(this.aC_()), dsd.b.c);
      }

      super.e();
   }

   public boolean b() {
      if (this.o == null) {
         return false;
      } else {
         for (jg $$0 : jg.c(this.p.b(-1, -1, -1), this.p.b(1, 1, 1))) {
            if (this.o.a_($$0).b() instanceof dkx) {
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

   public void a(@Nullable coh $$0, dvd $$1, dsd.b $$2) {
      List<btz> $$3 = this.a($$1, $$2);
      if ($$0 != null) {
         for (btz $$4 : $$3) {
            if ($$4 instanceof cgn) {
               cgn $$5 = (cgn)$$4;
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

   private List<btz> a(dvd $$0, dsd.b $$1) {
      List<btz> $$2 = Lists.newArrayList();
      this.i.removeIf($$3 -> a(this.o, this.p, $$0, $$3.b(), $$2, $$1, this.j));
      if (!$$2.isEmpty()) {
         super.e();
      }

      return $$2;
   }

   @bap
   public int f() {
      return this.i.size();
   }

   public static int a(dvd $$0) {
      return $$0.c(dhs.c);
   }

   @bap
   public boolean j() {
      return dim.a(this.o, this.aC_());
   }

   public void a(btz $$0) {
      if (this.i.size() < 3) {
         $$0.af();
         $$0.bQ();
         this.a(dsd.c.a($$0));
         if (this.o != null) {
            if ($$0 instanceof cgn $$1 && $$1.t() && (!this.k() || this.o.A.h())) {
               this.j = $$1.q();
            }

            jg $$2 = this.aC_();
            this.o.a(null, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awk.bV, awl.e, 1.0F, 1.0F);
            this.o.a(eaa.c, $$2, eaa.a.a($$0, this.m()));
         }

         $$0.au();
         super.e();
      }
   }

   public void a(dsd.c $$0) {
      this.i.add(new dsd.a($$0));
   }

   private static boolean a(dev $$0, jg $$1, dvd $$2, dsd.c $$3, @Nullable List<btz> $$4, dsd.b $$5, @Nullable jg $$6) {
      if (cgn.c($$0) && $$5 != dsd.b.c) {
         return false;
      } else {
         jl $$7 = $$2.c(dhs.b);
         jg $$8 = $$1.a($$7);
         boolean $$9 = !$$0.a_($$8).g($$0, $$8).c();
         if ($$9 && $$5 != dsd.b.c) {
            return false;
         } else {
            btz $$10 = $$3.a($$0, $$1);
            if ($$10 != null) {
               if ($$10 instanceof cgn $$11) {
                  if ($$6 != null && !$$11.t() && $$0.A.i() < 0.9F) {
                     $$11.h($$6);
                  }

                  if ($$5 == dsd.b.a) {
                     $$11.gL();
                     if ($$2.a(awz.aH, $$0x -> $$0x.b(dhs.c))) {
                        int $$12 = a($$2);
                        if ($$12 < 5) {
                           int $$13 = $$0.A.a(100) == 0 ? 2 : 1;
                           if ($$12 + $$13 > 5) {
                              $$13--;
                           }

                           $$0.b($$1, $$2.b(dhs.c, Integer.valueOf($$12 + $$13)));
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

               $$0.a(null, $$1, awk.bW, awl.e, 1.0F, 1.0F);
               $$0.a(eaa.c, $$1, eaa.a.a($$10, $$0.a_($$1)));
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

   private static void a(dev $$0, jg $$1, dvd $$2, List<dsd.a> $$3, @Nullable jg $$4) {
      boolean $$5 = false;
      Iterator<dsd.a> $$6 = $$3.iterator();

      while ($$6.hasNext()) {
         dsd.a $$7 = $$6.next();
         if ($$7.a()) {
            dsd.b $$8 = $$7.c() ? dsd.b.a : dsd.b.b;
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

   public static void a(dev $$0, jg $$1, dvd $$2, dsd $$3) {
      a($$0, $$1, $$2, $$3.i, $$3.j);
      if (!$$3.i.isEmpty() && $$0.E_().j() < 0.005) {
         double $$4 = (double)$$1.u() + 0.5;
         double $$5 = (double)$$1.v();
         double $$6 = (double)$$1.w() + 0.5;
         $$0.a(null, $$4, $$5, $$6, awk.bY, awl.e, 1.0F, 1.0F);
      }

      agr.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(uj $$0, jr.a $$1) {
      super.a($$0, $$1);
      this.i.clear();
      if ($$0.e("bees")) {
         dsd.c.b.parse(ux.a, $$0.c("bees")).resultOrPartial($$0x -> c.error("Failed to parse bees: '{}'", $$0x)).ifPresent($$0x -> $$0x.forEach(this::a));
      }

      this.j = uy.a($$0, "flower_pos").orElse(null);
   }

   @Override
   protected void b(uj $$0, jr.a $$1) {
      super.b($$0, $$1);
      $$0.a("bees", (vg)dsd.c.b.encodeStart(ux.a, this.t()).getOrThrow());
      if (this.k()) {
         $$0.a("flower_pos", uy.a(this.j));
      }
   }

   @Override
   protected void a(dsg.b $$0) {
      super.a($$0);
      this.i.clear();
      List<dsd.c> $$1 = $$0.a(kt.am, List.of());
      $$1.forEach(this::a);
   }

   @Override
   protected void a(kp.a $$0) {
      super.a($$0);
      $$0.a(kt.am, this.t());
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      $$0.r("bees");
   }

   private List<dsd.c> t() {
      return this.i.stream().map(dsd.a::b).toList();
   }

   static class a {
      private final dsd.c a;
      private int b;

      a(dsd.c $$0) {
         this.a = $$0;
         this.b = $$0.b();
      }

      public boolean a() {
         return this.b++ > this.a.f;
      }

      public dsd.c b() {
         return new dsd.c(this.a.d, this.b, this.a.f);
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

   public static record c(cyg d, int e, int f) {
      public static final Codec<dsd.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cyg.b.optionalFieldOf("entity_data", cyg.a).forGetter(dsd.c::a),
                  Codec.INT.fieldOf("ticks_in_hive").forGetter(dsd.c::b),
                  Codec.INT.fieldOf("min_ticks_in_hive").forGetter(dsd.c::c)
               )
               .apply($$0, dsd.c::new)
      );
      public static final Codec<List<dsd.c>> b = a.listOf();
      public static final zf<ByteBuf, dsd.c> c = zf.a(cyg.d, dsd.c::a, zd.h, dsd.c::b, zd.h, dsd.c::c, dsd.c::new);

      public static dsd.c a(btz $$0) {
         uj $$1 = new uj();
         $$0.e($$1);
         dsd.f.forEach($$1::r);
         boolean $$2 = $$1.q("HasNectar");
         return new dsd.c(cyg.a($$1), 0, $$2 ? 2400 : 600);
      }

      public static dsd.c a(int $$0) {
         uj $$1 = new uj();
         $$1.a("id", lx.f.b(bug.h).toString());
         return new dsd.c(cyg.a($$1), $$0, 600);
      }

      @Nullable
      public btz a(dev $$0, jg $$1) {
         uj $$2 = this.d.c();
         dsd.f.forEach($$2::r);
         btz $$3 = bug.a($$2, $$0, buf.r, $$0x -> $$0x);
         if ($$3 != null && $$3.aq().a(axd.e)) {
            $$3.f(true);
            if ($$3 instanceof cgn $$4) {
               $$4.i($$1);
               a(this.e, $$4);
            }

            return $$3;
         } else {
            return null;
         }
      }

      private static void a(int $$0, cgn $$1) {
         int $$2 = $$1.g();
         if ($$2 < 0) {
            $$1.c_(Math.min(0, $$2 + $$0));
         } else if ($$2 > 0) {
            $$1.c_(Math.max(0, $$2 - $$0));
         }

         $$1.s(Math.max(0, $$1.gD() - $$0));
      }

      public cyg a() {
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
