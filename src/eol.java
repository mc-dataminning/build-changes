import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eol(eoo b, eoo c) implements eoo {
   public static final Codec<eol> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eop.a.fieldOf("n").forGetter(eol::c), eop.a.fieldOf("p").forGetter(eol::d)).apply($$0, eol::new)
   );

   @Override
   public eon b() {
      return eop.d;
   }

   @Override
   public int a(eku $$0) {
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
   public float b(eku $$0) {
      return (float)this.a($$0);
   }

   public static eol a(int $$0, float $$1) {
      return new eol(eom.a((float)$$0), eom.a($$1));
   }

   @Override
   public Set<enc<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public eoo c() {
      return this.b;
   }

   public eoo d() {
      return this.c;
   }
}
