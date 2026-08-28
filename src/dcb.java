import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface dcb extends dbm, dch {
   @Override
   default long ak() {
      return this.A_().d();
   }

   long G_();

   exg<dfb> P();

   private <T> exk<T> a(iz $$0, T $$1, int $$2, exo $$3) {
      return new exk<>($$1, $$0, this.A_().c() + (long)$$2, $$3, this.G_());
   }

   private <T> exk<T> a(iz $$0, T $$1, int $$2) {
      return new exk<>($$1, $$0, this.A_().c() + (long)$$2, this.G_());
   }

   default void a(iz $$0, dfb $$1, int $$2, exo $$3) {
      this.P().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(iz $$0, dfb $$1, int $$2) {
      this.P().a(this.a($$0, $$1, $$2));
   }

   exg<enw> O();

   default void a(iz $$0, enw $$1, int $$2, exo $$3) {
      this.O().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(iz $$0, enw $$1, int $$2) {
      this.O().a(this.a($$0, $$1, $$2));
   }

   epu A_();

   bqu d_(iz var1);

   @Nullable
   MinecraftServer o();

   default bqt al() {
      return this.A_().q();
   }

   due N();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.N().b($$0, $$1);
   }

   azh E_();

   default void b(iz $$0, dfb $$1) {
   }

   default void a(je $$0, dse $$1, iz $$2, iz $$3, int $$4, int $$5) {
      epb.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable cmz $$0, iz $$1, avz $$2, awb $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable cmz var1, iz var2, avz var3, awb var4, float var5, float var6);

   void a(lg var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable cmz var1, int var2, iz var3, int var4);

   default void c(int $$0, iz $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(ji<dwx> var1, evt var2, dwx.a var3);

   default void a(@Nullable bsw $$0, ji<dwx> $$1, evt $$2) {
      this.a($$1, $$2, new dwx.a($$0, null));
   }

   default void a(@Nullable bsw $$0, ji<dwx> $$1, iz $$2) {
      this.a($$1, $$2, new dwx.a($$0, null));
   }

   default void a(ji<dwx> $$0, iz $$1, dwx.a $$2) {
      this.a($$0, evt.b($$1), $$2);
   }

   default void a(ale<dwx> $$0, iz $$1, dwx.a $$2) {
      this.a(this.H_().d(lq.C).g($$0), $$1, $$2);
   }
}
