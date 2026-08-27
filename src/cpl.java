import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cpl extends cow, cpr {
   @Override
   default long ah() {
      return this.u_().f();
   }

   long A_();

   ein<csk> L();

   private <T> eir<T> a(gv $$0, T $$1, int $$2, eiv $$3) {
      return new eir<>($$1, $$0, this.u_().e() + (long)$$2, $$3, this.A_());
   }

   private <T> eir<T> a(gv $$0, T $$1, int $$2) {
      return new eir<>($$1, $$0, this.u_().e() + (long)$$2, this.A_());
   }

   default void a(gv $$0, csk $$1, int $$2, eiv $$3) {
      this.L().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(gv $$0, csk $$1, int $$2) {
      this.L().a(this.a($$0, $$1, $$2));
   }

   ein<eaa> K();

   default void a(gv $$0, eaa $$1, int $$2, eiv $$3) {
      this.K().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(gv $$0, eaa $$1, int $$2) {
      this.K().a(this.a($$0, $$1, $$2));
   }

   ebs u_();

   bgm d_(gv var1);

   @Nullable
   MinecraftServer n();

   default bgl ai() {
      return this.u_().s();
   }

   dgy J();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.J().b($$0, $$1);
   }

   art y_();

   default void b(gv $$0, csk $$1) {
   }

   default void a(hb $$0, dey $$1, gv $$2, gv $$3, int $$4, int $$5) {
      ebd.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable cbl $$0, gv $$1, aot $$2, aov $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable cbl var1, gv var2, aot var3, aov var4, float var5, float var6);

   void a(iu var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable cbl var1, int var2, gv var3, int var4);

   default void c(int $$0, gv $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(dji var1, ehf var2, dji.a var3);

   default void a(@Nullable big $$0, dji $$1, ehf $$2) {
      this.a($$1, $$2, new dji.a($$0, null));
   }

   default void a(@Nullable big $$0, dji $$1, gv $$2) {
      this.a($$1, $$2, new dji.a($$0, null));
   }

   default void a(dji $$0, gv $$1, dji.a $$2) {
      this.a($$0, ehf.b($$1), $$2);
   }
}
