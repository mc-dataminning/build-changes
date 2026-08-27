import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class cyu {
   private final cpv a;
   private final gw b;
   private final csl c;
   private dfj d;
   private final boolean e;
   private final List<gw> f = Lists.newArrayList();

   public cyu(cpv $$0, gw $$1, dfj $$2) {
      this.a = $$0;
      this.b = $$1;
      this.d = $$2;
      this.c = (csl)$$2.b();
      dgn $$3 = $$2.c(this.c.b());
      this.e = this.c.a();
      this.a($$3);
   }

   public List<gw> a() {
      return this.f;
   }

   private void a(dgn $$0) {
      this.f.clear();
      switch ($$0) {
         case a:
            this.f.add(this.b.e());
            this.f.add(this.b.f());
            break;
         case b:
            this.f.add(this.b.g());
            this.f.add(this.b.h());
            break;
         case c:
            this.f.add(this.b.g());
            this.f.add(this.b.h().c());
            break;
         case d:
            this.f.add(this.b.g().c());
            this.f.add(this.b.h());
            break;
         case e:
            this.f.add(this.b.e().c());
            this.f.add(this.b.f());
            break;
         case f:
            this.f.add(this.b.e());
            this.f.add(this.b.f().c());
            break;
         case g:
            this.f.add(this.b.h());
            this.f.add(this.b.f());
            break;
         case h:
            this.f.add(this.b.g());
            this.f.add(this.b.f());
            break;
         case i:
            this.f.add(this.b.g());
            this.f.add(this.b.e());
            break;
         case j:
            this.f.add(this.b.h());
            this.f.add(this.b.e());
      }
   }

   private void d() {
      for (int $$0 = 0; $$0 < this.f.size(); $$0++) {
         cyu $$1 = this.b(this.f.get($$0));
         if ($$1 != null && $$1.a(this)) {
            this.f.set($$0, $$1.b);
         } else {
            this.f.remove($$0--);
         }
      }
   }

   private boolean a(gw $$0) {
      return csl.a(this.a, $$0) || csl.a(this.a, $$0.c()) || csl.a(this.a, $$0.d());
   }

   @Nullable
   private cyu b(gw $$0) {
      dfj $$2 = this.a.a_($$0);
      if (csl.g($$2)) {
         return new cyu(this.a, $$0, $$2);
      } else {
         gw $$1 = $$0.c();
         $$2 = this.a.a_($$1);
         if (csl.g($$2)) {
            return new cyu(this.a, $$1, $$2);
         } else {
            $$1 = $$0.d();
            $$2 = this.a.a_($$1);
            return csl.g($$2) ? new cyu(this.a, $$1, $$2) : null;
         }
      }
   }

   private boolean a(cyu $$0) {
      return this.c($$0.b);
   }

   private boolean c(gw $$0) {
      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         gw $$2 = this.f.get($$1);
         if ($$2.u() == $$0.u() && $$2.w() == $$0.w()) {
            return true;
         }
      }

      return false;
   }

   protected int b() {
      int $$0 = 0;

      for (ha $$1 : ha.c.a) {
         if (this.a(this.b.a($$1))) {
            $$0++;
         }
      }

      return $$0;
   }

   private boolean b(cyu $$0) {
      return this.a($$0) || this.f.size() != 2;
   }

   private void c(cyu $$0) {
      this.f.add($$0.b);
      gw $$1 = this.b.e();
      gw $$2 = this.b.f();
      gw $$3 = this.b.g();
      gw $$4 = this.b.h();
      boolean $$5 = this.c($$1);
      boolean $$6 = this.c($$2);
      boolean $$7 = this.c($$3);
      boolean $$8 = this.c($$4);
      dgn $$9 = null;
      if ($$5 || $$6) {
         $$9 = dgn.a;
      }

      if ($$7 || $$8) {
         $$9 = dgn.b;
      }

      if (!this.e) {
         if ($$6 && $$8 && !$$5 && !$$7) {
            $$9 = dgn.g;
         }

         if ($$6 && $$7 && !$$5 && !$$8) {
            $$9 = dgn.h;
         }

         if ($$5 && $$7 && !$$6 && !$$8) {
            $$9 = dgn.i;
         }

         if ($$5 && $$8 && !$$6 && !$$7) {
            $$9 = dgn.j;
         }
      }

      if ($$9 == dgn.a) {
         if (csl.a(this.a, $$1.c())) {
            $$9 = dgn.e;
         }

         if (csl.a(this.a, $$2.c())) {
            $$9 = dgn.f;
         }
      }

      if ($$9 == dgn.b) {
         if (csl.a(this.a, $$4.c())) {
            $$9 = dgn.c;
         }

         if (csl.a(this.a, $$3.c())) {
            $$9 = dgn.d;
         }
      }

      if ($$9 == null) {
         $$9 = dgn.a;
      }

      this.d = this.d.a(this.c.b(), $$9);
      this.a.a(this.b, this.d, 3);
   }

   private boolean d(gw $$0) {
      cyu $$1 = this.b($$0);
      if ($$1 == null) {
         return false;
      } else {
         $$1.d();
         return $$1.b(this);
      }
   }

   public cyu a(boolean $$0, boolean $$1, dgn $$2) {
      gw $$3 = this.b.e();
      gw $$4 = this.b.f();
      gw $$5 = this.b.g();
      gw $$6 = this.b.h();
      boolean $$7 = this.d($$3);
      boolean $$8 = this.d($$4);
      boolean $$9 = this.d($$5);
      boolean $$10 = this.d($$6);
      dgn $$11 = null;
      boolean $$12 = $$7 || $$8;
      boolean $$13 = $$9 || $$10;
      if ($$12 && !$$13) {
         $$11 = dgn.a;
      }

      if ($$13 && !$$12) {
         $$11 = dgn.b;
      }

      boolean $$14 = $$8 && $$10;
      boolean $$15 = $$8 && $$9;
      boolean $$16 = $$7 && $$10;
      boolean $$17 = $$7 && $$9;
      if (!this.e) {
         if ($$14 && !$$7 && !$$9) {
            $$11 = dgn.g;
         }

         if ($$15 && !$$7 && !$$10) {
            $$11 = dgn.h;
         }

         if ($$17 && !$$8 && !$$10) {
            $$11 = dgn.i;
         }

         if ($$16 && !$$8 && !$$9) {
            $$11 = dgn.j;
         }
      }

      if ($$11 == null) {
         if ($$12 && $$13) {
            $$11 = $$2;
         } else if ($$12) {
            $$11 = dgn.a;
         } else if ($$13) {
            $$11 = dgn.b;
         }

         if (!this.e) {
            if ($$0) {
               if ($$14) {
                  $$11 = dgn.g;
               }

               if ($$15) {
                  $$11 = dgn.h;
               }

               if ($$16) {
                  $$11 = dgn.j;
               }

               if ($$17) {
                  $$11 = dgn.i;
               }
            } else {
               if ($$17) {
                  $$11 = dgn.i;
               }

               if ($$16) {
                  $$11 = dgn.j;
               }

               if ($$15) {
                  $$11 = dgn.h;
               }

               if ($$14) {
                  $$11 = dgn.g;
               }
            }
         }
      }

      if ($$11 == dgn.a) {
         if (csl.a(this.a, $$3.c())) {
            $$11 = dgn.e;
         }

         if (csl.a(this.a, $$4.c())) {
            $$11 = dgn.f;
         }
      }

      if ($$11 == dgn.b) {
         if (csl.a(this.a, $$6.c())) {
            $$11 = dgn.c;
         }

         if (csl.a(this.a, $$5.c())) {
            $$11 = dgn.d;
         }
      }

      if ($$11 == null) {
         $$11 = $$2;
      }

      this.a($$11);
      this.d = this.d.a(this.c.b(), $$11);
      if ($$1 || this.a.a_(this.b) != this.d) {
         this.a.a(this.b, this.d, 3);

         for (int $$18 = 0; $$18 < this.f.size(); $$18++) {
            cyu $$19 = this.b(this.f.get($$18));
            if ($$19 != null) {
               $$19.d();
               if ($$19.b(this)) {
                  $$19.c(this);
               }
            }
         }
      }

      return this;
   }

   public dfj c() {
      return this.d;
   }
}
