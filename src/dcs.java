import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class dcs extends dcv {
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
   private final List<dcs.a> l = Lists.newArrayList();
   @Nullable
   private gw m;

   public dcs(gw $$0, dfj $$1) {
      super(dcx.H, $$0, $$1);
   }

   @Override
   public void e() {
      if (this.c()) {
         this.a(null, this.o.a_(this.p()), dcs.b.c);
      }

      super.e();
   }

   public boolean c() {
      if (this.o == null) {
         return false;
      } else {
         for (gw $$0 : gw.a(this.p.b(-1, -1, -1), this.p.b(1, 1, 1))) {
            if (this.o.a_($$0).b() instanceof cvr) {
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

   public void a(@Nullable cbu $$0, dfj $$1, dcs.b $$2) {
      List<biq> $$3 = this.a($$1, $$2);
      if ($$0 != null) {
         for (biq $$4 : $$3) {
            if ($$4 instanceof bus) {
               bus $$5 = (bus)$$4;
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

   private List<biq> a(dfj $$0, dcs.b $$1) {
      List<biq> $$2 = Lists.newArrayList();
      this.l.removeIf($$3 -> a(this.o, this.p, $$0, $$3, $$2, $$1, this.m));
      if (!$$2.isEmpty()) {
         super.e();
      }

      return $$2;
   }

   public void a(biq $$0, boolean $$1) {
      this.a($$0, $$1, 0);
   }

   @asy
   public int g() {
      return this.l.size();
   }

   public static int a(dfj $$0) {
      return $$0.c(csp.b);
   }

   @asy
   public boolean i() {
      return cti.a(this.o, this.p());
   }

   public void a(biq $$0, boolean $$1, int $$2) {
      if (this.l.size() < 3) {
         $$0.ab();
         $$0.bB();
         qx $$3 = new qx();
         $$0.e($$3);
         this.a($$3, $$2, $$1);
         if (this.o != null) {
            if ($$0 instanceof bus $$4 && $$4.t() && (!this.v() || this.o.z.h())) {
               this.m = $$4.s();
            }

            gw $$5 = this.p();
            this.o.a(null, (double)$$5.u(), (double)$$5.v(), (double)$$5.w(), ape.bG, apf.e, 1.0F, 1.0F);
            this.o.a(djt.c, $$5, djt.a.a($$0, this.q()));
         }

         $$0.al();
         super.e();
      }
   }

   public void a(qx $$0, int $$1, boolean $$2) {
      this.l.add(new dcs.a($$0, $$1, $$2 ? 2400 : 600));
   }

   private static boolean a(cpv $$0, gw $$1, dfj $$2, dcs.a $$3, @Nullable List<biq> $$4, dcs.b $$5, @Nullable gw $$6) {
      if (($$0.O() || $$0.Z()) && $$5 != dcs.b.c) {
         return false;
      } else {
         qx $$7 = $$3.a.h();
         d($$7);
         $$7.a("HivePos", rj.a($$1));
         $$7.a("NoGravity", true);
         hc $$8 = $$2.c(csp.a);
         gw $$9 = $$1.a($$8);
         boolean $$10 = !$$0.a_($$9).k($$0, $$9).c();
         if ($$10 && $$5 != dcs.b.c) {
            return false;
         } else {
            biq $$11 = biu.a($$7, $$0, $$0x -> $$0x);
            if ($$11 != null) {
               if (!$$11.ah().a(apw.c)) {
                  return false;
               } else {
                  if ($$11 instanceof bus $$12) {
                     if ($$6 != null && !$$12.t() && $$0.z.i() < 0.9F) {
                        $$12.i($$6);
                     }

                     if ($$5 == dcs.b.a) {
                        $$12.gr();
                        if ($$2.a(apt.aF, $$0x -> $$0x.b(csp.b))) {
                           int $$13 = a($$2);
                           if ($$13 < 5) {
                              int $$14 = $$0.z.a(100) == 0 ? 2 : 1;
                              if ($$13 + $$14 > 5) {
                                 $$14--;
                              }

                              $$0.b($$1, $$2.a(csp.b, Integer.valueOf($$13 + $$14)));
                           }
                        }
                     }

                     a($$3.b, $$12);
                     if ($$4 != null) {
                        $$4.add($$12);
                     }

                     float $$15 = $$11.dg();
                     double $$16 = $$10 ? 0.0 : 0.55 + (double)($$15 / 2.0F);
                     double $$17 = (double)$$1.u() + 0.5 + $$16 * (double)$$8.j();
                     double $$18 = (double)$$1.v() + 0.5 - (double)($$11.dh() / 2.0F);
                     double $$19 = (double)$$1.w() + 0.5 + $$16 * (double)$$8.l();
                     $$11.b($$17, $$18, $$19, $$11.dB(), $$11.dD());
                  }

                  $$0.a(null, $$1, ape.bH, apf.e, 1.0F, 1.0F);
                  $$0.a(djt.c, $$1, djt.a.a($$11, $$0.a_($$1)));
                  return $$0.b($$11);
               }
            } else {
               return false;
            }
         }
      }
   }

   static void d(qx $$0) {
      for (String $$1 : i) {
         $$0.r($$1);
      }
   }

   private static void a(int $$0, bus $$1) {
      int $$2 = $$1.h();
      if ($$2 < 0) {
         $$1.c_(Math.min(0, $$2 + $$0));
      } else if ($$2 > 0) {
         $$1.c_(Math.max(0, $$2 - $$0));
      }

      $$1.s(Math.max(0, $$1.gf() - $$0));
   }

   private boolean v() {
      return this.m != null;
   }

   private static void a(cpv $$0, gw $$1, dfj $$2, List<dcs.a> $$3, @Nullable gw $$4) {
      boolean $$5 = false;
      Iterator<dcs.a> $$6 = $$3.iterator();

      while ($$6.hasNext()) {
         dcs.a $$7 = $$6.next();
         if ($$7.b > $$7.c) {
            dcs.b $$8 = $$7.a.q("HasNectar") ? dcs.b.a : dcs.b.b;
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

   public static void a(cpv $$0, gw $$1, dfj $$2, dcs $$3) {
      a($$0, $$1, $$2, $$3.l, $$3.m);
      if (!$$3.l.isEmpty() && $$0.D_().j() < 0.005) {
         double $$4 = (double)$$1.u() + 0.5;
         double $$5 = (double)$$1.v();
         double $$6 = (double)$$1.w() + 0.5;
         $$0.a(null, $$4, $$5, $$6, ape.bJ, apf.e, 1.0F, 1.0F);
      }

      abc.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(qx $$0) {
      super.a($$0);
      this.l.clear();
      rd $$1 = $$0.c("Bees", 10);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         qx $$3 = $$1.a($$2);
         dcs.a $$4 = new dcs.a($$3.p("EntityData"), $$3.h("TicksInHive"), $$3.h("MinOccupationTicks"));
         this.l.add($$4);
      }

      this.m = null;
      if ($$0.e("FlowerPos")) {
         this.m = rj.b($$0.p("FlowerPos"));
      }
   }

   @Override
   protected void b(qx $$0) {
      super.b($$0);
      $$0.a("Bees", this.j());
      if (this.v()) {
         $$0.a("FlowerPos", rj.a(this.m));
      }
   }

   public rd j() {
      rd $$0 = new rd();

      for (dcs.a $$1 : this.l) {
         qx $$2 = $$1.a.h();
         $$2.r("UUID");
         qx $$3 = new qx();
         $$3.a("EntityData", $$2);
         $$3.a("TicksInHive", $$1.b);
         $$3.a("MinOccupationTicks", $$1.c);
         $$0.add($$3);
      }

      return $$0;
   }

   static class a {
      final qx a;
      int b;
      final int c;

      a(qx $$0, int $$1, int $$2) {
         dcs.d($$0);
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
