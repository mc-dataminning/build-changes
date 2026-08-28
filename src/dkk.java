import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface dkk extends dju, dkq, dky {
   @Override
   default long am() {
      return this.C_().d();
   }

   long I_();

   @Override
   default <T> fhu<T> a(iw $$0, T $$1, int $$2, fhy $$3) {
      return new fhu<>($$1, $$0, this.C_().c() + (long)$$2, $$3, this.I_());
   }

   @Override
   default <T> fhu<T> a(iw $$0, T $$1, int $$2) {
      return new fhu<>($$1, $$0, this.C_().c() + (long)$$2, this.I_());
   }

   fad C_();

   bva d_(iw var1);

   @Nullable
   MinecraftServer p();

   default buz an() {
      return this.C_().q();
   }

   edr S();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.S().b($$0, $$1);
   }

   bai G_();

   default void a(iw $$0, dno $$1) {
   }

   default void a(jc $$0, iw $$1, iw $$2, ebq $$3, int $$4, int $$5) {
      ezh.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable bxe $$0, iw $$1, awx $$2, awz $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable bxe var1, iw var2, awx var3, awz var4, float var5, float var6);

   void a(lx var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable bxe var1, int var2, iw var3, int var4);

   default void c(int $$0, iw $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(jg<egq> var1, fgc var2, egq.a var3);

   default void a(@Nullable bxe $$0, jg<egq> $$1, fgc $$2) {
      this.a($$1, $$2, new egq.a($$0, null));
   }

   default void a(@Nullable bxe $$0, jg<egq> $$1, iw $$2) {
      this.a($$1, $$2, new egq.a($$0, null));
   }

   default void a(jg<egq> $$0, iw $$1, egq.a $$2) {
      this.a($$0, fgc.b($$1), $$2);
   }

   default void a(alq<egq> $$0, iw $$1, egq.a $$2) {
      this.a(this.J_().f(mi.H).b($$0), $$1, $$2);
   }
}
