import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record evu(evy b, evy c) implements evy {
   public static final MapCodec<evu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(evz.a.fieldOf("n").forGetter(evu::c), evz.a.fieldOf("p").forGetter(evu::d)).apply($$0, evu::new)
   );

   @Override
   public evx b() {
      return evz.d;
   }

   @Override
   public int a(err $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      ayw $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(err $$0) {
      return (float)this.a($$0);
   }

   public static evu a(int $$0, float $$1) {
      return new evu(evv.a((float)$$0), evv.a($$1));
   }

   @Override
   public Set<euk<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public evy c() {
      return this.b;
   }

   public evy d() {
      return this.c;
   }
}
