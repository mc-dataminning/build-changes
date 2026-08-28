import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.ScissorState;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public class fji implements RenderPass {
   protected static final int a = 1;
   public static final boolean b = ac.aV;
   private final fjd l;
   private final boolean m;
   private boolean n;
   @Nullable
   protected fjj c;
   protected final GpuBuffer[] d = new GpuBuffer[1];
   @Nullable
   protected GpuBuffer e;
   protected VertexFormat.a f = VertexFormat.a.b;
   protected final ScissorState g = new ScissorState();
   protected final HashMap<String, Object> h = new HashMap<>();
   protected final HashMap<String, GpuTexture> i = new HashMap<>();
   protected final Set<String> j = new HashSet<>();
   protected final Set<String> k = new HashSet<>();

   public fji(fjd $$0, boolean $$1) {
      this.l = $$0;
      this.m = $$1;
   }

   public boolean a() {
      return this.m;
   }

   @Override
   public void setPipeline(RenderPipeline $$0) {
      if (this.c == null || this.c.a() != $$0) {
         this.j.addAll(this.h.keySet());
         this.k.addAll(this.i.keySet());
      }

      this.c = this.l.b().a($$0);
   }

   @Override
   public void bindSampler(String $$0, GpuTexture $$1) {
      this.i.put($$0, $$1);
      this.k.add($$0);
   }

   @Override
   public void setUniform(String $$0, int... $$1) {
      this.h.put($$0, $$1);
      this.j.add($$0);
   }

   @Override
   public void setUniform(String $$0, float... $$1) {
      this.h.put($$0, $$1);
      this.j.add($$0);
   }

   @Override
   public void setUniform(String $$0, Matrix4f $$1) {
      this.h.put($$0, $$1.get(new float[16]));
      this.j.add($$0);
   }

   @Override
   public void enableScissor(ScissorState $$0) {
      this.g.copyFrom($$0);
   }

   @Override
   public void enableScissor(int $$0, int $$1, int $$2, int $$3) {
      this.g.enable($$0, $$1, $$2, $$3);
   }

   @Override
   public void disableScissor() {
      this.g.disable();
   }

   @Override
   public void setVertexBuffer(int $$0, GpuBuffer $$1) {
      if ($$0 >= 0 && $$0 < 1) {
         this.d[$$0] = $$1;
      } else {
         throw new IllegalArgumentException("Vertex buffer slot is out of range: " + $$0);
      }
   }

   @Override
   public void setIndexBuffer(@Nullable GpuBuffer $$0, VertexFormat.a $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public void drawIndexed(int $$0, int $$1) {
      if (this.n) {
         throw new IllegalStateException("Can't use a closed render pass");
      } else {
         this.l.a(this, $$0, $$1, this.f);
      }
   }

   @Override
   public void drawMultipleIndexed(Collection<RenderPass.a> $$0, @Nullable GpuBuffer $$1, @Nullable VertexFormat.a $$2) {
      if (this.n) {
         throw new IllegalStateException("Can't use a closed render pass");
      } else {
         this.l.a(this, $$0, $$1, $$2);
      }
   }

   @Override
   public void draw(int $$0, int $$1) {
      if (this.n) {
         throw new IllegalStateException("Can't use a closed render pass");
      } else {
         this.l.a(this, $$0, $$1, null);
      }
   }

   @Override
   public void close() {
      if (!this.n) {
         this.n = true;
         this.l.a();
      }
   }
}
