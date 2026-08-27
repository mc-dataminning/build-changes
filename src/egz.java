import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record egz(ehc b, ehc c) implements ehc {
   public static final Codec<egz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ehd.a.fieldOf("n").forGetter(egz::c), ehd.a.fieldOf("p").forGetter(egz::d)).apply($$0, egz::new)
   );

   @Override
   public ehb b() {
      return ehd.d;
   }

   @Override
   public int a(edi $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      ate $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(edi $$0) {
      return (float)this.a($$0);
   }

   public static egz a(int $$0, float $$1) {
      return new egz(eha.a((float)$$0), eha.a($$1));
   }

   @Override
   public Set<efq<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public ehc c() {
      return this.b;
   }

   public ehc d() {
      return this.c;
   }
}
