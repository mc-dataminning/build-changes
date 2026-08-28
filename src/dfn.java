import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface dfn extends dex, dft, dgb {
   @Override
   default long aj() {
      return this.C_().d();
   }

   long I_();

   @Override
   default <T> fbq<T> a(jh $$0, T $$1, int $$2, fbu $$3) {
      return new fbq<>($$1, $$0, this.C_().c() + (long)$$2, $$3, this.I_());
   }

   @Override
   default <T> fbq<T> a(jh $$0, T $$1, int $$2) {
      return new fbq<>($$1, $$0, this.C_().c() + (long)$$2, this.I_());
   }

   etx C_();

   bsi d_(jh var1);

   @Nullable
   MinecraftServer p();

   default bsh ak() {
      return this.C_().q();
   }

   dxu Q();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.Q().b($$0, $$1);
   }

   azu G_();

   default void b(jh $$0, diq $$1) {
   }

   default void a(jm $$0, jh $$1, jh $$2, dvv $$3, int $$4, int $$5) {
      etc.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable cou $$0, jh $$1, awm $$2, awo $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable cou var1, jh var2, awm var3, awo var4, float var5, float var6);

   void a(lq var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable cou var1, int var2, jh var3, int var4);

   default void c(int $$0, jh $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(jq<ear> var1, ezy var2, ear.a var3);

   default void a(@Nullable bul $$0, jq<ear> $$1, ezy $$2) {
      this.a($$1, $$2, new ear.a($$0, null));
   }

   default void a(@Nullable bul $$0, jq<ear> $$1, jh $$2) {
      this.a($$1, $$2, new ear.a($$0, null));
   }

   default void a(jq<ear> $$0, jh $$1, ear.a $$2) {
      this.a($$0, ezy.b($$1), $$2);
   }

   default void a(ali<ear> $$0, jh $$1, ear.a $$2) {
      this.a(this.J_().e(ma.G).b($$0), $$1, $$2);
   }
}
