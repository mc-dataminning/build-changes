import com.google.common.collect.Lists;
import java.util.List;

public class dva {
   public static final int a = 12;
   private final dev b;
   private final jg c;
   private final boolean d;
   private final jg e;
   private final jl f;
   private final List<jg> g = Lists.newArrayList();
   private final List<jg> h = Lists.newArrayList();
   private final jl i;

   public dva(dev $$0, jg $$1, jl $$2, boolean $$3) {
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
      dvd $$0 = this.b.a_(this.e);
      if (!duw.a($$0, this.b, this.e, this.f, false, this.i)) {
         if (this.d && $$0.r() == erj.b) {
            this.h.add(this.e);
            return true;
         } else {
            return false;
         }
      } else if (!this.a(this.e, this.f)) {
         return false;
      } else {
         for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
            jg $$2 = this.g.get($$1);
            if (a(this.b.a_($$2)) && !this.a($$2)) {
               return false;
            }
         }

         return true;
      }
   }

   private static boolean a(dvd $$0) {
      return $$0.a(dia.hV) || $$0.a(dia.pg);
   }

   private static boolean a(dvd $$0, dvd $$1) {
      if ($$0.a(dia.pg) && $$1.a(dia.hV)) {
         return false;
      } else {
         return $$0.a(dia.hV) && $$1.a(dia.pg) ? false : a($$0) || a($$1);
      }
   }

   private boolean a(jg $$0, jl $$1) {
      dvd $$2 = this.b.a_($$0);
      if ($$2.l()) {
         return true;
      } else if (!duw.a($$2, this.b, $$0, this.f, false, $$1)) {
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
               jg $$4 = $$0.a(this.f.g(), $$3);
               dvd $$5 = $$2;
               $$2 = this.b.a_($$4);
               if ($$2.l() || !a($$5, $$2) || !duw.a($$2, this.b, $$4, this.f, false, this.f.g()) || $$4.equals(this.c)) {
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
               jg $$9 = $$0.a(this.f, $$8);
               int $$10 = this.g.indexOf($$9);
               if ($$10 > -1) {
                  this.a($$6, $$10);

                  for (int $$11 = 0; $$11 <= $$10 + $$6; $$11++) {
                     jg $$12 = this.g.get($$11);
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

               if (!duw.a($$2, this.b, $$9, this.f, true, this.f) || $$9.equals(this.c)) {
                  return false;
               }

               if ($$2.r() == erj.b) {
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
      List<jg> $$2 = Lists.newArrayList();
      List<jg> $$3 = Lists.newArrayList();
      List<jg> $$4 = Lists.newArrayList();
      $$2.addAll(this.g.subList(0, $$1));
      $$3.addAll(this.g.subList(this.g.size() - $$0, this.g.size()));
      $$4.addAll(this.g.subList($$1, this.g.size() - $$0));
      this.g.clear();
      this.g.addAll($$2);
      this.g.addAll($$3);
      this.g.addAll($$4);
   }

   private boolean a(jg $$0) {
      dvd $$1 = this.b.a_($$0);

      for (jl $$2 : jl.values()) {
         if ($$2.o() != this.f.o()) {
            jg $$3 = $$0.a($$2);
            dvd $$4 = this.b.a_($$3);
            if (a($$4, $$1) && !this.a($$3, $$2)) {
               return false;
            }
         }
      }

      return true;
   }

   public jl b() {
      return this.f;
   }

   public List<jg> c() {
      return this.g;
   }

   public List<jg> d() {
      return this.h;
   }
}
