import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class dtv {
   private final dkj a;
   private final iw b;
   private final dnd c;
   private ebq d;
   private final boolean e;
   private final List<iw> f = Lists.newArrayList();

   public dtv(dkj $$0, iw $$1, ebq $$2) {
      this.a = $$0;
      this.b = $$1;
      this.d = $$2;
      this.c = (dnd)$$2.b();
      ecu $$3 = $$2.c(this.c.c());
      this.e = this.c.b();
      this.a($$3);
   }

   public List<iw> a() {
      return this.f;
   }

   private void a(ecu $$0) {
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
         dtv $$1 = this.b(this.f.get($$0));
         if ($$1 != null && $$1.a(this)) {
            this.f.set($$0, $$1.b);
         } else {
            this.f.remove($$0--);
         }
      }
   }

   private boolean a(iw $$0) {
      return dnd.a(this.a, $$0) || dnd.a(this.a, $$0.d()) || dnd.a(this.a, $$0.e());
   }

   @Nullable
   private dtv b(iw $$0) {
      ebq $$2 = this.a.a_($$0);
      if (dnd.h($$2)) {
         return new dtv(this.a, $$0, $$2);
      } else {
         iw $$1 = $$0.d();
         $$2 = this.a.a_($$1);
         if (dnd.h($$2)) {
            return new dtv(this.a, $$1, $$2);
         } else {
            $$1 = $$0.e();
            $$2 = this.a.a_($$1);
            return dnd.h($$2) ? new dtv(this.a, $$1, $$2) : null;
         }
      }
   }

   private boolean a(dtv $$0) {
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

   private boolean b(dtv $$0) {
      return this.a($$0) || this.f.size() != 2;
   }

   private void c(dtv $$0) {
      this.f.add($$0.b);
      iw $$1 = this.b.f();
      iw $$2 = this.b.g();
      iw $$3 = this.b.h();
      iw $$4 = this.b.i();
      boolean $$5 = this.c($$1);
      boolean $$6 = this.c($$2);
      boolean $$7 = this.c($$3);
      boolean $$8 = this.c($$4);
      ecu $$9 = null;
      if ($$5 || $$6) {
         $$9 = ecu.a;
      }

      if ($$7 || $$8) {
         $$9 = ecu.b;
      }

      if (!this.e) {
         if ($$6 && $$8 && !$$5 && !$$7) {
            $$9 = ecu.g;
         }

         if ($$6 && $$7 && !$$5 && !$$8) {
            $$9 = ecu.h;
         }

         if ($$5 && $$7 && !$$6 && !$$8) {
            $$9 = ecu.i;
         }

         if ($$5 && $$8 && !$$6 && !$$7) {
            $$9 = ecu.j;
         }
      }

      if ($$9 == ecu.a) {
         if (dnd.a(this.a, $$1.d())) {
            $$9 = ecu.e;
         }

         if (dnd.a(this.a, $$2.d())) {
            $$9 = ecu.f;
         }
      }

      if ($$9 == ecu.b) {
         if (dnd.a(this.a, $$4.d())) {
            $$9 = ecu.c;
         }

         if (dnd.a(this.a, $$3.d())) {
            $$9 = ecu.d;
         }
      }

      if ($$9 == null) {
         $$9 = ecu.a;
      }

      this.d = this.d.b(this.c.c(), $$9);
      this.a.a(this.b, this.d, 3);
   }

   private boolean d(iw $$0) {
      dtv $$1 = this.b($$0);
      if ($$1 == null) {
         return false;
      } else {
         $$1.d();
         return $$1.b(this);
      }
   }

   public dtv a(boolean $$0, boolean $$1, ecu $$2) {
      iw $$3 = this.b.f();
      iw $$4 = this.b.g();
      iw $$5 = this.b.h();
      iw $$6 = this.b.i();
      boolean $$7 = this.d($$3);
      boolean $$8 = this.d($$4);
      boolean $$9 = this.d($$5);
      boolean $$10 = this.d($$6);
      ecu $$11 = null;
      boolean $$12 = $$7 || $$8;
      boolean $$13 = $$9 || $$10;
      if ($$12 && !$$13) {
         $$11 = ecu.a;
      }

      if ($$13 && !$$12) {
         $$11 = ecu.b;
      }

      boolean $$14 = $$8 && $$10;
      boolean $$15 = $$8 && $$9;
      boolean $$16 = $$7 && $$10;
      boolean $$17 = $$7 && $$9;
      if (!this.e) {
         if ($$14 && !$$7 && !$$9) {
            $$11 = ecu.g;
         }

         if ($$15 && !$$7 && !$$10) {
            $$11 = ecu.h;
         }

         if ($$17 && !$$8 && !$$10) {
            $$11 = ecu.i;
         }

         if ($$16 && !$$8 && !$$9) {
            $$11 = ecu.j;
         }
      }

      if ($$11 == null) {
         if ($$12 && $$13) {
            $$11 = $$2;
         } else if ($$12) {
            $$11 = ecu.a;
         } else if ($$13) {
            $$11 = ecu.b;
         }

         if (!this.e) {
            if ($$0) {
               if ($$14) {
                  $$11 = ecu.g;
               }

               if ($$15) {
                  $$11 = ecu.h;
               }

               if ($$16) {
                  $$11 = ecu.j;
               }

               if ($$17) {
                  $$11 = ecu.i;
               }
            } else {
               if ($$17) {
                  $$11 = ecu.i;
               }

               if ($$16) {
                  $$11 = ecu.j;
               }

               if ($$15) {
                  $$11 = ecu.h;
               }

               if ($$14) {
                  $$11 = ecu.g;
               }
            }
         }
      }

      if ($$11 == ecu.a) {
         if (dnd.a(this.a, $$3.d())) {
            $$11 = ecu.e;
         }

         if (dnd.a(this.a, $$4.d())) {
            $$11 = ecu.f;
         }
      }

      if ($$11 == ecu.b) {
         if (dnd.a(this.a, $$6.d())) {
            $$11 = ecu.c;
         }

         if (dnd.a(this.a, $$5.d())) {
            $$11 = ecu.d;
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
            dtv $$19 = this.b(this.f.get($$18));
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

   public ebq c() {
      return this.d;
   }
}
