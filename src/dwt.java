import com.google.common.collect.Lists;
import java.util.List;

public class dwt {
   public static final int a = 12;
   private final dgh b;
   private final ji c;
   private final boolean d;
   private final ji e;
   private final jn f;
   private final List<ji> g = Lists.newArrayList();
   private final List<ji> h = Lists.newArrayList();
   private final jn i;

   public dwt(dgh $$0, ji $$1, jn $$2, boolean $$3) {
      this.b = $$0;
      this.c = $$1;
      this.i = $$2;
      this.d = $$3;
      if ($$3) {
         this.f = $$2;
         this.e = $$1.a($$2);
      } else {
         this.f = $$2.g();
         this.e = $$1.a($$2, 2);
      }
   }

   public boolean a() {
      this.g.clear();
      this.h.clear();
      dww $$0 = this.b.a_(this.e);
      if (!dwp.a($$0, this.b, this.e, this.f, false, this.i)) {
         if (this.d && $$0.r() == etd.b) {
            this.h.add(this.e);
            return true;
         } else {
            return false;
         }
      } else if (!this.a(this.e, this.f)) {
         return false;
      } else {
         for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
            ji $$2 = this.g.get($$1);
            if (a(this.b.a_($$2)) && !this.a($$2)) {
               return false;
            }
         }

         return true;
      }
   }

   private static boolean a(dww $$0) {
      return $$0.a(djn.it) || $$0.a(djn.pI);
   }

   private static boolean a(dww $$0, dww $$1) {
      if ($$0.a(djn.pI) && $$1.a(djn.it)) {
         return false;
      } else {
         return $$0.a(djn.it) && $$1.a(djn.pI) ? false : a($$0) || a($$1);
      }
   }

   private boolean a(ji $$0, jn $$1) {
      dww $$2 = this.b.a_($$0);
      if ($$2.l()) {
         return true;
      } else if (!dwp.a($$2, this.b, $$0, this.f, false, $$1)) {
         return true;
      } else if ($$0.equals(this.c)) {
         return true;
      } else if (this.g.contains($$0)) {
         return true;
      } else {
         int $$3 = 1;
         if ($$3 + this.g.size() > 12) {
            return false;
         } else {
            while (a($$2)) {
               ji $$4 = $$0.a(this.f.g(), $$3);
               dww $$5 = $$2;
               $$2 = this.b.a_($$4);
               if ($$2.l() || !a($$5, $$2) || !dwp.a($$2, this.b, $$4, this.f, false, this.f.g()) || $$4.equals(this.c)) {
                  break;
               }

               if (++$$3 + this.g.size() > 12) {
                  return false;
               }
            }

            int $$6 = 0;

            for (int $$7 = $$3 - 1; $$7 >= 0; $$7--) {
               this.g.add($$0.a(this.f.g(), $$7));
               $$6++;
            }

            int $$8 = 1;

            while (true) {
               ji $$9 = $$0.a(this.f, $$8);
               int $$10 = this.g.indexOf($$9);
               if ($$10 > -1) {
                  this.a($$6, $$10);

                  for (int $$11 = 0; $$11 <= $$10 + $$6; $$11++) {
                     ji $$12 = this.g.get($$11);
                     if (a(this.b.a_($$12)) && !this.a($$12)) {
                        return false;
                     }
                  }

                  return true;
               }

               $$2 = this.b.a_($$9);
               if ($$2.l()) {
                  return true;
               }

               if (!dwp.a($$2, this.b, $$9, this.f, true, this.f) || $$9.equals(this.c)) {
                  return false;
               }

               if ($$2.r() == etd.b) {
                  this.h.add($$9);
                  return true;
               }

               if (this.g.size() >= 12) {
                  return false;
               }

               this.g.add($$9);
               $$6++;
               $$8++;
            }
         }
      }
   }

   private void a(int $$0, int $$1) {
      List<ji> $$2 = Lists.newArrayList();
      List<ji> $$3 = Lists.newArrayList();
      List<ji> $$4 = Lists.newArrayList();
      $$2.addAll(this.g.subList(0, $$1));
      $$3.addAll(this.g.subList(this.g.size() - $$0, this.g.size()));
      $$4.addAll(this.g.subList($$1, this.g.size() - $$0));
      this.g.clear();
      this.g.addAll($$2);
      this.g.addAll($$3);
      this.g.addAll($$4);
   }

   private boolean a(ji $$0) {
      dww $$1 = this.b.a_($$0);

      for (jn $$2 : jn.values()) {
         if ($$2.o() != this.f.o()) {
            ji $$3 = $$0.a($$2);
            dww $$4 = this.b.a_($$3);
            if (a($$4, $$1) && !this.a($$3, $$2)) {
               return false;
            }
         }
      }

      return true;
   }

   public jn b() {
      return this.f;
   }

   public List<ji> c() {
      return this.g;
   }

   public List<ji> d() {
      return this.h;
   }
}
