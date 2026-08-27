import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cwf extends cvq, cwl {
   @Override
   default long ai() {
      return this.B_().d();
   }

   long H_();

   eqi<czf> N();

   private <T> eqm<T> a(ib $$0, T $$1, int $$2, eqq $$3) {
      return new eqm<>($$1, $$0, this.B_().c() + (long)$$2, $$3, this.H_());
   }

   private <T> eqm<T> a(ib $$0, T $$1, int $$2) {
      return new eqm<>($$1, $$0, this.B_().c() + (long)$$2, this.H_());
   }

   default void a(ib $$0, czf $$1, int $$2, eqq $$3) {
      this.N().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(ib $$0, czf $$1, int $$2) {
      this.N().a(this.a($$0, $$1, $$2));
   }

   eqi<ehq> M();

   default void a(ib $$0, ehq $$1, int $$2, eqq $$3) {
      this.M().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(ib $$0, ehq $$1, int $$2) {
      this.M().a(this.a($$0, $$1, $$2));
   }

   ejk B_();

   bmj d_(ib var1);

   @Nullable
   MinecraftServer o();

   default bmi aj() {
      return this.B_().q();
   }

   doe L();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.L().b($$0, $$1);
   }

   awt F_();

   default void b(ib $$0, czf $$1) {
   }

   default void a(ih $$0, dme $$1, ib $$2, ib $$3, int $$4, int $$5) {
      eit.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable cia $$0, ib $$1, ato $$2, atq $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable cia var1, ib var2, ato var3, atq var4, float var5, float var6);

   void a(jz var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable cia var1, int var2, ib var3, int var4);

   default void c(int $$0, ib $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(il<dqr> var1, eov var2, dqr.a var3);

   default void a(@Nullable bof $$0, il<dqr> $$1, eov $$2) {
      this.a($$1, $$2, new dqr.a($$0, null));
   }

   default void a(@Nullable bof $$0, il<dqr> $$1, ib $$2) {
      this.a($$1, $$2, new dqr.a($$0, null));
   }

   default void a(il<dqr> $$0, ib $$1, dqr.a $$2) {
      this.a($$0, eov.b($$1), $$2);
   }

   default void a(ajb<dqr> $$0, ib $$1, dqr.a $$2) {
      this.a(this.I_().d(ki.B).f($$0), $$1, $$2);
   }
}
