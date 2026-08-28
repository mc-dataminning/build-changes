import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ctr(jj<eri> c) implements ctn {
   public static final MapCodec<ctr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ju.a(mh.be).fieldOf("structures").forGetter(ctr::b)).apply($$0, ctr::new));

   public boolean a(ctp $$0) {
      return $$0.b().a().b().a($$0.a(), this.c).b();
   }

   @Override
   public MapCodec<ctr> a() {
      return a;
   }

   public jj<eri> b() {
      return this.c;
   }
}
