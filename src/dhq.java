import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface dhq extends dhb, dhw, die {
   @Override
   default long am() {
      return this.y_().d();
   }

   long E_();

   @Override
   default <T> fem<T> a(jj $$0, T $$1, int $$2, feq $$3) {
      return new fem<>($$1, $$0, this.y_().c() + (long)$$2, $$3, this.E_());
   }

   @Override
   default <T> fem<T> a(jj $$0, T $$1, int $$2) {
      return new fem<>($$1, $$0, this.y_().c() + (long)$$2, this.E_());
   }

   ewv y_();

   bto d_(jj var1);

   @Nullable
   MinecraftServer p();

   default btn an() {
      return this.y_().q();
   }

   ean S();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.S().b($$0, $$1);
   }

   azs C_();

   default void a(jj $$0, dku $$1) {
   }

   default void a(jo $$0, jj $$1, jj $$2, dym $$3, int $$4, int $$5) {
      ewa.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable bvs $$0, jj $$1, awj $$2, awl $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable bvs var1, jj var2, awj var3, awl var4, float var5, float var6);

   void a(lt var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable bvs var1, int var2, jj var3, int var4);

   default void c(int $$0, jj $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(js<edm> var1, fcu var2, edm.a var3);

   default void a(@Nullable bvs $$0, js<edm> $$1, fcu $$2) {
      this.a($$1, $$2, new edm.a($$0, null));
   }

   default void a(@Nullable bvs $$0, js<edm> $$1, jj $$2) {
      this.a($$1, $$2, new edm.a($$0, null));
   }

   default void a(js<edm> $$0, jj $$1, edm.a $$2) {
      this.a($$0, fcu.b($$1), $$2);
   }

   default void a(alc<edm> $$0, jj $$1, edm.a $$2) {
      this.a(this.F_().f(me.G).b($$0), $$1, $$2);
   }
}
