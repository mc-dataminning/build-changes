import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface dhc extends dgb, dgi, dhr, did.a {
   @Nullable
   dzj a(int var1, int var2, eak var3, boolean var4);

   @Deprecated
   boolean b(int var1, int var2);

   int a(edj.a var1, int var2, int var3);

   int E_();

   did I_();

   default jq<dib> t(jh $$0) {
      return this.I_().a($$0);
   }

   default Stream<dxo> c(fbm $$0) {
      int $$1 = azu.a($$0.a);
      int $$2 = azu.a($$0.d);
      int $$3 = azu.a($$0.b);
      int $$4 = azu.a($$0.e);
      int $$5 = azu.a($$0.c);
      int $$6 = azu.a($$0.f);
      return this.a($$1, $$3, $$5, $$2, $$4, $$6) ? this.a($$0) : Stream.empty();
   }

   @Override
   default int a(jh $$0, dgj $$1) {
      return $$1.getColor(this.t($$0).a(), (double)$$0.u(), (double)$$0.w());
   }

   @Override
   default jq<dib> getNoiseBiome(int $$0, int $$1, int $$2) {
      dzj $$3 = this.a(kb.e($$0), kb.e($$2), eak.f, false);
      return $$3 != null ? $$3.getNoiseBiome($$0, $$1, $$2) : this.a($$0, $$1, $$2);
   }

   jq<dib> a(int var1, int var2, int var3);

   boolean B_();

   int P();

   ebj G_();

   @Override
   default int L_() {
      return this.G_().n();
   }

   @Override
   default int M_() {
      return this.G_().o();
   }

   default jh a(edj.a $$0, jh $$1) {
      return new jh($$1.u(), this.a($$0, $$1.u(), $$1.w()), $$1.w());
   }

   default boolean u(jh $$0) {
      return this.a_($$0).l();
   }

   default boolean v(jh $$0) {
      if ($$0.v() >= this.P()) {
         return this.h($$0);
      } else {
         jh $$1 = new jh($$0.u(), this.P(), $$0.w());
         if (!this.h($$1)) {
            return false;
         } else {
            for (jh var4 = $$1.e(); var4.v() > $$0.v(); var4 = var4.e()) {
               dxo $$2 = this.a_(var4);
               if ($$2.g() > 0 && !$$2.n()) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   default float w(jh $$0) {
      return this.x($$0) - 0.5F;
   }

   @Deprecated
   default float x(jh $$0) {
      float $$1 = (float)this.A($$0) / 15.0F;
      float $$2 = $$1 / (4.0F - 3.0F * $$1);
      return azu.h(this.G_().s(), $$2, 1.0F);
   }

   default dzj y(jh $$0) {
      return this.a(kj.a($$0.u()), kj.a($$0.w()));
   }

   default dzj a(int $$0, int $$1) {
      return this.a($$0, $$1, eak.n, true);
   }

   default dzj a(int $$0, int $$1, eak $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   @Nullable
   @Override
   default dge c(int $$0, int $$1) {
      return this.a($$0, $$1, eak.c, false);
   }

   default boolean z(jh $$0) {
      return this.b_($$0).a(axq.a);
   }

   default boolean d(fbm $$0) {
      int $$1 = azu.a($$0.a);
      int $$2 = azu.c($$0.d);
      int $$3 = azu.a($$0.b);
      int $$4 = azu.c($$0.e);
      int $$5 = azu.a($$0.c);
      int $$6 = azu.c($$0.f);
      jh.a $$7 = new jh.a();

      for (int $$8 = $$1; $$8 < $$2; $$8++) {
         for (int $$9 = $$3; $$9 < $$4; $$9++) {
            for (int $$10 = $$5; $$10 < $$6; $$10++) {
               dxo $$11 = this.a_($$7.d($$8, $$9, $$10));
               if (!$$11.y().c()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   default int A(jh $$0) {
      return this.c($$0, this.E_());
   }

   default int c(jh $$0, int $$1) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000 ? this.b($$0, $$1) : 15;
   }

   @Deprecated
   default boolean f(int $$0, int $$1) {
      return this.b(kj.a($$0), kj.a($$1));
   }

   @Deprecated
   default boolean B(jh $$0) {
      return this.f($$0.u(), $$0.w());
   }

   @Deprecated
   default boolean a(jh $$0, jh $$1) {
      return this.a($$0.u(), $$0.v(), $$0.w(), $$1.u(), $$1.v(), $$1.w());
   }

   @Deprecated
   default boolean a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      return $$4 >= this.L_() && $$1 <= this.an() ? this.b($$0, $$2, $$3, $$5) : false;
   }

   @Deprecated
   default boolean b(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = kj.a($$0);
      int $$5 = kj.a($$2);
      int $$6 = kj.a($$1);
      int $$7 = kj.a($$3);

      for (int $$8 = $$4; $$8 <= $$5; $$8++) {
         for (int $$9 = $$6; $$9 <= $$7; $$9++) {
            if (!this.b($$8, $$9)) {
               return false;
            }
         }
      }

      return true;
   }

   ke K_();

   csk K();

   default <T> js<T> a(alo<? extends kd<? extends T>> $$0) {
      kd<T> $$1 = this.K_().e($$0);
      return $$1.a(this.K());
   }
}
