import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cyy extends cyj, cze {
   @Override
   default long aj() {
      return this.A_().d();
   }

   long G_();

   etn<dby> O();

   private <T> etr<T> a(ib $$0, T $$1, int $$2, etv $$3) {
      return new etr<>($$1, $$0, this.A_().c() + (long)$$2, $$3, this.G_());
   }

   private <T> etr<T> a(ib $$0, T $$1, int $$2) {
      return new etr<>($$1, $$0, this.A_().c() + (long)$$2, this.G_());
   }

   default void a(ib $$0, dby $$1, int $$2, etv $$3) {
      this.O().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(ib $$0, dby $$1, int $$2) {
      this.O().a(this.a($$0, $$1, $$2));
   }

   etn<ekr> N();

   default void a(ib $$0, ekr $$1, int $$2, etv $$3) {
      this.N().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(ib $$0, ekr $$1, int $$2) {
      this.N().a(this.a($$0, $$1, $$2));
   }

   emn A_();

   bny d_(ib var1);

   @Nullable
   MinecraftServer o();

   default bnx ak() {
      return this.A_().q();
   }

   dqz M();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.M().b($$0, $$1);
   }

   axr E_();

   default void b(ib $$0, dby $$1) {
   }

   default void a(ih $$0, doz $$1, ib $$2, ib $$3, int $$4, int $$5) {
      elw.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable cjt $$0, ib $$1, aul $$2, aun $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable cjt var1, ib var2, aul var3, aun var4, float var5, float var6);

   void a(kj var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable cjt var1, int var2, ib var3, int var4);

   default void c(int $$0, ib $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(il<dts> var1, esa var2, dts.a var3);

   default void a(@Nullable bpv $$0, il<dts> $$1, esa $$2) {
      this.a($$1, $$2, new dts.a($$0, null));
   }

   default void a(@Nullable bpv $$0, il<dts> $$1, ib $$2) {
      this.a($$1, $$2, new dts.a($$0, null));
   }

   default void a(il<dts> $$0, ib $$1, dts.a $$2) {
      this.a($$0, esa.b($$1), $$2);
   }

   default void a(ajs<dts> $$0, ib $$1, dts.a $$2) {
      this.a(this.H_().d(ks.B).g($$0), $$1, $$2);
   }
}
