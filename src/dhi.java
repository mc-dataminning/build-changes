import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public interface dhi extends dgs, dho, dhw {
   @Override
   default long ak() {
      return this.D_().d();
   }

   long J_();

   @Override
   default <T> fdp<T> a(jh $$0, T $$1, int $$2, fdt $$3) {
      return new fdp<>($$1, $$0, this.D_().c() + (long)$$2, $$3, this.J_());
   }

   @Override
   default <T> fdp<T> a(jh $$0, T $$1, int $$2) {
      return new fdp<>($$1, $$0, this.D_().c() + (long)$$2, this.J_());
   }

   evy D_();

   btg d_(jh var1);

   @Nullable
   MinecraftServer p();

   default btf al() {
      return this.D_().q();
   }

   dzt R();

   @Override
   default boolean b(int $$0, int $$1) {
      return this.R().b($$0, $$1);
   }

   bam H_();

   default void b(jh $$0, dkl $$1) {
   }

   default void a(jm $$0, jh $$1, jh $$2, dxu $$3, int $$4, int $$5) {
      evd.a(this, $$0, $$1, $$2, $$3, $$4, $$5 - 1);
   }

   default void a(@Nullable cpw $$0, jh $$1, axe $$2, axg $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F);
   }

   void a(@Nullable cpw var1, jh var2, axe var3, axg var4, float var5, float var6);

   void a(lq var1, double var2, double var4, double var6, double var8, double var10, double var12);

   void a(@Nullable cpw var1, int var2, jh var3, int var4);

   default void c(int $$0, jh $$1, int $$2) {
      this.a(null, $$0, $$1, $$2);
   }

   void a(jq<ecq> var1, fbx var2, ecq.a var3);

   default void a(@Nullable bvj $$0, jq<ecq> $$1, fbx $$2) {
      this.a($$1, $$2, new ecq.a($$0, null));
   }

   default void a(@Nullable bvj $$0, jq<ecq> $$1, jh $$2) {
      this.a($$1, $$2, new ecq.a($$0, null));
   }

   default void a(jq<ecq> $$0, jh $$1, ecq.a $$2) {
      this.a($$0, fbx.b($$1), $$2);
   }

   default void a(aly<ecq> $$0, jh $$1, ecq.a $$2) {
      this.a(this.K_().e(mb.G).b($$0), $$1, $$2);
   }
}
