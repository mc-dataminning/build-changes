import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fay(fau b, fau c) implements fau {
   public static final MapCodec<fay> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fav.a.fieldOf("min").forGetter(fay::c), fav.a.fieldOf("max").forGetter(fay::d)).apply($$0, fay::new)
   );

   @Override
   public fat b() {
      return fav.c;
   }

   public static fay a(float $$0, float $$1) {
      return new fay(far.a($$0), far.a($$1));
   }

   @Override
   public int a(ewp $$0) {
      return bae.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(ewp $$0) {
      return bae.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<bbn<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public fau c() {
      return this.b;
   }

   public fau d() {
      return this.c;
   }
}
