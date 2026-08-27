import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ekg(ekj b, ekj c) implements ekj {
   public static final Codec<ekg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ekk.a.fieldOf("n").forGetter(ekg::c), ekk.a.fieldOf("p").forGetter(ekg::d)).apply($$0, ekg::new)
   );

   @Override
   public eki b() {
      return ekk.d;
   }

   @Override
   public int a(egp $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      aup $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(egp $$0) {
      return (float)this.a($$0);
   }

   public static ekg a(int $$0, float $$1) {
      return new ekg(ekh.a((float)$$0), ekh.a($$1));
   }

   @Override
   public Set<eix<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public ekj c() {
      return this.b;
   }

   public ekj d() {
      return this.c;
   }
}
