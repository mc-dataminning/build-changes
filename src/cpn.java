import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cpn extends coy, cpt {
   @Override
   default long ah() {
      return this.u_().f();
   }

   long A_();

   eim<csm> L();

   private <T> eiq<T> a(gu $$0, T $$1, int $$2, eiu $$3) {
      return new eiq<>($$1, $$0, this.u_().e() + (long)$$2, $$3, this.A_());
   }

   private <T> eiq<T> a(gu $$0, T $$1, int $$2) {
      return new eiq<>($$1, $$0, this.u_().e() + (long)$$2, this.A_());
   }

   default void a(gu $$0, csm $$1, int $$2, eiu $$3) {
      this.L().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(gu $$0, csm $$1, int $$2) {
      this.L().a(this.a($$0, $$1, $$2));
   }

   eim<eac> K();

   default void a(gu $$0, eac $$1, int $$2, eiu $$3) {
      this.K().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(gu $$0, eac $$1, int $$2) {
      this.K().a(this.a($$0, $$1, $$2));
   }

   ebu u_();

   bgo d_(gu var1);

   @Nullable
   MinecraftServer n();

   default bgn ai() {
      return this.u_().s();
   }

   dha J();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.J().b($$0, $$1);
   }

   aru y_();

   default void b(gu $$0, csm $$1) {
   }

   default void a(ha $$0, dfa $$1, gu $$2, gu $$3, int $$4, int $$5) {
      ebf.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable cbn $$0, gu $$1, aov $$2, aox $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable cbn var1, gu var2, aov var3, aox var4, float var5, float var6);

   void a(it var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable cbn var1, int var2, gu var3, int var4);

   default void c(int $$0, gu $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(djk var1, ehe var2, djk.a var3);

   default void a(@Nullable bii $$0, djk $$1, ehe $$2) {
      this.a($$1, $$2, new djk.a($$0, null));
   }

   default void a(@Nullable bii $$0, djk $$1, gu $$2) {
      this.a($$1, $$2, new djk.a($$0, null));
   }

   default void a(djk $$0, gu $$1, djk.a $$2) {
      this.a($$0, ehe.b($$1), $$2);
   }
}
