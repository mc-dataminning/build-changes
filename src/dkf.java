import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class dkf extends dki {
   public static final String a = "flower_pos";
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
      "hive_pos",
      "Passengers",
      "leash",
      "UUID"
   );
   public static final int g = 3;
   private static final int j = 400;
   private static final int k = 2400;
   public static final int h = 600;
   private final List<dkf.a> l = Lists.newArrayList();
   @Nullable
   private ib m;

   public dkf(ib $$0, dnb $$1) {
      super(dkk.H, $$0, $$1);
   }

   @Override
   public void e() {
      if (this.b()) {
         this.a(null, this.o.a_(this.aC_()), dkf.b.c);
      }

      super.e();
   }

   public boolean b() {
      if (this.o == null) {
         return false;
      } else {
         for (ib $$0 : ib.a(this.p.b(-1, -1, -1), this.p.b(1, 1, 1))) {
            if (this.o.a_($$0).b() instanceof ddc) {
               return true;
            }
         }

         return false;
      }
   }

   public boolean c() {
      return this.l.isEmpty();
   }

   public boolean d() {
      return this.l.size() == 3;
   }

   public void a(@Nullable ciu $$0, dnb $$1, dkf.b $$2) {
      List<box> $$3 = this.a($$1, $$2);
      if ($$0 != null) {
         for (box $$4 : $$3) {
            if ($$4 instanceof cbf) {
               cbf $$5 = (cbf)$$4;
               if ($$0.dk().g($$4.dk()) <= 16.0) {
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

   private List<box> a(dnb $$0, dkf.b $$1) {
      List<box> $$2 = Lists.newArrayList();
      this.l.removeIf($$3 -> a(this.o, this.p, $$0, $$3, $$2, $$1, this.m));
      if (!$$2.isEmpty()) {
         super.e();
      }

      return $$2;
   }

   public void a(box $$0, boolean $$1) {
      this.a($$0, $$1, 0);
   }

   @axz
   public int f() {
      return this.l.size();
   }

   public static int a(dnb $$0) {
      return $$0.c(czw.c);
   }

   @axz
   public boolean j() {
      return daq.a(this.o, this.aC_());
   }

   public void a(box $$0, boolean $$1, int $$2) {
      if (this.l.size() < 3) {
         $$0.ac();
         $$0.bE();
         ta $$3 = new ta();
         $$0.e($$3);
         this.a($$3, $$2, $$1);
         if (this.o != null) {
            if ($$0 instanceof cbf $$4 && $$4.s() && (!this.l() || this.o.z.h())) {
               this.m = $$4.r();
            }

            ib $$5 = this.aC_();
            this.o.a(null, (double)$$5.u(), (double)$$5.v(), (double)$$5.w(), aty.bV, atz.e, 1.0F, 1.0F);
            this.o.a(drp.c, $$5, drp.a.a($$0, this.n()));
         }

         $$0.am();
         super.e();
      }
   }

   public void a(ta $$0, int $$1, boolean $$2) {
      this.l.add(new dkf.a($$0, $$1, $$2 ? 2400 : 600));
   }

   private static boolean a(cxb $$0, ib $$1, dnb $$2, dkf.a $$3, @Nullable List<box> $$4, dkf.b $$5, @Nullable ib $$6) {
      if (($$0.Q() || $$0.ab()) && $$5 != dkf.b.c) {
         return false;
      } else {
         ta $$7 = $$3.a.h();
         b($$7);
         $$7.a("hive_pos", tp.a($$1));
         $$7.a("NoGravity", true);
         ih $$8 = $$2.c(czw.b);
         ib $$9 = $$1.a($$8);
         boolean $$10 = !$$0.a_($$9).k($$0, $$9).c();
         if ($$10 && $$5 != dkf.b.c) {
            return false;
         } else {
            box $$11 = bpd.a($$7, $$0, $$0x -> $$0x);
            if ($$11 != null) {
               if (!$$11.ai().a(auq.e)) {
                  return false;
               } else {
                  if ($$11 instanceof cbf $$12) {
                     if ($$6 != null && !$$12.s() && $$0.z.i() < 0.9F) {
                        $$12.i($$6);
                     }

                     if ($$5 == dkf.b.a) {
                        $$12.gB();
                        if ($$2.a(aun.aG, $$0x -> $$0x.b(czw.c))) {
                           int $$13 = a($$2);
                           if ($$13 < 5) {
                              int $$14 = $$0.z.a(100) == 0 ? 2 : 1;
                              if ($$13 + $$14 > 5) {
                                 $$14--;
                              }

                              $$0.b($$1, $$2.a(czw.c, Integer.valueOf($$13 + $$14)));
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

                  $$0.a(null, $$1, aty.bW, atz.e, 1.0F, 1.0F);
                  $$0.a(drp.c, $$1, drp.a.a($$11, $$0.a_($$1)));
                  return $$0.b($$11);
               }
            } else {
               return false;
            }
         }
      }
   }

   static void b(ta $$0) {
      for (String $$1 : i) {
         $$0.r($$1);
      }
   }

   private static void a(int $$0, cbf $$1) {
      int $$2 = $$1.g();
      if ($$2 < 0) {
         $$1.c_(Math.min(0, $$2 + $$0));
      } else if ($$2 > 0) {
         $$1.c_(Math.max(0, $$2 - $$0));
      }

      $$1.t(Math.max(0, $$1.gp() - $$0));
   }

   private boolean l() {
      return this.m != null;
   }

   private static void a(cxb $$0, ib $$1, dnb $$2, List<dkf.a> $$3, @Nullable ib $$4) {
      boolean $$5 = false;
      Iterator<dkf.a> $$6 = $$3.iterator();

      while ($$6.hasNext()) {
         dkf.a $$7 = $$6.next();
         if ($$7.b > $$7.c) {
            dkf.b $$8 = $$7.a.q("HasNectar") ? dkf.b.a : dkf.b.b;
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

   public static void a(cxb $$0, ib $$1, dnb $$2, dkf $$3) {
      a($$0, $$1, $$2, $$3.l, $$3.m);
      if (!$$3.l.isEmpty() && $$0.E_().j() < 0.005) {
         double $$4 = (double)$$1.u() + 0.5;
         double $$5 = (double)$$1.v();
         double $$6 = (double)$$1.w() + 0.5;
         $$0.a(null, $$4, $$5, $$6, aty.bY, atz.e, 1.0F, 1.0F);
      }

      aew.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ta $$0, in.a $$1) {
      super.a($$0, $$1);
      this.l.clear();
      tg $$2 = $$0.c("Bees", 10);

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         ta $$4 = $$2.a($$3);
         dkf.a $$5 = new dkf.a($$4.p("EntityData").h(), $$4.h("TicksInHive"), $$4.h("MinOccupationTicks"));
         this.l.add($$5);
      }

      this.m = tp.a($$0, "flower_pos").orElse(null);
   }

   @Override
   protected void b(ta $$0, in.a $$1) {
      super.b($$0, $$1);
      $$0.a("Bees", this.k());
      if (this.l()) {
         $$0.a("flower_pos", tp.a(this.m));
      }
   }

   public tg k() {
      tg $$0 = new tg();

      for (dkf.a $$1 : this.l) {
         ta $$2 = $$1.a.h();
         $$2.r("UUID");
         ta $$3 = new ta();
         $$3.a("EntityData", $$2);
         $$3.a("TicksInHive", $$1.b);
         $$3.a("MinOccupationTicks", $$1.c);
         $$0.add($$3);
      }

      return $$0;
   }

   static class a {
      final ta a;
      int b;
      final int c;

      a(ta $$0, int $$1, int $$2) {
         dkf.b($$0);
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
