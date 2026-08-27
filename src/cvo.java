import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cvo extends cuz, cvu {
   @Override
   default long aj() {
      return this.B_().d();
   }

   long H_();

   epf<cyo> N();

   private <T> epj<T> a(hz $$0, T $$1, int $$2, epn $$3) {
      return new epj<>($$1, $$0, this.B_().c() + (long)$$2, $$3, this.H_());
   }

   private <T> epj<T> a(hz $$0, T $$1, int $$2) {
      return new epj<>($$1, $$0, this.B_().c() + (long)$$2, this.H_());
   }

   default void a(hz $$0, cyo $$1, int $$2, epn $$3) {
      this.N().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(hz $$0, cyo $$1, int $$2) {
      this.N().a(this.a($$0, $$1, $$2));
   }

   epf<ego> M();

   default void a(hz $$0, ego $$1, int $$2, epn $$3) {
      this.M().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(hz $$0, ego $$1, int $$2) {
      this.M().a(this.a($$0, $$1, $$2));
   }

   eih B_();

   bls d_(hz var1);

   @Nullable
   MinecraftServer o();

   default blr ak() {
      return this.B_().q();
   }

   dnf L();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.L().b($$0, $$1);
   }

   awo F_();

   default void b(hz $$0, cyo $$1) {
   }

   default void a(ie $$0, dlf $$1, hz $$2, hz $$3, int $$4, int $$5) {
      ehr.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable chh $$0, hz $$1, atj $$2, atl $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable chh var1, hz var2, atj var3, atl var4, float var5, float var6);

   void a(jx var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable chh var1, int var2, hz var3, int var4);

   default void c(int $$0, hz $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(ij<dpp> var1, ens var2, dpp.a var3);

   default void a(@Nullable bno $$0, ij<dpp> $$1, ens $$2) {
      this.a($$1, $$2, new dpp.a($$0, null));
   }

   default void a(@Nullable bno $$0, ij<dpp> $$1, hz $$2) {
      this.a($$1, $$2, new dpp.a($$0, null));
   }

   default void a(ij<dpp> $$0, hz $$1, dpp.a $$2) {
      this.a($$0, ens.b($$1), $$2);
   }

   default void a(aix<dpp> $$0, hz $$1, dpp.a $$2) {
      this.a(this.I_().d(kg.B).f($$0), $$1, $$2);
   }
}
