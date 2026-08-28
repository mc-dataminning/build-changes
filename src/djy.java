import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface djy extends dji, dke, dkm {
   @Override
   default long am() {
      return this.C_().d();
   }

   long I_();

   @Override
   default <T> fhi<T> a(iv $$0, T $$1, int $$2, fhm $$3) {
      return new fhi<>($$1, $$0, this.C_().c() + (long)$$2, $$3, this.I_());
   }

   @Override
   default <T> fhi<T> a(iv $$0, T $$1, int $$2) {
      return new fhi<>($$1, $$0, this.C_().c() + (long)$$2, this.I_());
   }

   ezr C_();

   bup d_(iv var1);

   @Nullable
   MinecraftServer p();

   default buo an() {
      return this.C_().q();
   }

   edf S();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.S().b($$0, $$1);
   }

   azx G_();

   default void a(iv $$0, dnc $$1) {
   }

   default void a(jb $$0, iv $$1, iv $$2, ebe $$3, int $$4, int $$5) {
      eyv.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable bwt $$0, iv $$1, awo $$2, awq $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable bwt var1, iv var2, awo var3, awq var4, float var5, float var6);

   void a(lw var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable bwt var1, int var2, iv var3, int var4);

   default void c(int $$0, iv $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(jf<ege> var1, ffq var2, ege.a var3);

   default void a(@Nullable bwt $$0, jf<ege> $$1, ffq $$2) {
      this.a($$1, $$2, new ege.a($$0, null));
   }

   default void a(@Nullable bwt $$0, jf<ege> $$1, iv $$2) {
      this.a($$1, $$2, new ege.a($$0, null));
   }

   default void a(jf<ege> $$0, iv $$1, ege.a $$2) {
      this.a($$0, ffq.b($$1), $$2);
   }

   default void a(alh<ege> $$0, iv $$1, ege.a $$2) {
      this.a(this.J_().f(mh.H).b($$0), $$1, $$2);
   }
}
