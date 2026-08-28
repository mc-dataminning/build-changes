import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface dch extends dbs, dcn {
   @Override
   default long ak() {
      return this.A_().d();
   }

   long G_();

   exu<dfi> P();

   private <T> exy<T> a(ja $$0, T $$1, int $$2, eyc $$3) {
      return new exy<>($$1, $$0, this.A_().c() + (long)$$2, $$3, this.G_());
   }

   private <T> exy<T> a(ja $$0, T $$1, int $$2) {
      return new exy<>($$1, $$0, this.A_().c() + (long)$$2, this.G_());
   }

   default void a(ja $$0, dfi $$1, int $$2, eyc $$3) {
      this.P().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(ja $$0, dfi $$1, int $$2) {
      this.P().a(this.a($$0, $$1, $$2));
   }

   exu<eoi> O();

   default void a(ja $$0, eoi $$1, int $$2, eyc $$3) {
      this.O().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(ja $$0, eoi $$1, int $$2) {
      this.O().a(this.a($$0, $$1, $$2));
   }

   eqg A_();

   bqf d_(ja var1);

   @Nullable
   MinecraftServer o();

   default bqe al() {
      return this.A_().q();
   }

   dul N();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.N().b($$0, $$1);
   }

   ayo E_();

   default void b(ja $$0, dfi $$1) {
   }

   default void a(jf $$0, dsl $$1, ja $$2, ja $$3, int $$4, int $$5) {
      epn.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable cml $$0, ja $$1, avg $$2, avi $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable cml var1, ja var2, avg var3, avi var4, float var5, float var6);

   void a(lh var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable cml var1, int var2, ja var3, int var4);

   default void c(int $$0, ja $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(jj<dxh> var1, ewh var2, dxh.a var3);

   default void a(@Nullable bsh $$0, jj<dxh> $$1, ewh $$2) {
      this.a($$1, $$2, new dxh.a($$0, null));
   }

   default void a(@Nullable bsh $$0, jj<dxh> $$1, ja $$2) {
      this.a($$1, $$2, new dxh.a($$0, null));
   }

   default void a(jj<dxh> $$0, ja $$1, dxh.a $$2) {
      this.a($$0, ewh.b($$1), $$2);
   }

   default void a(akj<dxh> $$0, ja $$1, dxh.a $$2) {
      this.a(this.H_().d(lr.G).g($$0), $$1, $$2);
   }
}
