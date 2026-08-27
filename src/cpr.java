import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cpr extends cpc, cpx {
   @Override
   default long ah() {
      return this.u_().f();
   }

   long A_();

   eiq<csq> L();

   private <T> eiu<T> a(gw $$0, T $$1, int $$2, eiy $$3) {
      return new eiu<>($$1, $$0, this.u_().e() + (long)$$2, $$3, this.A_());
   }

   private <T> eiu<T> a(gw $$0, T $$1, int $$2) {
      return new eiu<>($$1, $$0, this.u_().e() + (long)$$2, this.A_());
   }

   default void a(gw $$0, csq $$1, int $$2, eiy $$3) {
      this.L().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(gw $$0, csq $$1, int $$2) {
      this.L().a(this.a($$0, $$1, $$2));
   }

   eiq<eag> K();

   default void a(gw $$0, eag $$1, int $$2, eiy $$3) {
      this.K().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(gw $$0, eag $$1, int $$2) {
      this.K().a(this.a($$0, $$1, $$2));
   }

   eby u_();

   bgr d_(gw var1);

   @Nullable
   MinecraftServer n();

   default bgq ai() {
      return this.u_().s();
   }

   dhe J();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.J().b($$0, $$1);
   }

   arx y_();

   default void b(gw $$0, csq $$1) {
   }

   default void a(hc $$0, dfe $$1, gw $$2, gw $$3, int $$4, int $$5) {
      ebj.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable cbp $$0, gw $$1, aoy $$2, apa $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable cbp var1, gw var2, aoy var3, apa var4, float var5, float var6);

   void a(iv var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable cbp var1, int var2, gw var3, int var4);

   default void c(int $$0, gw $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(djo var1, ehi var2, djo.a var3);

   default void a(@Nullable bil $$0, djo $$1, ehi $$2) {
      this.a($$1, $$2, new djo.a($$0, null));
   }

   default void a(@Nullable bil $$0, djo $$1, gw $$2) {
      this.a($$1, $$2, new djo.a($$0, null));
   }

   default void a(djo $$0, gw $$1, djo.a $$2) {
      this.a($$0, ehi.b($$1), $$2);
   }
}
