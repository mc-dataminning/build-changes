import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eui(eul b, eul c) implements eul {
   public static final MapCodec<eui> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eum.a.fieldOf("n").forGetter(eui::c), eum.a.fieldOf("p").forGetter(eui::d)).apply($$0, eui::new)
   );

   @Override
   public euk b() {
      return eum.d;
   }

   @Override
   public int a(eqg $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      azf $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(eqg $$0) {
      return (float)this.a($$0);
   }

   public static eui a(int $$0, float $$1) {
      return new eui(euj.a((float)$$0), euj.a($$1));
   }

   @Override
   public Set<esz<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public eul c() {
      return this.b;
   }

   public eul d() {
      return this.c;
   }
}
