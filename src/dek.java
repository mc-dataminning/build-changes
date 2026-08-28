import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface dek extends ddu, deq {
   @Override
   default long al() {
      return this.z_().d();
   }

   long F_();

   fak<dhm> R();

   private <T> fao<T> a(jf $$0, T $$1, int $$2, fas $$3) {
      return new fao<>($$1, $$0, this.z_().c() + (long)$$2, $$3, this.F_());
   }

   private <T> fao<T> a(jf $$0, T $$1, int $$2) {
      return new fao<>($$1, $$0, this.z_().c() + (long)$$2, this.F_());
   }

   default void a(jf $$0, dhm $$1, int $$2, fas $$3) {
      this.R().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(jf $$0, dhm $$1, int $$2) {
      this.R().a(this.a($$0, $$1, $$2));
   }

   fak<eqs> Q();

   default void a(jf $$0, eqs $$1, int $$2, fas $$3) {
      this.Q().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(jf $$0, eqs $$1, int $$2) {
      this.Q().a(this.a($$0, $$1, $$2));
   }

   esv z_();

   brq d_(jf var1);

   @Nullable
   MinecraftServer o();

   default brp am() {
      return this.z_().q();
   }

   dws P();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.P().b($$0, $$1);
   }

   azn D_();

   default void b(jf $$0, dhm $$1) {
   }

   default void a(jk $$0, jf $$1, jf $$2, dus $$3, int $$4, int $$5) {
      esa.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable cnx $$0, jf $$1, awf $$2, awh $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable cnx var1, jf var2, awf var3, awh var4, float var5, float var6);

   void a(lm var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable cnx var1, int var2, jf var3, int var4);

   default void c(int $$0, jf $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(jo<dzp> var1, eyw var2, dzp.a var3);

   default void a(@Nullable btr $$0, jo<dzp> $$1, eyw $$2) {
      this.a($$1, $$2, new dzp.a($$0, null));
   }

   default void a(@Nullable btr $$0, jo<dzp> $$1, jf $$2) {
      this.a($$1, $$2, new dzp.a($$0, null));
   }

   default void a(jo<dzp> $$0, jf $$1, dzp.a $$2) {
      this.a($$0, eyw.b($$1), $$2);
   }

   default void a(ald<dzp> $$0, jf $$1, dzp.a $$2) {
      this.a(this.G_().e(lw.G).b($$0), $$1, $$2);
   }
}
