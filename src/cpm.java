import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cpm extends cox, cps {
   @Override
   default long ah() {
      return this.u_().f();
   }

   long A_();

   eil<csl> L();

   private <T> eip<T> a(gu $$0, T $$1, int $$2, eit $$3) {
      return new eip<>($$1, $$0, this.u_().e() + (long)$$2, $$3, this.A_());
   }

   private <T> eip<T> a(gu $$0, T $$1, int $$2) {
      return new eip<>($$1, $$0, this.u_().e() + (long)$$2, this.A_());
   }

   default void a(gu $$0, csl $$1, int $$2, eit $$3) {
      this.L().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(gu $$0, csl $$1, int $$2) {
      this.L().a(this.a($$0, $$1, $$2));
   }

   eil<eab> K();

   default void a(gu $$0, eab $$1, int $$2, eit $$3) {
      this.K().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(gu $$0, eab $$1, int $$2) {
      this.K().a(this.a($$0, $$1, $$2));
   }

   ebt u_();

   bgo d_(gu var1);

   @Nullable
   MinecraftServer n();

   default bgn ai() {
      return this.u_().s();
   }

   dgz J();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.J().b($$0, $$1);
   }

   aru y_();

   default void b(gu $$0, csl $$1) {
   }

   default void a(ha $$0, dez $$1, gu $$2, gu $$3, int $$4, int $$5) {
      ebe.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable cbm $$0, gu $$1, aov $$2, aox $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable cbm var1, gu var2, aov var3, aox var4, float var5, float var6);

   void a(it var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable cbm var1, int var2, gu var3, int var4);

   default void c(int $$0, gu $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(djj var1, ehd var2, djj.a var3);

   default void a(@Nullable bii $$0, djj $$1, ehd $$2) {
      this.a($$1, $$2, new djj.a($$0, null));
   }

   default void a(@Nullable bii $$0, djj $$1, gu $$2) {
      this.a($$1, $$2, new djj.a($$0, null));
   }

   default void a(djj $$0, gu $$1, djj.a $$2) {
      this.a($$0, ehd.b($$1), $$2);
   }
}
