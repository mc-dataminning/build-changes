import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface ctp extends cta, ctv {
   @Override
   default long aj() {
      return this.B_().f();
   }

   long H_();

   enf<cwp> N();

   private <T> enj<T> a(hx $$0, T $$1, int $$2, enn $$3) {
      return new enj<>($$1, $$0, this.B_().e() + (long)$$2, $$3, this.H_());
   }

   private <T> enj<T> a(hx $$0, T $$1, int $$2) {
      return new enj<>($$1, $$0, this.B_().e() + (long)$$2, this.H_());
   }

   default void a(hx $$0, cwp $$1, int $$2, enn $$3) {
      this.N().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(hx $$0, cwp $$1, int $$2) {
      this.N().a(this.a($$0, $$1, $$2));
   }

   enf<eep> M();

   default void a(hx $$0, eep $$1, int $$2, enn $$3) {
      this.M().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(hx $$0, eep $$1, int $$2) {
      this.M().a(this.a($$0, $$1, $$2));
   }

   egh B_();

   bjy d_(hx var1);

   @Nullable
   MinecraftServer o();

   default bjx ak() {
      return this.B_().s();
   }

   dlg L();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.L().b($$0, $$1);
   }

   auu F_();

   default void b(hx $$0, cwp $$1) {
   }

   default void a(ic $$0, djg $$1, hx $$2, hx $$3, int $$4, int $$5) {
      efs.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable cfh $$0, hx $$1, arq $$2, ars $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable cfh var1, hx var2, arq var3, ars var4, float var5, float var6);

   void a(jv var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable cfh var1, int var2, hx var3, int var4);

   default void c(int $$0, hx $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(dnq var1, els var2, dnq.a var3);

   default void a(@Nullable blu $$0, dnq $$1, els $$2) {
      this.a($$1, $$2, new dnq.a($$0, null));
   }

   default void a(@Nullable blu $$0, dnq $$1, hx $$2) {
      this.a($$1, $$2, new dnq.a($$0, null));
   }

   default void a(dnq $$0, hx $$1, dnq.a $$2) {
      this.a($$0, els.b($$1), $$2);
   }
}
