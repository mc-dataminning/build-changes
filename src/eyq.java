import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eyq(eyu b, eyu c) implements eyu {
   public static final MapCodec<eyq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eyv.a.fieldOf("n").forGetter(eyq::c), eyv.a.fieldOf("p").forGetter(eyq::d)).apply($$0, eyq::new)
   );

   @Override
   public eyt b() {
      return eyv.d;
   }

   @Override
   public int a(eun $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      azu $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(eun $$0) {
      return (float)this.a($$0);
   }

   public static eyq a(int $$0, float $$1) {
      return new eyq(eyr.a((float)$$0), eyr.a($$1));
   }

   @Override
   public Set<exg<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public eyu c() {
      return this.b;
   }

   public eyu d() {
      return this.c;
   }
}
