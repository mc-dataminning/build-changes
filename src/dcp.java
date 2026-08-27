import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class dcp {
   private final ctp a;
   private final hx b;
   private final cwf c;
   private djh d;
   private final boolean e;
   private final List<hx> f = Lists.newArrayList();

   public dcp(ctp $$0, hx $$1, djh $$2) {
      this.a = $$0;
      this.b = $$1;
      this.d = $$2;
      this.c = (cwf)$$2.b();
      dkl $$3 = $$2.c(this.c.c());
      this.e = this.c.b();
      this.a($$3);
   }

   public List<hx> a() {
      return this.f;
   }

   private void a(dkl $$0) {
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
         dcp $$1 = this.b(this.f.get($$0));
         if ($$1 != null && $$1.a(this)) {
            this.f.set($$0, $$1.b);
         } else {
            this.f.remove($$0--);
         }
      }
   }

   private boolean a(hx $$0) {
      return cwf.a(this.a, $$0) || cwf.a(this.a, $$0.c()) || cwf.a(this.a, $$0.d());
   }

   @Nullable
   private dcp b(hx $$0) {
      djh $$2 = this.a.a_($$0);
      if (cwf.g($$2)) {
         return new dcp(this.a, $$0, $$2);
      } else {
         hx $$1 = $$0.c();
         $$2 = this.a.a_($$1);
         if (cwf.g($$2)) {
            return new dcp(this.a, $$1, $$2);
         } else {
            $$1 = $$0.d();
            $$2 = this.a.a_($$1);
            return cwf.g($$2) ? new dcp(this.a, $$1, $$2) : null;
         }
      }
   }

   private boolean a(dcp $$0) {
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

   private boolean b(dcp $$0) {
      return this.a($$0) || this.f.size() != 2;
   }

   private void c(dcp $$0) {
      this.f.add($$0.b);
      hx $$1 = this.b.e();
      hx $$2 = this.b.f();
      hx $$3 = this.b.g();
      hx $$4 = this.b.h();
      boolean $$5 = this.c($$1);
      boolean $$6 = this.c($$2);
      boolean $$7 = this.c($$3);
      boolean $$8 = this.c($$4);
      dkl $$9 = null;
      if ($$5 || $$6) {
         $$9 = dkl.a;
      }

      if ($$7 || $$8) {
         $$9 = dkl.b;
      }

      if (!this.e) {
         if ($$6 && $$8 && !$$5 && !$$7) {
            $$9 = dkl.g;
         }

         if ($$6 && $$7 && !$$5 && !$$8) {
            $$9 = dkl.h;
         }

         if ($$5 && $$7 && !$$6 && !$$8) {
            $$9 = dkl.i;
         }

         if ($$5 && $$8 && !$$6 && !$$7) {
            $$9 = dkl.j;
         }
      }

      if ($$9 == dkl.a) {
         if (cwf.a(this.a, $$1.c())) {
            $$9 = dkl.e;
         }

         if (cwf.a(this.a, $$2.c())) {
            $$9 = dkl.f;
         }
      }

      if ($$9 == dkl.b) {
         if (cwf.a(this.a, $$4.c())) {
            $$9 = dkl.c;
         }

         if (cwf.a(this.a, $$3.c())) {
            $$9 = dkl.d;
         }
      }

      if ($$9 == null) {
         $$9 = dkl.a;
      }

      this.d = this.d.a(this.c.c(), $$9);
      this.a.a(this.b, this.d, 3);
   }

   private boolean d(hx $$0) {
      dcp $$1 = this.b($$0);
      if ($$1 == null) {
         return false;
      } else {
         $$1.d();
         return $$1.b(this);
      }
   }

   public dcp a(boolean $$0, boolean $$1, dkl $$2) {
      hx $$3 = this.b.e();
      hx $$4 = this.b.f();
      hx $$5 = this.b.g();
      hx $$6 = this.b.h();
      boolean $$7 = this.d($$3);
      boolean $$8 = this.d($$4);
      boolean $$9 = this.d($$5);
      boolean $$10 = this.d($$6);
      dkl $$11 = null;
      boolean $$12 = $$7 || $$8;
      boolean $$13 = $$9 || $$10;
      if ($$12 && !$$13) {
         $$11 = dkl.a;
      }

      if ($$13 && !$$12) {
         $$11 = dkl.b;
      }

      boolean $$14 = $$8 && $$10;
      boolean $$15 = $$8 && $$9;
      boolean $$16 = $$7 && $$10;
      boolean $$17 = $$7 && $$9;
      if (!this.e) {
         if ($$14 && !$$7 && !$$9) {
            $$11 = dkl.g;
         }

         if ($$15 && !$$7 && !$$10) {
            $$11 = dkl.h;
         }

         if ($$17 && !$$8 && !$$10) {
            $$11 = dkl.i;
         }

         if ($$16 && !$$8 && !$$9) {
            $$11 = dkl.j;
         }
      }

      if ($$11 == null) {
         if ($$12 && $$13) {
            $$11 = $$2;
         } else if ($$12) {
            $$11 = dkl.a;
         } else if ($$13) {
            $$11 = dkl.b;
         }

         if (!this.e) {
            if ($$0) {
               if ($$14) {
                  $$11 = dkl.g;
               }

               if ($$15) {
                  $$11 = dkl.h;
               }

               if ($$16) {
                  $$11 = dkl.j;
               }

               if ($$17) {
                  $$11 = dkl.i;
               }
            } else {
               if ($$17) {
                  $$11 = dkl.i;
               }

               if ($$16) {
                  $$11 = dkl.j;
               }

               if ($$15) {
                  $$11 = dkl.h;
               }

               if ($$14) {
                  $$11 = dkl.g;
               }
            }
         }
      }

      if ($$11 == dkl.a) {
         if (cwf.a(this.a, $$3.c())) {
            $$11 = dkl.e;
         }

         if (cwf.a(this.a, $$4.c())) {
            $$11 = dkl.f;
         }
      }

      if ($$11 == dkl.b) {
         if (cwf.a(this.a, $$6.c())) {
            $$11 = dkl.c;
         }

         if (cwf.a(this.a, $$5.c())) {
            $$11 = dkl.d;
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
            dcp $$19 = this.b(this.f.get($$18));
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

   public djh c() {
      return this.d;
   }
}
