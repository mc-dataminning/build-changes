import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface crt extends cre, crz {
   @Override
   default long ah() {
      return this.A_().f();
   }

   long G_();

   ekq<cut> L();

   private <T> eku<T> a(ht $$0, T $$1, int $$2, eky $$3) {
      return new eku<>($$1, $$0, this.A_().e() + (long)$$2, $$3, this.G_());
   }

   private <T> eku<T> a(ht $$0, T $$1, int $$2) {
      return new eku<>($$1, $$0, this.A_().e() + (long)$$2, this.G_());
   }

   default void a(ht $$0, cut $$1, int $$2, eky $$3) {
      this.L().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(ht $$0, cut $$1, int $$2) {
      this.L().a(this.a($$0, $$1, $$2));
   }

   ekq<ecf> K();

   default void a(ht $$0, ecf $$1, int $$2, eky $$3) {
      this.K().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(ht $$0, ecf $$1, int $$2) {
      this.K().a(this.a($$0, $$1, $$2));
   }

   edx A_();

   bio d_(ht var1);

   @Nullable
   MinecraftServer n();

   default bin ai() {
      return this.A_().s();
   }

   diw J();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.J().b($$0, $$1);
   }

   ato E_();

   default void b(ht $$0, cut $$1) {
   }

   default void a(hx $$0, dgw $$1, ht $$2, ht $$3, int $$4, int $$5) {
      edi.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable cdm $$0, ht $$1, aqm $$2, aqo $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable cdm var1, ht var2, aqm var3, aqo var4, float var5, float var6);

   void a(jq var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable cdm var1, int var2, ht var3, int var4);

   default void c(int $$0, ht $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(dlg var1, eji var2, dlg.a var3);

   default void a(@Nullable bki $$0, dlg $$1, eji $$2) {
      this.a($$1, $$2, new dlg.a($$0, null));
   }

   default void a(@Nullable bki $$0, dlg $$1, ht $$2) {
      this.a($$1, $$2, new dlg.a($$0, null));
   }

   default void a(dlg $$0, ht $$1, dlg.a $$2) {
      this.a($$0, eji.b($$1), $$2);
   }
}
