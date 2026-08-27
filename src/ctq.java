import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface ctq extends ctb, ctw {
   @Override
   default long aj() {
      return this.B_().f();
   }

   long H_();

   eng<cwq> N();

   private <T> enk<T> a(hx $$0, T $$1, int $$2, eno $$3) {
      return new enk<>($$1, $$0, this.B_().e() + (long)$$2, $$3, this.H_());
   }

   private <T> enk<T> a(hx $$0, T $$1, int $$2) {
      return new enk<>($$1, $$0, this.B_().e() + (long)$$2, this.H_());
   }

   default void a(hx $$0, cwq $$1, int $$2, eno $$3) {
      this.N().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(hx $$0, cwq $$1, int $$2) {
      this.N().a(this.a($$0, $$1, $$2));
   }

   eng<eeq> M();

   default void a(hx $$0, eeq $$1, int $$2, eno $$3) {
      this.M().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(hx $$0, eeq $$1, int $$2) {
      this.M().a(this.a($$0, $$1, $$2));
   }

   egi B_();

   bjz d_(hx var1);

   @Nullable
   MinecraftServer o();

   default bjy ak() {
      return this.B_().s();
   }

   dlh L();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.L().b($$0, $$1);
   }

   auv F_();

   default void b(hx $$0, cwq $$1) {
   }

   default void a(ic $$0, djh $$1, hx $$2, hx $$3, int $$4, int $$5) {
      eft.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable cfi $$0, hx $$1, arr $$2, art $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable cfi var1, hx var2, arr var3, art var4, float var5, float var6);

   void a(jv var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable cfi var1, int var2, hx var3, int var4);

   default void c(int $$0, hx $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(dnr var1, elt var2, dnr.a var3);

   default void a(@Nullable blv $$0, dnr $$1, elt $$2) {
      this.a($$1, $$2, new dnr.a($$0, null));
   }

   default void a(@Nullable blv $$0, dnr $$1, hx $$2) {
      this.a($$1, $$2, new dnr.a($$0, null));
   }

   default void a(dnr $$0, hx $$1, dnr.a $$2) {
      this.a($$0, elt.b($$1), $$2);
   }
}
