import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface ddv extends dcu, ddb, dej, dev.a {
   @Nullable
   dvw a(int var1, int var2, dwx var3, boolean var4);

   @Deprecated
   boolean b(int var1, int var2);

   int a(dzw.a var1, int var2, int var3);

   int z_();

   dev D_();

   default jn<det> t(je $$0) {
      return this.D_().a($$0);
   }

   default Stream<dua> c(exz $$0) {
      int $$1 = azc.a($$0.a);
      int $$2 = azc.a($$0.d);
      int $$3 = azc.a($$0.b);
      int $$4 = azc.a($$0.e);
      int $$5 = azc.a($$0.c);
      int $$6 = azc.a($$0.f);
      return this.a($$1, $$3, $$5, $$2, $$4, $$6) ? this.a($$0) : Stream.empty();
   }

   @Override
   default int a(je $$0, ddc $$1) {
      return $$1.getColor(this.t($$0).a(), (double)$$0.u(), (double)$$0.w());
   }

   @Override
   default jn<det> getNoiseBiome(int $$0, int $$1, int $$2) {
      dvw $$3 = this.a(jy.e($$0), jy.e($$2), dwx.f, false);
      return $$3 != null ? $$3.getNoiseBiome($$0, $$1, $$2) : this.a($$0, $$1, $$2);
   }

   jn<det> a(int var1, int var2, int var3);

   boolean w_();

   int N();

   dxw B_();

   @Override
   default int G_() {
      return this.B_().n();
   }

   @Override
   default int H_() {
      return this.B_().o();
   }

   default je a(dzw.a $$0, je $$1) {
      return new je($$1.u(), this.a($$0, $$1.u(), $$1.w()), $$1.w());
   }

   default boolean u(je $$0) {
      return this.a_($$0).l();
   }

   default boolean v(je $$0) {
      if ($$0.v() >= this.N()) {
         return this.h($$0);
      } else {
         je $$1 = new je($$0.u(), this.N(), $$0.w());
         if (!this.h($$1)) {
            return false;
         } else {
            for (je var4 = $$1.e(); var4.v() > $$0.v(); var4 = var4.e()) {
               dua $$2 = this.a_(var4);
               if ($$2.g() > 0 && !$$2.n()) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   default float w(je $$0) {
      return this.x($$0) - 0.5F;
   }

   @Deprecated
   default float x(je $$0) {
      float $$1 = (float)this.A($$0) / 15.0F;
      float $$2 = $$1 / (4.0F - 3.0F * $$1);
      return azc.h(this.B_().s(), $$2, 1.0F);
   }

   default dvw y(je $$0) {
      return this.a(kg.a($$0.u()), kg.a($$0.w()));
   }

   default dvw a(int $$0, int $$1) {
      return this.a($$0, $$1, dwx.n, true);
   }

   default dvw a(int $$0, int $$1, dwx $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   @Nullable
   @Override
   default dcx c(int $$0, int $$1) {
      return this.a($$0, $$1, dwx.c, false);
   }

   default boolean z(je $$0) {
      return this.b_($$0).a(awy.a);
   }

   default boolean d(exz $$0) {
      int $$1 = azc.a($$0.a);
      int $$2 = azc.c($$0.d);
      int $$3 = azc.a($$0.b);
      int $$4 = azc.c($$0.e);
      int $$5 = azc.a($$0.c);
      int $$6 = azc.c($$0.f);
      je.a $$7 = new je.a();

      for (int $$8 = $$1; $$8 < $$2; $$8++) {
         for (int $$9 = $$3; $$9 < $$4; $$9++) {
            for (int $$10 = $$5; $$10 < $$6; $$10++) {
               dua $$11 = this.a_($$7.d($$8, $$9, $$10));
               if (!$$11.y().c()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   default int A(je $$0) {
      return this.c($$0, this.z_());
   }

   default int c(je $$0, int $$1) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000 ? this.b($$0, $$1) : 15;
   }

   @Deprecated
   default boolean f(int $$0, int $$1) {
      return this.b(kg.a($$0), kg.a($$1));
   }

   @Deprecated
   default boolean B(je $$0) {
      return this.f($$0.u(), $$0.w());
   }

   @Deprecated
   default boolean a(je $$0, je $$1) {
      return this.a($$0.u(), $$0.v(), $$0.w(), $$1.u(), $$1.v(), $$1.w());
   }

   @Deprecated
   default boolean a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      return $$4 >= this.G_() && $$1 < this.an() ? this.b($$0, $$2, $$3, $$5) : false;
   }

   @Deprecated
   default boolean b(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = kg.a($$0);
      int $$5 = kg.a($$2);
      int $$6 = kg.a($$1);
      int $$7 = kg.a($$3);

      for (int $$8 = $$4; $$8 <= $$5; $$8++) {
         for (int $$9 = $$6; $$9 <= $$7; $$9++) {
            if (!this.b($$8, $$9)) {
               return false;
            }
         }
      }

      return true;
   }

   kb F_();

   cqh J();

   default <T> jp<T> a(ala<? extends ka<? extends T>> $$0) {
      ka<T> $$1 = this.F_().d($$0);
      return $$1.p().a(this.J());
   }
}
