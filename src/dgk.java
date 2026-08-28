import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface dgk extends dfu, dgq, dgy {
   @Override
   default long al() {
      return this.D_().d();
   }

   long J_();

   @Override
   default <T> fct<T> a(ji $$0, T $$1, int $$2, fcx $$3) {
      return new fct<>($$1, $$0, this.D_().c() + (long)$$2, $$3, this.J_());
   }

   @Override
   default <T> fct<T> a(ji $$0, T $$1, int $$2) {
      return new fct<>($$1, $$0, this.D_().c() + (long)$$2, this.J_());
   }

   evc D_();

   bsj d_(ji var1);

   @Nullable
   MinecraftServer p();

   default bsi am() {
      return this.D_().q();
   }

   dyx S();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.S().b($$0, $$1);
   }

   azh H_();

   default void b(ji $$0, djn $$1) {
   }

   default void a(jn $$0, ji $$1, ji $$2, dwy $$3, int $$4, int $$5) {
      euh.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable coy $$0, ji $$1, avz $$2, awb $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable coy var1, ji var2, avz var3, awb var4, float var5, float var6);

   void a(lr var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable coy var1, int var2, ji var3, int var4);

   default void c(int $$0, ji $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(jr<ebu> var1, fbb var2, ebu.a var3);

   default void a(@Nullable bum $$0, jr<ebu> $$1, fbb $$2) {
      this.a($$1, $$2, new ebu.a($$0, null));
   }

   default void a(@Nullable bum $$0, jr<ebu> $$1, ji $$2) {
      this.a($$1, $$2, new ebu.a($$0, null));
   }

   default void a(jr<ebu> $$0, ji $$1, ebu.a $$2) {
      this.a($$0, fbb.b($$1), $$2);
   }

   default void a(aku<ebu> $$0, ji $$1, ebu.a $$2) {
      this.a(this.K_().e(mc.G).b($$0), $$1, $$2);
   }
}
