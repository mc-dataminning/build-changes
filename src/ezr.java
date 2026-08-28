import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ezr(ezv b, ezv c) implements ezv {
   public static final MapCodec<ezr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ezw.a.fieldOf("n").forGetter(ezr::c), ezw.a.fieldOf("p").forGetter(ezr::d)).apply($$0, ezr::new)
   );

   @Override
   public ezu b() {
      return ezw.d;
   }

   @Override
   public int a(evq $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      azh $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(evq $$0) {
      return (float)this.a($$0);
   }

   public static ezr a(int $$0, float $$1) {
      return new ezr(ezs.a((float)$$0), ezs.a($$1));
   }

   @Override
   public Set<bai<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public ezv c() {
      return this.b;
   }

   public ezv d() {
      return this.c;
   }
}
