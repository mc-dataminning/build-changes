import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface diq extends dib, diw, dje {
   @Override
   default long am() {
      return this.y_().d();
   }

   long E_();

   @Override
   default <T> ffo<T> a(iu $$0, T $$1, int $$2, ffs $$3) {
      return new ffo<>($$1, $$0, this.y_().c() + (long)$$2, $$3, this.E_());
   }

   @Override
   default <T> ffo<T> a(iu $$0, T $$1, int $$2) {
      return new ffo<>($$1, $$0, this.y_().c() + (long)$$2, this.E_());
   }

   exx y_();

   btw d_(iu var1);

   @Nullable
   MinecraftServer p();

   default btv an() {
      return this.y_().q();
   }

   ebp S();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.S().b($$0, $$1);
   }

   azt C_();

   default void a(iu $$0, dlu $$1) {
   }

   default void a(ja $$0, iu $$1, iu $$2, dzo $$3, int $$4, int $$5) {
      exc.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable bwa $$0, iu $$1, awk $$2, awm $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable bwa var1, iu var2, awk var3, awm var4, float var5, float var6);

   void a(lv var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable bwa var1, int var2, iu var3, int var4);

   default void c(int $$0, iu $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(je<eeo> var1, fdw var2, eeo.a var3);

   default void a(@Nullable bwa $$0, je<eeo> $$1, fdw $$2) {
      this.a($$1, $$2, new eeo.a($$0, null));
   }

   default void a(@Nullable bwa $$0, je<eeo> $$1, iu $$2) {
      this.a($$1, $$2, new eeo.a($$0, null));
   }

   default void a(je<eeo> $$0, iu $$1, eeo.a $$2) {
      this.a($$0, fdw.b($$1), $$2);
   }

   default void a(ald<eeo> $$0, iu $$1, eeo.a $$2) {
      this.a(this.F_().f(mg.H).b($$0), $$1, $$2);
   }
}
