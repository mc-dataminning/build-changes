import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record esi(esl b, esl c) implements esl {
   public static final Codec<esi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(esm.a.fieldOf("n").forGetter(esi::c), esm.a.fieldOf("p").forGetter(esi::d)).apply($$0, esi::new)
   );

   @Override
   public esk b() {
      return esm.d;
   }

   @Override
   public int a(eol $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      ayg $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(eol $$0) {
      return (float)this.a($$0);
   }

   public static esi a(int $$0, float $$1) {
      return new esi(esj.a((float)$$0), esj.a($$1));
   }

   @Override
   public Set<eqz<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public esl c() {
      return this.b;
   }

   public esl d() {
      return this.c;
   }
}
