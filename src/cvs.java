import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cvs extends cvd, cvy {
   @Override
   default long ai() {
      return this.B_().d();
   }

   long H_();

   epm<cys> N();

   private <T> epq<T> a(hz $$0, T $$1, int $$2, epu $$3) {
      return new epq<>($$1, $$0, this.B_().c() + (long)$$2, $$3, this.H_());
   }

   private <T> epq<T> a(hz $$0, T $$1, int $$2) {
      return new epq<>($$1, $$0, this.B_().c() + (long)$$2, this.H_());
   }

   default void a(hz $$0, cys $$1, int $$2, epu $$3) {
      this.N().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(hz $$0, cys $$1, int $$2) {
      this.N().a(this.a($$0, $$1, $$2));
   }

   epm<egv> M();

   default void a(hz $$0, egv $$1, int $$2, epu $$3) {
      this.M().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(hz $$0, egv $$1, int $$2) {
      this.M().a(this.a($$0, $$1, $$2));
   }

   eio B_();

   blu d_(hz var1);

   @Nullable
   MinecraftServer o();

   default blt aj() {
      return this.B_().q();
   }

   dnj L();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.L().b($$0, $$1);
   }

   awp F_();

   default void b(hz $$0, cys $$1) {
   }

   default void a(ie $$0, dlj $$1, hz $$2, hz $$3, int $$4, int $$5) {
      ehy.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable chl $$0, hz $$1, atk $$2, atm $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable chl var1, hz var2, atk var3, atm var4, float var5, float var6);

   void a(jx var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable chl var1, int var2, hz var3, int var4);

   default void c(int $$0, hz $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(ij<dpw> var1, enz var2, dpw.a var3);

   default void a(@Nullable bnq $$0, ij<dpw> $$1, enz $$2) {
      this.a($$1, $$2, new dpw.a($$0, null));
   }

   default void a(@Nullable bnq $$0, ij<dpw> $$1, hz $$2) {
      this.a($$1, $$2, new dpw.a($$0, null));
   }

   default void a(ij<dpw> $$0, hz $$1, dpw.a $$2) {
      this.a($$0, enz.b($$1), $$2);
   }

   default void a(aix<dpw> $$0, hz $$1, dpw.a $$2) {
      this.a(this.I_().d(kg.B).f($$0), $$1, $$2);
   }
}
