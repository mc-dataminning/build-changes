import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface czh extends cys, czn {
   @Override
   default long aj() {
      return this.A_().d();
   }

   long G_();

   etw<dch> O();

   private <T> eua<T> a(id $$0, T $$1, int $$2, eue $$3) {
      return new eua<>($$1, $$0, this.A_().c() + (long)$$2, $$3, this.G_());
   }

   private <T> eua<T> a(id $$0, T $$1, int $$2) {
      return new eua<>($$1, $$0, this.A_().c() + (long)$$2, this.G_());
   }

   default void a(id $$0, dch $$1, int $$2, eue $$3) {
      this.O().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(id $$0, dch $$1, int $$2) {
      this.O().a(this.a($$0, $$1, $$2));
   }

   etw<ela> N();

   default void a(id $$0, ela $$1, int $$2, eue $$3) {
      this.N().a(this.a($$0, $$1, $$2, $$3));
   }

   default void a(id $$0, ela $$1, int $$2) {
      this.N().a(this.a($$0, $$1, $$2));
   }

   emw A_();

   bod d_(id var1);

   @Nullable
   MinecraftServer o();

   default boc ak() {
      return this.A_().q();
   }

   dri M();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.M().b($$0, $$1);
   }

   axt E_();

   default void b(id $$0, dch $$1) {
   }

   default void a(ij $$0, dpi $$1, id $$2, id $$3, int $$4, int $$5) {
      emf.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable cka $$0, id $$1, aun $$2, aup $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable cka var1, id var2, aun var3, aup var4, float var5, float var6);

   void a(kl var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable cka var1, int var2, id var3, int var4);

   default void c(int $$0, id $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(in<dub> var1, esj var2, dub.a var3);

   default void a(@Nullable bqa $$0, in<dub> $$1, esj $$2) {
      this.a($$1, $$2, new dub.a($$0, null));
   }

   default void a(@Nullable bqa $$0, in<dub> $$1, id $$2) {
      this.a($$1, $$2, new dub.a($$0, null));
   }

   default void a(in<dub> $$0, id $$1, dub.a $$2) {
      this.a($$0, esj.b($$1), $$2);
   }

   default void a(aju<dub> $$0, id $$1, dub.a $$2) {
      this.a(this.H_().d(ku.C).g($$0), $$1, $$2);
   }
}
