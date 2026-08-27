import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cra extends cql, crg {
   @Override
   default long ah() {
      return this.A_().f();
   }

   long G_();

   ejn<cua> L();

   private <T> ejr<T> a(ht $$0, T $$1, int $$2, ejv $$3) {
      return new ejr<>($$1, $$0, this.A_().e() + (long)$$2, $$3, this.G_());
   }

   private <T> ejr<T> a(ht $$0, T $$1, int $$2) {
      return new ejr<>($$1, $$0, this.A_().e() + (long)$$2, this.G_());
   }

   default void a(ht $$0, cua $$1, int $$2, ejv $$3) {
      this.L().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(ht $$0, cua $$1, int $$2) {
      this.L().a(this.a($$0, $$1, $$2));
   }

   ejn<ebd> K();

   default void a(ht $$0, ebd $$1, int $$2, ejv $$3) {
      this.K().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(ht $$0, ebd $$1, int $$2) {
      this.K().a(this.a($$0, $$1, $$2));
   }

   ecv A_();

   bhz d_(ht var1);

   @Nullable
   MinecraftServer n();

   default bhy ai() {
      return this.A_().s();
   }

   dib J();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.J().b($$0, $$1);
   }

   ate E_();

   default void b(ht $$0, cua $$1) {
   }

   default void a(hx $$0, dgb $$1, ht $$2, ht $$3, int $$4, int $$5) {
      ecg.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable ccx $$0, ht $$1, aqc $$2, aqe $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable ccx var1, ht var2, aqc var3, aqe var4, float var5, float var6);

   void a(jq var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable ccx var1, int var2, ht var3, int var4);

   default void c(int $$0, ht $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(dkl var1, eif var2, dkl.a var3);

   default void a(@Nullable bjt $$0, dkl $$1, eif $$2) {
      this.a($$1, $$2, new dkl.a($$0, null));
   }

   default void a(@Nullable bjt $$0, dkl $$1, ht $$2) {
      this.a($$1, $$2, new dkl.a($$0, null));
   }

   default void a(dkl $$0, ht $$1, dkl.a $$2) {
      this.a($$0, eif.b($$1), $$2);
   }
}
