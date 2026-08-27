import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record etm(eti b, eti c) implements eti {
   public static final MapCodec<etm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(etj.a.fieldOf("min").forGetter(etm::c), etj.a.fieldOf("max").forGetter(etm::d)).apply($$0, etm::new)
   );

   @Override
   public eth b() {
      return etj.c;
   }

   public static etm a(float $$0, float $$1) {
      return new etm(etg.a($$0), etg.a($$1));
   }

   @Override
   public int a(eph $$0) {
      return ayf.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(eph $$0) {
      return ayf.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<erw<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public eti c() {
      return this.b;
   }

   public eti d() {
      return this.c;
   }
}
