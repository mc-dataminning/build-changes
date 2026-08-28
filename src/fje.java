import com.mojang.blaze3d.platform.GlConst;
import com.mojang.blaze3d.platform.GlStateManager;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntIterator;
import javax.annotation.Nullable;

public class fje extends flj {
   protected final int a;
   private final Int2IntMap i = new Int2IntOpenHashMap();
   protected boolean b;
   protected boolean c = true;

   protected fje(String $$0, flk $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a = $$5;
   }

   @Override
   public void close() {
      if (!this.b) {
         this.b = true;
         GlStateManager._deleteTexture(this.a);
         IntIterator var1 = this.i.values().iterator();

         while (var1.hasNext()) {
            int $$0 = (Integer)var1.next();
            GlStateManager._glDeleteFramebuffers($$0);
         }
      }
   }

   public int a(fji $$0, @Nullable flj $$1) {
      int $$2 = $$1 == null ? 0 : ((fje)$$1).a;
      return this.i.computeIfAbsent($$2, $$2x -> {
         int $$3 = $$0.a();
         $$0.a($$3, this.a, $$2, 0, false);
         return $$3;
      });
   }

   public void a() {
      if (this.c) {
         GlStateManager._texParameter(3553, 10242, GlConst.toGl(this.d));
         GlStateManager._texParameter(3553, 10243, GlConst.toGl(this.e));
         switch (this.f) {
            case a:
               GlStateManager._texParameter(3553, 10241, this.h ? 9986 : 9728);
               break;
            case b:
               GlStateManager._texParameter(3553, 10241, this.h ? 9987 : 9729);
         }

         switch (this.g) {
            case a:
               GlStateManager._texParameter(3553, 10240, 9728);
               break;
            case b:
               GlStateManager._texParameter(3553, 10240, 9729);
         }

         this.c = false;
      }
   }

   public int b() {
      return this.a;
   }

   @Override
   public void a(flh $$0, flh $$1) {
      super.a($$0, $$1);
      this.c = true;
   }

   @Override
   public void a(fli $$0, fli $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      this.c = true;
   }
}
