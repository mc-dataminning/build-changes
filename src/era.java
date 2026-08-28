import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;

public class era extends erl {
   private final Long2ObjectMap<erg> l = new Long2ObjectOpenHashMap();
   private static final float m = 1.0F;
   private static final float n = 1.1F;
   private static final int o = 10;

   @Override
   public void a(det $$0, bum $$1) {
      super.a($$0, $$1);
      this.l.clear();
      $$1.G();
   }

   @Override
   public void b() {
      this.b.I();
      this.l.clear();
      super.b();
   }

   @Override
   public erb a() {
      int $$0;
      if (this.f() && this.b.bi()) {
         $$0 = this.b.dy();
         je.a $$1 = new je.a(this.b.dx(), (double)$$0, this.b.dD());

         for (duo $$2 = this.a.a($$1); $$2.a(dhl.G); $$2 = this.a.a($$1)) {
            $$1.b(this.b.dx(), (double)(++$$0), this.b.dD());
         }
      } else {
         $$0 = azd.a(this.b.dz() + 0.5);
      }

      je $$4 = je.a(this.b.dx(), (double)$$0, this.b.dD());
      if (!this.a($$4)) {
         for (je $$5 : this.a(this.b)) {
            if (this.a($$5)) {
               return super.c($$5);
            }
         }
      }

      return super.c($$4);
   }

   @Override
   protected boolean a(je $$0) {
      erg $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return this.b.a($$1) >= 0.0F;
   }

   @Override
   public erk a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(erb[] $$0, erb $$1) {
      int $$2 = 0;
      erb $$3 = this.a($$1.a, $$1.b, $$1.c + 1);
      if (this.c($$3)) {
         $$0[$$2++] = $$3;
      }

      erb $$4 = this.a($$1.a - 1, $$1.b, $$1.c);
      if (this.c($$4)) {
         $$0[$$2++] = $$4;
      }

      erb $$5 = this.a($$1.a + 1, $$1.b, $$1.c);
      if (this.c($$5)) {
         $$0[$$2++] = $$5;
      }

      erb $$6 = this.a($$1.a, $$1.b, $$1.c - 1);
      if (this.c($$6)) {
         $$0[$$2++] = $$6;
      }

      erb $$7 = this.a($$1.a, $$1.b + 1, $$1.c);
      if (this.c($$7)) {
         $$0[$$2++] = $$7;
      }

      erb $$8 = this.a($$1.a, $$1.b - 1, $$1.c);
      if (this.c($$8)) {
         $$0[$$2++] = $$8;
      }

      erb $$9 = this.a($$1.a, $$1.b + 1, $$1.c + 1);
      if (this.c($$9) && this.b($$3) && this.b($$7)) {
         $$0[$$2++] = $$9;
      }

      erb $$10 = this.a($$1.a - 1, $$1.b + 1, $$1.c);
      if (this.c($$10) && this.b($$4) && this.b($$7)) {
         $$0[$$2++] = $$10;
      }

      erb $$11 = this.a($$1.a + 1, $$1.b + 1, $$1.c);
      if (this.c($$11) && this.b($$5) && this.b($$7)) {
         $$0[$$2++] = $$11;
      }

      erb $$12 = this.a($$1.a, $$1.b + 1, $$1.c - 1);
      if (this.c($$12) && this.b($$6) && this.b($$7)) {
         $$0[$$2++] = $$12;
      }

      erb $$13 = this.a($$1.a, $$1.b - 1, $$1.c + 1);
      if (this.c($$13) && this.b($$3) && this.b($$8)) {
         $$0[$$2++] = $$13;
      }

      erb $$14 = this.a($$1.a - 1, $$1.b - 1, $$1.c);
      if (this.c($$14) && this.b($$4) && this.b($$8)) {
         $$0[$$2++] = $$14;
      }

      erb $$15 = this.a($$1.a + 1, $$1.b - 1, $$1.c);
      if (this.c($$15) && this.b($$5) && this.b($$8)) {
         $$0[$$2++] = $$15;
      }

      erb $$16 = this.a($$1.a, $$1.b - 1, $$1.c - 1);
      if (this.c($$16) && this.b($$6) && this.b($$8)) {
         $$0[$$2++] = $$16;
      }

      erb $$17 = this.a($$1.a + 1, $$1.b, $$1.c - 1);
      if (this.c($$17) && this.b($$6) && this.b($$5)) {
         $$0[$$2++] = $$17;
      }

      erb $$18 = this.a($$1.a + 1, $$1.b, $$1.c + 1);
      if (this.c($$18) && this.b($$3) && this.b($$5)) {
         $$0[$$2++] = $$18;
      }

      erb $$19 = this.a($$1.a - 1, $$1.b, $$1.c - 1);
      if (this.c($$19) && this.b($$6) && this.b($$4)) {
         $$0[$$2++] = $$19;
      }

      erb $$20 = this.a($$1.a - 1, $$1.b, $$1.c + 1);
      if (this.c($$20) && this.b($$3) && this.b($$4)) {
         $$0[$$2++] = $$20;
      }

      erb $$21 = this.a($$1.a + 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$21) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$7) && this.b($$12) && this.b($$11)) {
         $$0[$$2++] = $$21;
      }

      erb $$22 = this.a($$1.a + 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$22) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$7) && this.b($$9) && this.b($$11)) {
         $$0[$$2++] = $$22;
      }

      erb $$23 = this.a($$1.a - 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$23) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$7) && this.b($$12) && this.b($$10)) {
         $$0[$$2++] = $$23;
      }

      erb $$24 = this.a($$1.a - 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$24) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$7) && this.b($$9) && this.b($$10)) {
         $$0[$$2++] = $$24;
      }

      erb $$25 = this.a($$1.a + 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$25) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$8) && this.b($$16) && this.b($$15)) {
         $$0[$$2++] = $$25;
      }

      erb $$26 = this.a($$1.a + 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$26) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$8) && this.b($$13) && this.b($$15)) {
         $$0[$$2++] = $$26;
      }

      erb $$27 = this.a($$1.a - 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$27) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$8) && this.b($$16) && this.b($$14)) {
         $$0[$$2++] = $$27;
      }

      erb $$28 = this.a($$1.a - 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$28) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$8) && this.b($$13) && this.b($$14)) {
         $$0[$$2++] = $$28;
      }

      return $$2;
   }

   private boolean b(@Nullable erb $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   private boolean c(@Nullable erb $$0) {
      return $$0 != null && !$$0.i;
   }

   @Nullable
   @Override
   protected erb a(int $$0, int $$1, int $$2) {
      erb $$3 = null;
      erg $$4 = this.b($$0, $$1, $$2);
      float $$5 = this.b.a($$4);
      if ($$5 >= 0.0F) {
         $$3 = this.c($$0, $$1, $$2);
         $$3.l = $$4;
         $$3.k = Math.max($$3.k, $$5);
         if ($$4 == erg.c) {
            $$3.k++;
         }
      }

      return $$3;
   }

   @Override
   protected erg b(int $$0, int $$1, int $$2) {
      return (erg)this.l.computeIfAbsent(je.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public erg a(eri $$0, int $$1, int $$2, int $$3) {
      erg $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == erg.b && $$2 >= $$0.a().G_() + 1) {
         je $$5 = new je($$1, $$2 - 1, $$3);
         erg $$6 = $$0.a($$5.u(), $$5.v(), $$5.w());
         if ($$6 == erg.o || $$6 == erg.i) {
            $$4 = erg.o;
         } else if ($$6 == erg.q) {
            $$4 = erg.q;
         } else if ($$6 == erg.x) {
            $$4 = erg.x;
         } else if ($$6 == erg.h) {
            if (!$$5.equals($$0.b())) {
               $$4 = erg.h;
            }
         } else {
            $$4 = $$6 != erg.c && $$6 != erg.b && $$6 != erg.j ? erg.c : erg.b;
         }
      }

      if ($$4 == erg.c || $$4 == erg.b) {
         $$4 = a($$0, $$1, $$2, $$3, $$4);
      }

      return $$4;
   }

   private Iterable<je> a(bum $$0) {
      eyn $$1 = $$0.cO();
      boolean $$2 = $$1.a() < 1.0;
      if (!$$2) {
         return List.of(
            je.a($$1.a, (double)$$0.dy(), $$1.c),
            je.a($$1.a, (double)$$0.dy(), $$1.f),
            je.a($$1.d, (double)$$0.dy(), $$1.c),
            je.a($$1.d, (double)$$0.dy(), $$1.f)
         );
      } else {
         double $$3 = Math.max(0.0, 1.1F - $$1.d());
         double $$4 = Math.max(0.0, 1.1F - $$1.b());
         double $$5 = Math.max(0.0, 1.1F - $$1.c());
         eyn $$6 = $$1.c($$4, $$5, $$3);
         return je.a($$0.dV(), 10, azd.a($$6.a), azd.a($$6.b), azd.a($$6.c), azd.a($$6.d), azd.a($$6.e), azd.a($$6.f));
      }
   }
}
