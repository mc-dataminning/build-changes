import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ezq(ezu b, ezu c) implements ezu {
   public static final MapCodec<ezq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ezv.a.fieldOf("n").forGetter(ezq::c), ezv.a.fieldOf("p").forGetter(ezq::d)).apply($$0, ezq::new)
   );

   @Override
   public ezt b() {
      return ezv.d;
   }

   @Override
   public int a(evp $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      azg $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(evp $$0) {
      return (float)this.a($$0);
   }

   public static ezq a(int $$0, float $$1) {
      return new ezq(ezr.a((float)$$0), ezr.a($$1));
   }

   @Override
   public Set<bah<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public ezu c() {
      return this.b;
   }

   public ezu d() {
      return this.c;
   }
}
