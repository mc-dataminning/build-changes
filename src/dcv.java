import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface dcv extends dcg, ddb {
   @Override
   default long ak() {
      return this.A_().d();
   }

   long G_();

   eyj<dfw> P();

   private <T> eyn<T> a(jd $$0, T $$1, int $$2, eyr $$3) {
      return new eyn<>($$1, $$0, this.A_().c() + (long)$$2, $$3, this.G_());
   }

   private <T> eyn<T> a(jd $$0, T $$1, int $$2) {
      return new eyn<>($$1, $$0, this.A_().c() + (long)$$2, this.G_());
   }

   default void a(jd $$0, dfw $$1, int $$2, eyr $$3) {
      this.P().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(jd $$0, dfw $$1, int $$2) {
      this.P().a(this.a($$0, $$1, $$2));
   }

   eyj<eox> O();

   default void a(jd $$0, eox $$1, int $$2, eyr $$3) {
      this.O().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(jd $$0, eox $$1, int $$2) {
      this.O().a(this.a($$0, $$1, $$2));
   }

   eqv A_();

   bqo d_(jd var1);

   @Nullable
   MinecraftServer o();

   default bqn al() {
      return this.A_().q();
   }

   dva N();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.N().b($$0, $$1);
   }

   ayv E_();

   default void b(jd $$0, dfw $$1) {
   }

   default void a(ji $$0, dta $$1, jd $$2, jd $$3, int $$4, int $$5) {
      eqc.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable cmv $$0, jd $$1, avn $$2, avp $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable cmv var1, jd var2, avn var3, avp var4, float var5, float var6);

   void a(lk var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable cmv var1, int var2, jd var3, int var4);

   default void c(int $$0, jd $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(jm<dxw> var1, eww var2, dxw.a var3);

   default void a(@Nullable bsq $$0, jm<dxw> $$1, eww $$2) {
      this.a($$1, $$2, new dxw.a($$0, null));
   }

   default void a(@Nullable bsq $$0, jm<dxw> $$1, jd $$2) {
      this.a($$1, $$2, new dxw.a($$0, null));
   }

   default void a(jm<dxw> $$0, jd $$1, dxw.a $$2) {
      this.a($$0, eww.b($$1), $$2);
   }

   default void a(akp<dxw> $$0, jd $$1, dxw.a $$2) {
      this.a(this.H_().d(lu.G).g($$0), $$1, $$2);
   }
}
