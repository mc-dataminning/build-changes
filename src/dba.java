import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface dba extends daa, dah, dbn, dby.a {
   @Nullable
   dsx a(int var1, int var2, dtw var3, boolean var4);

   @Deprecated
   boolean b(int var1, int var2);

   int a(dwt.a var1, int var2, int var3);

   int B_();

   dby F_();

   default ix<dbw> t(io $$0) {
      return this.F_().a($$0);
   }

   default Stream<drb> c(euf $$0) {
      int $$1 = ayd.a($$0.a);
      int $$2 = ayd.a($$0.d);
      int $$3 = ayd.a($$0.b);
      int $$4 = ayd.a($$0.e);
      int $$5 = ayd.a($$0.c);
      int $$6 = ayd.a($$0.f);
      return this.a($$1, $$3, $$5, $$2, $$4, $$6) ? this.a($$0) : Stream.empty();
   }

   @Override
   default int a(io $$0, dai $$1) {
      return $$1.getColor(this.t($$0).a(), (double)$$0.u(), (double)$$0.w());
   }

   @Override
   default ix<dbw> getNoiseBiome(int $$0, int $$1, int $$2) {
      dsx $$3 = this.a(ji.e($$0), ji.e($$2), dtw.f, false);
      return $$3 != null ? $$3.getNoiseBiome($$0, $$1, $$2) : this.a($$0, $$1, $$2);
   }

   ix<dbw> a(int var1, int var2, int var3);

   boolean x_();

   @Deprecated
   int z_();

   dut D_();

   @Override
   default int I_() {
      return this.D_().n();
   }

   @Override
   default int J_() {
      return this.D_().o();
   }

   default io a(dwt.a $$0, io $$1) {
      return new io($$1.u(), this.a($$0, $$1.u(), $$1.w()), $$1.w());
   }

   default boolean u(io $$0) {
      return this.a_($$0).i();
   }

   default boolean v(io $$0) {
      if ($$0.v() >= this.z_()) {
         return this.h($$0);
      } else {
         io $$1 = new io($$0.u(), this.z_(), $$0.w());
         if (!this.h($$1)) {
            return false;
         } else {
            for (io var4 = $$1.d(); var4.v() > $$0.v(); var4 = var4.d()) {
               drb $$2 = this.a_(var4);
               if ($$2.b(this, var4) > 0 && !$$2.k()) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   default float w(io $$0) {
      return this.x($$0) - 0.5F;
   }

   @Deprecated
   default float x(io $$0) {
      float $$1 = (float)this.A($$0) / 15.0F;
      float $$2 = $$1 / (4.0F - 3.0F * $$1);
      return ayd.i(this.D_().s(), $$2, 1.0F);
   }

   default dsx y(io $$0) {
      return this.a(jq.a($$0.u()), jq.a($$0.w()));
   }

   default dsx a(int $$0, int $$1) {
      return this.a($$0, $$1, dtw.n, true);
   }

   default dsx a(int $$0, int $$1, dtw $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   @Nullable
   @Override
   default dad c(int $$0, int $$1) {
      return this.a($$0, $$1, dtw.c, false);
   }

   default boolean z(io $$0) {
      return this.b_($$0).a(awb.a);
   }

   default boolean d(euf $$0) {
      int $$1 = ayd.a($$0.a);
      int $$2 = ayd.c($$0.d);
      int $$3 = ayd.a($$0.b);
      int $$4 = ayd.c($$0.e);
      int $$5 = ayd.a($$0.c);
      int $$6 = ayd.c($$0.f);
      io.a $$7 = new io.a();

      for (int $$8 = $$1; $$8 < $$2; $$8++) {
         for (int $$9 = $$3; $$9 < $$4; $$9++) {
            for (int $$10 = $$5; $$10 < $$6; $$10++) {
               drb $$11 = this.a_($$7.d($$8, $$9, $$10));
               if (!$$11.u().c()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   default int A(io $$0) {
      return this.c($$0, this.B_());
   }

   default int c(io $$0, int $$1) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000 ? this.b($$0, $$1) : 15;
   }

   @Deprecated
   default boolean f(int $$0, int $$1) {
      return this.b(jq.a($$0), jq.a($$1));
   }

   @Deprecated
   default boolean B(io $$0) {
      return this.f($$0.u(), $$0.w());
   }

   @Deprecated
   default boolean a(io $$0, io $$1) {
      return this.a($$0.u(), $$0.v(), $$0.w(), $$1.u(), $$1.v(), $$1.w());
   }

   @Deprecated
   default boolean a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      return $$4 >= this.I_() && $$1 < this.al() ? this.b($$0, $$2, $$3, $$5) : false;
   }

   @Deprecated
   default boolean b(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = jq.a($$0);
      int $$5 = jq.a($$2);
      int $$6 = jq.a($$1);
      int $$7 = jq.a($$3);

      for (int $$8 = $$4; $$8 <= $$5; $$8++) {
         for (int $$9 = $$6; $$9 <= $$7; $$9++) {
            if (!this.b($$8, $$9)) {
               return false;
            }
         }
      }

      return true;
   }

   jl H_();

   coj J();

   default <T> iz<T> a(akl<? extends jk<? extends T>> $$0) {
      jk<T> $$1 = this.H_().d($$0);
      return $$1.p().a(this.J());
   }
}
