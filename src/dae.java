import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface dae extends czp, dak {
   @Override
   default long aj() {
      return this.A_().d();
   }

   long G_();

   evc<dde> O();

   private <T> evg<T> a(in $$0, T $$1, int $$2, evk $$3) {
      return new evg<>($$1, $$0, this.A_().c() + (long)$$2, $$3, this.G_());
   }

   private <T> evg<T> a(in $$0, T $$1, int $$2) {
      return new evg<>($$1, $$0, this.A_().c() + (long)$$2, this.G_());
   }

   default void a(in $$0, dde $$1, int $$2, evk $$3) {
      this.O().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(in $$0, dde $$1, int $$2) {
      this.O().a(this.a($$0, $$1, $$2));
   }

   evc<elz> N();

   default void a(in $$0, elz $$1, int $$2, evk $$3) {
      this.N().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(in $$0, elz $$1, int $$2) {
      this.N().a(this.a($$0, $$1, $$2));
   }

   enx A_();

   bpk d_(in var1);

   @Nullable
   MinecraftServer o();

   default bpj ak() {
      return this.A_().q();
   }

   dsh M();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.M().b($$0, $$1);
   }

   ayg E_();

   default void b(in $$0, dde $$1) {
   }

   default void a(is $$0, dqh $$1, in $$2, in $$3, int $$4, int $$5) {
      ene.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable clh $$0, in $$1, avb $$2, avd $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable clh var1, in var2, avb var3, avd var4, float var5, float var6);

   void a(kv var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable clh var1, int var2, in var3, int var4);

   default void c(int $$0, in $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(iw<dva> var1, etp var2, dva.a var3);

   default void a(@Nullable brh $$0, iw<dva> $$1, etp $$2) {
      this.a($$1, $$2, new dva.a($$0, null));
   }

   default void a(@Nullable brh $$0, iw<dva> $$1, in $$2) {
      this.a($$1, $$2, new dva.a($$0, null));
   }

   default void a(iw<dva> $$0, in $$1, dva.a $$2) {
      this.a($$0, etp.b($$1), $$2);
   }

   default void a(akg<dva> $$0, in $$1, dva.a $$2) {
      this.a(this.H_().d(le.C).g($$0), $$1, $$2);
   }
}
