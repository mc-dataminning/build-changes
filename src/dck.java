import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dck(axv<bvm> c) {
   public static final Codec<dck> a = RecordCodecBuilder.create($$0 -> $$0.group(axv.b(mi.aN).fieldOf("types").forGetter(dck::a)).apply($$0, dck::new));
   public static final za<wn, dck> b = za.a(axv.c(mi.aN), dck::a, dck::new);

   public boolean a(bvk $$0) {
      return $$0.a(this.c);
   }

   public axv<bvm> a() {
      return this.c;
   }
}
