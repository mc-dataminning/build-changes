import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface cmn extends cly, cmt {
   @Override
   default long ah() {
      return this.u_().f();
   }

   long A_();

   efp<cpn> L();

   private <T> eft<T> a(gu $$0, T $$1, int $$2, efx $$3) {
      return new eft<>($$1, $$0, this.u_().e() + (long)$$2, $$3, this.A_());
   }

   private <T> eft<T> a(gu $$0, T $$1, int $$2) {
      return new eft<>($$1, $$0, this.u_().e() + (long)$$2, this.A_());
   }

   default void a(gu $$0, cpn $$1, int $$2, efx $$3) {
      this.L().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(gu $$0, cpn $$1, int $$2) {
      this.L().a(this.a($$0, $$1, $$2));
   }

   efp<dxd> K();

   default void a(gu $$0, dxd $$1, int $$2, efx $$3) {
      this.K().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(gu $$0, dxd $$1, int $$2) {
      this.K().a(this.a($$0, $$1, $$2));
   }

   dyv u_();

   bdv d_(gu var1);

   @Nullable
   MinecraftServer n();

   default bdu ai() {
      return this.u_().s();
   }

   deb J();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.J().b($$0, $$1);
   }

   apf y_();

   default void b(gu $$0, cpn $$1) {
   }

   default void a(ha $$0, dcb $$1, gu $$2, gu $$3, int $$4, int $$5) {
      dyg.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable byo $$0, gu $$1, amg $$2, ami $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable byo var1, gu var2, amg var3, ami var4, float var5, float var6);

   void a(it var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable byo var1, int var2, gu var3, int var4);

   default void c(int $$0, gu $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(dgl var1, eei var2, dgl.a var3);

   default void a(@Nullable bfj $$0, dgl $$1, eei $$2) {
      this.a($$1, $$2, new dgl.a($$0, null));
   }

   default void a(@Nullable bfj $$0, dgl $$1, gu $$2) {
      this.a($$1, $$2, new dgl.a($$0, null));
   }

   default void a(dgl $$0, gu $$1, dgl.a $$2) {
      this.a($$0, eei.b($$1), $$2);
   }
}
