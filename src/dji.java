import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class dji extends djl {
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
   private final List<dji.a> l = Lists.newArrayList();
   @Nullable
   private ib m;

   public dji(ib $$0, dme $$1) {
      super(djn.H, $$0, $$1);
   }

   @Override
   public void e() {
      if (this.b()) {
         this.a(null, this.o.a_(this.aD_()), dji.b.c);
      }

      super.e();
   }

   public boolean b() {
      if (this.o == null) {
         return false;
      } else {
         for (ib $$0 : ib.a(this.p.b(-1, -1, -1), this.p.b(1, 1, 1))) {
            if (this.o.a_($$0).b() instanceof dcf) {
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

   public void a(@Nullable cia $$0, dme $$1, dji.b $$2) {
      List<bof> $$3 = this.a($$1, $$2);
      if ($$0 != null) {
         for (bof $$4 : $$3) {
            if ($$4 instanceof can) {
               can $$5 = (can)$$4;
               if ($$0.dh().g($$4.dh()) <= 16.0) {
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

   private List<bof> a(dme $$0, dji.b $$1) {
      List<bof> $$2 = Lists.newArrayList();
      this.l.removeIf($$3 -> a(this.o, this.p, $$0, $$3, $$2, $$1, this.m));
      if (!$$2.isEmpty()) {
         super.e();
      }

      return $$2;
   }

   public void a(bof $$0, boolean $$1) {
      this.a($$0, $$1, 0);
   }

   @axp
   public int f() {
      return this.l.size();
   }

   public static int a(dme $$0) {
      return $$0.c(cyz.c);
   }

   @axp
   public boolean j() {
      return czt.a(this.o, this.aD_());
   }

   public void a(bof $$0, boolean $$1, int $$2) {
      if (this.l.size() < 3) {
         $$0.ac();
         $$0.bB();
         sy $$3 = new sy();
         $$0.e($$3);
         this.a($$3, $$2, $$1);
         if (this.o != null) {
            if ($$0 instanceof can $$4 && $$4.w() && (!this.l() || this.o.z.h())) {
               this.m = $$4.u();
            }

            ib $$5 = this.aD_();
            this.o.a(null, (double)$$5.u(), (double)$$5.v(), (double)$$5.w(), atp.bT, atq.e, 1.0F, 1.0F);
            this.o.a(dqr.c, $$5, dqr.a.a($$0, this.n()));
         }

         $$0.am();
         super.e();
      }
   }

   public void a(sy $$0, int $$1, boolean $$2) {
      this.l.add(new dji.a($$0, $$1, $$2 ? 2400 : 600));
   }

   private static boolean a(cwe $$0, ib $$1, dme $$2, dji.a $$3, @Nullable List<bof> $$4, dji.b $$5, @Nullable ib $$6) {
      if (($$0.Q() || $$0.ab()) && $$5 != dji.b.c) {
         return false;
      } else {
         sy $$7 = $$3.a.h();
         b($$7);
         $$7.a("HivePos", tn.a($$1));
         $$7.a("NoGravity", true);
         ih $$8 = $$2.c(cyz.b);
         ib $$9 = $$1.a($$8);
         boolean $$10 = !$$0.a_($$9).k($$0, $$9).c();
         if ($$10 && $$5 != dji.b.c) {
            return false;
         } else {
            bof $$11 = bol.a($$7, $$0, $$0x -> $$0x);
            if ($$11 != null) {
               if (!$$11.ai().a(auh.e)) {
                  return false;
               } else {
                  if ($$11 instanceof can $$12) {
                     if ($$6 != null && !$$12.w() && $$0.z.i() < 0.9F) {
                        $$12.i($$6);
                     }

                     if ($$5 == dji.b.a) {
                        $$12.gz();
                        if ($$2.a(aue.aF, $$0x -> $$0x.b(cyz.c))) {
                           int $$13 = a($$2);
                           if ($$13 < 5) {
                              int $$14 = $$0.z.a(100) == 0 ? 2 : 1;
                              if ($$13 + $$14 > 5) {
                                 $$14--;
                              }

                              $$0.b($$1, $$2.a(cyz.c, Integer.valueOf($$13 + $$14)));
                           }
                        }
                     }

                     a($$3.b, $$12);
                     if ($$4 != null) {
                        $$4.add($$12);
                     }

                     float $$15 = $$11.dd();
                     double $$16 = $$10 ? 0.0 : 0.55 + (double)($$15 / 2.0F);
                     double $$17 = (double)$$1.u() + 0.5 + $$16 * (double)$$8.j();
                     double $$18 = (double)$$1.v() + 0.5 - (double)($$11.de() / 2.0F);
                     double $$19 = (double)$$1.w() + 0.5 + $$16 * (double)$$8.l();
                     $$11.b($$17, $$18, $$19, $$11.dz(), $$11.dB());
                  }

                  $$0.a(null, $$1, atp.bU, atq.e, 1.0F, 1.0F);
                  $$0.a(dqr.c, $$1, dqr.a.a($$11, $$0.a_($$1)));
                  return $$0.b($$11);
               }
            } else {
               return false;
            }
         }
      }
   }

   static void b(sy $$0) {
      for (String $$1 : i) {
         $$0.r($$1);
      }
   }

   private static void a(int $$0, can $$1) {
      int $$2 = $$1.h();
      if ($$2 < 0) {
         $$1.c_(Math.min(0, $$2 + $$0));
      } else if ($$2 > 0) {
         $$1.c_(Math.max(0, $$2 - $$0));
      }

      $$1.t(Math.max(0, $$1.gn() - $$0));
   }

   private boolean l() {
      return this.m != null;
   }

   private static void a(cwe $$0, ib $$1, dme $$2, List<dji.a> $$3, @Nullable ib $$4) {
      boolean $$5 = false;
      Iterator<dji.a> $$6 = $$3.iterator();

      while ($$6.hasNext()) {
         dji.a $$7 = $$6.next();
         if ($$7.b > $$7.c) {
            dji.b $$8 = $$7.a.q("HasNectar") ? dji.b.a : dji.b.b;
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

   public static void a(cwe $$0, ib $$1, dme $$2, dji $$3) {
      a($$0, $$1, $$2, $$3.l, $$3.m);
      if (!$$3.l.isEmpty() && $$0.F_().j() < 0.005) {
         double $$4 = (double)$$1.u() + 0.5;
         double $$5 = (double)$$1.v();
         double $$6 = (double)$$1.w() + 0.5;
         $$0.a(null, $$4, $$5, $$6, atp.bW, atq.e, 1.0F, 1.0F);
      }

      aes.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(sy $$0, in.a $$1) {
      super.a($$0, $$1);
      this.l.clear();
      te $$2 = $$0.c("Bees", 10);

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         sy $$4 = $$2.a($$3);
         dji.a $$5 = new dji.a($$4.p("EntityData").h(), $$4.h("TicksInHive"), $$4.h("MinOccupationTicks"));
         this.l.add($$5);
      }

      this.m = null;
      if ($$0.e("FlowerPos")) {
         this.m = tn.b($$0.p("FlowerPos"));
      }
   }

   @Override
   protected void b(sy $$0, in.a $$1) {
      super.b($$0, $$1);
      $$0.a("Bees", this.k());
      if (this.l()) {
         $$0.a("FlowerPos", tn.a(this.m));
      }
   }

   public te k() {
      te $$0 = new te();

      for (dji.a $$1 : this.l) {
         sy $$2 = $$1.a.h();
         $$2.r("UUID");
         sy $$3 = new sy();
         $$3.a("EntityData", $$2);
         $$3.a("TicksInHive", $$1.b);
         $$3.a("MinOccupationTicks", $$1.c);
         $$0.add($$3);
      }

      return $$0;
   }

   static class a {
      final sy a;
      int b;
      final int c;

      a(sy $$0, int $$1, int $$2) {
         dji.b($$0);
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
