import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class dmw {
   private final dds a;
   private final je b;
   private final dgk c;
   private dua d;
   private final boolean e;
   private final List<je> f = Lists.newArrayList();

   public dmw(dds $$0, je $$1, dua $$2) {
      this.a = $$0;
      this.b = $$1;
      this.d = $$2;
      this.c = (dgk)$$2.b();
      dve $$3 = $$2.c(this.c.c());
      this.e = this.c.b();
      this.a($$3);
   }

   public List<je> a() {
      return this.f;
   }

   private void a(dve $$0) {
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
         dmw $$1 = this.b(this.f.get($$0));
         if ($$1 != null && $$1.a(this)) {
            this.f.set($$0, $$1.b);
         } else {
            this.f.remove($$0--);
         }
      }
   }

   private boolean a(je $$0) {
      return dgk.a(this.a, $$0) || dgk.a(this.a, $$0.d()) || dgk.a(this.a, $$0.e());
   }

   @Nullable
   private dmw b(je $$0) {
      dua $$2 = this.a.a_($$0);
      if (dgk.h($$2)) {
         return new dmw(this.a, $$0, $$2);
      } else {
         je $$1 = $$0.d();
         $$2 = this.a.a_($$1);
         if (dgk.h($$2)) {
            return new dmw(this.a, $$1, $$2);
         } else {
            $$1 = $$0.e();
            $$2 = this.a.a_($$1);
            return dgk.h($$2) ? new dmw(this.a, $$1, $$2) : null;
         }
      }
   }

   private boolean a(dmw $$0) {
      return this.c($$0.b);
   }

   private boolean c(je $$0) {
      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         je $$2 = this.f.get($$1);
         if ($$2.u() == $$0.u() && $$2.w() == $$0.w()) {
            return true;
         }
      }

      return false;
   }

   protected int b() {
      int $$0 = 0;

      for (jj $$1 : jj.c.a) {
         if (this.a(this.b.a($$1))) {
            $$0++;
         }
      }

      return $$0;
   }

   private boolean b(dmw $$0) {
      return this.a($$0) || this.f.size() != 2;
   }

   private void c(dmw $$0) {
      this.f.add($$0.b);
      je $$1 = this.b.f();
      je $$2 = this.b.g();
      je $$3 = this.b.h();
      je $$4 = this.b.i();
      boolean $$5 = this.c($$1);
      boolean $$6 = this.c($$2);
      boolean $$7 = this.c($$3);
      boolean $$8 = this.c($$4);
      dve $$9 = null;
      if ($$5 || $$6) {
         $$9 = dve.a;
      }

      if ($$7 || $$8) {
         $$9 = dve.b;
      }

      if (!this.e) {
         if ($$6 && $$8 && !$$5 && !$$7) {
            $$9 = dve.g;
         }

         if ($$6 && $$7 && !$$5 && !$$8) {
            $$9 = dve.h;
         }

         if ($$5 && $$7 && !$$6 && !$$8) {
            $$9 = dve.i;
         }

         if ($$5 && $$8 && !$$6 && !$$7) {
            $$9 = dve.j;
         }
      }

      if ($$9 == dve.a) {
         if (dgk.a(this.a, $$1.d())) {
            $$9 = dve.e;
         }

         if (dgk.a(this.a, $$2.d())) {
            $$9 = dve.f;
         }
      }

      if ($$9 == dve.b) {
         if (dgk.a(this.a, $$4.d())) {
            $$9 = dve.c;
         }

         if (dgk.a(this.a, $$3.d())) {
            $$9 = dve.d;
         }
      }

      if ($$9 == null) {
         $$9 = dve.a;
      }

      this.d = this.d.b(this.c.c(), $$9);
      this.a.a(this.b, this.d, 3);
   }

   private boolean d(je $$0) {
      dmw $$1 = this.b($$0);
      if ($$1 == null) {
         return false;
      } else {
         $$1.d();
         return $$1.b(this);
      }
   }

   public dmw a(boolean $$0, boolean $$1, dve $$2) {
      je $$3 = this.b.f();
      je $$4 = this.b.g();
      je $$5 = this.b.h();
      je $$6 = this.b.i();
      boolean $$7 = this.d($$3);
      boolean $$8 = this.d($$4);
      boolean $$9 = this.d($$5);
      boolean $$10 = this.d($$6);
      dve $$11 = null;
      boolean $$12 = $$7 || $$8;
      boolean $$13 = $$9 || $$10;
      if ($$12 && !$$13) {
         $$11 = dve.a;
      }

      if ($$13 && !$$12) {
         $$11 = dve.b;
      }

      boolean $$14 = $$8 && $$10;
      boolean $$15 = $$8 && $$9;
      boolean $$16 = $$7 && $$10;
      boolean $$17 = $$7 && $$9;
      if (!this.e) {
         if ($$14 && !$$7 && !$$9) {
            $$11 = dve.g;
         }

         if ($$15 && !$$7 && !$$10) {
            $$11 = dve.h;
         }

         if ($$17 && !$$8 && !$$10) {
            $$11 = dve.i;
         }

         if ($$16 && !$$8 && !$$9) {
            $$11 = dve.j;
         }
      }

      if ($$11 == null) {
         if ($$12 && $$13) {
            $$11 = $$2;
         } else if ($$12) {
            $$11 = dve.a;
         } else if ($$13) {
            $$11 = dve.b;
         }

         if (!this.e) {
            if ($$0) {
               if ($$14) {
                  $$11 = dve.g;
               }

               if ($$15) {
                  $$11 = dve.h;
               }

               if ($$16) {
                  $$11 = dve.j;
               }

               if ($$17) {
                  $$11 = dve.i;
               }
            } else {
               if ($$17) {
                  $$11 = dve.i;
               }

               if ($$16) {
                  $$11 = dve.j;
               }

               if ($$15) {
                  $$11 = dve.h;
               }

               if ($$14) {
                  $$11 = dve.g;
               }
            }
         }
      }

      if ($$11 == dve.a) {
         if (dgk.a(this.a, $$3.d())) {
            $$11 = dve.e;
         }

         if (dgk.a(this.a, $$4.d())) {
            $$11 = dve.f;
         }
      }

      if ($$11 == dve.b) {
         if (dgk.a(this.a, $$6.d())) {
            $$11 = dve.c;
         }

         if (dgk.a(this.a, $$5.d())) {
            $$11 = dve.d;
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
            dmw $$19 = this.b(this.f.get($$18));
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

   public dua c() {
      return this.d;
   }
}
