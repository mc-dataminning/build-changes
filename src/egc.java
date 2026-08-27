import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record egc(egf b, egf c) implements egf {
   public static final Codec<egc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(egg.a.fieldOf("n").forGetter(egc::c), egg.a.fieldOf("p").forGetter(egc::d)).apply($$0, egc::new)
   );

   @Override
   public ege b() {
      return egg.d;
   }

   @Override
   public int a(ecl $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      arx $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(ecl $$0) {
      return (float)this.a($$0);
   }

   public static egc a(int $$0, float $$1) {
      return new egc(egd.a((float)$$0), egd.a($$1));
   }

   @Override
   public Set<eet<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public egf c() {
      return this.b;
   }

   public egf d() {
      return this.c;
   }
}
