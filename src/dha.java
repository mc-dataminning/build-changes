import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface dha extends dgl, dhg, dho {
   @Override
   default long am() {
      return this.y_().d();
   }

   long E_();

   @Override
   default <T> fdp<T> a(ji $$0, T $$1, int $$2, fdt $$3) {
      return new fdp<>($$1, $$0, this.y_().c() + (long)$$2, $$3, this.E_());
   }

   @Override
   default <T> fdp<T> a(ji $$0, T $$1, int $$2) {
      return new fdp<>($$1, $$0, this.y_().c() + (long)$$2, this.E_());
   }

   evy y_();

   bsw d_(ji var1);

   @Nullable
   MinecraftServer p();

   default bsv an() {
      return this.y_().q();
   }

   dzq S();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.S().b($$0, $$1);
   }

   azh C_();

   default void a(ji $$0, dke $$1) {
   }

   default void a(jn $$0, ji $$1, ji $$2, dxq $$3, int $$4, int $$5) {
      evd.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable bva $$0, ji $$1, avz $$2, awb $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable bva var1, ji var2, avz var3, awb var4, float var5, float var6);

   void a(lr var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable bva var1, int var2, ji var3, int var4);

   default void c(int $$0, ji $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(jr<ecp> var1, fbx var2, ecp.a var3);

   default void a(@Nullable bva $$0, jr<ecp> $$1, fbx $$2) {
      this.a($$1, $$2, new ecp.a($$0, null));
   }

   default void a(@Nullable bva $$0, jr<ecp> $$1, ji $$2) {
      this.a($$1, $$2, new ecp.a($$0, null));
   }

   default void a(jr<ecp> $$0, ji $$1, ecp.a $$2) {
      this.a($$0, fbx.b($$1), $$2);
   }

   default void a(akt<ecp> $$0, ji $$1, ecp.a $$2) {
      this.a(this.F_().e(mc.G).b($$0), $$1, $$2);
   }
}
