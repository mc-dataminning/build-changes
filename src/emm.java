import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record emm(emp b, emp c) implements emp {
   public static final Codec<emm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(emq.a.fieldOf("n").forGetter(emm::c), emq.a.fieldOf("p").forGetter(emm::d)).apply($$0, emm::new)
   );

   @Override
   public emo b() {
      return emq.d;
   }

   @Override
   public int a(eiv $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      awo $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(eiv $$0) {
      return (float)this.a($$0);
   }

   public static emm a(int $$0, float $$1) {
      return new emm(emn.a((float)$$0), emn.a($$1));
   }

   @Override
   public Set<eld<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public emp c() {
      return this.b;
   }

   public emp d() {
      return this.c;
   }
}
