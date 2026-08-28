import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class dla {
   private final dbz a;
   private final iz b;
   private final dep c;
   private dsd d;
   private final boolean e;
   private final List<iz> f = Lists.newArrayList();

   public dla(dbz $$0, iz $$1, dsd $$2) {
      this.a = $$0;
      this.b = $$1;
      this.d = $$2;
      this.c = (dep)$$2.b();
      dth $$3 = $$2.c(this.c.c());
      this.e = this.c.b();
      this.a($$3);
   }

   public List<iz> a() {
      return this.f;
   }

   private void a(dth $$0) {
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
         dla $$1 = this.b(this.f.get($$0));
         if ($$1 != null && $$1.a(this)) {
            this.f.set($$0, $$1.b);
         } else {
            this.f.remove($$0--);
         }
      }
   }

   private boolean a(iz $$0) {
      return dep.a(this.a, $$0) || dep.a(this.a, $$0.c()) || dep.a(this.a, $$0.d());
   }

   @Nullable
   private dla b(iz $$0) {
      dsd $$2 = this.a.a_($$0);
      if (dep.g($$2)) {
         return new dla(this.a, $$0, $$2);
      } else {
         iz $$1 = $$0.c();
         $$2 = this.a.a_($$1);
         if (dep.g($$2)) {
            return new dla(this.a, $$1, $$2);
         } else {
            $$1 = $$0.d();
            $$2 = this.a.a_($$1);
            return dep.g($$2) ? new dla(this.a, $$1, $$2) : null;
         }
      }
   }

   private boolean a(dla $$0) {
      return this.c($$0.b);
   }

   private boolean c(iz $$0) {
      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         iz $$2 = this.f.get($$1);
         if ($$2.u() == $$0.u() && $$2.w() == $$0.w()) {
            return true;
         }
      }

      return false;
   }

   protected int b() {
      int $$0 = 0;

      for (je $$1 : je.c.a) {
         if (this.a(this.b.a($$1))) {
            $$0++;
         }
      }

      return $$0;
   }

   private boolean b(dla $$0) {
      return this.a($$0) || this.f.size() != 2;
   }

   private void c(dla $$0) {
      this.f.add($$0.b);
      iz $$1 = this.b.e();
      iz $$2 = this.b.f();
      iz $$3 = this.b.g();
      iz $$4 = this.b.h();
      boolean $$5 = this.c($$1);
      boolean $$6 = this.c($$2);
      boolean $$7 = this.c($$3);
      boolean $$8 = this.c($$4);
      dth $$9 = null;
      if ($$5 || $$6) {
         $$9 = dth.a;
      }

      if ($$7 || $$8) {
         $$9 = dth.b;
      }

      if (!this.e) {
         if ($$6 && $$8 && !$$5 && !$$7) {
            $$9 = dth.g;
         }

         if ($$6 && $$7 && !$$5 && !$$8) {
            $$9 = dth.h;
         }

         if ($$5 && $$7 && !$$6 && !$$8) {
            $$9 = dth.i;
         }

         if ($$5 && $$8 && !$$6 && !$$7) {
            $$9 = dth.j;
         }
      }

      if ($$9 == dth.a) {
         if (dep.a(this.a, $$1.c())) {
            $$9 = dth.e;
         }

         if (dep.a(this.a, $$2.c())) {
            $$9 = dth.f;
         }
      }

      if ($$9 == dth.b) {
         if (dep.a(this.a, $$4.c())) {
            $$9 = dth.c;
         }

         if (dep.a(this.a, $$3.c())) {
            $$9 = dth.d;
         }
      }

      if ($$9 == null) {
         $$9 = dth.a;
      }

      this.d = this.d.a(this.c.c(), $$9);
      this.a.a(this.b, this.d, 3);
   }

   private boolean d(iz $$0) {
      dla $$1 = this.b($$0);
      if ($$1 == null) {
         return false;
      } else {
         $$1.d();
         return $$1.b(this);
      }
   }

   public dla a(boolean $$0, boolean $$1, dth $$2) {
      iz $$3 = this.b.e();
      iz $$4 = this.b.f();
      iz $$5 = this.b.g();
      iz $$6 = this.b.h();
      boolean $$7 = this.d($$3);
      boolean $$8 = this.d($$4);
      boolean $$9 = this.d($$5);
      boolean $$10 = this.d($$6);
      dth $$11 = null;
      boolean $$12 = $$7 || $$8;
      boolean $$13 = $$9 || $$10;
      if ($$12 && !$$13) {
         $$11 = dth.a;
      }

      if ($$13 && !$$12) {
         $$11 = dth.b;
      }

      boolean $$14 = $$8 && $$10;
      boolean $$15 = $$8 && $$9;
      boolean $$16 = $$7 && $$10;
      boolean $$17 = $$7 && $$9;
      if (!this.e) {
         if ($$14 && !$$7 && !$$9) {
            $$11 = dth.g;
         }

         if ($$15 && !$$7 && !$$10) {
            $$11 = dth.h;
         }

         if ($$17 && !$$8 && !$$10) {
            $$11 = dth.i;
         }

         if ($$16 && !$$8 && !$$9) {
            $$11 = dth.j;
         }
      }

      if ($$11 == null) {
         if ($$12 && $$13) {
            $$11 = $$2;
         } else if ($$12) {
            $$11 = dth.a;
         } else if ($$13) {
            $$11 = dth.b;
         }

         if (!this.e) {
            if ($$0) {
               if ($$14) {
                  $$11 = dth.g;
               }

               if ($$15) {
                  $$11 = dth.h;
               }

               if ($$16) {
                  $$11 = dth.j;
               }

               if ($$17) {
                  $$11 = dth.i;
               }
            } else {
               if ($$17) {
                  $$11 = dth.i;
               }

               if ($$16) {
                  $$11 = dth.j;
               }

               if ($$15) {
                  $$11 = dth.h;
               }

               if ($$14) {
                  $$11 = dth.g;
               }
            }
         }
      }

      if ($$11 == dth.a) {
         if (dep.a(this.a, $$3.c())) {
            $$11 = dth.e;
         }

         if (dep.a(this.a, $$4.c())) {
            $$11 = dth.f;
         }
      }

      if ($$11 == dth.b) {
         if (dep.a(this.a, $$6.c())) {
            $$11 = dth.c;
         }

         if (dep.a(this.a, $$5.c())) {
            $$11 = dth.d;
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
            dla $$19 = this.b(this.f.get($$18));
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

   public dsd c() {
      return this.d;
   }
}
