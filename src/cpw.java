import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cpw extends cph, cqc {
   @Override
   default long ah() {
      return this.z_().f();
   }

   long F_();

   eiv<csv> L();

   private <T> eiz<T> a(gw $$0, T $$1, int $$2, ejd $$3) {
      return new eiz<>($$1, $$0, this.z_().e() + (long)$$2, $$3, this.F_());
   }

   private <T> eiz<T> a(gw $$0, T $$1, int $$2) {
      return new eiz<>($$1, $$0, this.z_().e() + (long)$$2, this.F_());
   }

   default void a(gw $$0, csv $$1, int $$2, ejd $$3) {
      this.L().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(gw $$0, csv $$1, int $$2) {
      this.L().a(this.a($$0, $$1, $$2));
   }

   eiv<eal> K();

   default void a(gw $$0, eal $$1, int $$2, ejd $$3) {
      this.K().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(gw $$0, eal $$1, int $$2) {
      this.K().a(this.a($$0, $$1, $$2));
   }

   ecd z_();

   bgw d_(gw var1);

   @Nullable
   MinecraftServer n();

   default bgv ai() {
      return this.z_().s();
   }

   dhj J();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.J().b($$0, $$1);
   }

   asc D_();

   default void b(gw $$0, csv $$1) {
   }

   default void a(ha $$0, dfj $$1, gw $$2, gw $$3, int $$4, int $$5) {
      ebo.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable cbu $$0, gw $$1, apc $$2, ape $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable cbu var1, gw var2, apc var3, ape var4, float var5, float var6);

   void a(it var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable cbu var1, int var2, gw var3, int var4);

   default void c(int $$0, gw $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(djt var1, ehn var2, djt.a var3);

   default void a(@Nullable biq $$0, djt $$1, ehn $$2) {
      this.a($$1, $$2, new djt.a($$0, null));
   }

   default void a(@Nullable biq $$0, djt $$1, gw $$2) {
      this.a($$1, $$2, new djt.a($$0, null));
   }

   default void a(djt $$0, gw $$1, djt.a $$2) {
      this.a($$0, ehn.b($$1), $$2);
   }
}
