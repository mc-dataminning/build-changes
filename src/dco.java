import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class dco {
   private final cto a;
   private final hx b;
   private final cwe c;
   private djg d;
   private final boolean e;
   private final List<hx> f = Lists.newArrayList();

   public dco(cto $$0, hx $$1, djg $$2) {
      this.a = $$0;
      this.b = $$1;
      this.d = $$2;
      this.c = (cwe)$$2.b();
      dkk $$3 = $$2.c(this.c.c());
      this.e = this.c.b();
      this.a($$3);
   }

   public List<hx> a() {
      return this.f;
   }

   private void a(dkk $$0) {
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
         dco $$1 = this.b(this.f.get($$0));
         if ($$1 != null && $$1.a(this)) {
            this.f.set($$0, $$1.b);
         } else {
            this.f.remove($$0--);
         }
      }
   }

   private boolean a(hx $$0) {
      return cwe.a(this.a, $$0) || cwe.a(this.a, $$0.c()) || cwe.a(this.a, $$0.d());
   }

   @Nullable
   private dco b(hx $$0) {
      djg $$2 = this.a.a_($$0);
      if (cwe.g($$2)) {
         return new dco(this.a, $$0, $$2);
      } else {
         hx $$1 = $$0.c();
         $$2 = this.a.a_($$1);
         if (cwe.g($$2)) {
            return new dco(this.a, $$1, $$2);
         } else {
            $$1 = $$0.d();
            $$2 = this.a.a_($$1);
            return cwe.g($$2) ? new dco(this.a, $$1, $$2) : null;
         }
      }
   }

   private boolean a(dco $$0) {
      return this.c($$0.b);
   }

   private boolean c(hx $$0) {
      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         hx $$2 = this.f.get($$1);
         if ($$2.u() == $$0.u() && $$2.w() == $$0.w()) {
            return true;
         }
      }

      return false;
   }

   protected int b() {
      int $$0 = 0;

      for (ic $$1 : ic.c.a) {
         if (this.a(this.b.a($$1))) {
            $$0++;
         }
      }

      return $$0;
   }

   private boolean b(dco $$0) {
      return this.a($$0) || this.f.size() != 2;
   }

   private void c(dco $$0) {
      this.f.add($$0.b);
      hx $$1 = this.b.e();
      hx $$2 = this.b.f();
      hx $$3 = this.b.g();
      hx $$4 = this.b.h();
      boolean $$5 = this.c($$1);
      boolean $$6 = this.c($$2);
      boolean $$7 = this.c($$3);
      boolean $$8 = this.c($$4);
      dkk $$9 = null;
      if ($$5 || $$6) {
         $$9 = dkk.a;
      }

      if ($$7 || $$8) {
         $$9 = dkk.b;
      }

      if (!this.e) {
         if ($$6 && $$8 && !$$5 && !$$7) {
            $$9 = dkk.g;
         }

         if ($$6 && $$7 && !$$5 && !$$8) {
            $$9 = dkk.h;
         }

         if ($$5 && $$7 && !$$6 && !$$8) {
            $$9 = dkk.i;
         }

         if ($$5 && $$8 && !$$6 && !$$7) {
            $$9 = dkk.j;
         }
      }

      if ($$9 == dkk.a) {
         if (cwe.a(this.a, $$1.c())) {
            $$9 = dkk.e;
         }

         if (cwe.a(this.a, $$2.c())) {
            $$9 = dkk.f;
         }
      }

      if ($$9 == dkk.b) {
         if (cwe.a(this.a, $$4.c())) {
            $$9 = dkk.c;
         }

         if (cwe.a(this.a, $$3.c())) {
            $$9 = dkk.d;
         }
      }

      if ($$9 == null) {
         $$9 = dkk.a;
      }

      this.d = this.d.a(this.c.c(), $$9);
      this.a.a(this.b, this.d, 3);
   }

   private boolean d(hx $$0) {
      dco $$1 = this.b($$0);
      if ($$1 == null) {
         return false;
      } else {
         $$1.d();
         return $$1.b(this);
      }
   }

   public dco a(boolean $$0, boolean $$1, dkk $$2) {
      hx $$3 = this.b.e();
      hx $$4 = this.b.f();
      hx $$5 = this.b.g();
      hx $$6 = this.b.h();
      boolean $$7 = this.d($$3);
      boolean $$8 = this.d($$4);
      boolean $$9 = this.d($$5);
      boolean $$10 = this.d($$6);
      dkk $$11 = null;
      boolean $$12 = $$7 || $$8;
      boolean $$13 = $$9 || $$10;
      if ($$12 && !$$13) {
         $$11 = dkk.a;
      }

      if ($$13 && !$$12) {
         $$11 = dkk.b;
      }

      boolean $$14 = $$8 && $$10;
      boolean $$15 = $$8 && $$9;
      boolean $$16 = $$7 && $$10;
      boolean $$17 = $$7 && $$9;
      if (!this.e) {
         if ($$14 && !$$7 && !$$9) {
            $$11 = dkk.g;
         }

         if ($$15 && !$$7 && !$$10) {
            $$11 = dkk.h;
         }

         if ($$17 && !$$8 && !$$10) {
            $$11 = dkk.i;
         }

         if ($$16 && !$$8 && !$$9) {
            $$11 = dkk.j;
         }
      }

      if ($$11 == null) {
         if ($$12 && $$13) {
            $$11 = $$2;
         } else if ($$12) {
            $$11 = dkk.a;
         } else if ($$13) {
            $$11 = dkk.b;
         }

         if (!this.e) {
            if ($$0) {
               if ($$14) {
                  $$11 = dkk.g;
               }

               if ($$15) {
                  $$11 = dkk.h;
               }

               if ($$16) {
                  $$11 = dkk.j;
               }

               if ($$17) {
                  $$11 = dkk.i;
               }
            } else {
               if ($$17) {
                  $$11 = dkk.i;
               }

               if ($$16) {
                  $$11 = dkk.j;
               }

               if ($$15) {
                  $$11 = dkk.h;
               }

               if ($$14) {
                  $$11 = dkk.g;
               }
            }
         }
      }

      if ($$11 == dkk.a) {
         if (cwe.a(this.a, $$3.c())) {
            $$11 = dkk.e;
         }

         if (cwe.a(this.a, $$4.c())) {
            $$11 = dkk.f;
         }
      }

      if ($$11 == dkk.b) {
         if (cwe.a(this.a, $$6.c())) {
            $$11 = dkk.c;
         }

         if (cwe.a(this.a, $$5.c())) {
            $$11 = dkk.d;
         }
      }

      if ($$11 == null) {
         $$11 = $$2;
      }

      this.a($$11);
      this.d = this.d.a(this.c.c(), $$11);
      if ($$1 || this.a.a_(this.b) != this.d) {
         this.a.a(this.b, this.d, 3);

         for (int $$18 = 0; $$18 < this.f.size(); $$18++) {
            dco $$19 = this.b(this.f.get($$18));
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

   public djg c() {
      return this.d;
   }
}
