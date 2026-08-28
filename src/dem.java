import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface dem extends ddl, dds, dfa, dfm.a {
   @Nullable
   dwo a(int var1, int var2, dxp var3, boolean var4);

   @Deprecated
   boolean b(int var1, int var2);

   int a(eao.a var1, int var2, int var3);

   int A_();

   dfm E_();

   default jo<dfk> t(jf $$0) {
      return this.E_().a($$0);
   }

   default Stream<dus> c(eyr $$0) {
      int $$1 = azf.a($$0.a);
      int $$2 = azf.a($$0.d);
      int $$3 = azf.a($$0.b);
      int $$4 = azf.a($$0.e);
      int $$5 = azf.a($$0.c);
      int $$6 = azf.a($$0.f);
      return this.a($$1, $$3, $$5, $$2, $$4, $$6) ? this.a($$0) : Stream.empty();
   }

   @Override
   default int a(jf $$0, ddt $$1) {
      return $$1.getColor(this.t($$0).a(), (double)$$0.u(), (double)$$0.w());
   }

   @Override
   default jo<dfk> getNoiseBiome(int $$0, int $$1, int $$2) {
      dwo $$3 = this.a(jz.e($$0), jz.e($$2), dxp.f, false);
      return $$3 != null ? $$3.getNoiseBiome($$0, $$1, $$2) : this.a($$0, $$1, $$2);
   }

   jo<dfk> a(int var1, int var2, int var3);

   boolean x_();

   int N();

   dyo C_();

   @Override
   default int H_() {
      return this.C_().n();
   }

   @Override
   default int I_() {
      return this.C_().o();
   }

   default jf a(eao.a $$0, jf $$1) {
      return new jf($$1.u(), this.a($$0, $$1.u(), $$1.w()), $$1.w());
   }

   default boolean u(jf $$0) {
      return this.a_($$0).l();
   }

   default boolean v(jf $$0) {
      if ($$0.v() >= this.N()) {
         return this.h($$0);
      } else {
         jf $$1 = new jf($$0.u(), this.N(), $$0.w());
         if (!this.h($$1)) {
            return false;
         } else {
            for (jf var4 = $$1.e(); var4.v() > $$0.v(); var4 = var4.e()) {
               dus $$2 = this.a_(var4);
               if ($$2.g() > 0 && !$$2.n()) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   default float w(jf $$0) {
      return this.x($$0) - 0.5F;
   }

   @Deprecated
   default float x(jf $$0) {
      float $$1 = (float)this.A($$0) / 15.0F;
      float $$2 = $$1 / (4.0F - 3.0F * $$1);
      return azf.h(this.C_().s(), $$2, 1.0F);
   }

   default dwo y(jf $$0) {
      return this.a(kh.a($$0.u()), kh.a($$0.w()));
   }

   default dwo a(int $$0, int $$1) {
      return this.a($$0, $$1, dxp.n, true);
   }

   default dwo a(int $$0, int $$1, dxp $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   @Nullable
   @Override
   default ddo c(int $$0, int $$1) {
      return this.a($$0, $$1, dxp.c, false);
   }

   default boolean z(jf $$0) {
      return this.b_($$0).a(axb.a);
   }

   default boolean d(eyr $$0) {
      int $$1 = azf.a($$0.a);
      int $$2 = azf.c($$0.d);
      int $$3 = azf.a($$0.b);
      int $$4 = azf.c($$0.e);
      int $$5 = azf.a($$0.c);
      int $$6 = azf.c($$0.f);
      jf.a $$7 = new jf.a();

      for (int $$8 = $$1; $$8 < $$2; $$8++) {
         for (int $$9 = $$3; $$9 < $$4; $$9++) {
            for (int $$10 = $$5; $$10 < $$6; $$10++) {
               dus $$11 = this.a_($$7.d($$8, $$9, $$10));
               if (!$$11.y().c()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   default int A(jf $$0) {
      return this.c($$0, this.A_());
   }

   default int c(jf $$0, int $$1) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000 ? this.b($$0, $$1) : 15;
   }

   @Deprecated
   default boolean f(int $$0, int $$1) {
      return this.b(kh.a($$0), kh.a($$1));
   }

   @Deprecated
   default boolean B(jf $$0) {
      return this.f($$0.u(), $$0.w());
   }

   @Deprecated
   default boolean a(jf $$0, jf $$1) {
      return this.a($$0.u(), $$0.v(), $$0.w(), $$1.u(), $$1.v(), $$1.w());
   }

   @Deprecated
   default boolean a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      return $$4 >= this.H_() && $$1 <= this.an() ? this.b($$0, $$2, $$3, $$5) : false;
   }

   @Deprecated
   default boolean b(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = kh.a($$0);
      int $$5 = kh.a($$2);
      int $$6 = kh.a($$1);
      int $$7 = kh.a($$3);

      for (int $$8 = $$4; $$8 <= $$5; $$8++) {
         for (int $$9 = $$6; $$9 <= $$7; $$9++) {
            if (!this.b($$8, $$9)) {
               return false;
            }
         }
      }

      return true;
   }

   kc G_();

   cqq J();

   default <T> jq<T> a(ald<? extends kb<? extends T>> $$0) {
      kb<T> $$1 = this.G_().e($$0);
      return $$1.a(this.J());
   }
}
