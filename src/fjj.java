import com.mojang.blaze3d.pipeline.CompiledRenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline;

public record fjj(RenderPipeline a, fjh b) implements CompiledRenderPipeline {
   @Override
   public boolean containsUniform(String $$0) {
      return this.b.a($$0) != null;
   }

   @Override
   public boolean isValid() {
      return this.b != fjh.b;
   }
}
