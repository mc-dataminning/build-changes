import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface diw extends dih, djc, djk {
   @Override
   default long am() {
      return this.y_().d();
   }

   long E_();

   @Override
   default <T> fga<T> a(iu $$0, T $$1, int $$2, fge $$3) {
      return new fga<>($$1, $$0, this.y_().c() + (long)$$2, $$3, this.E_());
   }

   @Override
   default <T> fga<T> a(iu $$0, T $$1, int $$2) {
      return new fga<>($$1, $$0, this.y_().c() + (long)$$2, this.E_());
   }

   eyj y_();

   btz d_(iu var1);

   @Nullable
   MinecraftServer p();

   default bty an() {
      return this.y_().q();
   }

   eca S();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.S().b($$0, $$1);
   }

   azv C_();

   default void a(iu $$0, dma $$1) {
   }

   default void a(ja $$0, iu $$1, iu $$2, dzz $$3, int $$4, int $$5) {
      exn.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable bwd $$0, iu $$1, awm $$2, awo $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable bwd var1, iu var2, awm var3, awo var4, float var5, float var6);

   void a(lv var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable bwd var1, int var2, iu var3, int var4);

   default void c(int $$0, iu $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(je<eez> var1, fei var2, eez.a var3);

   default void a(@Nullable bwd $$0, je<eez> $$1, fei $$2) {
      this.a($$1, $$2, new eez.a($$0, null));
   }

   default void a(@Nullable bwd $$0, je<eez> $$1, iu $$2) {
      this.a($$1, $$2, new eez.a($$0, null));
   }

   default void a(je<eez> $$0, iu $$1, eez.a $$2) {
      this.a($$0, fei.b($$1), $$2);
   }

   default void a(alf<eez> $$0, iu $$1, eez.a $$2) {
      this.a(this.F_().f(mg.H).b($$0), $$1, $$2);
   }
}
