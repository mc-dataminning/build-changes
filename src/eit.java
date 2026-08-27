import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eit(eiw b, eiw c) implements eiw {
   public static final Codec<eit> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eix.a.fieldOf("n").forGetter(eit::c), eix.a.fieldOf("p").forGetter(eit::d)).apply($$0, eit::new)
   );

   @Override
   public eiv b() {
      return eix.d;
   }

   @Override
   public int a(efc $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      atw $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(efc $$0) {
      return (float)this.a($$0);
   }

   public static eit a(int $$0, float $$1) {
      return new eit(eiu.a((float)$$0), eiu.a($$1));
   }

   @Override
   public Set<ehk<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public eiw c() {
      return this.b;
   }

   public eiw d() {
      return this.c;
   }
}
