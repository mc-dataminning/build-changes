import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface dby extends dbj, dce {
   @Override
   default long ak() {
      return this.A_().d();
   }

   long G_();

   exd<dey> P();

   private <T> exh<T> a(iz $$0, T $$1, int $$2, exl $$3) {
      return new exh<>($$1, $$0, this.A_().c() + (long)$$2, $$3, this.G_());
   }

   private <T> exh<T> a(iz $$0, T $$1, int $$2) {
      return new exh<>($$1, $$0, this.A_().c() + (long)$$2, this.G_());
   }

   default void a(iz $$0, dey $$1, int $$2, exl $$3) {
      this.P().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(iz $$0, dey $$1, int $$2) {
      this.P().a(this.a($$0, $$1, $$2));
   }

   exd<ent> O();

   default void a(iz $$0, ent $$1, int $$2, exl $$3) {
      this.O().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(iz $$0, ent $$1, int $$2) {
      this.O().a(this.a($$0, $$1, $$2));
   }

   epr A_();

   bqr d_(iz var1);

   @Nullable
   MinecraftServer o();

   default bqq al() {
      return this.A_().q();
   }

   dub N();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.N().b($$0, $$1);
   }

   azg E_();

   default void b(iz $$0, dey $$1) {
   }

   default void a(je $$0, dsb $$1, iz $$2, iz $$3, int $$4, int $$5) {
      eoy.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable cmw $$0, iz $$1, avy $$2, awa $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable cmw var1, iz var2, avy var3, awa var4, float var5, float var6);

   void a(lg var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable cmw var1, int var2, iz var3, int var4);

   default void c(int $$0, iz $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(ji<dwu> var1, evq var2, dwu.a var3);

   default void a(@Nullable bst $$0, ji<dwu> $$1, evq $$2) {
      this.a($$1, $$2, new dwu.a($$0, null));
   }

   default void a(@Nullable bst $$0, ji<dwu> $$1, iz $$2) {
      this.a($$1, $$2, new dwu.a($$0, null));
   }

   default void a(ji<dwu> $$0, iz $$1, dwu.a $$2) {
      this.a($$0, evq.b($$1), $$2);
   }

   default void a(ald<dwu> $$0, iz $$1, dwu.a $$2) {
      this.a(this.H_().d(lq.C).g($$0), $$1, $$2);
   }
}
