import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ctu(jj<ern> c) implements ctq {
   public static final MapCodec<ctu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ju.a(mh.be).fieldOf("structures").forGetter(ctu::b)).apply($$0, ctu::new));

   public boolean a(cts $$0) {
      return $$0.b().a().b().a($$0.a(), this.c).b();
   }

   @Override
   public MapCodec<ctu> a() {
      return a;
   }

   public jj<ern> b() {
      return this.c;
   }
}
