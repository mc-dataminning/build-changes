import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtj extends dte {
   public static final Codec<dtj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bey.b(dte.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, dtj::new)
   );
   private final bey<dte> b;

   public dtj(bey<dte> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(art $$0, dle $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public dtf<?> a() {
      return dtf.f;
   }
}
