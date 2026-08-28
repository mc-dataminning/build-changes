import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface dce extends dbp, dck {
   @Override
   default long ak() {
      return this.A_().d();
   }

   long G_();

   exm<dff> P();

   private <T> exq<T> a(ja $$0, T $$1, int $$2, exu $$3) {
      return new exq<>($$1, $$0, this.A_().c() + (long)$$2, $$3, this.G_());
   }

   private <T> exq<T> a(ja $$0, T $$1, int $$2) {
      return new exq<>($$1, $$0, this.A_().c() + (long)$$2, this.G_());
   }

   default void a(ja $$0, dff $$1, int $$2, exu $$3) {
      this.P().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(ja $$0, dff $$1, int $$2) {
      this.P().a(this.a($$0, $$1, $$2));
   }

   exm<eoa> O();

   default void a(ja $$0, eoa $$1, int $$2, exu $$3) {
      this.O().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(ja $$0, eoa $$1, int $$2) {
      this.O().a(this.a($$0, $$1, $$2));
   }

   epy A_();

   bqb d_(ja var1);

   @Nullable
   MinecraftServer o();

   default bqa al() {
      return this.A_().q();
   }

   duh N();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.N().b($$0, $$1);
   }

   aym E_();

   default void b(ja $$0, dff $$1) {
   }

   default void a(jf $$0, dsh $$1, ja $$2, ja $$3, int $$4, int $$5) {
      epf.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable cmh $$0, ja $$1, ave $$2, avg $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable cmh var1, ja var2, ave var3, avg var4, float var5, float var6);

   void a(lh var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable cmh var1, int var2, ja var3, int var4);

   default void c(int $$0, ja $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(jj<dxa> var1, evz var2, dxa.a var3);

   default void a(@Nullable bsd $$0, jj<dxa> $$1, evz $$2) {
      this.a($$1, $$2, new dxa.a($$0, null));
   }

   default void a(@Nullable bsd $$0, jj<dxa> $$1, ja $$2) {
      this.a($$1, $$2, new dxa.a($$0, null));
   }

   default void a(jj<dxa> $$0, ja $$1, dxa.a $$2) {
      this.a($$0, evz.b($$1), $$2);
   }

   default void a(akj<dxa> $$0, ja $$1, dxa.a $$2) {
      this.a(this.H_().d(lr.G).g($$0), $$1, $$2);
   }
}
