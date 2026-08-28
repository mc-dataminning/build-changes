import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ezs(ezw b, ezw c) implements ezw {
   public static final MapCodec<ezs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ezx.a.fieldOf("n").forGetter(ezs::c), ezx.a.fieldOf("p").forGetter(ezs::d)).apply($$0, ezs::new)
   );

   @Override
   public ezv b() {
      return ezx.d;
   }

   @Override
   public int a(evr $$0) {
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
   public float b(evr $$0) {
      return (float)this.a($$0);
   }

   public static ezs a(int $$0, float $$1) {
      return new ezs(ezt.a((float)$$0), ezt.a($$1));
   }

   @Override
   public Set<bai<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public ezw c() {
      return this.b;
   }

   public ezw d() {
      return this.c;
   }
}
