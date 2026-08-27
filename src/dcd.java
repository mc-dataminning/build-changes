import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface dcd extends dbd, dbk, dcq, ddb.a {
   @Nullable
   duy a(int var1, int var2, dvx var3, boolean var4);

   @Deprecated
   boolean b(int var1, int var2);

   int a(dyu.a var1, int var2, int var3);

   int C_();

   ddb G_();

   default ja<dcz> t(ir $$0) {
      return this.G_().a($$0);
   }

   default Stream<dtc> c(ewp $$0) {
      int $$1 = aym.a($$0.a);
      int $$2 = aym.a($$0.d);
      int $$3 = aym.a($$0.b);
      int $$4 = aym.a($$0.e);
      int $$5 = aym.a($$0.c);
      int $$6 = aym.a($$0.f);
      return this.a($$1, $$3, $$5, $$2, $$4, $$6) ? this.a($$0) : Stream.empty();
   }

   @Override
   default int a(ir $$0, dbl $$1) {
      return $$1.getColor(this.t($$0).a(), (double)$$0.u(), (double)$$0.w());
   }

   @Override
   default ja<dcz> getNoiseBiome(int $$0, int $$1, int $$2) {
      duy $$3 = this.a(jl.e($$0), jl.e($$2), dvx.f, false);
      return $$3 != null ? $$3.getNoiseBiome($$0, $$1, $$2) : this.a($$0, $$1, $$2);
   }

   ja<dcz> a(int var1, int var2, int var3);

   boolean x_();

   @Deprecated
   int A_();

   dwu E_();

   @Override
   default int J_() {
      return this.E_().n();
   }

   @Override
   default int K_() {
      return this.E_().o();
   }

   default ir a(dyu.a $$0, ir $$1) {
      return new ir($$1.u(), this.a($$0, $$1.u(), $$1.w()), $$1.w());
   }

   default boolean u(ir $$0) {
      return this.a_($$0).i();
   }

   default boolean v(ir $$0) {
      if ($$0.v() >= this.A_()) {
         return this.h($$0);
      } else {
         ir $$1 = new ir($$0.u(), this.A_(), $$0.w());
         if (!this.h($$1)) {
            return false;
         } else {
            for (ir var4 = $$1.d(); var4.v() > $$0.v(); var4 = var4.d()) {
               dtc $$2 = this.a_(var4);
               if ($$2.b(this, var4) > 0 && !$$2.k()) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   default float w(ir $$0) {
      return this.x($$0) - 0.5F;
   }

   @Deprecated
   default float x(ir $$0) {
      float $$1 = (float)this.A($$0) / 15.0F;
      float $$2 = $$1 / (4.0F - 3.0F * $$1);
      return aym.i(this.E_().s(), $$2, 1.0F);
   }

   default duy y(ir $$0) {
      return this.a_(jt.a($$0.u()), jt.a($$0.w()));
   }

   default duy a_(int $$0, int $$1) {
      return this.a($$0, $$1, dvx.n, true);
   }

   default duy a(int $$0, int $$1, dvx $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   @Nullable
   @Override
   default dbg a(int $$0, int $$1) {
      return this.a($$0, $$1, dvx.c, false);
   }

   default boolean z(ir $$0) {
      return this.b_($$0).a(awj.a);
   }

   default boolean d(ewp $$0) {
      int $$1 = aym.a($$0.a);
      int $$2 = aym.c($$0.d);
      int $$3 = aym.a($$0.b);
      int $$4 = aym.c($$0.e);
      int $$5 = aym.a($$0.c);
      int $$6 = aym.c($$0.f);
      ir.a $$7 = new ir.a();

      for (int $$8 = $$1; $$8 < $$2; $$8++) {
         for (int $$9 = $$3; $$9 < $$4; $$9++) {
            for (int $$10 = $$5; $$10 < $$6; $$10++) {
               dtc $$11 = this.a_($$7.d($$8, $$9, $$10));
               if (!$$11.u().c()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   default int A(ir $$0) {
      return this.c($$0, this.C_());
   }

   default int c(ir $$0, int $$1) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000 ? this.b($$0, $$1) : 15;
   }

   @Deprecated
   default boolean e(int $$0, int $$1) {
      return this.b(jt.a($$0), jt.a($$1));
   }

   @Deprecated
   default boolean B(ir $$0) {
      return this.e($$0.u(), $$0.w());
   }

   @Deprecated
   default boolean a(ir $$0, ir $$1) {
      return this.a($$0.u(), $$0.v(), $$0.w(), $$1.u(), $$1.v(), $$1.w());
   }

   @Deprecated
   default boolean a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      return $$4 >= this.J_() && $$1 < this.am() ? this.b($$0, $$2, $$3, $$5) : false;
   }

   @Deprecated
   default boolean b(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = jt.a($$0);
      int $$5 = jt.a($$2);
      int $$6 = jt.a($$1);
      int $$7 = jt.a($$3);

      for (int $$8 = $$4; $$8 <= $$5; $$8++) {
         for (int $$9 = $$6; $$9 <= $$7; $$9++) {
            if (!this.b($$8, $$9)) {
               return false;
            }
         }
      }

      return true;
   }

   jo I_();

   cop K();

   default <T> jc<T> a(aks<? extends jn<? extends T>> $$0) {
      jn<T> $$1 = this.I_().d($$0);
      return $$1.p().a(this.K());
   }
}
