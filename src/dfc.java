import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface dfc extends dem, dfi {
   @Override
   default long aj() {
      return this.A_().d();
   }

   long G_();

   fbb<die> R();

   private <T> fbf<T> a(jh $$0, T $$1, int $$2, fbj $$3) {
      return new fbf<>($$1, $$0, this.A_().c() + (long)$$2, $$3, this.G_());
   }

   private <T> fbf<T> a(jh $$0, T $$1, int $$2) {
      return new fbf<>($$1, $$0, this.A_().c() + (long)$$2, this.G_());
   }

   default void a(jh $$0, die $$1, int $$2, fbj $$3) {
      this.R().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(jh $$0, die $$1, int $$2) {
      this.R().a(this.a($$0, $$1, $$2));
   }

   fbb<erj> Q();

   default void a(jh $$0, erj $$1, int $$2, fbj $$3) {
      this.Q().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(jh $$0, erj $$1, int $$2) {
      this.Q().a(this.a($$0, $$1, $$2));
   }

   etm A_();

   bsb d_(jh var1);

   @Nullable
   MinecraftServer o();

   default bsa ak() {
      return this.A_().q();
   }

   dxj P();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.P().b($$0, $$1);
   }

   azs E_();

   default void b(jh $$0, die $$1) {
   }

   default void a(jm $$0, jh $$1, jh $$2, dvj $$3, int $$4, int $$5) {
      esr.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable com $$0, jh $$1, awk $$2, awm $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable com var1, jh var2, awk var3, awm var4, float var5, float var6);

   void a(lp var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable com var1, int var2, jh var3, int var4);

   default void c(int $$0, jh $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(jq<eag> var1, ezn var2, eag.a var3);

   default void a(@Nullable bue $$0, jq<eag> $$1, ezn $$2) {
      this.a($$1, $$2, new eag.a($$0, null));
   }

   default void a(@Nullable bue $$0, jq<eag> $$1, jh $$2) {
      this.a($$1, $$2, new eag.a($$0, null));
   }

   default void a(jq<eag> $$0, jh $$1, eag.a $$2) {
      this.a($$0, ezn.b($$1), $$2);
   }

   default void a(alh<eag> $$0, jh $$1, eag.a $$2) {
      this.a(this.H_().e(lz.G).b($$0), $$1, $$2);
   }
}
