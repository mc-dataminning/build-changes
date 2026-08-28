import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record euj(eum b, eum c) implements eum {
   public static final MapCodec<euj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eun.a.fieldOf("n").forGetter(euj::c), eun.a.fieldOf("p").forGetter(euj::d)).apply($$0, euj::new)
   );

   @Override
   public eul b() {
      return eun.d;
   }

   @Override
   public int a(eqh $$0) {
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
   public float b(eqh $$0) {
      return (float)this.a($$0);
   }

   public static euj a(int $$0, float $$1) {
      return new euj(euk.a((float)$$0), euk.a($$1));
   }

   @Override
   public Set<eta<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public eum c() {
      return this.b;
   }

   public eum d() {
      return this.c;
   }
}
