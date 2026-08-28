import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class doj {
   private final dff a;
   private final jh b;
   private final dhy c;
   private dvo d;
   private final boolean e;
   private final List<jh> f = Lists.newArrayList();

   public doj(dff $$0, jh $$1, dvo $$2) {
      this.a = $$0;
      this.b = $$1;
      this.d = $$2;
      this.c = (dhy)$$2.b();
      dwr $$3 = $$2.c(this.c.c());
      this.e = this.c.b();
      this.a($$3);
   }

   public List<jh> a() {
      return this.f;
   }

   private void a(dwr $$0) {
      this.f.clear();
      switch ($$0) {
         case a:
            this.f.add(this.b.f());
            this.f.add(this.b.g());
            break;
         case b:
            this.f.add(this.b.h());
            this.f.add(this.b.i());
            break;
         case c:
            this.f.add(this.b.h());
            this.f.add(this.b.i().d());
            break;
         case d:
            this.f.add(this.b.h().d());
            this.f.add(this.b.i());
            break;
         case e:
            this.f.add(this.b.f().d());
            this.f.add(this.b.g());
            break;
         case f:
            this.f.add(this.b.f());
            this.f.add(this.b.g().d());
            break;
         case g:
            this.f.add(this.b.i());
            this.f.add(this.b.g());
            break;
         case h:
            this.f.add(this.b.h());
            this.f.add(this.b.g());
            break;
         case i:
            this.f.add(this.b.h());
            this.f.add(this.b.f());
            break;
         case j:
            this.f.add(this.b.i());
            this.f.add(this.b.f());
      }
   }

   private void d() {
      for (int $$0 = 0; $$0 < this.f.size(); $$0++) {
         doj $$1 = this.b(this.f.get($$0));
         if ($$1 != null && $$1.a(this)) {
            this.f.set($$0, $$1.b);
         } else {
            this.f.remove($$0--);
         }
      }
   }

   private boolean a(jh $$0) {
      return dhy.a(this.a, $$0) || dhy.a(this.a, $$0.d()) || dhy.a(this.a, $$0.e());
   }

   @Nullable
   private doj b(jh $$0) {
      dvo $$2 = this.a.a_($$0);
      if (dhy.h($$2)) {
         return new doj(this.a, $$0, $$2);
      } else {
         jh $$1 = $$0.d();
         $$2 = this.a.a_($$1);
         if (dhy.h($$2)) {
            return new doj(this.a, $$1, $$2);
         } else {
            $$1 = $$0.e();
            $$2 = this.a.a_($$1);
            return dhy.h($$2) ? new doj(this.a, $$1, $$2) : null;
         }
      }
   }

   private boolean a(doj $$0) {
      return this.c($$0.b);
   }

   private boolean c(jh $$0) {
      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         jh $$2 = this.f.get($$1);
         if ($$2.u() == $$0.u() && $$2.w() == $$0.w()) {
            return true;
         }
      }

      return false;
   }

   protected int b() {
      int $$0 = 0;

      for (jm $$1 : jm.c.a) {
         if (this.a(this.b.a($$1))) {
            $$0++;
         }
      }

      return $$0;
   }

   private boolean b(doj $$0) {
      return this.a($$0) || this.f.size() != 2;
   }

   private void c(doj $$0) {
      this.f.add($$0.b);
      jh $$1 = this.b.f();
      jh $$2 = this.b.g();
      jh $$3 = this.b.h();
      jh $$4 = this.b.i();
      boolean $$5 = this.c($$1);
      boolean $$6 = this.c($$2);
      boolean $$7 = this.c($$3);
      boolean $$8 = this.c($$4);
      dwr $$9 = null;
      if ($$5 || $$6) {
         $$9 = dwr.a;
      }

      if ($$7 || $$8) {
         $$9 = dwr.b;
      }

      if (!this.e) {
         if ($$6 && $$8 && !$$5 && !$$7) {
            $$9 = dwr.g;
         }

         if ($$6 && $$7 && !$$5 && !$$8) {
            $$9 = dwr.h;
         }

         if ($$5 && $$7 && !$$6 && !$$8) {
            $$9 = dwr.i;
         }

         if ($$5 && $$8 && !$$6 && !$$7) {
            $$9 = dwr.j;
         }
      }

      if ($$9 == dwr.a) {
         if (dhy.a(this.a, $$1.d())) {
            $$9 = dwr.e;
         }

         if (dhy.a(this.a, $$2.d())) {
            $$9 = dwr.f;
         }
      }

      if ($$9 == dwr.b) {
         if (dhy.a(this.a, $$4.d())) {
            $$9 = dwr.c;
         }

         if (dhy.a(this.a, $$3.d())) {
            $$9 = dwr.d;
         }
      }

      if ($$9 == null) {
         $$9 = dwr.a;
      }

      this.d = this.d.b(this.c.c(), $$9);
      this.a.a(this.b, this.d, 3);
   }

   private boolean d(jh $$0) {
      doj $$1 = this.b($$0);
      if ($$1 == null) {
         return false;
      } else {
         $$1.d();
         return $$1.b(this);
      }
   }

   public doj a(boolean $$0, boolean $$1, dwr $$2) {
      jh $$3 = this.b.f();
      jh $$4 = this.b.g();
      jh $$5 = this.b.h();
      jh $$6 = this.b.i();
      boolean $$7 = this.d($$3);
      boolean $$8 = this.d($$4);
      boolean $$9 = this.d($$5);
      boolean $$10 = this.d($$6);
      dwr $$11 = null;
      boolean $$12 = $$7 || $$8;
      boolean $$13 = $$9 || $$10;
      if ($$12 && !$$13) {
         $$11 = dwr.a;
      }

      if ($$13 && !$$12) {
         $$11 = dwr.b;
      }

      boolean $$14 = $$8 && $$10;
      boolean $$15 = $$8 && $$9;
      boolean $$16 = $$7 && $$10;
      boolean $$17 = $$7 && $$9;
      if (!this.e) {
         if ($$14 && !$$7 && !$$9) {
            $$11 = dwr.g;
         }

         if ($$15 && !$$7 && !$$10) {
            $$11 = dwr.h;
         }

         if ($$17 && !$$8 && !$$10) {
            $$11 = dwr.i;
         }

         if ($$16 && !$$8 && !$$9) {
            $$11 = dwr.j;
         }
      }

      if ($$11 == null) {
         if ($$12 && $$13) {
            $$11 = $$2;
         } else if ($$12) {
            $$11 = dwr.a;
         } else if ($$13) {
            $$11 = dwr.b;
         }

         if (!this.e) {
            if ($$0) {
               if ($$14) {
                  $$11 = dwr.g;
               }

               if ($$15) {
                  $$11 = dwr.h;
               }

               if ($$16) {
                  $$11 = dwr.j;
               }

               if ($$17) {
                  $$11 = dwr.i;
               }
            } else {
               if ($$17) {
                  $$11 = dwr.i;
               }

               if ($$16) {
                  $$11 = dwr.j;
               }

               if ($$15) {
                  $$11 = dwr.h;
               }

               if ($$14) {
                  $$11 = dwr.g;
               }
            }
         }
      }

      if ($$11 == dwr.a) {
         if (dhy.a(this.a, $$3.d())) {
            $$11 = dwr.e;
         }

         if (dhy.a(this.a, $$4.d())) {
            $$11 = dwr.f;
         }
      }

      if ($$11 == dwr.b) {
         if (dhy.a(this.a, $$6.d())) {
            $$11 = dwr.c;
         }

         if (dhy.a(this.a, $$5.d())) {
            $$11 = dwr.d;
         }
      }

      if ($$11 == null) {
         $$11 = $$2;
      }

      this.a($$11);
      this.d = this.d.b(this.c.c(), $$11);
      if ($$1 || this.a.a_(this.b) != this.d) {
         this.a.a(this.b, this.d, 3);

         for (int $$18 = 0; $$18 < this.f.size(); $$18++) {
            doj $$19 = this.b(this.f.get($$18));
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

   public dvo c() {
      return this.d;
   }
}
