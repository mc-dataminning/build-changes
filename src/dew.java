import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface dew extends deg, dfc {
   @Override
   default long al() {
      return this.A_().d();
   }

   long G_();

   fav<dhy> R();

   private <T> faz<T> a(jg $$0, T $$1, int $$2, fbd $$3) {
      return new faz<>($$1, $$0, this.A_().c() + (long)$$2, $$3, this.G_());
   }

   private <T> faz<T> a(jg $$0, T $$1, int $$2) {
      return new faz<>($$1, $$0, this.A_().c() + (long)$$2, this.G_());
   }

   default void a(jg $$0, dhy $$1, int $$2, fbd $$3) {
      this.R().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(jg $$0, dhy $$1, int $$2) {
      this.R().a(this.a($$0, $$1, $$2));
   }

   fav<erd> Q();

   default void a(jg $$0, erd $$1, int $$2, fbd $$3) {
      this.Q().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(jg $$0, erd $$1, int $$2) {
      this.Q().a(this.a($$0, $$1, $$2));
   }

   etg A_();

   brw d_(jg var1);

   @Nullable
   MinecraftServer o();

   default brv am() {
      return this.A_().q();
   }

   dxd P();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.P().b($$0, $$1);
   }

   azr E_();

   default void b(jg $$0, dhy $$1) {
   }

   default void a(jl $$0, jg $$1, jg $$2, dvd $$3, int $$4, int $$5) {
      esl.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable coh $$0, jg $$1, awj $$2, awl $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable coh var1, jg var2, awj var3, awl var4, float var5, float var6);

   void a(lo var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable coh var1, int var2, jg var3, int var4);

   default void c(int $$0, jg $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(jp<eaa> var1, ezh var2, eaa.a var3);

   default void a(@Nullable btz $$0, jp<eaa> $$1, ezh $$2) {
      this.a($$1, $$2, new eaa.a($$0, null));
   }

   default void a(@Nullable btz $$0, jp<eaa> $$1, jg $$2) {
      this.a($$1, $$2, new eaa.a($$0, null));
   }

   default void a(jp<eaa> $$0, jg $$1, eaa.a $$2) {
      this.a($$0, ezh.b($$1), $$2);
   }

   default void a(alg<eaa> $$0, jg $$1, eaa.a $$2) {
      this.a(this.H_().e(ly.G).b($$0), $$1, $$2);
   }
}
