import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record euk(eun b, eun c) implements eun {
   public static final MapCodec<euk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(euo.a.fieldOf("n").forGetter(euk::c), euo.a.fieldOf("p").forGetter(euk::d)).apply($$0, euk::new)
   );

   @Override
   public eum b() {
      return euo.d;
   }

   @Override
   public int a(eqi $$0) {
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
   public float b(eqi $$0) {
      return (float)this.a($$0);
   }

   public static euk a(int $$0, float $$1) {
      return new euk(eul.a((float)$$0), eul.a($$1));
   }

   @Override
   public Set<etb<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public eun c() {
      return this.b;
   }

   public eun d() {
      return this.c;
   }
}
