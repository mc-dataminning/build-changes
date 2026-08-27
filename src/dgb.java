import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class dgb {
   private final cxb a;
   private final ib b;
   private final czr c;
   private dnb d;
   private final boolean e;
   private final List<ib> f = Lists.newArrayList();

   public dgb(cxb $$0, ib $$1, dnb $$2) {
      this.a = $$0;
      this.b = $$1;
      this.d = $$2;
      this.c = (czr)$$2.b();
      dof $$3 = $$2.c(this.c.c());
      this.e = this.c.b();
      this.a($$3);
   }

   public List<ib> a() {
      return this.f;
   }

   private void a(dof $$0) {
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
         dgb $$1 = this.b(this.f.get($$0));
         if ($$1 != null && $$1.a(this)) {
            this.f.set($$0, $$1.b);
         } else {
            this.f.remove($$0--);
         }
      }
   }

   private boolean a(ib $$0) {
      return czr.a(this.a, $$0) || czr.a(this.a, $$0.c()) || czr.a(this.a, $$0.d());
   }

   @Nullable
   private dgb b(ib $$0) {
      dnb $$2 = this.a.a_($$0);
      if (czr.g($$2)) {
         return new dgb(this.a, $$0, $$2);
      } else {
         ib $$1 = $$0.c();
         $$2 = this.a.a_($$1);
         if (czr.g($$2)) {
            return new dgb(this.a, $$1, $$2);
         } else {
            $$1 = $$0.d();
            $$2 = this.a.a_($$1);
            return czr.g($$2) ? new dgb(this.a, $$1, $$2) : null;
         }
      }
   }

   private boolean a(dgb $$0) {
      return this.c($$0.b);
   }

   private boolean c(ib $$0) {
      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         ib $$2 = this.f.get($$1);
         if ($$2.u() == $$0.u() && $$2.w() == $$0.w()) {
            return true;
         }
      }

      return false;
   }

   protected int b() {
      int $$0 = 0;

      for (ih $$1 : ih.c.a) {
         if (this.a(this.b.a($$1))) {
            $$0++;
         }
      }

      return $$0;
   }

   private boolean b(dgb $$0) {
      return this.a($$0) || this.f.size() != 2;
   }

   private void c(dgb $$0) {
      this.f.add($$0.b);
      ib $$1 = this.b.e();
      ib $$2 = this.b.f();
      ib $$3 = this.b.g();
      ib $$4 = this.b.h();
      boolean $$5 = this.c($$1);
      boolean $$6 = this.c($$2);
      boolean $$7 = this.c($$3);
      boolean $$8 = this.c($$4);
      dof $$9 = null;
      if ($$5 || $$6) {
         $$9 = dof.a;
      }

      if ($$7 || $$8) {
         $$9 = dof.b;
      }

      if (!this.e) {
         if ($$6 && $$8 && !$$5 && !$$7) {
            $$9 = dof.g;
         }

         if ($$6 && $$7 && !$$5 && !$$8) {
            $$9 = dof.h;
         }

         if ($$5 && $$7 && !$$6 && !$$8) {
            $$9 = dof.i;
         }

         if ($$5 && $$8 && !$$6 && !$$7) {
            $$9 = dof.j;
         }
      }

      if ($$9 == dof.a) {
         if (czr.a(this.a, $$1.c())) {
            $$9 = dof.e;
         }

         if (czr.a(this.a, $$2.c())) {
            $$9 = dof.f;
         }
      }

      if ($$9 == dof.b) {
         if (czr.a(this.a, $$4.c())) {
            $$9 = dof.c;
         }

         if (czr.a(this.a, $$3.c())) {
            $$9 = dof.d;
         }
      }

      if ($$9 == null) {
         $$9 = dof.a;
      }

      this.d = this.d.a(this.c.c(), $$9);
      this.a.a(this.b, this.d, 3);
   }

   private boolean d(ib $$0) {
      dgb $$1 = this.b($$0);
      if ($$1 == null) {
         return false;
      } else {
         $$1.d();
         return $$1.b(this);
      }
   }

   public dgb a(boolean $$0, boolean $$1, dof $$2) {
      ib $$3 = this.b.e();
      ib $$4 = this.b.f();
      ib $$5 = this.b.g();
      ib $$6 = this.b.h();
      boolean $$7 = this.d($$3);
      boolean $$8 = this.d($$4);
      boolean $$9 = this.d($$5);
      boolean $$10 = this.d($$6);
      dof $$11 = null;
      boolean $$12 = $$7 || $$8;
      boolean $$13 = $$9 || $$10;
      if ($$12 && !$$13) {
         $$11 = dof.a;
      }

      if ($$13 && !$$12) {
         $$11 = dof.b;
      }

      boolean $$14 = $$8 && $$10;
      boolean $$15 = $$8 && $$9;
      boolean $$16 = $$7 && $$10;
      boolean $$17 = $$7 && $$9;
      if (!this.e) {
         if ($$14 && !$$7 && !$$9) {
            $$11 = dof.g;
         }

         if ($$15 && !$$7 && !$$10) {
            $$11 = dof.h;
         }

         if ($$17 && !$$8 && !$$10) {
            $$11 = dof.i;
         }

         if ($$16 && !$$8 && !$$9) {
            $$11 = dof.j;
         }
      }

      if ($$11 == null) {
         if ($$12 && $$13) {
            $$11 = $$2;
         } else if ($$12) {
            $$11 = dof.a;
         } else if ($$13) {
            $$11 = dof.b;
         }

         if (!this.e) {
            if ($$0) {
               if ($$14) {
                  $$11 = dof.g;
               }

               if ($$15) {
                  $$11 = dof.h;
               }

               if ($$16) {
                  $$11 = dof.j;
               }

               if ($$17) {
                  $$11 = dof.i;
               }
            } else {
               if ($$17) {
                  $$11 = dof.i;
               }

               if ($$16) {
                  $$11 = dof.j;
               }

               if ($$15) {
                  $$11 = dof.h;
               }

               if ($$14) {
                  $$11 = dof.g;
               }
            }
         }
      }

      if ($$11 == dof.a) {
         if (czr.a(this.a, $$3.c())) {
            $$11 = dof.e;
         }

         if (czr.a(this.a, $$4.c())) {
            $$11 = dof.f;
         }
      }

      if ($$11 == dof.b) {
         if (czr.a(this.a, $$6.c())) {
            $$11 = dof.c;
         }

         if (czr.a(this.a, $$5.c())) {
            $$11 = dof.d;
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
            dgb $$19 = this.b(this.f.get($$18));
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

   public dnb c() {
      return this.d;
   }
}
