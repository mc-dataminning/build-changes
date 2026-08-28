import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface dgh extends dfr, dgn, dgv {
   @Override
   default long al() {
      return this.D_().d();
   }

   long J_();

   @Override
   default <T> fcq<T> a(ji $$0, T $$1, int $$2, fcu $$3) {
      return new fcq<>($$1, $$0, this.D_().c() + (long)$$2, $$3, this.J_());
   }

   @Override
   default <T> fcq<T> a(ji $$0, T $$1, int $$2) {
      return new fcq<>($$1, $$0, this.D_().c() + (long)$$2, this.J_());
   }

   euz D_();

   bsg d_(ji var1);

   @Nullable
   MinecraftServer p();

   default bsf am() {
      return this.D_().q();
   }

   dyu S();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.S().b($$0, $$1);
   }

   azg H_();

   default void b(ji $$0, djk $$1) {
   }

   default void a(jn $$0, ji $$1, ji $$2, dwv $$3, int $$4, int $$5) {
      eue.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable cov $$0, ji $$1, avy $$2, awa $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable cov var1, ji var2, avy var3, awa var4, float var5, float var6);

   void a(lr var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable cov var1, int var2, ji var3, int var4);

   default void c(int $$0, ji $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(jr<ebr> var1, fay var2, ebr.a var3);

   default void a(@Nullable buj $$0, jr<ebr> $$1, fay $$2) {
      this.a($$1, $$2, new ebr.a($$0, null));
   }

   default void a(@Nullable buj $$0, jr<ebr> $$1, ji $$2) {
      this.a($$1, $$2, new ebr.a($$0, null));
   }

   default void a(jr<ebr> $$0, ji $$1, ebr.a $$2) {
      this.a($$0, fay.b($$1), $$2);
   }

   default void a(akt<ebr> $$0, ji $$1, ebr.a $$2) {
      this.a(this.K_().e(mc.G).b($$0), $$1, $$2);
   }
}
