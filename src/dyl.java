import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class dyl extends dyo {
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
   private final List<dyl.a> h = Lists.newArrayList();
   @Nullable
   private iw i;

   public dyl(iw $$0, ebq $$1) {
      super(dyq.I, $$0, $$1);
   }

   @Override
   public void e() {
      if (this.a()) {
         this.a(null, this.n.a_(this.ax_()), dyl.b.c);
      }

      super.e();
   }

   public boolean a() {
      if (this.n == null) {
         return false;
      } else {
         for (iw $$0 : iw.c(this.o.b(-1, -1, -1), this.o.b(1, 1, 1))) {
            if (this.n.a_($$0).b() instanceof dqq) {
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

   public void a(@Nullable csi $$0, ebq $$1, dyl.b $$2) {
      List<bxe> $$3 = this.a($$1, $$2);
      if ($$0 != null) {
         for (bxe $$4 : $$3) {
            if ($$4 instanceof cjw) {
               cjw $$5 = (cjw)$$4;
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

   private List<bxe> a(ebq $$0, dyl.b $$1) {
      List<bxe> $$2 = Lists.newArrayList();
      this.h.removeIf($$3 -> a(this.n, this.o, $$0, $$3.b(), $$2, $$1, this.i));
      if (!$$2.isEmpty()) {
         super.e();
      }

      return $$2;
   }

   @bbi
   public int f() {
      return this.h.size();
   }

   public static int a(ebq $$0) {
      return $$0.c(dni.c);
   }

   @bbi
   public boolean j() {
      return doe.a(this.n, this.ax_());
   }

   public void a(cjw $$0) {
      if (this.h.size() < 3) {
         $$0.bO();
         $$0.bN();
         $$0.x();
         this.a(dyl.c.a($$0));
         if (this.n != null) {
            if ($$0.p() && (!this.k() || this.n.A.h())) {
               this.i = $$0.m();
            }

            iw $$1 = this.ax_();
            this.n.a(null, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), awy.bV, awz.e, 1.0F, 1.0F);
            this.n.a(egq.c, $$1, egq.a.a($$0, this.m()));
         }

         $$0.aq();
         super.e();
      }
   }

   public void a(dyl.c $$0) {
      this.h.add(new dyl.a($$0));
   }

   private static boolean a(dkj $$0, iw $$1, ebq $$2, dyl.c $$3, @Nullable List<bxe> $$4, dyl.b $$5, @Nullable iw $$6) {
      if (cjw.c($$0) && $$5 != dyl.b.c) {
         return false;
      } else {
         jc $$7 = $$2.c(dni.b);
         iw $$8 = $$1.a($$7);
         boolean $$9 = !$$0.a_($$8).g($$0, $$8).c();
         if ($$9 && $$5 != dyl.b.c) {
            return false;
         } else {
            bxe $$10 = $$3.a($$0, $$1);
            if ($$10 != null) {
               if ($$10 instanceof cjw $$11) {
                  if ($$6 != null && !$$11.p() && $$0.A.i() < 0.9F) {
                     $$11.h($$6);
                  }

                  if ($$5 == dyl.b.a) {
                     $$11.gK();
                     if ($$2.a(axn.aJ, $$0x -> $$0x.b(dni.c))) {
                        int $$12 = a($$2);
                        if ($$12 < 5) {
                           int $$13 = $$0.A.a(100) == 0 ? 2 : 1;
                           if ($$12 + $$13 > 5) {
                              $$13--;
                           }

                           $$0.b($$1, $$2.b(dni.c, Integer.valueOf($$12 + $$13)));
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

               $$0.a(null, $$1, awy.bW, awz.e, 1.0F, 1.0F);
               $$0.a(egq.c, $$1, egq.a.a($$10, $$0.a_($$1)));
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

   private static void a(dkj $$0, iw $$1, ebq $$2, List<dyl.a> $$3, @Nullable iw $$4) {
      boolean $$5 = false;
      Iterator<dyl.a> $$6 = $$3.iterator();

      while ($$6.hasNext()) {
         dyl.a $$7 = $$6.next();
         if ($$7.a()) {
            dyl.b $$8 = $$7.c() ? dyl.b.a : dyl.b.b;
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

   public static void a(dkj $$0, iw $$1, ebq $$2, dyl $$3) {
      a($$0, $$1, $$2, $$3.h, $$3.i);
      if (!$$3.h.isEmpty() && $$0.G_().j() < 0.005) {
         double $$4 = (double)$$1.u() + 0.5;
         double $$5 = (double)$$1.v();
         double $$6 = (double)$$1.w() + 0.5;
         $$0.a(null, $$4, $$5, $$6, awy.bY, awz.e, 1.0F, 1.0F);
      }

      agx.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ua $$0, ji.a $$1) {
      super.a($$0, $$1);
      this.h.clear();
      $$0.<List>a("bees", dyl.c.b).orElse(List.of()).forEach(this::a);
      this.i = $$0.<iw>a("flower_pos", iw.a).orElse(null);
   }

   @Override
   protected void b(ua $$0, ji.a $$1) {
      super.b($$0, $$1);
      $$0.a("bees", dyl.c.b, this.s());
      $$0.b("flower_pos", iw.a, this.i);
   }

   @Override
   protected void a(kg $$0) {
      super.a($$0);
      this.h.clear();
      List<dyl.c> $$1 = $$0.a(kl.ar, dcj.c).a();
      $$1.forEach(this::a);
   }

   @Override
   protected void a(ki.a $$0) {
      super.a($$0);
      $$0.a(kl.ar, new dcj(this.s()));
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      $$0.r("bees");
   }

   private List<dyl.c> s() {
      return this.h.stream().map(dyl.a::b).toList();
   }

   static class a {
      private final dyl.c a;
      private int b;

      a(dyl.c $$0) {
         this.a = $$0;
         this.b = $$0.b();
      }

      public boolean a() {
         return this.b++ > this.a.f;
      }

      public dyl.c b() {
         return new dyl.c(this.a.d, this.b, this.a.f);
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

   public static record c(dcs d, int e, int f) {
      public static final Codec<dyl.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  dcs.b.optionalFieldOf("entity_data", dcs.a).forGetter(dyl.c::a),
                  Codec.INT.fieldOf("ticks_in_hive").forGetter(dyl.c::b),
                  Codec.INT.fieldOf("min_ticks_in_hive").forGetter(dyl.c::c)
               )
               .apply($$0, dyl.c::new)
      );
      public static final Codec<List<dyl.c>> b = a.listOf();
      public static final ze<ByteBuf, dyl.c> c = ze.a(dcs.d, dyl.c::a, zc.h, dyl.c::b, zc.h, dyl.c::c, dyl.c::new);

      public static dyl.c a(bxe $$0) {
         ua $$1 = new ua();
         $$0.g($$1);
         dyl.e.forEach($$1::r);
         boolean $$2 = $$1.b("HasNectar", false);
         return new dyl.c(dcs.a($$1), 0, $$2 ? 2400 : 600);
      }

      public static dyl.c a(int $$0) {
         ua $$1 = new ua();
         $$1.a("id", mh.f.b(bxn.m).toString());
         return new dyl.c(dcs.a($$1), $$0, 600);
      }

      @Nullable
      public bxe a(dkj $$0, iw $$1) {
         ua $$2 = this.d.d();
         dyl.e.forEach($$2::r);
         bxe $$3 = bxn.a($$2, $$0, bxm.r, $$0x -> $$0x);
         if ($$3 != null && $$3.an().a(axq.e)) {
            $$3.f(true);
            if ($$3 instanceof cjw $$4) {
               $$4.i($$1);
               a(this.e, $$4);
            }

            return $$3;
         } else {
            return null;
         }
      }

      private static void a(int $$0, cjw $$1) {
         int $$2 = $$1.Y_();
         if ($$2 < 0) {
            $$1.c_(Math.min(0, $$2 + $$0));
         } else if ($$2 > 0) {
            $$1.c_(Math.max(0, $$2 - $$0));
         }

         $$1.r(Math.max(0, $$1.gC() - $$0));
      }

      public dcs a() {
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
