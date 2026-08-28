import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class dtl {
   private final djz a;
   private final iw b;
   private final dmt c;
   private ebg d;
   private final boolean e;
   private final List<iw> f = Lists.newArrayList();

   public dtl(djz $$0, iw $$1, ebg $$2) {
      this.a = $$0;
      this.b = $$1;
      this.d = $$2;
      this.c = (dmt)$$2.b();
      eck $$3 = $$2.c(this.c.c());
      this.e = this.c.b();
      this.a($$3);
   }

   public List<iw> a() {
      return this.f;
   }

   private void a(eck $$0) {
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
         dtl $$1 = this.b(this.f.get($$0));
         if ($$1 != null && $$1.a(this)) {
            this.f.set($$0, $$1.b);
         } else {
            this.f.remove($$0--);
         }
      }
   }

   private boolean a(iw $$0) {
      return dmt.a(this.a, $$0) || dmt.a(this.a, $$0.d()) || dmt.a(this.a, $$0.e());
   }

   @Nullable
   private dtl b(iw $$0) {
      ebg $$2 = this.a.a_($$0);
      if (dmt.h($$2)) {
         return new dtl(this.a, $$0, $$2);
      } else {
         iw $$1 = $$0.d();
         $$2 = this.a.a_($$1);
         if (dmt.h($$2)) {
            return new dtl(this.a, $$1, $$2);
         } else {
            $$1 = $$0.e();
            $$2 = this.a.a_($$1);
            return dmt.h($$2) ? new dtl(this.a, $$1, $$2) : null;
         }
      }
   }

   private boolean a(dtl $$0) {
      return this.c($$0.b);
   }

   private boolean c(iw $$0) {
      for (int $$1 = 0; $$1 < this.f.size(); $$1++) {
         iw $$2 = this.f.get($$1);
         if ($$2.u() == $$0.u() && $$2.w() == $$0.w()) {
            return true;
         }
      }

      return false;
   }

   protected int b() {
      int $$0 = 0;

      for (jc $$1 : jc.c.a) {
         if (this.a(this.b.a($$1))) {
            $$0++;
         }
      }

      return $$0;
   }

   private boolean b(dtl $$0) {
      return this.a($$0) || this.f.size() != 2;
   }

   private void c(dtl $$0) {
      this.f.add($$0.b);
      iw $$1 = this.b.f();
      iw $$2 = this.b.g();
      iw $$3 = this.b.h();
      iw $$4 = this.b.i();
      boolean $$5 = this.c($$1);
      boolean $$6 = this.c($$2);
      boolean $$7 = this.c($$3);
      boolean $$8 = this.c($$4);
      eck $$9 = null;
      if ($$5 || $$6) {
         $$9 = eck.a;
      }

      if ($$7 || $$8) {
         $$9 = eck.b;
      }

      if (!this.e) {
         if ($$6 && $$8 && !$$5 && !$$7) {
            $$9 = eck.g;
         }

         if ($$6 && $$7 && !$$5 && !$$8) {
            $$9 = eck.h;
         }

         if ($$5 && $$7 && !$$6 && !$$8) {
            $$9 = eck.i;
         }

         if ($$5 && $$8 && !$$6 && !$$7) {
            $$9 = eck.j;
         }
      }

      if ($$9 == eck.a) {
         if (dmt.a(this.a, $$1.d())) {
            $$9 = eck.e;
         }

         if (dmt.a(this.a, $$2.d())) {
            $$9 = eck.f;
         }
      }

      if ($$9 == eck.b) {
         if (dmt.a(this.a, $$4.d())) {
            $$9 = eck.c;
         }

         if (dmt.a(this.a, $$3.d())) {
            $$9 = eck.d;
         }
      }

      if ($$9 == null) {
         $$9 = eck.a;
      }

      this.d = this.d.b(this.c.c(), $$9);
      this.a.a(this.b, this.d, 3);
   }

   private boolean d(iw $$0) {
      dtl $$1 = this.b($$0);
      if ($$1 == null) {
         return false;
      } else {
         $$1.d();
         return $$1.b(this);
      }
   }

   public dtl a(boolean $$0, boolean $$1, eck $$2) {
      iw $$3 = this.b.f();
      iw $$4 = this.b.g();
      iw $$5 = this.b.h();
      iw $$6 = this.b.i();
      boolean $$7 = this.d($$3);
      boolean $$8 = this.d($$4);
      boolean $$9 = this.d($$5);
      boolean $$10 = this.d($$6);
      eck $$11 = null;
      boolean $$12 = $$7 || $$8;
      boolean $$13 = $$9 || $$10;
      if ($$12 && !$$13) {
         $$11 = eck.a;
      }

      if ($$13 && !$$12) {
         $$11 = eck.b;
      }

      boolean $$14 = $$8 && $$10;
      boolean $$15 = $$8 && $$9;
      boolean $$16 = $$7 && $$10;
      boolean $$17 = $$7 && $$9;
      if (!this.e) {
         if ($$14 && !$$7 && !$$9) {
            $$11 = eck.g;
         }

         if ($$15 && !$$7 && !$$10) {
            $$11 = eck.h;
         }

         if ($$17 && !$$8 && !$$10) {
            $$11 = eck.i;
         }

         if ($$16 && !$$8 && !$$9) {
            $$11 = eck.j;
         }
      }

      if ($$11 == null) {
         if ($$12 && $$13) {
            $$11 = $$2;
         } else if ($$12) {
            $$11 = eck.a;
         } else if ($$13) {
            $$11 = eck.b;
         }

         if (!this.e) {
            if ($$0) {
               if ($$14) {
                  $$11 = eck.g;
               }

               if ($$15) {
                  $$11 = eck.h;
               }

               if ($$16) {
                  $$11 = eck.j;
               }

               if ($$17) {
                  $$11 = eck.i;
               }
            } else {
               if ($$17) {
                  $$11 = eck.i;
               }

               if ($$16) {
                  $$11 = eck.j;
               }

               if ($$15) {
                  $$11 = eck.h;
               }

               if ($$14) {
                  $$11 = eck.g;
               }
            }
         }
      }

      if ($$11 == eck.a) {
         if (dmt.a(this.a, $$3.d())) {
            $$11 = eck.e;
         }

         if (dmt.a(this.a, $$4.d())) {
            $$11 = eck.f;
         }
      }

      if ($$11 == eck.b) {
         if (dmt.a(this.a, $$6.d())) {
            $$11 = eck.c;
         }

         if (dmt.a(this.a, $$5.d())) {
            $$11 = eck.d;
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
            dtl $$19 = this.b(this.f.get($$18));
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

   public ebg c() {
      return this.d;
   }
}
