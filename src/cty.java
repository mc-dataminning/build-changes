import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cty extends ctj, cue {
   @Override
   default long aj() {
      return this.B_().f();
   }

   long H_();

   enp<cwy> N();

   private <T> ent<T> a(hx $$0, T $$1, int $$2, enx $$3) {
      return new ent<>($$1, $$0, this.B_().e() + (long)$$2, $$3, this.H_());
   }

   private <T> ent<T> a(hx $$0, T $$1, int $$2) {
      return new ent<>($$1, $$0, this.B_().e() + (long)$$2, this.H_());
   }

   default void a(hx $$0, cwy $$1, int $$2, enx $$3) {
      this.N().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(hx $$0, cwy $$1, int $$2) {
      this.N().a(this.a($$0, $$1, $$2));
   }

   enp<eey> M();

   default void a(hx $$0, eey $$1, int $$2, enx $$3) {
      this.M().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(hx $$0, eey $$1, int $$2) {
      this.M().a(this.a($$0, $$1, $$2));
   }

   egr B_();

   bka d_(hx var1);

   @Nullable
   MinecraftServer o();

   default bjz ak() {
      return this.B_().s();
   }

   dlp L();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.L().b($$0, $$1);
   }

   auw F_();

   default void b(hx $$0, cwy $$1) {
   }

   default void a(ic $$0, djp $$1, hx $$2, hx $$3, int $$4, int $$5) {
      egb.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable cfq $$0, hx $$1, ars $$2, aru $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable cfq var1, hx var2, ars var3, aru var4, float var5, float var6);

   void a(jv var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable cfq var1, int var2, hx var3, int var4);

   default void c(int $$0, hx $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(ih<dnz> var1, emc var2, dnz.a var3);

   default void a(@Nullable blw $$0, ih<dnz> $$1, emc $$2) {
      this.a($$1, $$2, new dnz.a($$0, null));
   }

   default void a(@Nullable blw $$0, ih<dnz> $$1, hx $$2) {
      this.a($$1, $$2, new dnz.a($$0, null));
   }

   default void a(ih<dnz> $$0, hx $$1, dnz.a $$2) {
      this.a($$0, emc.b($$1), $$2);
   }

   default void a(ahg<dnz> $$0, hx $$1, dnz.a $$2) {
      this.a(this.I_().d(ke.B).f($$0), $$1, $$2);
   }
}
