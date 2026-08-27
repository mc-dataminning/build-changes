import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class diq extends dit {
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
   private final List<diq.a> l = Lists.newArrayList();
   @Nullable
   private hz m;

   public diq(hz $$0, dlf $$1) {
      super(div.H, $$0, $$1);
   }

   @Override
   public void e() {
      if (this.c()) {
         this.a(null, this.o.a_(this.aE_()), diq.b.c);
      }

      super.e();
   }

   public boolean c() {
      if (this.o == null) {
         return false;
      } else {
         for (hz $$0 : hz.a(this.p.b(-1, -1, -1), this.p.b(1, 1, 1))) {
            if (this.o.a_($$0).b() instanceof dbo) {
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

   public void a(@Nullable chh $$0, dlf $$1, diq.b $$2) {
      List<bno> $$3 = this.a($$1, $$2);
      if ($$0 != null) {
         for (bno $$4 : $$3) {
            if ($$4 instanceof bzu) {
               bzu $$5 = (bzu)$$4;
               if ($$0.dk().g($$4.dk()) <= 16.0) {
                  if (!this.k()) {
                     $$5.h($$0);
                  } else {
                     $$5.u(400);
                  }
               }
            }
         }
      }
   }

   private List<bno> a(dlf $$0, diq.b $$1) {
      List<bno> $$2 = Lists.newArrayList();
      this.l.removeIf($$3 -> a(this.o, this.p, $$0, $$3, $$2, $$1, this.m));
      if (!$$2.isEmpty()) {
         super.e();
      }

      return $$2;
   }

   public void a(bno $$0, boolean $$1) {
      this.a($$0, $$1, 0);
   }

   @axl
   public int g() {
      return this.l.size();
   }

   public static int a(dlf $$0) {
      return $$0.c(cyi.c);
   }

   @axl
   public boolean k() {
      return czc.a(this.o, this.aE_());
   }

   public void a(bno $$0, boolean $$1, int $$2) {
      if (this.l.size() < 3) {
         $$0.ac();
         $$0.bB();
         sw $$3 = new sw();
         $$0.e($$3);
         this.a($$3, $$2, $$1);
         if (this.o != null) {
            if ($$0 instanceof bzu $$4 && $$4.w() && (!this.m() || this.o.z.h())) {
               this.m = $$4.u();
            }

            hz $$5 = this.aE_();
            this.o.a(null, (double)$$5.u(), (double)$$5.v(), (double)$$5.w(), atk.bS, atl.e, 1.0F, 1.0F);
            this.o.a(dpp.c, $$5, dpp.a.a($$0, this.r()));
         }

         $$0.am();
         super.e();
      }
   }

   public void a(sw $$0, int $$1, boolean $$2) {
      this.l.add(new diq.a($$0, $$1, $$2 ? 2400 : 600));
   }

   private static boolean a(cvn $$0, hz $$1, dlf $$2, diq.a $$3, @Nullable List<bno> $$4, diq.b $$5, @Nullable hz $$6) {
      if (($$0.Q() || $$0.ab()) && $$5 != diq.b.c) {
         return false;
      } else {
         sw $$7 = $$3.a.h();
         d($$7);
         $$7.a("HivePos", tl.a($$1));
         $$7.a("NoGravity", true);
         ie $$8 = $$2.c(cyi.b);
         hz $$9 = $$1.a($$8);
         boolean $$10 = !$$0.a_($$9).k($$0, $$9).c();
         if ($$10 && $$5 != diq.b.c) {
            return false;
         } else {
            bno $$11 = bnu.a($$7, $$0, $$0x -> $$0x);
            if ($$11 != null) {
               if (!$$11.ai().a(auc.e)) {
                  return false;
               } else {
                  if ($$11 instanceof bzu $$12) {
                     if ($$6 != null && !$$12.w() && $$0.z.i() < 0.9F) {
                        $$12.i($$6);
                     }

                     if ($$5 == diq.b.a) {
                        $$12.gu();
                        if ($$2.a(atz.aF, $$0x -> $$0x.b(cyi.c))) {
                           int $$13 = a($$2);
                           if ($$13 < 5) {
                              int $$14 = $$0.z.a(100) == 0 ? 2 : 1;
                              if ($$13 + $$14 > 5) {
                                 $$14--;
                              }

                              $$0.b($$1, $$2.a(cyi.c, Integer.valueOf($$13 + $$14)));
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
                     $$11.b($$17, $$18, $$19, $$11.dC(), $$11.dE());
                  }

                  $$0.a(null, $$1, atk.bT, atl.e, 1.0F, 1.0F);
                  $$0.a(dpp.c, $$1, dpp.a.a($$11, $$0.a_($$1)));
                  return $$0.b($$11);
               }
            } else {
               return false;
            }
         }
      }
   }

   static void d(sw $$0) {
      for (String $$1 : i) {
         $$0.r($$1);
      }
   }

   private static void a(int $$0, bzu $$1) {
      int $$2 = $$1.h();
      if ($$2 < 0) {
         $$1.c_(Math.min(0, $$2 + $$0));
      } else if ($$2 > 0) {
         $$1.c_(Math.max(0, $$2 - $$0));
      }

      $$1.t(Math.max(0, $$1.gi() - $$0));
   }

   private boolean m() {
      return this.m != null;
   }

   private static void a(cvn $$0, hz $$1, dlf $$2, List<diq.a> $$3, @Nullable hz $$4) {
      boolean $$5 = false;
      Iterator<diq.a> $$6 = $$3.iterator();

      while ($$6.hasNext()) {
         diq.a $$7 = $$6.next();
         if ($$7.b > $$7.c) {
            diq.b $$8 = $$7.a.q("HasNectar") ? diq.b.a : diq.b.b;
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

   public static void a(cvn $$0, hz $$1, dlf $$2, diq $$3) {
      a($$0, $$1, $$2, $$3.l, $$3.m);
      if (!$$3.l.isEmpty() && $$0.F_().j() < 0.005) {
         double $$4 = (double)$$1.u() + 0.5;
         double $$5 = (double)$$1.v();
         double $$6 = (double)$$1.w() + 0.5;
         $$0.a(null, $$4, $$5, $$6, atk.bV, atl.e, 1.0F, 1.0F);
      }

      aep.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.l.clear();
      tc $$1 = $$0.c("Bees", 10);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         sw $$3 = $$1.a($$2);
         diq.a $$4 = new diq.a($$3.p("EntityData").h(), $$3.h("TicksInHive"), $$3.h("MinOccupationTicks"));
         this.l.add($$4);
      }

      this.m = null;
      if ($$0.e("FlowerPos")) {
         this.m = tl.b($$0.p("FlowerPos"));
      }
   }

   @Override
   protected void b(sw $$0) {
      super.b($$0);
      $$0.a("Bees", this.l());
      if (this.m()) {
         $$0.a("FlowerPos", tl.a(this.m));
      }
   }

   public tc l() {
      tc $$0 = new tc();

      for (diq.a $$1 : this.l) {
         sw $$2 = $$1.a.h();
         $$2.r("UUID");
         sw $$3 = new sw();
         $$3.a("EntityData", $$2);
         $$3.a("TicksInHive", $$1.b);
         $$3.a("MinOccupationTicks", $$1.c);
         $$0.add($$3);
      }

      return $$0;
   }

   static class a {
      final sw a;
      int b;
      final int c;

      a(sw $$0, int $$1, int $$2) {
         diq.d($$0);
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
