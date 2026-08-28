import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cuf(jj<esb> c) implements cub {
   public static final MapCodec<cuf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ju.a(mh.be).fieldOf("structures").forGetter(cuf::b)).apply($$0, cuf::new));

   public boolean a(cud $$0) {
      return $$0.b().a().b().a($$0.a(), this.c).b();
   }

   @Override
   public MapCodec<cuf> a() {
      return a;
   }

   public jj<esb> b() {
      return this.c;
   }
}
