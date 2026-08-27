import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface dcb extends dbm, dch {
   @Override
   default long ak() {
      return this.B_().d();
   }

   long H_();

   eyh<dfc> P();

   private <T> eyl<T> a(ir $$0, T $$1, int $$2, eyp $$3) {
      return new eyl<>($$1, $$0, this.B_().c() + (long)$$2, $$3, this.H_());
   }

   private <T> eyl<T> a(ir $$0, T $$1, int $$2) {
      return new eyl<>($$1, $$0, this.B_().c() + (long)$$2, this.H_());
   }

   default void a(ir $$0, dfc $$1, int $$2, eyp $$3) {
      this.P().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(ir $$0, dfc $$1, int $$2) {
      this.P().a(this.a($$0, $$1, $$2));
   }

   eyh<epd> O();

   default void a(ir $$0, epd $$1, int $$2, eyp $$3) {
      this.O().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(ir $$0, epd $$1, int $$2) {
      this.O().a(this.a($$0, $$1, $$2));
   }

   erb B_();

   bpy d_(ir var1);

   @Nullable
   MinecraftServer o();

   default bpx al() {
      return this.B_().q();
   }

   dvc N();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.N().b($$0, $$1);
   }

   ayt F_();

   default void b(ir $$0, dfc $$1) {
   }

   default void a(iw $$0, dtc $$1, ir $$2, ir $$3, int $$4, int $$5) {
      eqi.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable cly $$0, ir $$1, avn $$2, avq $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable cly var1, ir var2, avn var3, avq var4, float var5, float var6);

   void a(kz var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable cly var1, int var2, ir var3, int var4);

   default void c(int $$0, ir $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(ja<dxv> var1, ewu var2, dxv.a var3);

   default void a(@Nullable brv $$0, ja<dxv> $$1, ewu $$2) {
      this.a($$1, $$2, new dxv.a($$0, null));
   }

   default void a(@Nullable brv $$0, ja<dxv> $$1, ir $$2) {
      this.a($$1, $$2, new dxv.a($$0, null));
   }

   default void a(ja<dxv> $$0, ir $$1, dxv.a $$2) {
      this.a($$0, ewu.b($$1), $$2);
   }

   default void a(aks<dxv> $$0, ir $$1, dxv.a $$2) {
      this.a(this.I_().d(li.C).g($$0), $$1, $$2);
   }
}
