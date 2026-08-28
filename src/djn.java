import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface djn extends dix, djt, dkb {
   @Override
   default long am() {
      return this.y_().d();
   }

   long E_();

   @Override
   default <T> fgu<T> a(iv $$0, T $$1, int $$2, fgy $$3) {
      return new fgu<>($$1, $$0, this.y_().c() + (long)$$2, $$3, this.E_());
   }

   @Override
   default <T> fgu<T> a(iv $$0, T $$1, int $$2) {
      return new fgu<>($$1, $$0, this.y_().c() + (long)$$2, this.E_());
   }

   ezd y_();

   bue d_(iv var1);

   @Nullable
   MinecraftServer p();

   default bud an() {
      return this.y_().q();
   }

   ecu S();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.S().b($$0, $$1);
   }

   azv C_();

   default void a(iv $$0, dmr $$1) {
   }

   default void a(jb $$0, iv $$1, iv $$2, eat $$3, int $$4, int $$5) {
      eyh.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable bwi $$0, iv $$1, awm $$2, awo $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable bwi var1, iv var2, awm var3, awo var4, float var5, float var6);

   void a(lw var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable bwi var1, int var2, iv var3, int var4);

   default void c(int $$0, iv $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(jf<eft> var1, ffc var2, eft.a var3);

   default void a(@Nullable bwi $$0, jf<eft> $$1, ffc $$2) {
      this.a($$1, $$2, new eft.a($$0, null));
   }

   default void a(@Nullable bwi $$0, jf<eft> $$1, iv $$2) {
      this.a($$1, $$2, new eft.a($$0, null));
   }

   default void a(jf<eft> $$0, iv $$1, eft.a $$2) {
      this.a($$0, ffc.b($$1), $$2);
   }

   default void a(alf<eft> $$0, iv $$1, eft.a $$2) {
      this.a(this.F_().f(mh.H).b($$0), $$1, $$2);
   }
}
