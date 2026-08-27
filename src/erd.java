import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record erd(erg b, erg c) implements erg {
   public static final Codec<erd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(erh.a.fieldOf("n").forGetter(erd::c), erh.a.fieldOf("p").forGetter(erd::d)).apply($$0, erd::new)
   );

   @Override
   public erf b() {
      return erh.d;
   }

   @Override
   public int a(enk $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      axt $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(enk $$0) {
      return (float)this.a($$0);
   }

   public static erd a(int $$0, float $$1) {
      return new erd(ere.a((float)$$0), ere.a($$1));
   }

   @Override
   public Set<epu<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public erg c() {
      return this.b;
   }

   public erg d() {
      return this.c;
   }
}
