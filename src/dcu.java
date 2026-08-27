import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class dcu extends dcx {
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
   private final List<dcu.a> l = Lists.newArrayList();
   @Nullable
   private gw m;

   public dcu(gw $$0, dfl $$1) {
      super(dcz.H, $$0, $$1);
   }

   @Override
   public void e() {
      if (this.c()) {
         this.a(null, this.o.a_(this.p()), dcu.b.c);
      }

      super.e();
   }

   public boolean c() {
      if (this.o == null) {
         return false;
      } else {
         for (gw $$0 : gw.a(this.p.b(-1, -1, -1), this.p.b(1, 1, 1))) {
            if (this.o.a_($$0).b() instanceof cvt) {
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

   public void a(@Nullable cbw $$0, dfl $$1, dcu.b $$2) {
      List<bis> $$3 = this.a($$1, $$2);
      if ($$0 != null) {
         for (bis $$4 : $$3) {
            if ($$4 instanceof buu) {
               buu $$5 = (buu)$$4;
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

   private List<bis> a(dfl $$0, dcu.b $$1) {
      List<bis> $$2 = Lists.newArrayList();
      this.l.removeIf($$3 -> a(this.o, this.p, $$0, $$3, $$2, $$1, this.m));
      if (!$$2.isEmpty()) {
         super.e();
      }

      return $$2;
   }

   public void a(bis $$0, boolean $$1) {
      this.a($$0, $$1, 0);
   }

   @ata
   public int g() {
      return this.l.size();
   }

   public static int a(dfl $$0) {
      return $$0.c(csr.b);
   }

   @ata
   public boolean i() {
      return ctk.a(this.o, this.p());
   }

   public void a(bis $$0, boolean $$1, int $$2) {
      if (this.l.size() < 3) {
         $$0.aa();
         $$0.bA();
         qy $$3 = new qy();
         $$0.e($$3);
         this.a($$3, $$2, $$1);
         if (this.o != null) {
            if ($$0 instanceof buu $$4 && $$4.t() && (!this.v() || this.o.z.h())) {
               this.m = $$4.s();
            }

            gw $$5 = this.p();
            this.o.a(null, (double)$$5.u(), (double)$$5.v(), (double)$$5.w(), apf.bG, apg.e, 1.0F, 1.0F);
            this.o.a(djv.c, $$5, djv.a.a($$0, this.q()));
         }

         $$0.ak();
         super.e();
      }
   }

   public void a(qy $$0, int $$1, boolean $$2) {
      this.l.add(new dcu.a($$0, $$1, $$2 ? 2400 : 600));
   }

   private static boolean a(cpx $$0, gw $$1, dfl $$2, dcu.a $$3, @Nullable List<bis> $$4, dcu.b $$5, @Nullable gw $$6) {
      if (($$0.O() || $$0.Z()) && $$5 != dcu.b.c) {
         return false;
      } else {
         qy $$7 = $$3.a.h();
         d($$7);
         $$7.a("HivePos", rl.a($$1));
         $$7.a("NoGravity", true);
         hc $$8 = $$2.c(csr.a);
         gw $$9 = $$1.a($$8);
         boolean $$10 = !$$0.a_($$9).k($$0, $$9).c();
         if ($$10 && $$5 != dcu.b.c) {
            return false;
         } else {
            bis $$11 = biw.a($$7, $$0, $$0x -> $$0x);
            if ($$11 != null) {
               if (!$$11.ag().a(apx.c)) {
                  return false;
               } else {
                  if ($$11 instanceof buu $$12) {
                     if ($$6 != null && !$$12.t() && $$0.z.i() < 0.9F) {
                        $$12.i($$6);
                     }

                     if ($$5 == dcu.b.a) {
                        $$12.gr();
                        if ($$2.a(apu.aF, $$0x -> $$0x.b(csr.b))) {
                           int $$13 = a($$2);
                           if ($$13 < 5) {
                              int $$14 = $$0.z.a(100) == 0 ? 2 : 1;
                              if ($$13 + $$14 > 5) {
                                 $$14--;
                              }

                              $$0.b($$1, $$2.a(csr.b, Integer.valueOf($$13 + $$14)));
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

                  $$0.a(null, $$1, apf.bH, apg.e, 1.0F, 1.0F);
                  $$0.a(djv.c, $$1, djv.a.a($$11, $$0.a_($$1)));
                  return $$0.b($$11);
               }
            } else {
               return false;
            }
         }
      }
   }

   static void d(qy $$0) {
      for (String $$1 : i) {
         $$0.r($$1);
      }
   }

   private static void a(int $$0, buu $$1) {
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

   private static void a(cpx $$0, gw $$1, dfl $$2, List<dcu.a> $$3, @Nullable gw $$4) {
      boolean $$5 = false;
      Iterator<dcu.a> $$6 = $$3.iterator();

      while ($$6.hasNext()) {
         dcu.a $$7 = $$6.next();
         if ($$7.b > $$7.c) {
            dcu.b $$8 = $$7.a.q("HasNectar") ? dcu.b.a : dcu.b.b;
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

   public static void a(cpx $$0, gw $$1, dfl $$2, dcu $$3) {
      a($$0, $$1, $$2, $$3.l, $$3.m);
      if (!$$3.l.isEmpty() && $$0.D_().j() < 0.005) {
         double $$4 = (double)$$1.u() + 0.5;
         double $$5 = (double)$$1.v();
         double $$6 = (double)$$1.w() + 0.5;
         $$0.a(null, $$4, $$5, $$6, apf.bJ, apg.e, 1.0F, 1.0F);
      }

      abd.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.l.clear();
      re $$1 = $$0.c("Bees", 10);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         qy $$3 = $$1.a($$2);
         dcu.a $$4 = new dcu.a($$3.p("EntityData"), $$3.h("TicksInHive"), $$3.h("MinOccupationTicks"));
         this.l.add($$4);
      }

      this.m = null;
      if ($$0.e("FlowerPos")) {
         this.m = rl.b($$0.p("FlowerPos"));
      }
   }

   @Override
   protected void b(qy $$0) {
      super.b($$0);
      $$0.a("Bees", this.j());
      if (this.v()) {
         $$0.a("FlowerPos", rl.a(this.m));
      }
   }

   public re j() {
      re $$0 = new re();

      for (dcu.a $$1 : this.l) {
         qy $$2 = $$1.a.h();
         $$2.r("UUID");
         qy $$3 = new qy();
         $$3.a("EntityData", $$2);
         $$3.a("TicksInHive", $$1.b);
         $$3.a("MinOccupationTicks", $$1.c);
         $$0.add($$3);
      }

      return $$0;
   }

   static class a {
      final qy a;
      int b;
      final int c;

      a(qy $$0, int $$1, int $$2) {
         dcu.d($$0);
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
