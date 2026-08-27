import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface csg extends crr, csm {
   @Override
   default long ai() {
      return this.B_().f();
   }

   long H_();

   elh<cvf> M();

   private <T> ell<T> a(hx $$0, T $$1, int $$2, elp $$3) {
      return new ell<>($$1, $$0, this.B_().e() + (long)$$2, $$3, this.H_());
   }

   private <T> ell<T> a(hx $$0, T $$1, int $$2) {
      return new ell<>($$1, $$0, this.B_().e() + (long)$$2, this.H_());
   }

   default void a(hx $$0, cvf $$1, int $$2, elp $$3) {
      this.M().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(hx $$0, cvf $$1, int $$2) {
      this.M().a(this.a($$0, $$1, $$2));
   }

   elh<ecw> L();

   default void a(hx $$0, ecw $$1, int $$2, elp $$3) {
      this.L().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(hx $$0, ecw $$1, int $$2) {
      this.L().a(this.a($$0, $$1, $$2));
   }

   eeo B_();

   biz d_(hx var1);

   @Nullable
   MinecraftServer n();

   default biy aj() {
      return this.B_().s();
   }

   djn K();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.K().b($$0, $$1);
   }

   atw F_();

   default void b(hx $$0, cvf $$1) {
   }

   default void a(ib $$0, dhn $$1, hx $$2, hx $$3, int $$4, int $$5) {
      edz.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable cdz $$0, hx $$1, aqu $$2, aqw $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable cdz var1, hx var2, aqu var3, aqw var4, float var5, float var6);

   void a(ju var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable cdz var1, int var2, hx var3, int var4);

   default void c(int $$0, hx $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(dlx var1, ejz var2, dlx.a var3);

   default void a(@Nullable bkv $$0, dlx $$1, ejz $$2) {
      this.a($$1, $$2, new dlx.a($$0, null));
   }

   default void a(@Nullable bkv $$0, dlx $$1, hx $$2) {
      this.a($$1, $$2, new dlx.a($$0, null));
   }

   default void a(dlx $$0, hx $$1, dlx.a $$2) {
      this.a($$0, ejz.b($$1), $$2);
   }
}
