import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cpy extends cpj, cqe {
   @Override
   default long ah() {
      return this.z_().f();
   }

   long F_();

   eix<csx> L();

   private <T> ejb<T> a(gw $$0, T $$1, int $$2, ejf $$3) {
      return new ejb<>($$1, $$0, this.z_().e() + (long)$$2, $$3, this.F_());
   }

   private <T> ejb<T> a(gw $$0, T $$1, int $$2) {
      return new ejb<>($$1, $$0, this.z_().e() + (long)$$2, this.F_());
   }

   default void a(gw $$0, csx $$1, int $$2, ejf $$3) {
      this.L().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(gw $$0, csx $$1, int $$2) {
      this.L().a(this.a($$0, $$1, $$2));
   }

   eix<ean> K();

   default void a(gw $$0, ean $$1, int $$2, ejf $$3) {
      this.K().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(gw $$0, ean $$1, int $$2) {
      this.K().a(this.a($$0, $$1, $$2));
   }

   ecf z_();

   bgy d_(gw var1);

   @Nullable
   MinecraftServer n();

   default bgx ai() {
      return this.z_().s();
   }

   dhl J();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.J().b($$0, $$1);
   }

   ase D_();

   default void b(gw $$0, csx $$1) {
   }

   default void a(hc $$0, dfl $$1, gw $$2, gw $$3, int $$4, int $$5) {
      ebq.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable cbw $$0, gw $$1, ape $$2, apg $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable cbw var1, gw var2, ape var3, apg var4, float var5, float var6);

   void a(iv var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable cbw var1, int var2, gw var3, int var4);

   default void c(int $$0, gw $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(djv var1, ehp var2, djv.a var3);

   default void a(@Nullable bis $$0, djv $$1, ehp $$2) {
      this.a($$1, $$2, new djv.a($$0, null));
   }

   default void a(@Nullable bis $$0, djv $$1, gw $$2) {
      this.a($$1, $$2, new djv.a($$0, null));
   }

   default void a(djv $$0, gw $$1, djv.a $$2) {
      this.a($$0, ehp.b($$1), $$2);
   }
}
