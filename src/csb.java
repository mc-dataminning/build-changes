import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface csb extends crm, csh {
   @Override
   default long ai() {
      return this.A_().f();
   }

   long G_();

   elc<cva> M();

   private <T> elg<T> a(ht $$0, T $$1, int $$2, elk $$3) {
      return new elg<>($$1, $$0, this.A_().e() + (long)$$2, $$3, this.G_());
   }

   private <T> elg<T> a(ht $$0, T $$1, int $$2) {
      return new elg<>($$1, $$0, this.A_().e() + (long)$$2, this.G_());
   }

   default void a(ht $$0, cva $$1, int $$2, elk $$3) {
      this.M().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(ht $$0, cva $$1, int $$2) {
      this.M().a(this.a($$0, $$1, $$2));
   }

   elc<ecr> L();

   default void a(ht $$0, ecr $$1, int $$2, elk $$3) {
      this.L().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(ht $$0, ecr $$1, int $$2) {
      this.L().a(this.a($$0, $$1, $$2));
   }

   eej A_();

   biv d_(ht var1);

   @Nullable
   MinecraftServer n();

   default biu aj() {
      return this.A_().s();
   }

   dji K();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.K().b($$0, $$1);
   }

   ats E_();

   default void b(ht $$0, cva $$1) {
   }

   default void a(hx $$0, dhi $$1, ht $$2, ht $$3, int $$4, int $$5) {
      edu.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable cdu $$0, ht $$1, aqq $$2, aqs $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable cdu var1, ht var2, aqq var3, aqs var4, float var5, float var6);

   void a(jq var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable cdu var1, int var2, ht var3, int var4);

   default void c(int $$0, ht $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(dls var1, eju var2, dls.a var3);

   default void a(@Nullable bkq $$0, dls $$1, eju $$2) {
      this.a($$1, $$2, new dls.a($$0, null));
   }

   default void a(@Nullable bkq $$0, dls $$1, ht $$2) {
      this.a($$1, $$2, new dls.a($$0, null));
   }

   default void a(dls $$0, ht $$1, dls.a $$2) {
      this.a($$0, eju.b($$1), $$2);
   }
}
