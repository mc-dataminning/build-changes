import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface dcx extends dci, ddd {
   @Override
   default long ak() {
      return this.A_().d();
   }

   long G_();

   eyn<dfy> P();

   private <T> eyr<T> a(jd $$0, T $$1, int $$2, eyv $$3) {
      return new eyr<>($$1, $$0, this.A_().c() + (long)$$2, $$3, this.G_());
   }

   private <T> eyr<T> a(jd $$0, T $$1, int $$2) {
      return new eyr<>($$1, $$0, this.A_().c() + (long)$$2, this.G_());
   }

   default void a(jd $$0, dfy $$1, int $$2, eyv $$3) {
      this.P().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(jd $$0, dfy $$1, int $$2) {
      this.P().a(this.a($$0, $$1, $$2));
   }

   eyn<epb> O();

   default void a(jd $$0, epb $$1, int $$2, eyv $$3) {
      this.O().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(jd $$0, epb $$1, int $$2) {
      this.O().a(this.a($$0, $$1, $$2));
   }

   eqz A_();

   bqp d_(jd var1);

   @Nullable
   MinecraftServer o();

   default bqo al() {
      return this.A_().q();
   }

   dvc N();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.N().b($$0, $$1);
   }

   ayw E_();

   default void b(jd $$0, dfy $$1) {
   }

   default void a(ji $$0, dtc $$1, jd $$2, jd $$3, int $$4, int $$5) {
      eqg.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable cmx $$0, jd $$1, avo $$2, avq $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable cmx var1, jd var2, avo var3, avq var4, float var5, float var6);

   void a(lk var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable cmx var1, int var2, jd var3, int var4);

   default void c(int $$0, jd $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(jm<dxz> var1, exa var2, dxz.a var3);

   default void a(@Nullable bsr $$0, jm<dxz> $$1, exa $$2) {
      this.a($$1, $$2, new dxz.a($$0, null));
   }

   default void a(@Nullable bsr $$0, jm<dxz> $$1, jd $$2) {
      this.a($$1, $$2, new dxz.a($$0, null));
   }

   default void a(jm<dxz> $$0, jd $$1, dxz.a $$2) {
      this.a($$0, exa.b($$1), $$2);
   }

   default void a(akq<dxz> $$0, jd $$1, dxz.a $$2) {
      this.a(this.H_().d(lu.G).g($$0), $$1, $$2);
   }
}
