import com.mojang.blaze3d.opengl.GlConst;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.TextureFormat;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntIterator;
import javax.annotation.Nullable;

public class fjl extends GpuTexture {
   protected final int a;
   private final Int2IntMap d = new Int2IntOpenHashMap();
   protected boolean b;
   protected boolean c = true;

   protected fjl(String $$0, TextureFormat $$1, int $$2, int $$3, int $$4, int $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a = $$5;
   }

   @Override
   public void close() {
      if (!this.b) {
         this.b = true;
         GlStateManager._deleteTexture(this.a);
         IntIterator var1 = this.d.values().iterator();

         while (var1.hasNext()) {
            int $$0 = (Integer)var1.next();
            GlStateManager._glDeleteFramebuffers($$0);
         }
      }
   }

   @Override
   public boolean isClosed() {
      return this.b;
   }

   public int a(fjb $$0, @Nullable GpuTexture $$1) {
      int $$2 = $$1 == null ? 0 : ((fjl)$$1).a;
      return this.d.computeIfAbsent($$2, $$2x -> {
         int $$3 = $$0.a();
         $$0.a($$3, this.a, $$2, 0, 0);
         return $$3;
      });
   }

   public void a() {
      if (this.c) {
         GlStateManager._texParameter(3553, 10242, GlConst.toGl(this.addressModeU));
         GlStateManager._texParameter(3553, 10243, GlConst.toGl(this.addressModeV));
         switch (this.minFilter) {
            case NEAREST:
               GlStateManager._texParameter(3553, 10241, this.useMipmaps ? 9986 : 9728);
               break;
            case LINEAR:
               GlStateManager._texParameter(3553, 10241, this.useMipmaps ? 9987 : 9729);
         }

         switch (this.magFilter) {
            case NEAREST:
               GlStateManager._texParameter(3553, 10240, 9728);
               break;
            case LINEAR:
               GlStateManager._texParameter(3553, 10240, 9729);
         }

         this.c = false;
      }
   }

   public int b() {
      return this.a;
   }

   @Override
   public void setAddressMode(AddressMode $$0, AddressMode $$1) {
      super.setAddressMode($$0, $$1);
      this.c = true;
   }

   @Override
   public void setTextureFilter(FilterMode $$0, FilterMode $$1, boolean $$2) {
      super.setTextureFilter($$0, $$1, $$2);
      this.c = true;
   }
}
