import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface deh extends ddr, den {
   @Override
   default long al() {
      return this.y_().d();
   }

   long E_();

   fag<dhj> R();

   private <T> fak<T> a(je $$0, T $$1, int $$2, fao $$3) {
      return new fak<>($$1, $$0, this.y_().c() + (long)$$2, $$3, this.E_());
   }

   private <T> fak<T> a(je $$0, T $$1, int $$2) {
      return new fak<>($$1, $$0, this.y_().c() + (long)$$2, this.E_());
   }

   default void a(je $$0, dhj $$1, int $$2, fao $$3) {
      this.R().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(je $$0, dhj $$1, int $$2) {
      this.R().a(this.a($$0, $$1, $$2));
   }

   fag<eqo> Q();

   default void a(je $$0, eqo $$1, int $$2, fao $$3) {
      this.Q().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(je $$0, eqo $$1, int $$2) {
      this.Q().a(this.a($$0, $$1, $$2));
   }

   esr y_();

   brn d_(je var1);

   @Nullable
   MinecraftServer o();

   default brm am() {
      return this.y_().q();
   }

   dwo P();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.P().b($$0, $$1);
   }

   azl C_();

   default void b(je $$0, dhj $$1) {
   }

   default void a(jj $$0, duo $$1, je $$2, je $$3, int $$4, int $$5) {
      erw.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable cnu $$0, je $$1, awd $$2, awf $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable cnu var1, je var2, awd var3, awf var4, float var5, float var6);

   void a(ll var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable cnu var1, int var2, je var3, int var4);

   default void c(int $$0, je $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(jn<dzl> var1, eys var2, dzl.a var3);

   default void a(@Nullable bto $$0, jn<dzl> $$1, eys $$2) {
      this.a($$1, $$2, new dzl.a($$0, null));
   }

   default void a(@Nullable bto $$0, jn<dzl> $$1, je $$2) {
      this.a($$1, $$2, new dzl.a($$0, null));
   }

   default void a(jn<dzl> $$0, je $$1, dzl.a $$2) {
      this.a($$0, eys.b($$1), $$2);
   }

   default void a(alb<dzl> $$0, je $$1, dzl.a $$2) {
      this.a(this.F_().d(lv.G).g($$0), $$1, $$2);
   }
}
