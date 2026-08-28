import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cuq(jk<esn> c) implements cum {
   public static final MapCodec<cuq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(jv.a(mi.be).fieldOf("structures").forGetter(cuq::b)).apply($$0, cuq::new));

   public boolean a(cuo $$0) {
      return $$0.b().a().b().a($$0.a(), this.c).b();
   }

   @Override
   public MapCodec<cuq> a() {
      return a;
   }

   public jk<esn> b() {
      return this.c;
   }
}
