import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface dbz extends dbk, dcf {
   @Override
   default long ak() {
      return this.A_().d();
   }

   long G_();

   exe<dez> P();

   private <T> exi<T> a(iz $$0, T $$1, int $$2, exm $$3) {
      return new exi<>($$1, $$0, this.A_().c() + (long)$$2, $$3, this.G_());
   }

   private <T> exi<T> a(iz $$0, T $$1, int $$2) {
      return new exi<>($$1, $$0, this.A_().c() + (long)$$2, this.G_());
   }

   default void a(iz $$0, dez $$1, int $$2, exm $$3) {
      this.P().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(iz $$0, dez $$1, int $$2) {
      this.P().a(this.a($$0, $$1, $$2));
   }

   exe<enu> O();

   default void a(iz $$0, enu $$1, int $$2, exm $$3) {
      this.O().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(iz $$0, enu $$1, int $$2) {
      this.O().a(this.a($$0, $$1, $$2));
   }

   eps A_();

   bqs d_(iz var1);

   @Nullable
   MinecraftServer o();

   default bqr al() {
      return this.A_().q();
   }

   duc N();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.N().b($$0, $$1);
   }

   azh E_();

   default void b(iz $$0, dez $$1) {
   }

   default void a(je $$0, dsc $$1, iz $$2, iz $$3, int $$4, int $$5) {
      eoz.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable cmx $$0, iz $$1, avz $$2, awb $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable cmx var1, iz var2, avz var3, awb var4, float var5, float var6);

   void a(lg var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable cmx var1, int var2, iz var3, int var4);

   default void c(int $$0, iz $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(ji<dwv> var1, evr var2, dwv.a var3);

   default void a(@Nullable bsu $$0, ji<dwv> $$1, evr $$2) {
      this.a($$1, $$2, new dwv.a($$0, null));
   }

   default void a(@Nullable bsu $$0, ji<dwv> $$1, iz $$2) {
      this.a($$1, $$2, new dwv.a($$0, null));
   }

   default void a(ji<dwv> $$0, iz $$1, dwv.a $$2) {
      this.a($$0, evr.b($$1), $$2);
   }

   default void a(ale<dwv> $$0, iz $$1, dwv.a $$2) {
      this.a(this.H_().d(lq.C).g($$0), $$1, $$2);
   }
}
