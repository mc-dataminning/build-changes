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

public class dwk extends dwn {
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
   private final List<dwk.a> i = Lists.newArrayList();
   @Nullable
   private iu j;

   public dwk(iu $$0, dzo $$1) {
      super(dwp.I, $$0, $$1);
   }

   @Override
   public void e() {
      if (this.a()) {
         this.a(null, this.n.a_(this.aw_()), dwk.b.c);
      }

      super.e();
   }

   public boolean a() {
      if (this.n == null) {
         return false;
      } else {
         for (iu $$0 : iu.c(this.o.b(-1, -1, -1), this.o.b(1, 1, 1))) {
            if (this.n.a_($$0).b() instanceof dov) {
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

   public void a(@Nullable cqs $$0, dzo $$1, dwk.b $$2) {
      List<bwa> $$3 = this.a($$1, $$2);
      if ($$0 != null) {
         for (bwa $$4 : $$3) {
            if ($$4 instanceof cip) {
               cip $$5 = (cip)$$4;
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

   private List<bwa> a(dzo $$0, dwk.b $$1) {
      List<bwa> $$2 = Lists.newArrayList();
      this.i.removeIf($$3 -> a(this.n, this.o, $$0, $$3.b(), $$2, $$1, this.j));
      if (!$$2.isEmpty()) {
         super.e();
      }

      return $$2;
   }

   @bat
   public int f() {
      return this.i.size();
   }

   public static int a(dzo $$0) {
      return $$0.c(dlo.c);
   }

   @bat
   public boolean j() {
      return dmj.a(this.n, this.aw_());
   }

   public void a(cip $$0) {
      if (this.i.size() < 3) {
         $$0.bP();
         $$0.bO();
         $$0.y();
         this.a(dwk.c.a($$0));
         if (this.n != null) {
            if ($$0.t() && (!this.k() || this.n.A.h())) {
               this.j = $$0.q();
            }

            iu $$1 = this.aw_();
            this.n.a(null, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), awl.bV, awm.e, 1.0F, 1.0F);
            this.n.a(eeo.c, $$1, eeo.a.a($$0, this.m()));
         }

         $$0.at();
         super.e();
      }
   }

   public void a(dwk.c $$0) {
      this.i.add(new dwk.a($$0));
   }

   private static boolean a(dip $$0, iu $$1, dzo $$2, dwk.c $$3, @Nullable List<bwa> $$4, dwk.b $$5, @Nullable iu $$6) {
      if (cip.c($$0) && $$5 != dwk.b.c) {
         return false;
      } else {
         ja $$7 = $$2.c(dlo.b);
         iu $$8 = $$1.a($$7);
         boolean $$9 = !$$0.a_($$8).g($$0, $$8).c();
         if ($$9 && $$5 != dwk.b.c) {
            return false;
         } else {
            bwa $$10 = $$3.a($$0, $$1);
            if ($$10 != null) {
               if ($$10 instanceof cip $$11) {
                  if ($$6 != null && !$$11.t() && $$0.A.i() < 0.9F) {
                     $$11.h($$6);
                  }

                  if ($$5 == dwk.b.a) {
                     $$11.gG();
                     if ($$2.a(axa.aJ, $$0x -> $$0x.b(dlo.c))) {
                        int $$12 = a($$2);
                        if ($$12 < 5) {
                           int $$13 = $$0.A.a(100) == 0 ? 2 : 1;
                           if ($$12 + $$13 > 5) {
                              $$13--;
                           }

                           $$0.b($$1, $$2.b(dlo.c, Integer.valueOf($$12 + $$13)));
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

               $$0.a(null, $$1, awl.bW, awm.e, 1.0F, 1.0F);
               $$0.a(eeo.c, $$1, eeo.a.a($$10, $$0.a_($$1)));
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

   private static void a(dip $$0, iu $$1, dzo $$2, List<dwk.a> $$3, @Nullable iu $$4) {
      boolean $$5 = false;
      Iterator<dwk.a> $$6 = $$3.iterator();

      while ($$6.hasNext()) {
         dwk.a $$7 = $$6.next();
         if ($$7.a()) {
            dwk.b $$8 = $$7.c() ? dwk.b.a : dwk.b.b;
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

   public static void a(dip $$0, iu $$1, dzo $$2, dwk $$3) {
      a($$0, $$1, $$2, $$3.i, $$3.j);
      if (!$$3.i.isEmpty() && $$0.C_().j() < 0.005) {
         double $$4 = (double)$$1.u() + 0.5;
         double $$5 = (double)$$1.v();
         double $$6 = (double)$$1.w() + 0.5;
         $$0.a(null, $$4, $$5, $$6, awl.bY, awm.e, 1.0F, 1.0F);
      }

      agk.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(tx $$0, jg.a $$1) {
      super.a($$0, $$1);
      this.i.clear();
      if ($$0.e("bees")) {
         dwk.c.b.parse(ul.a, $$0.c("bees")).resultOrPartial($$0x -> c.error("Failed to parse bees: '{}'", $$0x)).ifPresent($$0x -> $$0x.forEach(this::a));
      }

      this.j = um.a($$0, "flower_pos").orElse(null);
   }

   @Override
   protected void b(tx $$0, jg.a $$1) {
      super.b($$0, $$1);
      $$0.a("bees", (uu)dwk.c.b.encodeStart(ul.a, this.s()).getOrThrow());
      if (this.k()) {
         $$0.a("flower_pos", um.a(this.j));
      }
   }

   @Override
   protected void a(ke $$0) {
      super.a($$0);
      this.i.clear();
      List<dwk.c> $$1 = $$0.a(kj.ar, dar.c).a();
      $$1.forEach(this::a);
   }

   @Override
   protected void a(kg.a $$0) {
      super.a($$0);
      $$0.a(kj.ar, new dar(this.s()));
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      $$0.r("bees");
   }

   private List<dwk.c> s() {
      return this.i.stream().map(dwk.a::b).toList();
   }

   static class a {
      private final dwk.c a;
      private int b;

      a(dwk.c $$0) {
         this.a = $$0;
         this.b = $$0.b();
      }

      public boolean a() {
         return this.b++ > this.a.f;
      }

      public dwk.c b() {
         return new dwk.c(this.a.d, this.b, this.a.f);
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

   public static record c(dba d, int e, int f) {
      public static final Codec<dwk.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dba.b.optionalFieldOf("entity_data", dba.a).forGetter(dwk.c::a),
                  Codec.INT.fieldOf("ticks_in_hive").forGetter(dwk.c::b),
                  Codec.INT.fieldOf("min_ticks_in_hive").forGetter(dwk.c::c)
               )
               .apply($$0, dwk.c::new)
      );
      public static final Codec<List<dwk.c>> b = a.listOf();
      public static final yu<ByteBuf, dwk.c> c = yu.a(dba.d, dwk.c::a, ys.h, dwk.c::b, ys.h, dwk.c::c, dwk.c::new);

      public static dwk.c a(bwa $$0) {
         tx $$1 = new tx();
         $$0.e($$1);
         dwk.f.forEach($$1::r);
         boolean $$2 = $$1.q("HasNectar");
         return new dwk.c(dba.a($$1), 0, $$2 ? 2400 : 600);
      }

      public static dwk.c a(int $$0) {
         tx $$1 = new tx();
         $$1.a("id", mf.f.b(bwj.l).toString());
         return new dwk.c(dba.a($$1), $$0, 600);
      }

      @Nullable
      public bwa a(dip $$0, iu $$1) {
         tx $$2 = this.d.d();
         dwk.f.forEach($$2::r);
         bwa $$3 = bwj.a($$2, $$0, bwi.r, $$0x -> $$0x);
         if ($$3 != null && $$3.aq().a(axd.e)) {
            $$3.f(true);
            if ($$3 instanceof cip $$4) {
               $$4.i($$1);
               a(this.e, $$4);
            }

            return $$3;
         } else {
            return null;
         }
      }

      private static void a(int $$0, cip $$1) {
         int $$2 = $$1.g();
         if ($$2 < 0) {
            $$1.c_(Math.min(0, $$2 + $$0));
         } else if ($$2 > 0) {
            $$1.c_(Math.max(0, $$2 - $$0));
         }

         $$1.r(Math.max(0, $$1.gy() - $$0));
      }

      public dba a() {
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
