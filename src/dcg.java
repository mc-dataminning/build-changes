import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface dcg extends dbg, dbn, dct, ddf.a {
   @Nullable
   dud a(int var1, int var2, dvc var3, boolean var4);

   @Deprecated
   boolean b(int var1, int var2);

   int a(dxz.a var1, int var2, int var3);

   int B_();

   ddf F_();

   default jj<ddd> t(ja $$0) {
      return this.F_().a($$0);
   }

   default Stream<dsh> c(evu $$0) {
      int $$1 = aye.a($$0.a);
      int $$2 = aye.a($$0.d);
      int $$3 = aye.a($$0.b);
      int $$4 = aye.a($$0.e);
      int $$5 = aye.a($$0.c);
      int $$6 = aye.a($$0.f);
      return this.a($$1, $$3, $$5, $$2, $$4, $$6) ? this.a($$0) : Stream.empty();
   }

   @Override
   default int a(ja $$0, dbo $$1) {
      return $$1.getColor(this.t($$0).a(), (double)$$0.u(), (double)$$0.w());
   }

   @Override
   default jj<ddd> getNoiseBiome(int $$0, int $$1, int $$2) {
      dud $$3 = this.a(ju.e($$0), ju.e($$2), dvc.f, false);
      return $$3 != null ? $$3.getNoiseBiome($$0, $$1, $$2) : this.a($$0, $$1, $$2);
   }

   jj<ddd> a(int var1, int var2, int var3);

   boolean x_();

   @Deprecated
   int z_();

   dvz D_();

   @Override
   default int I_() {
      return this.D_().n();
   }

   @Override
   default int J_() {
      return this.D_().o();
   }

   default ja a(dxz.a $$0, ja $$1) {
      return new ja($$1.u(), this.a($$0, $$1.u(), $$1.w()), $$1.w());
   }

   default boolean u(ja $$0) {
      return this.a_($$0).i();
   }

   default boolean v(ja $$0) {
      if ($$0.v() >= this.z_()) {
         return this.h($$0);
      } else {
         ja $$1 = new ja($$0.u(), this.z_(), $$0.w());
         if (!this.h($$1)) {
            return false;
         } else {
            for (ja var4 = $$1.d(); var4.v() > $$0.v(); var4 = var4.d()) {
               dsh $$2 = this.a_(var4);
               if ($$2.b(this, var4) > 0 && !$$2.k()) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   default float w(ja $$0) {
      return this.x($$0) - 0.5F;
   }

   @Deprecated
   default float x(ja $$0) {
      float $$1 = (float)this.A($$0) / 15.0F;
      float $$2 = $$1 / (4.0F - 3.0F * $$1);
      return aye.i(this.D_().s(), $$2, 1.0F);
   }

   default dud y(ja $$0) {
      return this.a(kc.a($$0.u()), kc.a($$0.w()));
   }

   default dud a(int $$0, int $$1) {
      return this.a($$0, $$1, dvc.n, true);
   }

   default dud a(int $$0, int $$1, dvc $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   @Nullable
   @Override
   default dbj c(int $$0, int $$1) {
      return this.a($$0, $$1, dvc.c, false);
   }

   default boolean z(ja $$0) {
      return this.b_($$0).a(awa.a);
   }

   default boolean d(evu $$0) {
      int $$1 = aye.a($$0.a);
      int $$2 = aye.c($$0.d);
      int $$3 = aye.a($$0.b);
      int $$4 = aye.c($$0.e);
      int $$5 = aye.a($$0.c);
      int $$6 = aye.c($$0.f);
      ja.a $$7 = new ja.a();

      for (int $$8 = $$1; $$8 < $$2; $$8++) {
         for (int $$9 = $$3; $$9 < $$4; $$9++) {
            for (int $$10 = $$5; $$10 < $$6; $$10++) {
               dsh $$11 = this.a_($$7.d($$8, $$9, $$10));
               if (!$$11.u().c()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   default int A(ja $$0) {
      return this.c($$0, this.B_());
   }

   default int c(ja $$0, int $$1) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000 ? this.b($$0, $$1) : 15;
   }

   @Deprecated
   default boolean f(int $$0, int $$1) {
      return this.b(kc.a($$0), kc.a($$1));
   }

   @Deprecated
   default boolean B(ja $$0) {
      return this.f($$0.u(), $$0.w());
   }

   @Deprecated
   default boolean a(ja $$0, ja $$1) {
      return this.a($$0.u(), $$0.v(), $$0.w(), $$1.u(), $$1.v(), $$1.w());
   }

   @Deprecated
   default boolean a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      return $$4 >= this.I_() && $$1 < this.am() ? this.b($$0, $$2, $$3, $$5) : false;
   }

   @Deprecated
   default boolean b(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = kc.a($$0);
      int $$5 = kc.a($$2);
      int $$6 = kc.a($$1);
      int $$7 = kc.a($$3);

      for (int $$8 = $$4; $$8 <= $$5; $$8++) {
         for (int $$9 = $$6; $$9 <= $$7; $$9++) {
            if (!this.b($$8, $$9)) {
               return false;
            }
         }
      }

      return true;
   }

   jx H_();

   cov J();

   default <T> jl<T> a(akj<? extends jw<? extends T>> $$0) {
      jw<T> $$1 = this.H_().d($$0);
      return $$1.q().a(this.J());
   }
}
