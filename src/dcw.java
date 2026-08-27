import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class dcw extends dcz {
   public static final String a = "FlowerPos";
   public static final String b = "MinOccupationTicks";
   public static final String c = "EntityData";
   public static final String d = "TicksInHive";
   public static final String e = "HasNectar";
   public static final String f = "Bees";
   private static final List<String> i = Arrays.asList(
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
      "CannotEnterHiveTicks",
      "TicksSincePollination",
      "CropsGrownSincePollination",
      "HivePos",
      "Passengers",
      "Leash",
      "UUID"
   );
   public static final int g = 3;
   private static final int j = 400;
   private static final int k = 2400;
   public static final int h = 600;
   private final List<dcw.a> l = Lists.newArrayList();
   @Nullable
   private gw m;

   public dcw(gw $$0, dfd $$1) {
      super(ddb.H, $$0, $$1);
   }

   @Override
   public void e() {
      if (this.c()) {
         this.a(null, this.o.a_(this.p()), dcw.b.c);
      }

      super.e();
   }

   public boolean c() {
      if (this.o == null) {
         return false;
      } else {
         for (gw $$0 : gw.a(this.p.b(-1, -1, -1), this.p.b(1, 1, 1))) {
            if (this.o.a_($$0).b() instanceof cwa) {
               return true;
            }
         }

         return false;
      }
   }

   public boolean d() {
      return this.l.isEmpty();
   }

   public boolean f() {
      return this.l.size() == 3;
   }

   public void a(@Nullable cca $$0, dfd $$1, dcw.b $$2) {
      List<biw> $$3 = this.a($$1, $$2);
      if ($$0 != null) {
         for (biw $$4 : $$3) {
            if ($$4 instanceof buy) {
               buy $$5 = (buy)$$4;
               if ($$0.dj().g($$4.dj()) <= 16.0) {
                  if (!this.i()) {
                     $$5.h($$0);
                  } else {
                     $$5.t(400);
                  }
               }
            }
         }
      }
   }

   private List<biw> a(dfd $$0, dcw.b $$1) {
      List<biw> $$2 = Lists.newArrayList();
      this.l.removeIf($$3 -> a(this.o, this.p, $$0, $$3, $$2, $$1, this.m));
      if (!$$2.isEmpty()) {
         super.e();
      }

      return $$2;
   }

   public void a(biw $$0, boolean $$1) {
      this.a($$0, $$1, 0);
   }

   @atd
   public int g() {
      return this.l.size();
   }

   public static int a(dfd $$0) {
      return $$0.c(csw.c);
   }

   @atd
   public boolean i() {
      return ctq.a(this.o, this.p());
   }

   public void a(biw $$0, boolean $$1, int $$2) {
      if (this.l.size() < 3) {
         $$0.aa();
         $$0.bA();
         qw $$3 = new qw();
         $$0.e($$3);
         this.a($$3, $$2, $$1);
         if (this.o != null) {
            if ($$0 instanceof buy $$4 && $$4.t() && (!this.v() || this.o.z.h())) {
               this.m = $$4.s();
            }

            gw $$5 = this.p();
            this.o.a(null, (double)$$5.u(), (double)$$5.v(), (double)$$5.w(), apg.bG, aph.e, 1.0F, 1.0F);
            this.o.a(djn.c, $$5, djn.a.a($$0, this.q()));
         }

         $$0.ak();
         super.e();
      }
   }

   public void a(qw $$0, int $$1, boolean $$2) {
      this.l.add(new dcw.a($$0, $$1, $$2 ? 2400 : 600));
   }

   private static boolean a(cqb $$0, gw $$1, dfd $$2, dcw.a $$3, @Nullable List<biw> $$4, dcw.b $$5, @Nullable gw $$6) {
      if (($$0.O() || $$0.Z()) && $$5 != dcw.b.c) {
         return false;
      } else {
         qw $$7 = $$3.a.h();
         d($$7);
         $$7.a("HivePos", rj.a($$1));
         $$7.a("NoGravity", true);
         ha $$8 = $$2.c(csw.b);
         gw $$9 = $$1.a($$8);
         boolean $$10 = !$$0.a_($$9).k($$0, $$9).c();
         if ($$10 && $$5 != dcw.b.c) {
            return false;
         } else {
            biw $$11 = bja.a($$7, $$0, $$0x -> $$0x);
            if ($$11 != null) {
               if (!$$11.ag().a(apy.e)) {
                  return false;
               } else {
                  if ($$11 instanceof buy $$12) {
                     if ($$6 != null && !$$12.t() && $$0.z.i() < 0.9F) {
                        $$12.i($$6);
                     }

                     if ($$5 == dcw.b.a) {
                        $$12.gs();
                        if ($$2.a(apv.aF, $$0x -> $$0x.b(csw.c))) {
                           int $$13 = a($$2);
                           if ($$13 < 5) {
                              int $$14 = $$0.z.a(100) == 0 ? 2 : 1;
                              if ($$13 + $$14 > 5) {
                                 $$14--;
                              }

                              $$0.b($$1, $$2.a(csw.c, Integer.valueOf($$13 + $$14)));
                           }
                        }
                     }

                     a($$3.b, $$12);
                     if ($$4 != null) {
                        $$4.add($$12);
                     }

                     float $$15 = $$11.df();
                     double $$16 = $$10 ? 0.0 : 0.55 + (double)($$15 / 2.0F);
                     double $$17 = (double)$$1.u() + 0.5 + $$16 * (double)$$8.j();
                     double $$18 = (double)$$1.v() + 0.5 - (double)($$11.dg() / 2.0F);
                     double $$19 = (double)$$1.w() + 0.5 + $$16 * (double)$$8.l();
                     $$11.b($$17, $$18, $$19, $$11.dB(), $$11.dD());
                  }

                  $$0.a(null, $$1, apg.bH, aph.e, 1.0F, 1.0F);
                  $$0.a(djn.c, $$1, djn.a.a($$11, $$0.a_($$1)));
                  return $$0.b($$11);
               }
            } else {
               return false;
            }
         }
      }
   }

   static void d(qw $$0) {
      for (String $$1 : i) {
         $$0.r($$1);
      }
   }

   private static void a(int $$0, buy $$1) {
      int $$2 = $$1.h();
      if ($$2 < 0) {
         $$1.c_(Math.min(0, $$2 + $$0));
      } else if ($$2 > 0) {
         $$1.c_(Math.max(0, $$2 - $$0));
      }

      $$1.s(Math.max(0, $$1.gg() - $$0));
   }

   private boolean v() {
      return this.m != null;
   }

   private static void a(cqb $$0, gw $$1, dfd $$2, List<dcw.a> $$3, @Nullable gw $$4) {
      boolean $$5 = false;
      Iterator<dcw.a> $$6 = $$3.iterator();

      while ($$6.hasNext()) {
         dcw.a $$7 = $$6.next();
         if ($$7.b > $$7.c) {
            dcw.b $$8 = $$7.a.q("HasNectar") ? dcw.b.a : dcw.b.b;
            if (a($$0, $$1, $$2, $$7, null, $$8, $$4)) {
               $$5 = true;
               $$6.remove();
            }
         }

         $$7.b++;
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(cqb $$0, gw $$1, dfd $$2, dcw $$3) {
      a($$0, $$1, $$2, $$3.l, $$3.m);
      if (!$$3.l.isEmpty() && $$0.D_().j() < 0.005) {
         double $$4 = (double)$$1.u() + 0.5;
         double $$5 = (double)$$1.v();
         double $$6 = (double)$$1.w() + 0.5;
         $$0.a(null, $$4, $$5, $$6, apg.bJ, aph.e, 1.0F, 1.0F);
      }

      abc.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.l.clear();
      rc $$1 = $$0.c("Bees", 10);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         qw $$3 = $$1.a($$2);
         dcw.a $$4 = new dcw.a($$3.p("EntityData"), $$3.h("TicksInHive"), $$3.h("MinOccupationTicks"));
         this.l.add($$4);
      }

      this.m = null;
      if ($$0.e("FlowerPos")) {
         this.m = rj.b($$0.p("FlowerPos"));
      }
   }

   @Override
   protected void b(qw $$0) {
      super.b($$0);
      $$0.a("Bees", this.j());
      if (this.v()) {
         $$0.a("FlowerPos", rj.a(this.m));
      }
   }

   public rc j() {
      rc $$0 = new rc();

      for (dcw.a $$1 : this.l) {
         qw $$2 = $$1.a.h();
         $$2.r("UUID");
         qw $$3 = new qw();
         $$3.a("EntityData", $$2);
         $$3.a("TicksInHive", $$1.b);
         $$3.a("MinOccupationTicks", $$1.c);
         $$0.add($$3);
      }

      return $$0;
   }

   static class a {
      final qw a;
      int b;
      final int c;

      a(qw $$0, int $$1, int $$2) {
         dcw.d($$0);
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   public static enum b {
      a,
      b,
      c;
   }
}
