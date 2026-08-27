import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cxc extends cwn, cxi {
   @Override
   default long ai() {
      return this.A_().d();
   }

   long G_();

   erg<dac> N();

   private <T> erk<T> a(ib $$0, T $$1, int $$2, ero $$3) {
      return new erk<>($$1, $$0, this.A_().c() + (long)$$2, $$3, this.G_());
   }

   private <T> erk<T> a(ib $$0, T $$1, int $$2) {
      return new erk<>($$1, $$0, this.A_().c() + (long)$$2, this.G_());
   }

   default void a(ib $$0, dac $$1, int $$2, ero $$3) {
      this.N().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(ib $$0, dac $$1, int $$2) {
      this.N().a(this.a($$0, $$1, $$2));
   }

   erg<eio> M();

   default void a(ib $$0, eio $$1, int $$2, ero $$3) {
      this.M().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(ib $$0, eio $$1, int $$2) {
      this.M().a(this.a($$0, $$1, $$2));
   }

   eki A_();

   bnb d_(ib var1);

   @Nullable
   MinecraftServer o();

   default bna aj() {
      return this.A_().q();
   }

   dpb L();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.L().b($$0, $$1);
   }

   axd E_();

   default void b(ib $$0, dac $$1) {
   }

   default void a(ih $$0, dnb $$1, ib $$2, ib $$3, int $$4, int $$5) {
      ejr.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable ciu $$0, ib $$1, atx $$2, atz $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable ciu var1, ib var2, atx var3, atz var4, float var5, float var6);

   void a(ka var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable ciu var1, int var2, ib var3, int var4);

   default void c(int $$0, ib $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(il<drp> var1, ept var2, drp.a var3);

   default void a(@Nullable box $$0, il<drp> $$1, ept $$2) {
      this.a($$1, $$2, new drp.a($$0, null));
   }

   default void a(@Nullable box $$0, il<drp> $$1, ib $$2) {
      this.a($$1, $$2, new drp.a($$0, null));
   }

   default void a(il<drp> $$0, ib $$1, drp.a $$2) {
      this.a($$0, ept.b($$1), $$2);
   }

   default void a(ajg<drp> $$0, ib $$1, drp.a $$2) {
      this.a(this.H_().d(kj.B).g($$0), $$1, $$2);
   }
}
