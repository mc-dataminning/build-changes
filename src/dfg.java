import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface dfg extends deq, dfm, dfu {
   @Override
   default long aj() {
      return this.A_().d();
   }

   long G_();

   @Override
   default <T> fbj<T> a(jh $$0, T $$1, int $$2, fbn $$3) {
      return new fbj<>($$1, $$0, this.A_().c() + (long)$$2, $$3, this.G_());
   }

   @Override
   default <T> fbj<T> a(jh $$0, T $$1, int $$2) {
      return new fbj<>($$1, $$0, this.A_().c() + (long)$$2, this.G_());
   }

   etq A_();

   bsf d_(jh var1);

   @Nullable
   MinecraftServer o();

   default bse ak() {
      return this.A_().q();
   }

   dxn P();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.P().b($$0, $$1);
   }

   azv E_();

   default void b(jh $$0, dij $$1) {
   }

   default void a(jm $$0, jh $$1, jh $$2, dvo $$3, int $$4, int $$5) {
      esv.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable cor $$0, jh $$1, awn $$2, awp $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable cor var1, jh var2, awn var3, awp var4, float var5, float var6);

   void a(lq var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable cor var1, int var2, jh var3, int var4);

   default void c(int $$0, jh $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(jq<eak> var1, ezr var2, eak.a var3);

   default void a(@Nullable bui $$0, jq<eak> $$1, ezr $$2) {
      this.a($$1, $$2, new eak.a($$0, null));
   }

   default void a(@Nullable bui $$0, jq<eak> $$1, jh $$2) {
      this.a($$1, $$2, new eak.a($$0, null));
   }

   default void a(jq<eak> $$0, jh $$1, eak.a $$2) {
      this.a($$0, ezr.b($$1), $$2);
   }

   default void a(alk<eak> $$0, jh $$1, eak.a $$2) {
      this.a(this.H_().e(ma.G).b($$0), $$1, $$2);
   }
}
