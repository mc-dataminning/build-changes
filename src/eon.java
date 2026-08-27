import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eon(eoq b, eoq c) implements eoq {
   public static final Codec<eon> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eor.a.fieldOf("n").forGetter(eon::c), eor.a.fieldOf("p").forGetter(eon::d)).apply($$0, eon::new)
   );

   @Override
   public eop b() {
      return eor.d;
   }

   @Override
   public int a(ekw $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      axd $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(ekw $$0) {
      return (float)this.a($$0);
   }

   public static eon a(int $$0, float $$1) {
      return new eon(eoo.a((float)$$0), eoo.a($$1));
   }

   @Override
   public Set<ene<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public eoq c() {
      return this.b;
   }

   public eoq d() {
      return this.c;
   }
}
