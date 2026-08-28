import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface dbu extends dbf, dca {
   @Override
   default long ak() {
      return this.A_().d();
   }

   long G_();

   ewz<deu> P();

   private <T> exd<T> a(iz $$0, T $$1, int $$2, exh $$3) {
      return new exd<>($$1, $$0, this.A_().c() + (long)$$2, $$3, this.G_());
   }

   private <T> exd<T> a(iz $$0, T $$1, int $$2) {
      return new exd<>($$1, $$0, this.A_().c() + (long)$$2, this.G_());
   }

   default void a(iz $$0, deu $$1, int $$2, exh $$3) {
      this.P().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(iz $$0, deu $$1, int $$2) {
      this.P().a(this.a($$0, $$1, $$2));
   }

   ewz<enp> O();

   default void a(iz $$0, enp $$1, int $$2, exh $$3) {
      this.O().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(iz $$0, enp $$1, int $$2) {
      this.O().a(this.a($$0, $$1, $$2));
   }

   epn A_();

   bqn d_(iz var1);

   @Nullable
   MinecraftServer o();

   default bqm al() {
      return this.A_().q();
   }

   dtx N();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.N().b($$0, $$1);
   }

   azc E_();

   default void b(iz $$0, deu $$1) {
   }

   default void a(je $$0, drx $$1, iz $$2, iz $$3, int $$4, int $$5) {
      eou.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable cms $$0, iz $$1, avv $$2, avx $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable cms var1, iz var2, avv var3, avx var4, float var5, float var6);

   void a(lh var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable cms var1, int var2, iz var3, int var4);

   default void c(int $$0, iz $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(ji<dwq> var1, evm var2, dwq.a var3);

   default void a(@Nullable bsp $$0, ji<dwq> $$1, evm $$2) {
      this.a($$1, $$2, new dwq.a($$0, null));
   }

   default void a(@Nullable bsp $$0, ji<dwq> $$1, iz $$2) {
      this.a($$1, $$2, new dwq.a($$0, null));
   }

   default void a(ji<dwq> $$0, iz $$1, dwq.a $$2) {
      this.a($$0, evm.b($$1), $$2);
   }

   default void a(ala<dwq> $$0, iz $$1, dwq.a $$2) {
      this.a(this.H_().d(lq.C).g($$0), $$1, $$2);
   }
}
