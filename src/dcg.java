import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface dcg extends dbr, dcm {
   @Override
   default long ak() {
      return this.A_().d();
   }

   long G_();

   exs<dfh> P();

   private <T> exw<T> a(ja $$0, T $$1, int $$2, eya $$3) {
      return new exw<>($$1, $$0, this.A_().c() + (long)$$2, $$3, this.G_());
   }

   private <T> exw<T> a(ja $$0, T $$1, int $$2) {
      return new exw<>($$1, $$0, this.A_().c() + (long)$$2, this.G_());
   }

   default void a(ja $$0, dfh $$1, int $$2, eya $$3) {
      this.P().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(ja $$0, dfh $$1, int $$2) {
      this.P().a(this.a($$0, $$1, $$2));
   }

   exs<eog> O();

   default void a(ja $$0, eog $$1, int $$2, eya $$3) {
      this.O().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(ja $$0, eog $$1, int $$2) {
      this.O().a(this.a($$0, $$1, $$2));
   }

   eqe A_();

   bqe d_(ja var1);

   @Nullable
   MinecraftServer o();

   default bqd al() {
      return this.A_().q();
   }

   duk N();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.N().b($$0, $$1);
   }

   ayo E_();

   default void b(ja $$0, dfh $$1) {
   }

   default void a(jf $$0, dsk $$1, ja $$2, ja $$3, int $$4, int $$5) {
      epl.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable cmk $$0, ja $$1, avg $$2, avi $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable cmk var1, ja var2, avg var3, avi var4, float var5, float var6);

   void a(lh var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable cmk var1, int var2, ja var3, int var4);

   default void c(int $$0, ja $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(jj<dxg> var1, ewf var2, dxg.a var3);

   default void a(@Nullable bsg $$0, jj<dxg> $$1, ewf $$2) {
      this.a($$1, $$2, new dxg.a($$0, null));
   }

   default void a(@Nullable bsg $$0, jj<dxg> $$1, ja $$2) {
      this.a($$1, $$2, new dxg.a($$0, null));
   }

   default void a(jj<dxg> $$0, ja $$1, dxg.a $$2) {
      this.a($$0, ewf.b($$1), $$2);
   }

   default void a(akj<dxg> $$0, ja $$1, dxg.a $$2) {
      this.a(this.H_().d(lr.G).g($$0), $$1, $$2);
   }
}
