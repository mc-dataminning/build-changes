import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fec(fdy b, fdy c) implements fdy {
   public static final MapCodec<fec> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fdz.a.fieldOf("min").forGetter(fec::c), fdz.a.fieldOf("max").forGetter(fec::d)).apply($$0, fec::new)
   );

   @Override
   public fdx b() {
      return fdz.c;
   }

   public static fec a(float $$0, float $$1) {
      return new fec(fdv.a($$0), fdv.a($$1));
   }

   @Override
   public int a(ezt $$0) {
      return azm.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(ezt $$0) {
      return azm.a($$0.b(), this.b.b($$0), this.c.b($$0));
   }

   @Override
   public Set<bax<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public fdy c() {
      return this.b;
   }

   public fdy d() {
      return this.c;
   }
}
