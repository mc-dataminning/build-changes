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

public class dvi extends dvl {
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
   private static final int g = 400;
   private static final int h = 2400;
   public static final int b = 600;
   private final List<dvi.a> i = Lists.newArrayList();
   @Nullable
   private jj j;

   public dvi(jj $$0, dym $$1) {
      super(dvn.I, $$0, $$1);
   }

   @Override
   public void e() {
      if (this.a()) {
         this.a(null, this.n.a_(this.aw_()), dvi.b.c);
      }

      super.e();
   }

   public boolean a() {
      if (this.n == null) {
         return false;
      } else {
         for (jj $$0 : jj.c(this.o.b(-1, -1, -1), this.o.b(1, 1, 1))) {
            if (this.n.a_($$0).b() instanceof dnv) {
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

   public void a(@Nullable cqi $$0, dym $$1, dvi.b $$2) {
      List<bvs> $$3 = this.a($$1, $$2);
      if ($$0 != null) {
         for (bvs $$4 : $$3) {
            if ($$4 instanceof cih) {
               cih $$5 = (cih)$$4;
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

   private List<bvs> a(dym $$0, dvi.b $$1) {
      List<bvs> $$2 = Lists.newArrayList();
      this.i.removeIf($$3 -> a(this.n, this.o, $$0, $$3.b(), $$2, $$1, this.j));
      if (!$$2.isEmpty()) {
         super.e();
      }

      return $$2;
   }

   @bar
   public int f() {
      return this.i.size();
   }

   public static int a(dym $$0) {
      return $$0.c(dko.c);
   }

   @bar
   public boolean j() {
      return dlj.a(this.n, this.aw_());
   }

   public void a(cih $$0) {
      if (this.i.size() < 3) {
         $$0.bP();
         $$0.bO();
         $$0.y();
         this.a(dvi.c.a($$0));
         if (this.n != null) {
            if ($$0.t() && (!this.k() || this.n.A.h())) {
               this.j = $$0.q();
            }

            jj $$1 = this.aw_();
            this.n.a(null, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), awk.bV, awl.e, 1.0F, 1.0F);
            this.n.a(edm.c, $$1, edm.a.a($$0, this.m()));
         }

         $$0.at();
         super.e();
      }
   }

   public void a(dvi.c $$0) {
      this.i.add(new dvi.a($$0));
   }

   private static boolean a(dhp $$0, jj $$1, dym $$2, dvi.c $$3, @Nullable List<bvs> $$4, dvi.b $$5, @Nullable jj $$6) {
      if (cih.c($$0) && $$5 != dvi.b.c) {
         return false;
      } else {
         jo $$7 = $$2.c(dko.b);
         jj $$8 = $$1.a($$7);
         boolean $$9 = !$$0.a_($$8).g($$0, $$8).c();
         if ($$9 && $$5 != dvi.b.c) {
            return false;
         } else {
            bvs $$10 = $$3.a($$0, $$1);
            if ($$10 != null) {
               if ($$10 instanceof cih $$11) {
                  if ($$6 != null && !$$11.t() && $$0.A.i() < 0.9F) {
                     $$11.i($$6);
                  }

                  if ($$5 == dvi.b.a) {
                     $$11.gG();
                     if ($$2.a(awz.aJ, $$0x -> $$0x.b(dko.c))) {
                        int $$12 = a($$2);
                        if ($$12 < 5) {
                           int $$13 = $$0.A.a(100) == 0 ? 2 : 1;
                           if ($$12 + $$13 > 5) {
                              $$13--;
                           }

                           $$0.b($$1, $$2.b(dko.c, Integer.valueOf($$12 + $$13)));
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

               $$0.a(null, $$1, awk.bW, awl.e, 1.0F, 1.0F);
               $$0.a(edm.c, $$1, edm.a.a($$10, $$0.a_($$1)));
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

   private static void a(dhp $$0, jj $$1, dym $$2, List<dvi.a> $$3, @Nullable jj $$4) {
      boolean $$5 = false;
      Iterator<dvi.a> $$6 = $$3.iterator();

      while ($$6.hasNext()) {
         dvi.a $$7 = $$6.next();
         if ($$7.a()) {
            dvi.b $$8 = $$7.c() ? dvi.b.a : dvi.b.b;
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

   public static void a(dhp $$0, jj $$1, dym $$2, dvi $$3) {
      a($$0, $$1, $$2, $$3.i, $$3.j);
      if (!$$3.i.isEmpty() && $$0.C_().j() < 0.005) {
         double $$4 = (double)$$1.u() + 0.5;
         double $$5 = (double)$$1.v();
         double $$6 = (double)$$1.w() + 0.5;
         $$0.a(null, $$4, $$5, $$6, awk.bY, awl.e, 1.0F, 1.0F);
      }

      agj.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(tw $$0, ju.a $$1) {
      super.a($$0, $$1);
      this.i.clear();
      if ($$0.e("bees")) {
         dvi.c.b.parse(uk.a, $$0.c("bees")).resultOrPartial($$0x -> c.error("Failed to parse bees: '{}'", $$0x)).ifPresent($$0x -> $$0x.forEach(this::a));
      }

      this.j = ul.a($$0, "flower_pos").orElse(null);
   }

   @Override
   protected void b(tw $$0, ju.a $$1) {
      super.b($$0, $$1);
      $$0.a("bees", (ut)dvi.c.b.encodeStart(uk.a, this.s()).getOrThrow());
      if (this.k()) {
         $$0.a("flower_pos", ul.a(this.j));
      }
   }

   @Override
   protected void a(kr $$0) {
      super.a($$0);
      this.i.clear();
      List<dvi.c> $$1 = $$0.a(kx.ap, List.of());
      $$1.forEach(this::a);
   }

   @Override
   protected void a(kt.a $$0) {
      super.a($$0);
      $$0.a(kx.ap, this.s());
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      $$0.r("bees");
   }

   private List<dvi.c> s() {
      return this.i.stream().map(dvi.a::b).toList();
   }

   static class a {
      private final dvi.c a;
      private int b;

      a(dvi.c $$0) {
         this.a = $$0;
         this.b = $$0.b();
      }

      public boolean a() {
         return this.b++ > this.a.f;
      }

      public dvi.c b() {
         return new dvi.c(this.a.d, this.b, this.a.f);
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

   public static record c(dae d, int e, int f) {
      public static final Codec<dvi.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dae.b.optionalFieldOf("entity_data", dae.a).forGetter(dvi.c::a),
                  Codec.INT.fieldOf("ticks_in_hive").forGetter(dvi.c::b),
                  Codec.INT.fieldOf("min_ticks_in_hive").forGetter(dvi.c::c)
               )
               .apply($$0, dvi.c::new)
      );
      public static final Codec<List<dvi.c>> b = a.listOf();
      public static final yt<ByteBuf, dvi.c> c = yt.a(dae.d, dvi.c::a, yr.h, dvi.c::b, yr.h, dvi.c::c, dvi.c::new);

      public static dvi.c a(bvs $$0) {
         tw $$1 = new tw();
         $$0.e($$1);
         dvi.f.forEach($$1::r);
         boolean $$2 = $$1.q("HasNectar");
         return new dvi.c(dae.a($$1), 0, $$2 ? 2400 : 600);
      }

      public static dvi.c a(int $$0) {
         tw $$1 = new tw();
         $$1.a("id", md.f.b(bwb.l).toString());
         return new dvi.c(dae.a($$1), $$0, 600);
      }

      @Nullable
      public bvs a(dhp $$0, jj $$1) {
         tw $$2 = this.d.d();
         dvi.f.forEach($$2::r);
         bvs $$3 = bwb.a($$2, $$0, bwa.r, $$0x -> $$0x);
         if ($$3 != null && $$3.aq().a(axd.e)) {
            $$3.f(true);
            if ($$3 instanceof cih $$4) {
               $$4.j($$1);
               a(this.e, $$4);
            }

            return $$3;
         } else {
            return null;
         }
      }

      private static void a(int $$0, cih $$1) {
         int $$2 = $$1.g();
         if ($$2 < 0) {
            $$1.c_(Math.min(0, $$2 + $$0));
         } else if ($$2 > 0) {
            $$1.c_(Math.max(0, $$2 - $$0));
         }

         $$1.r(Math.max(0, $$1.gy() - $$0));
      }

      public dae a() {
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
