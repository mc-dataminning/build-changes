import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface dha extends dgk, dhg, dho {
   @Override
   default long al() {
      return this.D_().d();
   }

   long J_();

   @Override
   default <T> fdj<T> a(jh $$0, T $$1, int $$2, fdn $$3) {
      return new fdj<>($$1, $$0, this.D_().c() + (long)$$2, $$3, this.J_());
   }

   @Override
   default <T> fdj<T> a(jh $$0, T $$1, int $$2) {
      return new fdj<>($$1, $$0, this.D_().c() + (long)$$2, this.J_());
   }

   evs D_();

   bsy d_(jh var1);

   @Nullable
   MinecraftServer p();

   default bsx am() {
      return this.D_().q();
   }

   dzn S();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.S().b($$0, $$1);
   }

   bac H_();

   default void b(jh $$0, dkd $$1) {
   }

   default void a(jm $$0, jh $$1, jh $$2, dxo $$3, int $$4, int $$5) {
      eux.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable cpo $$0, jh $$1, awu $$2, aww $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable cpo var1, jh var2, awu var3, aww var4, float var5, float var6);

   void a(lq var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable cpo var1, int var2, jh var3, int var4);

   default void c(int $$0, jh $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(jq<eck> var1, fbr var2, eck.a var3);

   default void a(@Nullable bvb $$0, jq<eck> $$1, fbr $$2) {
      this.a($$1, $$2, new eck.a($$0, null));
   }

   default void a(@Nullable bvb $$0, jq<eck> $$1, jh $$2) {
      this.a($$1, $$2, new eck.a($$0, null));
   }

   default void a(jq<eck> $$0, jh $$1, eck.a $$2) {
      this.a($$0, fbr.b($$1), $$2);
   }

   default void a(alo<eck> $$0, jh $$1, eck.a $$2) {
      this.a(this.K_().e(mb.G).b($$0), $$1, $$2);
   }
}
