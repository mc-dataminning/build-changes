import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface djb extends dim, djh, djp {
   @Override
   default long am() {
      return this.y_().d();
   }

   long E_();

   @Override
   default <T> fgi<T> a(iu $$0, T $$1, int $$2, fgm $$3) {
      return new fgi<>($$1, $$0, this.y_().c() + (long)$$2, $$3, this.E_());
   }

   @Override
   default <T> fgi<T> a(iu $$0, T $$1, int $$2) {
      return new fgi<>($$1, $$0, this.y_().c() + (long)$$2, this.E_());
   }

   eyr y_();

   bub d_(iu var1);

   @Nullable
   MinecraftServer p();

   default bua an() {
      return this.y_().q();
   }

   eci S();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.S().b($$0, $$1);
   }

   azv C_();

   default void a(iu $$0, dmf $$1) {
   }

   default void a(ja $$0, iu $$1, iu $$2, eah $$3, int $$4, int $$5) {
      exv.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable bwf $$0, iu $$1, awm $$2, awo $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable bwf var1, iu var2, awm var3, awo var4, float var5, float var6);

   void a(lv var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable bwf var1, int var2, iu var3, int var4);

   default void c(int $$0, iu $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(je<efh> var1, feq var2, efh.a var3);

   default void a(@Nullable bwf $$0, je<efh> $$1, feq $$2) {
      this.a($$1, $$2, new efh.a($$0, null));
   }

   default void a(@Nullable bwf $$0, je<efh> $$1, iu $$2) {
      this.a($$1, $$2, new efh.a($$0, null));
   }

   default void a(je<efh> $$0, iu $$1, efh.a $$2) {
      this.a($$0, feq.b($$1), $$2);
   }

   default void a(alf<efh> $$0, iu $$1, efh.a $$2) {
      this.a(this.F_().f(mg.H).b($$0), $$1, $$2);
   }
}
