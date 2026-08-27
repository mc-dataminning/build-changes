import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface csz extends csk, ctf {
   @Override
   default long ai() {
      return this.B_().f();
   }

   long H_();

   emj<cvz> M();

   private <T> emn<T> a(hv $$0, T $$1, int $$2, emr $$3) {
      return new emn<>($$1, $$0, this.B_().e() + (long)$$2, $$3, this.H_());
   }

   private <T> emn<T> a(hv $$0, T $$1, int $$2) {
      return new emn<>($$1, $$0, this.B_().e() + (long)$$2, this.H_());
   }

   default void a(hv $$0, cvz $$1, int $$2, emr $$3) {
      this.M().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(hv $$0, cvz $$1, int $$2) {
      this.M().a(this.a($$0, $$1, $$2));
   }

   emj<edy> L();

   default void a(hv $$0, edy $$1, int $$2, emr $$3) {
      this.L().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(hv $$0, edy $$1, int $$2) {
      this.L().a(this.a($$0, $$1, $$2));
   }

   efq B_();

   bjj d_(hv var1);

   @Nullable
   MinecraftServer n();

   default bji aj() {
      return this.B_().s();
   }

   dkp K();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.K().b($$0, $$1);
   }

   auf F_();

   default void b(hv $$0, cvz $$1) {
   }

   default void a(ia $$0, dip $$1, hv $$2, hv $$3, int $$4, int $$5) {
      efb.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable cer $$0, hv $$1, arb $$2, ard $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable cer var1, hv var2, arb var3, ard var4, float var5, float var6);

   void a(jt var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable cer var1, int var2, hv var3, int var4);

   default void c(int $$0, hv $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(dmz var1, elb var2, dmz.a var3);

   default void a(@Nullable blf $$0, dmz $$1, elb $$2) {
      this.a($$1, $$2, new dmz.a($$0, null));
   }

   default void a(@Nullable blf $$0, dmz $$1, hv $$2) {
      this.a($$1, $$2, new dmz.a($$0, null));
   }

   default void a(dmz $$0, hv $$1, dmz.a $$2) {
      this.a($$0, elb.b($$1), $$2);
   }
}
