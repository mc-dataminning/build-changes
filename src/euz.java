import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record euz(evd b, evd c) implements evd {
   public static final MapCodec<euz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eve.a.fieldOf("n").forGetter(euz::c), eve.a.fieldOf("p").forGetter(euz::d)).apply($$0, euz::new)
   );

   @Override
   public evc b() {
      return eve.d;
   }

   @Override
   public int a(eqw $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      ayo $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(eqw $$0) {
      return (float)this.a($$0);
   }

   public static euz a(int $$0, float $$1) {
      return new euz(eva.a((float)$$0), eva.a($$1));
   }

   @Override
   public Set<etp<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public evd c() {
      return this.b;
   }

   public evd d() {
      return this.c;
   }
}
