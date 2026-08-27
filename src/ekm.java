import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ekm(ekp b, ekp c) implements ekp {
   public static final Codec<ekm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ekq.a.fieldOf("n").forGetter(ekm::c), ekq.a.fieldOf("p").forGetter(ekm::d)).apply($$0, ekm::new)
   );

   @Override
   public eko b() {
      return ekq.d;
   }

   @Override
   public int a(egv $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      auu $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(egv $$0) {
      return (float)this.a($$0);
   }

   public static ekm a(int $$0, float $$1) {
      return new ekm(ekn.a((float)$$0), ekn.a($$1));
   }

   @Override
   public Set<ejd<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public ekp c() {
      return this.b;
   }

   public ekp d() {
      return this.c;
   }
}
