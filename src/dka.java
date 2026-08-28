import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface dka extends djk, dkg, dko {
   @Override
   default long am() {
      return this.C_().d();
   }

   long I_();

   @Override
   default <T> fhk<T> a(iw $$0, T $$1, int $$2, fho $$3) {
      return new fhk<>($$1, $$0, this.C_().c() + (long)$$2, $$3, this.I_());
   }

   @Override
   default <T> fhk<T> a(iw $$0, T $$1, int $$2) {
      return new fhk<>($$1, $$0, this.C_().c() + (long)$$2, this.I_());
   }

   ezt C_();

   bur d_(iw var1);

   @Nullable
   MinecraftServer p();

   default buq an() {
      return this.C_().q();
   }

   edh S();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.S().b($$0, $$1);
   }

   azz G_();

   default void a(iw $$0, dne $$1) {
   }

   default void a(jc $$0, iw $$1, iw $$2, ebg $$3, int $$4, int $$5) {
      eyx.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable bwv $$0, iw $$1, awq $$2, aws $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable bwv var1, iw var2, awq var3, aws var4, float var5, float var6);

   void a(lx var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable bwv var1, int var2, iw var3, int var4);

   default void c(int $$0, iw $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(jg<egg> var1, ffs var2, egg.a var3);

   default void a(@Nullable bwv $$0, jg<egg> $$1, ffs $$2) {
      this.a($$1, $$2, new egg.a($$0, null));
   }

   default void a(@Nullable bwv $$0, jg<egg> $$1, iw $$2) {
      this.a($$1, $$2, new egg.a($$0, null));
   }

   default void a(jg<egg> $$0, iw $$1, egg.a $$2) {
      this.a($$0, ffs.b($$1), $$2);
   }

   default void a(alj<egg> $$0, iw $$1, egg.a $$2) {
      this.a(this.J_().f(mi.H).b($$0), $$1, $$2);
   }
}
