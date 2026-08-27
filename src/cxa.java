import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cxa extends cwl, cxg {
   @Override
   default long ai() {
      return this.A_().d();
   }

   long G_();

   ere<daa> N();

   private <T> eri<T> a(ib $$0, T $$1, int $$2, erm $$3) {
      return new eri<>($$1, $$0, this.A_().c() + (long)$$2, $$3, this.G_());
   }

   private <T> eri<T> a(ib $$0, T $$1, int $$2) {
      return new eri<>($$1, $$0, this.A_().c() + (long)$$2, this.G_());
   }

   default void a(ib $$0, daa $$1, int $$2, erm $$3) {
      this.N().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(ib $$0, daa $$1, int $$2) {
      this.N().a(this.a($$0, $$1, $$2));
   }

   ere<eim> M();

   default void a(ib $$0, eim $$1, int $$2, erm $$3) {
      this.M().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(ib $$0, eim $$1, int $$2) {
      this.M().a(this.a($$0, $$1, $$2));
   }

   ekg A_();

   bna d_(ib var1);

   @Nullable
   MinecraftServer o();

   default bmz aj() {
      return this.A_().q();
   }

   doz L();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.L().b($$0, $$1);
   }

   axd E_();

   default void b(ib $$0, daa $$1) {
   }

   default void a(ih $$0, dmz $$1, ib $$2, ib $$3, int $$4, int $$5) {
      ejp.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable cis $$0, ib $$1, atx $$2, atz $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable cis var1, ib var2, atx var3, atz var4, float var5, float var6);

   void a(ka var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable cis var1, int var2, ib var3, int var4);

   default void c(int $$0, ib $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(il<drn> var1, epr var2, drn.a var3);

   default void a(@Nullable bow $$0, il<drn> $$1, epr $$2) {
      this.a($$1, $$2, new drn.a($$0, null));
   }

   default void a(@Nullable bow $$0, il<drn> $$1, ib $$2) {
      this.a($$1, $$2, new drn.a($$0, null));
   }

   default void a(il<drn> $$0, ib $$1, drn.a $$2) {
      this.a($$0, epr.b($$1), $$2);
   }

   default void a(ajg<drn> $$0, ib $$1, drn.a $$2) {
      this.a(this.H_().d(kj.B).g($$0), $$1, $$2);
   }
}
