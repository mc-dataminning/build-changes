import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface czv extends czg, dab {
   @Override
   default long aj() {
      return this.A_().d();
   }

   long G_();

   eus<dcv> O();

   private <T> euw<T> a(im $$0, T $$1, int $$2, eva $$3) {
      return new euw<>($$1, $$0, this.A_().c() + (long)$$2, $$3, this.G_());
   }

   private <T> euw<T> a(im $$0, T $$1, int $$2) {
      return new euw<>($$1, $$0, this.A_().c() + (long)$$2, this.G_());
   }

   default void a(im $$0, dcv $$1, int $$2, eva $$3) {
      this.O().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(im $$0, dcv $$1, int $$2) {
      this.O().a(this.a($$0, $$1, $$2));
   }

   eus<elq> N();

   default void a(im $$0, elq $$1, int $$2, eva $$3) {
      this.N().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(im $$0, elq $$1, int $$2) {
      this.N().a(this.a($$0, $$1, $$2));
   }

   enm A_();

   boo d_(im var1);

   @Nullable
   MinecraftServer o();

   default bon ak() {
      return this.A_().q();
   }

   dry M();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.M().b($$0, $$1);
   }

   ayd E_();

   default void b(im $$0, dcv $$1) {
   }

   default void a(ir $$0, dpy $$1, im $$2, im $$3, int $$4, int $$5) {
      emv.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable ckl $$0, im $$1, auy $$2, ava $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable ckl var1, im var2, auy var3, ava var4, float var5, float var6);

   void a(ku var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable ckl var1, int var2, im var3, int var4);

   default void c(int $$0, im $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(iv<dur> var1, etf var2, dur.a var3);

   default void a(@Nullable bql $$0, iv<dur> $$1, etf $$2) {
      this.a($$1, $$2, new dur.a($$0, null));
   }

   default void a(@Nullable bql $$0, iv<dur> $$1, im $$2) {
      this.a($$1, $$2, new dur.a($$0, null));
   }

   default void a(iv<dur> $$0, im $$1, dur.a $$2) {
      this.a($$0, etf.b($$1), $$2);
   }

   default void a(ake<dur> $$0, im $$1, dur.a $$2) {
      this.a(this.H_().d(ld.C).g($$0), $$1, $$2);
   }
}
