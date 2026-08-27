import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eio(eir b, eir c) implements eir {
   public static final Codec<eio> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eis.a.fieldOf("n").forGetter(eio::c), eis.a.fieldOf("p").forGetter(eio::d)).apply($$0, eio::new)
   );

   @Override
   public eiq b() {
      return eis.d;
   }

   @Override
   public int a(eex $$0) {
      int $$1 = this.b.a($$0);
      float $$2 = this.c.b($$0);
      ats $$3 = $$0.b();
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if ($$3.i() < $$2) {
            $$4++;
         }
      }

      return $$4;
   }

   @Override
   public float b(eex $$0) {
      return (float)this.a($$0);
   }

   public static eio a(int $$0, float $$1) {
      return new eio(eip.a((float)$$0), eip.a($$1));
   }

   @Override
   public Set<ehf<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public eir c() {
      return this.b;
   }

   public eir d() {
      return this.c;
   }
}
