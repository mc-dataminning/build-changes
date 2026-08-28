import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class dyb extends dye {
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
   private final List<dyb.a> h = Lists.newArrayList();
   @Nullable
   private iw i;

   public dyb(iw $$0, ebg $$1) {
      super(dyg.I, $$0, $$1);
   }

   @Override
   public void e() {
      if (this.a()) {
         this.a(null, this.n.a_(this.aB_()), dyb.b.c);
      }

      super.e();
   }

   public boolean a() {
      if (this.n == null) {
         return false;
      } else {
         for (iw $$0 : iw.c(this.o.b(-1, -1, -1), this.o.b(1, 1, 1))) {
            if (this.n.a_($$0).b() instanceof dqg) {
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

   public void a(@Nullable crz $$0, ebg $$1, dyb.b $$2) {
      List<bwv> $$3 = this.a($$1, $$2);
      if ($$0 != null) {
         for (bwv $$4 : $$3) {
            if ($$4 instanceof cjn) {
               cjn $$5 = (cjn)$$4;
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

   private List<bwv> a(ebg $$0, dyb.b $$1) {
      List<bwv> $$2 = Lists.newArrayList();
      this.h.removeIf($$3 -> a(this.n, this.o, $$0, $$3.b(), $$2, $$1, this.i));
      if (!$$2.isEmpty()) {
         super.e();
      }

      return $$2;
   }

   @baz
   public int f() {
      return this.h.size();
   }

   public static int a(ebg $$0) {
      return $$0.c(dmy.c);
   }

   @baz
   public boolean j() {
      return dnu.a(this.n, this.aB_());
   }

   public void a(cjn $$0) {
      if (this.h.size() < 3) {
         $$0.bO();
         $$0.bN();
         $$0.y();
         this.a(dyb.c.a($$0));
         if (this.n != null) {
            if ($$0.t() && (!this.k() || this.n.A.h())) {
               this.i = $$0.q();
            }

            iw $$1 = this.aB_();
            this.n.a(null, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), awr.bV, aws.e, 1.0F, 1.0F);
            this.n.a(egg.c, $$1, egg.a.a($$0, this.m()));
         }

         $$0.aq();
         super.e();
      }
   }

   public void a(dyb.c $$0) {
      this.h.add(new dyb.a($$0));
   }

   private static boolean a(djz $$0, iw $$1, ebg $$2, dyb.c $$3, @Nullable List<bwv> $$4, dyb.b $$5, @Nullable iw $$6) {
      if (cjn.c($$0) && $$5 != dyb.b.c) {
         return false;
      } else {
         jc $$7 = $$2.c(dmy.b);
         iw $$8 = $$1.a($$7);
         boolean $$9 = !$$0.a_($$8).g($$0, $$8).c();
         if ($$9 && $$5 != dyb.b.c) {
            return false;
         } else {
            bwv $$10 = $$3.a($$0, $$1);
            if ($$10 != null) {
               if ($$10 instanceof cjn $$11) {
                  if ($$6 != null && !$$11.t() && $$0.A.i() < 0.9F) {
                     $$11.h($$6);
                  }

                  if ($$5 == dyb.b.a) {
                     $$11.gK();
                     if ($$2.a(axg.aJ, $$0x -> $$0x.b(dmy.c))) {
                        int $$12 = a($$2);
                        if ($$12 < 5) {
                           int $$13 = $$0.A.a(100) == 0 ? 2 : 1;
                           if ($$12 + $$13 > 5) {
                              $$13--;
                           }

                           $$0.b($$1, $$2.b(dmy.c, Integer.valueOf($$12 + $$13)));
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

               $$0.a(null, $$1, awr.bW, aws.e, 1.0F, 1.0F);
               $$0.a(egg.c, $$1, egg.a.a($$10, $$0.a_($$1)));
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

   private static void a(djz $$0, iw $$1, ebg $$2, List<dyb.a> $$3, @Nullable iw $$4) {
      boolean $$5 = false;
      Iterator<dyb.a> $$6 = $$3.iterator();

      while ($$6.hasNext()) {
         dyb.a $$7 = $$6.next();
         if ($$7.a()) {
            dyb.b $$8 = $$7.c() ? dyb.b.a : dyb.b.b;
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

   public static void a(djz $$0, iw $$1, ebg $$2, dyb $$3) {
      a($$0, $$1, $$2, $$3.h, $$3.i);
      if (!$$3.h.isEmpty() && $$0.G_().j() < 0.005) {
         double $$4 = (double)$$1.u() + 0.5;
         double $$5 = (double)$$1.v();
         double $$6 = (double)$$1.w() + 0.5;
         $$0.a(null, $$4, $$5, $$6, awr.bY, aws.e, 1.0F, 1.0F);
      }

      agq.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      this.h.clear();
      $$0.<List>a("bees", dyb.c.b).orElse(List.of()).forEach(this::a);
      this.i = $$0.<iw>a("flower_pos", iw.a).orElse(null);
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      $$0.a("bees", dyb.c.b, this.s());
      $$0.b("flower_pos", iw.a, this.i);
   }

   @Override
   protected void a(kg $$0) {
      super.a($$0);
      this.h.clear();
      List<dyb.c> $$1 = $$0.a(kl.ar, dbz.c).a();
      $$1.forEach(this::a);
   }

   @Override
   protected void a(ki.a $$0) {
      super.a($$0);
      $$0.a(kl.ar, new dbz(this.s()));
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      $$0.r("bees");
   }

   private List<dyb.c> s() {
      return this.h.stream().map(dyb.a::b).toList();
   }

   static class a {
      private final dyb.c a;
      private int b;

      a(dyb.c $$0) {
         this.a = $$0;
         this.b = $$0.b();
      }

      public boolean a() {
         return this.b++ > this.a.f;
      }

      public dyb.c b() {
         return new dyb.c(this.a.d, this.b, this.a.f);
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

   public static record c(dci d, int e, int f) {
      public static final Codec<dyb.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dci.b.optionalFieldOf("entity_data", dci.a).forGetter(dyb.c::a),
                  Codec.INT.fieldOf("ticks_in_hive").forGetter(dyb.c::b),
                  Codec.INT.fieldOf("min_ticks_in_hive").forGetter(dyb.c::c)
               )
               .apply($$0, dyb.c::new)
      );
      public static final Codec<List<dyb.c>> b = a.listOf();
      public static final za<ByteBuf, dyb.c> c = za.a(dci.d, dyb.c::a, yy.h, dyb.c::b, yy.h, dyb.c::c, dyb.c::new);

      public static dyb.c a(bwv $$0) {
         ua $$1 = new ua();
         $$0.g($$1);
         dyb.e.forEach($$1::r);
         boolean $$2 = $$1.b("HasNectar", false);
         return new dyb.c(dci.a($$1), 0, $$2 ? 2400 : 600);
      }

      public static dyb.c a(int $$0) {
         ua $$1 = new ua();
         $$1.a("id", mh.f.b(bxe.m).toString());
         return new dyb.c(dci.a($$1), $$0, 600);
      }

      @Nullable
      public bwv a(djz $$0, iw $$1) {
         ua $$2 = this.d.d();
         dyb.e.forEach($$2::r);
         bwv $$3 = bxe.a($$2, $$0, bxd.r, $$0x -> $$0x);
         if ($$3 != null && $$3.an().a(axj.e)) {
            $$3.f(true);
            if ($$3 instanceof cjn $$4) {
               $$4.i($$1);
               a(this.e, $$4);
            }

            return $$3;
         } else {
            return null;
         }
      }

      private static void a(int $$0, cjn $$1) {
         int $$2 = $$1.g();
         if ($$2 < 0) {
            $$1.c_(Math.min(0, $$2 + $$0));
         } else if ($$2 > 0) {
            $$1.c_(Math.max(0, $$2 - $$0));
         }

         $$1.r(Math.max(0, $$1.gC() - $$0));
      }

      public dci a() {
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
