import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record evn(evq b, evq c) implements evq {
   public static final Codec<evn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(evr.a.fieldOf("n").forGetter(evn::c), evr.a.fieldOf("p").forGetter(evn::d)).apply($$0, evn::new)
   );

   @Override
   public evp b() {
      return evr.d;
   }

   @Override
   public int a(erp $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      ayt $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(erp $$0) {
      return (float)this.a($$0);
   }

   public static evn a(int $$0, float $$1) {
      return new evn(evo.a((float)$$0), evo.a($$1));
   }

   @Override
   public Set<eud<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public evq c() {
      return this.b;
   }

   public evq d() {
      return this.c;
   }
}
