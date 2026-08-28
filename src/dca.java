import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface dca extends dbl, dcg {
   @Override
   default long ak() {
      return this.A_().d();
   }

   long G_();

   exf<dfa> P();

   private <T> exj<T> a(iz $$0, T $$1, int $$2, exn $$3) {
      return new exj<>($$1, $$0, this.A_().c() + (long)$$2, $$3, this.G_());
   }

   private <T> exj<T> a(iz $$0, T $$1, int $$2) {
      return new exj<>($$1, $$0, this.A_().c() + (long)$$2, this.G_());
   }

   default void a(iz $$0, dfa $$1, int $$2, exn $$3) {
      this.P().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(iz $$0, dfa $$1, int $$2) {
      this.P().a(this.a($$0, $$1, $$2));
   }

   exf<env> O();

   default void a(iz $$0, env $$1, int $$2, exn $$3) {
      this.O().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(iz $$0, env $$1, int $$2) {
      this.O().a(this.a($$0, $$1, $$2));
   }

   ept A_();

   bqt d_(iz var1);

   @Nullable
   MinecraftServer o();

   default bqs al() {
      return this.A_().q();
   }

   dud N();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.N().b($$0, $$1);
   }

   azh E_();

   default void b(iz $$0, dfa $$1) {
   }

   default void a(je $$0, dsd $$1, iz $$2, iz $$3, int $$4, int $$5) {
      epa.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable cmy $$0, iz $$1, avz $$2, awb $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable cmy var1, iz var2, avz var3, awb var4, float var5, float var6);

   void a(lg var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable cmy var1, int var2, iz var3, int var4);

   default void c(int $$0, iz $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(ji<dww> var1, evs var2, dww.a var3);

   default void a(@Nullable bsv $$0, ji<dww> $$1, evs $$2) {
      this.a($$1, $$2, new dww.a($$0, null));
   }

   default void a(@Nullable bsv $$0, ji<dww> $$1, iz $$2) {
      this.a($$1, $$2, new dww.a($$0, null));
   }

   default void a(ji<dww> $$0, iz $$1, dww.a $$2) {
      this.a($$0, evs.b($$1), $$2);
   }

   default void a(ale<dww> $$0, iz $$1, dww.a $$2) {
      this.a(this.H_().d(lq.C).g($$0), $$1, $$2);
   }
}
