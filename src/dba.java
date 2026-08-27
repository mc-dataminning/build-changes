import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface dba extends dal, dbg {
   @Override
   default long aj() {
      return this.A_().d();
   }

   long G_();

   evz<dea> O();

   private <T> ewd<T> a(io $$0, T $$1, int $$2, ewh $$3) {
      return new ewd<>($$1, $$0, this.A_().c() + (long)$$2, $$3, this.G_());
   }

   private <T> ewd<T> a(io $$0, T $$1, int $$2) {
      return new ewd<>($$1, $$0, this.A_().c() + (long)$$2, this.G_());
   }

   default void a(io $$0, dea $$1, int $$2, ewh $$3) {
      this.O().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(io $$0, dea $$1, int $$2) {
      this.O().a(this.a($$0, $$1, $$2));
   }

   evz<emv> N();

   default void a(io $$0, emv $$1, int $$2, ewh $$3) {
      this.N().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(io $$0, emv $$1, int $$2) {
      this.N().a(this.a($$0, $$1, $$2));
   }

   eot A_();

   bpu d_(io var1);

   @Nullable
   MinecraftServer o();

   default bpt ak() {
      return this.A_().q();
   }

   dtd M();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.M().b($$0, $$1);
   }

   aym E_();

   default void b(io $$0, dea $$1) {
   }

   default void a(it $$0, drd $$1, io $$2, io $$3, int $$4, int $$5) {
      eoa.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable cly $$0, io $$1, avh $$2, avj $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable cly var1, io var2, avh var3, avj var4, float var5, float var6);

   void a(kw var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable cly var1, int var2, io var3, int var4);

   default void c(int $$0, io $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(ix<dvw> var1, eum var2, dvw.a var3);

   default void a(@Nullable brw $$0, ix<dvw> $$1, eum $$2) {
      this.a($$1, $$2, new dvw.a($$0, null));
   }

   default void a(@Nullable brw $$0, ix<dvw> $$1, io $$2) {
      this.a($$1, $$2, new dvw.a($$0, null));
   }

   default void a(ix<dvw> $$0, io $$1, dvw.a $$2) {
      this.a($$0, eum.b($$1), $$2);
   }

   default void a(akm<dvw> $$0, io $$1, dvw.a $$2) {
      this.a(this.H_().d(lf.C).g($$0), $$1, $$2);
   }
}
