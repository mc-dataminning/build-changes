import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface dbx extends dbi, dcd {
   @Override
   default long ak() {
      return this.A_().d();
   }

   long G_();

   exc<dex> P();

   private <T> exg<T> a(iz $$0, T $$1, int $$2, exk $$3) {
      return new exg<>($$1, $$0, this.A_().c() + (long)$$2, $$3, this.G_());
   }

   private <T> exg<T> a(iz $$0, T $$1, int $$2) {
      return new exg<>($$1, $$0, this.A_().c() + (long)$$2, this.G_());
   }

   default void a(iz $$0, dex $$1, int $$2, exk $$3) {
      this.P().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(iz $$0, dex $$1, int $$2) {
      this.P().a(this.a($$0, $$1, $$2));
   }

   exc<ens> O();

   default void a(iz $$0, ens $$1, int $$2, exk $$3) {
      this.O().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(iz $$0, ens $$1, int $$2) {
      this.O().a(this.a($$0, $$1, $$2));
   }

   epq A_();

   bqq d_(iz var1);

   @Nullable
   MinecraftServer o();

   default bqp al() {
      return this.A_().q();
   }

   dua N();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.N().b($$0, $$1);
   }

   azf E_();

   default void b(iz $$0, dex $$1) {
   }

   default void a(je $$0, dsa $$1, iz $$2, iz $$3, int $$4, int $$5) {
      eox.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable cmv $$0, iz $$1, avy $$2, awa $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable cmv var1, iz var2, avy var3, awa var4, float var5, float var6);

   void a(lg var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable cmv var1, int var2, iz var3, int var4);

   default void c(int $$0, iz $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(ji<dwt> var1, evp var2, dwt.a var3);

   default void a(@Nullable bss $$0, ji<dwt> $$1, evp $$2) {
      this.a($$1, $$2, new dwt.a($$0, null));
   }

   default void a(@Nullable bss $$0, ji<dwt> $$1, iz $$2) {
      this.a($$1, $$2, new dwt.a($$0, null));
   }

   default void a(ji<dwt> $$0, iz $$1, dwt.a $$2) {
      this.a($$0, evp.b($$1), $$2);
   }

   default void a(ald<dwt> $$0, iz $$1, dwt.a $$2) {
      this.a(this.H_().d(lq.C).g($$0), $$1, $$2);
   }
}
