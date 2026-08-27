import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface day extends daj, dbe {
   @Override
   default long aj() {
      return this.A_().d();
   }

   long G_();

   evx<ddy> O();

   private <T> ewb<T> a(io $$0, T $$1, int $$2, ewf $$3) {
      return new ewb<>($$1, $$0, this.A_().c() + (long)$$2, $$3, this.G_());
   }

   private <T> ewb<T> a(io $$0, T $$1, int $$2) {
      return new ewb<>($$1, $$0, this.A_().c() + (long)$$2, this.G_());
   }

   default void a(io $$0, ddy $$1, int $$2, ewf $$3) {
      this.O().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(io $$0, ddy $$1, int $$2) {
      this.O().a(this.a($$0, $$1, $$2));
   }

   evx<emt> N();

   default void a(io $$0, emt $$1, int $$2, ewf $$3) {
      this.N().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(io $$0, emt $$1, int $$2) {
      this.N().a(this.a($$0, $$1, $$2));
   }

   eor A_();

   bps d_(io var1);

   @Nullable
   MinecraftServer o();

   default bpr ak() {
      return this.A_().q();
   }

   dtb M();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.M().b($$0, $$1);
   }

   ayk E_();

   default void b(io $$0, ddy $$1) {
   }

   default void a(it $$0, drb $$1, io $$2, io $$3, int $$4, int $$5) {
      eny.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable clw $$0, io $$1, avg $$2, avi $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable clw var1, io var2, avg var3, avi var4, float var5, float var6);

   void a(kw var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable clw var1, int var2, io var3, int var4);

   default void c(int $$0, io $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(ix<dvu> var1, euk var2, dvu.a var3);

   default void a(@Nullable bru $$0, ix<dvu> $$1, euk $$2) {
      this.a($$1, $$2, new dvu.a($$0, null));
   }

   default void a(@Nullable bru $$0, ix<dvu> $$1, io $$2) {
      this.a($$1, $$2, new dvu.a($$0, null));
   }

   default void a(ix<dvu> $$0, io $$1, dvu.a $$2) {
      this.a($$0, euk.b($$1), $$2);
   }

   default void a(akl<dvu> $$0, io $$1, dvu.a $$2) {
      this.a(this.H_().d(lf.C).g($$0), $$1, $$2);
   }
}
