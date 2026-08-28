import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface ddt extends ddd, ddz {
   @Override
   default long al() {
      return this.y_().d();
   }

   long E_();

   ezr<dgv> R();

   private <T> ezv<T> a(je $$0, T $$1, int $$2, ezz $$3) {
      return new ezv<>($$1, $$0, this.y_().c() + (long)$$2, $$3, this.E_());
   }

   private <T> ezv<T> a(je $$0, T $$1, int $$2) {
      return new ezv<>($$1, $$0, this.y_().c() + (long)$$2, this.E_());
   }

   default void a(je $$0, dgv $$1, int $$2, ezz $$3) {
      this.R().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(je $$0, dgv $$1, int $$2) {
      this.R().a(this.a($$0, $$1, $$2));
   }

   ezr<eqa> Q();

   default void a(je $$0, eqa $$1, int $$2, ezz $$3) {
      this.Q().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(je $$0, eqa $$1, int $$2) {
      this.Q().a(this.a($$0, $$1, $$2));
   }

   esd y_();

   bri d_(je var1);

   @Nullable
   MinecraftServer o();

   default brh am() {
      return this.y_().q();
   }

   dwa P();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.P().b($$0, $$1);
   }

   azk C_();

   default void b(je $$0, dgv $$1) {
   }

   default void a(jj $$0, dua $$1, je $$2, je $$3, int $$4, int $$5) {
      eri.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable cnp $$0, je $$1, awc $$2, awe $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable cnp var1, je var2, awc var3, awe var4, float var5, float var6);

   void a(ll var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable cnp var1, int var2, je var3, int var4);

   default void c(int $$0, je $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(jn<dyx> var1, eye var2, dyx.a var3);

   default void a(@Nullable btj $$0, jn<dyx> $$1, eye $$2) {
      this.a($$1, $$2, new dyx.a($$0, null));
   }

   default void a(@Nullable btj $$0, jn<dyx> $$1, je $$2) {
      this.a($$1, $$2, new dyx.a($$0, null));
   }

   default void a(jn<dyx> $$0, je $$1, dyx.a $$2) {
      this.a($$0, eye.b($$1), $$2);
   }

   default void a(ala<dyx> $$0, je $$1, dyx.a $$2) {
      this.a(this.F_().d(lv.G).g($$0), $$1, $$2);
   }
}
