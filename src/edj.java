import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class edj extends edr {
   private final Long2ObjectMap<edi> l = new Long2ObjectOpenHashMap();
   private static final float m = 1.5F;
   private static final int n = 10;

   @Override
   public void a(css $$0, bln $$1) {
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
   public edk a() {
      int $$0;
      if (this.f() && this.b.aZ()) {
         $$0 = this.b.dt();
         hx.a $$1 = new hx.a(this.b.ds(), (double)$$0, this.b.dy());

         for (dhn $$2 = this.a.a_($$1); $$2.a(cvh.G); $$2 = this.a.a_($$1)) {
            $$1.b(this.b.ds(), (double)(++$$0), this.b.dy());
         }
      } else {
         $$0 = atq.a(this.b.du() + 0.5);
      }

      hx $$4 = hx.a(this.b.ds(), (double)$$0, this.b.dy());
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
      edi $$1 = this.a(this.b, $$0);
      return this.b.a($$1) >= 0.0F;
   }

   @Override
   public edq a(double $$0, double $$1, double $$2) {
      return this.a(this.b(atq.a($$0), atq.a($$1), atq.a($$2)));
   }

   @Override
   public int a(edk[] $$0, edk $$1) {
      int $$2 = 0;
      edk $$3 = this.a($$1.a, $$1.b, $$1.c + 1);
      if (this.c($$3)) {
         $$0[$$2++] = $$3;
      }

      edk $$4 = this.a($$1.a - 1, $$1.b, $$1.c);
      if (this.c($$4)) {
         $$0[$$2++] = $$4;
      }

      edk $$5 = this.a($$1.a + 1, $$1.b, $$1.c);
      if (this.c($$5)) {
         $$0[$$2++] = $$5;
      }

      edk $$6 = this.a($$1.a, $$1.b, $$1.c - 1);
      if (this.c($$6)) {
         $$0[$$2++] = $$6;
      }

      edk $$7 = this.a($$1.a, $$1.b + 1, $$1.c);
      if (this.c($$7)) {
         $$0[$$2++] = $$7;
      }

      edk $$8 = this.a($$1.a, $$1.b - 1, $$1.c);
      if (this.c($$8)) {
         $$0[$$2++] = $$8;
      }

      edk $$9 = this.a($$1.a, $$1.b + 1, $$1.c + 1);
      if (this.c($$9) && this.b($$3) && this.b($$7)) {
         $$0[$$2++] = $$9;
      }

      edk $$10 = this.a($$1.a - 1, $$1.b + 1, $$1.c);
      if (this.c($$10) && this.b($$4) && this.b($$7)) {
         $$0[$$2++] = $$10;
      }

      edk $$11 = this.a($$1.a + 1, $$1.b + 1, $$1.c);
      if (this.c($$11) && this.b($$5) && this.b($$7)) {
         $$0[$$2++] = $$11;
      }

      edk $$12 = this.a($$1.a, $$1.b + 1, $$1.c - 1);
      if (this.c($$12) && this.b($$6) && this.b($$7)) {
         $$0[$$2++] = $$12;
      }

      edk $$13 = this.a($$1.a, $$1.b - 1, $$1.c + 1);
      if (this.c($$13) && this.b($$3) && this.b($$8)) {
         $$0[$$2++] = $$13;
      }

      edk $$14 = this.a($$1.a - 1, $$1.b - 1, $$1.c);
      if (this.c($$14) && this.b($$4) && this.b($$8)) {
         $$0[$$2++] = $$14;
      }

      edk $$15 = this.a($$1.a + 1, $$1.b - 1, $$1.c);
      if (this.c($$15) && this.b($$5) && this.b($$8)) {
         $$0[$$2++] = $$15;
      }

      edk $$16 = this.a($$1.a, $$1.b - 1, $$1.c - 1);
      if (this.c($$16) && this.b($$6) && this.b($$8)) {
         $$0[$$2++] = $$16;
      }

      edk $$17 = this.a($$1.a + 1, $$1.b, $$1.c - 1);
      if (this.c($$17) && this.b($$6) && this.b($$5)) {
         $$0[$$2++] = $$17;
      }

      edk $$18 = this.a($$1.a + 1, $$1.b, $$1.c + 1);
      if (this.c($$18) && this.b($$3) && this.b($$5)) {
         $$0[$$2++] = $$18;
      }

      edk $$19 = this.a($$1.a - 1, $$1.b, $$1.c - 1);
      if (this.c($$19) && this.b($$6) && this.b($$4)) {
         $$0[$$2++] = $$19;
      }

      edk $$20 = this.a($$1.a - 1, $$1.b, $$1.c + 1);
      if (this.c($$20) && this.b($$3) && this.b($$4)) {
         $$0[$$2++] = $$20;
      }

      edk $$21 = this.a($$1.a + 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$21) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$7) && this.b($$12) && this.b($$11)) {
         $$0[$$2++] = $$21;
      }

      edk $$22 = this.a($$1.a + 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$22) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$7) && this.b($$9) && this.b($$11)) {
         $$0[$$2++] = $$22;
      }

      edk $$23 = this.a($$1.a - 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$23) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$7) && this.b($$12) && this.b($$10)) {
         $$0[$$2++] = $$23;
      }

      edk $$24 = this.a($$1.a - 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$24) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$7) && this.b($$9) && this.b($$10)) {
         $$0[$$2++] = $$24;
      }

      edk $$25 = this.a($$1.a + 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$25) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$8) && this.b($$16) && this.b($$15)) {
         $$0[$$2++] = $$25;
      }

      edk $$26 = this.a($$1.a + 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$26) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$8) && this.b($$13) && this.b($$15)) {
         $$0[$$2++] = $$26;
      }

      edk $$27 = this.a($$1.a - 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$27) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$8) && this.b($$16) && this.b($$14)) {
         $$0[$$2++] = $$27;
      }

      edk $$28 = this.a($$1.a - 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$28) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$8) && this.b($$13) && this.b($$14)) {
         $$0[$$2++] = $$28;
      }

      return $$2;
   }

   private boolean b(@Nullable edk $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   private boolean c(@Nullable edk $$0) {
      return $$0 != null && !$$0.i;
   }

   @Nullable
   @Override
   protected edk a(int $$0, int $$1, int $$2) {
      edk $$3 = null;
      edi $$4 = this.c($$0, $$1, $$2);
      float $$5 = this.b.a($$4);
      if ($$5 >= 0.0F) {
         $$3 = this.b($$0, $$1, $$2);
         $$3.l = $$4;
         $$3.k = Math.max($$3.k, $$5);
         if ($$4 == edi.c) {
            $$3.k++;
         }
      }

      return $$3;
   }

   private edi c(int $$0, int $$1, int $$2) {
      return (edi)this.l.computeIfAbsent(hx.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public edi a(crl $$0, int $$1, int $$2, int $$3, bln $$4) {
      EnumSet<edi> $$5 = EnumSet.noneOf(edi.class);
      edi $$6 = edi.a;
      hx $$7 = $$4.dn();
      $$6 = super.a($$0, $$1, $$2, $$3, $$5, $$6, $$7);
      if ($$5.contains(edi.h)) {
         return edi.h;
      } else {
         edi $$8 = edi.a;

         for (edi $$9 : $$5) {
            if ($$4.a($$9) < 0.0F) {
               return $$9;
            }

            if ($$4.a($$9) >= $$4.a($$8)) {
               $$8 = $$9;
            }
         }

         return $$6 == edi.b && $$4.a($$8) == 0.0F ? edi.b : $$8;
      }
   }

   @Override
   public edi a(crl $$0, int $$1, int $$2, int $$3) {
      hx.a $$4 = new hx.a();
      edi $$5 = b($$0, $$4.d($$1, $$2, $$3));
      if ($$5 == edi.b && $$2 >= $$0.J_() + 1) {
         edi $$6 = b($$0, $$4.d($$1, $$2 - 1, $$3));
         if ($$6 == edi.o || $$6 == edi.i) {
            $$5 = edi.o;
         } else if ($$6 == edi.q) {
            $$5 = edi.q;
         } else if ($$6 == edi.x) {
            $$5 = edi.x;
         } else if ($$6 == edi.h) {
            if (!$$4.equals(this.b.dn())) {
               $$5 = edi.h;
            }
         } else {
            $$5 = $$6 != edi.c && $$6 != edi.b && $$6 != edi.j ? edi.c : edi.b;
         }
      }

      if ($$5 == edi.c || $$5 == edi.b) {
         $$5 = a($$0, $$4.d($$1, $$2, $$3), $$5);
      }

      return $$5;
   }

   private Iterable<hx> a(bln $$0) {
      float $$1 = 1.0F;
      eju $$2 = $$0.cH();
      boolean $$3 = $$2.a() < 1.0;
      if (!$$3) {
         return List.of(
            hx.a($$2.a, (double)$$0.dt(), $$2.c),
            hx.a($$2.a, (double)$$0.dt(), $$2.f),
            hx.a($$2.d, (double)$$0.dt(), $$2.c),
            hx.a($$2.d, (double)$$0.dt(), $$2.f)
         );
      } else {
         double $$4 = Math.max(0.0, (1.5 - $$2.d()) / 2.0);
         double $$5 = Math.max(0.0, (1.5 - $$2.b()) / 2.0);
         double $$6 = Math.max(0.0, (1.5 - $$2.c()) / 2.0);
         eju $$7 = $$2.c($$5, $$6, $$4);
         return hx.a($$0.eh(), 10, atq.a($$7.a), atq.a($$7.b), atq.a($$7.c), atq.a($$7.d), atq.a($$7.e), atq.a($$7.f));
      }
   }
}
