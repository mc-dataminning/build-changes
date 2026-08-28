import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface dgj extends dft, dgp, dgx {
   @Override
   default long al() {
      return this.D_().d();
   }

   long J_();

   @Override
   default <T> fcs<T> a(ji $$0, T $$1, int $$2, fcw $$3) {
      return new fcs<>($$1, $$0, this.D_().c() + (long)$$2, $$3, this.J_());
   }

   @Override
   default <T> fcs<T> a(ji $$0, T $$1, int $$2) {
      return new fcs<>($$1, $$0, this.D_().c() + (long)$$2, this.J_());
   }

   evb D_();

   bsh d_(ji var1);

   @Nullable
   MinecraftServer p();

   default bsg am() {
      return this.D_().q();
   }

   dyw S();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.S().b($$0, $$1);
   }

   azh H_();

   default void b(ji $$0, djm $$1) {
   }

   default void a(jn $$0, ji $$1, ji $$2, dwx $$3, int $$4, int $$5) {
      eug.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable cox $$0, ji $$1, avz $$2, awb $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable cox var1, ji var2, avz var3, awb var4, float var5, float var6);

   void a(lr var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable cox var1, int var2, ji var3, int var4);

   default void c(int $$0, ji $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(jr<ebt> var1, fba var2, ebt.a var3);

   default void a(@Nullable buk $$0, jr<ebt> $$1, fba $$2) {
      this.a($$1, $$2, new ebt.a($$0, null));
   }

   default void a(@Nullable buk $$0, jr<ebt> $$1, ji $$2) {
      this.a($$1, $$2, new ebt.a($$0, null));
   }

   default void a(jr<ebt> $$0, ji $$1, ebt.a $$2) {
      this.a($$0, fba.b($$1), $$2);
   }

   default void a(akt<ebt> $$0, ji $$1, ebt.a $$2) {
      this.a(this.K_().e(mc.G).b($$0), $$1, $$2);
   }
}
