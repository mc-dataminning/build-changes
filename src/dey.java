import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface dey extends ddx, dee, dfm, dfy.a {
   @Nullable
   dwz a(int var1, int var2, dya var3, boolean var4);

   @Deprecated
   boolean b(int var1, int var2);

   int a(eaz.a var1, int var2, int var3);

   int B_();

   dfy F_();

   default jp<dfw> t(jg $$0) {
      return this.F_().a($$0);
   }

   default Stream<dvd> c(ezc $$0) {
      int $$1 = azj.a($$0.a);
      int $$2 = azj.a($$0.d);
      int $$3 = azj.a($$0.b);
      int $$4 = azj.a($$0.e);
      int $$5 = azj.a($$0.c);
      int $$6 = azj.a($$0.f);
      return this.a($$1, $$3, $$5, $$2, $$4, $$6) ? this.a($$0) : Stream.empty();
   }

   @Override
   default int a(jg $$0, def $$1) {
      return $$1.getColor(this.t($$0).a(), (double)$$0.u(), (double)$$0.w());
   }

   @Override
   default jp<dfw> getNoiseBiome(int $$0, int $$1, int $$2) {
      dwz $$3 = this.a(ka.e($$0), ka.e($$2), dya.f, false);
      return $$3 != null ? $$3.getNoiseBiome($$0, $$1, $$2) : this.a($$0, $$1, $$2);
   }

   jp<dfw> a(int var1, int var2, int var3);

   boolean y_();

   int N();

   dyz D_();

   @Override
   default int I_() {
      return this.D_().n();
   }

   @Override
   default int J_() {
      return this.D_().o();
   }

   default jg a(eaz.a $$0, jg $$1) {
      return new jg($$1.u(), this.a($$0, $$1.u(), $$1.w()), $$1.w());
   }

   default boolean u(jg $$0) {
      return this.a_($$0).l();
   }

   default boolean v(jg $$0) {
      if ($$0.v() >= this.N()) {
         return this.h($$0);
      } else {
         jg $$1 = new jg($$0.u(), this.N(), $$0.w());
         if (!this.h($$1)) {
            return false;
         } else {
            for (jg var4 = $$1.e(); var4.v() > $$0.v(); var4 = var4.e()) {
               dvd $$2 = this.a_(var4);
               if ($$2.g() > 0 && !$$2.n()) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   default float w(jg $$0) {
      return this.x($$0) - 0.5F;
   }

   @Deprecated
   default float x(jg $$0) {
      float $$1 = (float)this.A($$0) / 15.0F;
      float $$2 = $$1 / (4.0F - 3.0F * $$1);
      return azj.h(this.D_().s(), $$2, 1.0F);
   }

   default dwz y(jg $$0) {
      return this.a(ki.a($$0.u()), ki.a($$0.w()));
   }

   default dwz a(int $$0, int $$1) {
      return this.a($$0, $$1, dya.n, true);
   }

   default dwz a(int $$0, int $$1, dya $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   @Nullable
   @Override
   default dea c(int $$0, int $$1) {
      return this.a($$0, $$1, dya.c, false);
   }

   default boolean z(jg $$0) {
      return this.b_($$0).a(axf.a);
   }

   default boolean d(ezc $$0) {
      int $$1 = azj.a($$0.a);
      int $$2 = azj.c($$0.d);
      int $$3 = azj.a($$0.b);
      int $$4 = azj.c($$0.e);
      int $$5 = azj.a($$0.c);
      int $$6 = azj.c($$0.f);
      jg.a $$7 = new jg.a();

      for (int $$8 = $$1; $$8 < $$2; $$8++) {
         for (int $$9 = $$3; $$9 < $$4; $$9++) {
            for (int $$10 = $$5; $$10 < $$6; $$10++) {
               dvd $$11 = this.a_($$7.d($$8, $$9, $$10));
               if (!$$11.y().c()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   default int A(jg $$0) {
      return this.c($$0, this.B_());
   }

   default int c(jg $$0, int $$1) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000 ? this.b($$0, $$1) : 15;
   }

   @Deprecated
   default boolean f(int $$0, int $$1) {
      return this.b(ki.a($$0), ki.a($$1));
   }

   @Deprecated
   default boolean B(jg $$0) {
      return this.f($$0.u(), $$0.w());
   }

   @Deprecated
   default boolean a(jg $$0, jg $$1) {
      return this.a($$0.u(), $$0.v(), $$0.w(), $$1.u(), $$1.v(), $$1.w());
   }

   @Deprecated
   default boolean a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      return $$4 >= this.I_() && $$1 <= this.an() ? this.b($$0, $$2, $$3, $$5) : false;
   }

   @Deprecated
   default boolean b(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = ki.a($$0);
      int $$5 = ki.a($$2);
      int $$6 = ki.a($$1);
      int $$7 = ki.a($$3);

      for (int $$8 = $$4; $$8 <= $$5; $$8++) {
         for (int $$9 = $$6; $$9 <= $$7; $$9++) {
            if (!this.b($$8, $$9)) {
               return false;
            }
         }
      }

      return true;
   }

   kd H_();

   cra J();

   default <T> jr<T> a(alg<? extends kc<? extends T>> $$0) {
      kc<T> $$1 = this.H_().e($$0);
      return $$1.a(this.J());
   }
}
