import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class eew extends efe {
   private final Long2ObjectMap<eev> l = new Long2ObjectOpenHashMap();
   private static final float m = 1.5F;
   private static final int n = 10;

   @Override
   public void a(ctv $$0, bmh $$1) {
      super.a($$0, $$1);
      this.l.clear();
      $$1.E();
   }

   @Override
   public void b() {
      this.b.G();
      this.l.clear();
      super.b();
   }

   @Override
   public eex a() {
      int $$0;
      if (this.f() && this.b.aZ()) {
         $$0 = this.b.ds();
         hx.a $$1 = new hx.a(this.b.dr(), (double)$$0, this.b.dx());

         for (dja $$2 = this.a.a_($$1); $$2.a(cwl.G); $$2 = this.a.a_($$1)) {
            $$1.b(this.b.dr(), (double)(++$$0), this.b.dx());
         }
      } else {
         $$0 = aui.a(this.b.dt() + 0.5);
      }

      hx $$4 = hx.a(this.b.dr(), (double)$$0, this.b.dx());
      if (!this.a($$4)) {
         for (hx $$5 : this.a(this.b)) {
            if (this.a($$5)) {
               return super.c($$5);
            }
         }
      }

      return super.c($$4);
   }

   @Override
   protected boolean a(hx $$0) {
      eev $$1 = this.a(this.b, $$0);
      return this.b.a($$1) >= 0.0F;
   }

   @Override
   public efd a(double $$0, double $$1, double $$2) {
      return this.a(this.b(aui.a($$0), aui.a($$1), aui.a($$2)));
   }

   @Override
   public int a(eex[] $$0, eex $$1) {
      int $$2 = 0;
      eex $$3 = this.a($$1.a, $$1.b, $$1.c + 1);
      if (this.c($$3)) {
         $$0[$$2++] = $$3;
      }

      eex $$4 = this.a($$1.a - 1, $$1.b, $$1.c);
      if (this.c($$4)) {
         $$0[$$2++] = $$4;
      }

      eex $$5 = this.a($$1.a + 1, $$1.b, $$1.c);
      if (this.c($$5)) {
         $$0[$$2++] = $$5;
      }

      eex $$6 = this.a($$1.a, $$1.b, $$1.c - 1);
      if (this.c($$6)) {
         $$0[$$2++] = $$6;
      }

      eex $$7 = this.a($$1.a, $$1.b + 1, $$1.c);
      if (this.c($$7)) {
         $$0[$$2++] = $$7;
      }

      eex $$8 = this.a($$1.a, $$1.b - 1, $$1.c);
      if (this.c($$8)) {
         $$0[$$2++] = $$8;
      }

      eex $$9 = this.a($$1.a, $$1.b + 1, $$1.c + 1);
      if (this.c($$9) && this.b($$3) && this.b($$7)) {
         $$0[$$2++] = $$9;
      }

      eex $$10 = this.a($$1.a - 1, $$1.b + 1, $$1.c);
      if (this.c($$10) && this.b($$4) && this.b($$7)) {
         $$0[$$2++] = $$10;
      }

      eex $$11 = this.a($$1.a + 1, $$1.b + 1, $$1.c);
      if (this.c($$11) && this.b($$5) && this.b($$7)) {
         $$0[$$2++] = $$11;
      }

      eex $$12 = this.a($$1.a, $$1.b + 1, $$1.c - 1);
      if (this.c($$12) && this.b($$6) && this.b($$7)) {
         $$0[$$2++] = $$12;
      }

      eex $$13 = this.a($$1.a, $$1.b - 1, $$1.c + 1);
      if (this.c($$13) && this.b($$3) && this.b($$8)) {
         $$0[$$2++] = $$13;
      }

      eex $$14 = this.a($$1.a - 1, $$1.b - 1, $$1.c);
      if (this.c($$14) && this.b($$4) && this.b($$8)) {
         $$0[$$2++] = $$14;
      }

      eex $$15 = this.a($$1.a + 1, $$1.b - 1, $$1.c);
      if (this.c($$15) && this.b($$5) && this.b($$8)) {
         $$0[$$2++] = $$15;
      }

      eex $$16 = this.a($$1.a, $$1.b - 1, $$1.c - 1);
      if (this.c($$16) && this.b($$6) && this.b($$8)) {
         $$0[$$2++] = $$16;
      }

      eex $$17 = this.a($$1.a + 1, $$1.b, $$1.c - 1);
      if (this.c($$17) && this.b($$6) && this.b($$5)) {
         $$0[$$2++] = $$17;
      }

      eex $$18 = this.a($$1.a + 1, $$1.b, $$1.c + 1);
      if (this.c($$18) && this.b($$3) && this.b($$5)) {
         $$0[$$2++] = $$18;
      }

      eex $$19 = this.a($$1.a - 1, $$1.b, $$1.c - 1);
      if (this.c($$19) && this.b($$6) && this.b($$4)) {
         $$0[$$2++] = $$19;
      }

      eex $$20 = this.a($$1.a - 1, $$1.b, $$1.c + 1);
      if (this.c($$20) && this.b($$3) && this.b($$4)) {
         $$0[$$2++] = $$20;
      }

      eex $$21 = this.a($$1.a + 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$21) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$7) && this.b($$12) && this.b($$11)) {
         $$0[$$2++] = $$21;
      }

      eex $$22 = this.a($$1.a + 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$22) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$7) && this.b($$9) && this.b($$11)) {
         $$0[$$2++] = $$22;
      }

      eex $$23 = this.a($$1.a - 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$23) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$7) && this.b($$12) && this.b($$10)) {
         $$0[$$2++] = $$23;
      }

      eex $$24 = this.a($$1.a - 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$24) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$7) && this.b($$9) && this.b($$10)) {
         $$0[$$2++] = $$24;
      }

      eex $$25 = this.a($$1.a + 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$25) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$8) && this.b($$16) && this.b($$15)) {
         $$0[$$2++] = $$25;
      }

      eex $$26 = this.a($$1.a + 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$26) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$8) && this.b($$13) && this.b($$15)) {
         $$0[$$2++] = $$26;
      }

      eex $$27 = this.a($$1.a - 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$27) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$8) && this.b($$16) && this.b($$14)) {
         $$0[$$2++] = $$27;
      }

      eex $$28 = this.a($$1.a - 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$28) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$8) && this.b($$13) && this.b($$14)) {
         $$0[$$2++] = $$28;
      }

      return $$2;
   }

   private boolean b(@Nullable eex $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   private boolean c(@Nullable eex $$0) {
      return $$0 != null && !$$0.i;
   }

   @Nullable
   @Override
   protected eex a(int $$0, int $$1, int $$2) {
      eex $$3 = null;
      eev $$4 = this.c($$0, $$1, $$2);
      float $$5 = this.b.a($$4);
      if ($$5 >= 0.0F) {
         $$3 = this.b($$0, $$1, $$2);
         $$3.l = $$4;
         $$3.k = Math.max($$3.k, $$5);
         if ($$4 == eev.c) {
            $$3.k++;
         }
      }

      return $$3;
   }

   private eev c(int $$0, int $$1, int $$2) {
      return (eev)this.l.computeIfAbsent(hx.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public eev a(cso $$0, int $$1, int $$2, int $$3, bmh $$4) {
      EnumSet<eev> $$5 = EnumSet.noneOf(eev.class);
      eev $$6 = eev.a;
      hx $$7 = $$4.dm();
      $$6 = super.a($$0, $$1, $$2, $$3, $$5, $$6, $$7);
      if ($$5.contains(eev.h)) {
         return eev.h;
      } else {
         eev $$8 = eev.a;

         for (eev $$9 : $$5) {
            if ($$4.a($$9) < 0.0F) {
               return $$9;
            }

            if ($$4.a($$9) >= $$4.a($$8)) {
               $$8 = $$9;
            }
         }

         return $$6 == eev.b && $$4.a($$8) == 0.0F ? eev.b : $$8;
      }
   }

   @Override
   public eev a(cso $$0, int $$1, int $$2, int $$3) {
      hx.a $$4 = new hx.a();
      eev $$5 = b($$0, $$4.d($$1, $$2, $$3));
      if ($$5 == eev.b && $$2 >= $$0.J_() + 1) {
         eev $$6 = b($$0, $$4.d($$1, $$2 - 1, $$3));
         if ($$6 == eev.o || $$6 == eev.i) {
            $$5 = eev.o;
         } else if ($$6 == eev.q) {
            $$5 = eev.q;
         } else if ($$6 == eev.x) {
            $$5 = eev.x;
         } else if ($$6 == eev.h) {
            if (!$$4.equals(this.b.dm())) {
               $$5 = eev.h;
            }
         } else {
            $$5 = $$6 != eev.c && $$6 != eev.b && $$6 != eev.j ? eev.c : eev.b;
         }
      }

      if ($$5 == eev.c || $$5 == eev.b) {
         $$5 = a($$0, $$4.d($$1, $$2, $$3), $$5);
      }

      return $$5;
   }

   private Iterable<hx> a(bmh $$0) {
      float $$1 = 1.0F;
      elh $$2 = $$0.cH();
      boolean $$3 = $$2.a() < 1.0;
      if (!$$3) {
         return List.of(
            hx.a($$2.a, (double)$$0.ds(), $$2.c),
            hx.a($$2.a, (double)$$0.ds(), $$2.f),
            hx.a($$2.d, (double)$$0.ds(), $$2.c),
            hx.a($$2.d, (double)$$0.ds(), $$2.f)
         );
      } else {
         double $$4 = Math.max(0.0, (1.5 - $$2.d()) / 2.0);
         double $$5 = Math.max(0.0, (1.5 - $$2.b()) / 2.0);
         double $$6 = Math.max(0.0, (1.5 - $$2.c()) / 2.0);
         elh $$7 = $$2.c($$5, $$6, $$4);
         return hx.a($$0.eg(), 10, aui.a($$7.a), aui.a($$7.b), aui.a($$7.c), aui.a($$7.d), aui.a($$7.e), aui.a($$7.f));
      }
   }
}
