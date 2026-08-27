import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface ctj extends csu, ctp {
   @Override
   default long aj() {
      return this.B_().f();
   }

   long H_();

   emz<cwj> N();

   private <T> end<T> a(hx $$0, T $$1, int $$2, enh $$3) {
      return new end<>($$1, $$0, this.B_().e() + (long)$$2, $$3, this.H_());
   }

   private <T> end<T> a(hx $$0, T $$1, int $$2) {
      return new end<>($$1, $$0, this.B_().e() + (long)$$2, this.H_());
   }

   default void a(hx $$0, cwj $$1, int $$2, enh $$3) {
      this.N().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(hx $$0, cwj $$1, int $$2) {
      this.N().a(this.a($$0, $$1, $$2));
   }

   emz<eej> M();

   default void a(hx $$0, eej $$1, int $$2, enh $$3) {
      this.M().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(hx $$0, eej $$1, int $$2) {
      this.M().a(this.a($$0, $$1, $$2));
   }

   egb B_();

   bjt d_(hx var1);

   @Nullable
   MinecraftServer o();

   default bjs ak() {
      return this.B_().s();
   }

   dla L();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.L().b($$0, $$1);
   }

   aup F_();

   default void b(hx $$0, cwj $$1) {
   }

   default void a(ic $$0, dja $$1, hx $$2, hx $$3, int $$4, int $$5) {
      efm.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable cfb $$0, hx $$1, arl $$2, arn $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable cfb var1, hx var2, arl var3, arn var4, float var5, float var6);

   void a(jv var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable cfb var1, int var2, hx var3, int var4);

   default void c(int $$0, hx $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(dnk var1, elm var2, dnk.a var3);

   default void a(@Nullable blp $$0, dnk $$1, elm $$2) {
      this.a($$1, $$2, new dnk.a($$0, null));
   }

   default void a(@Nullable blp $$0, dnk $$1, hx $$2) {
      this.a($$1, $$2, new dnk.a($$0, null));
   }

   default void a(dnk $$0, hx $$1, dnk.a $$2) {
      this.a($$0, elm.b($$1), $$2);
   }
}
