import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record euf(czq b, jj<czj> c) implements etz {
   public static final MapCodec<euf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(czq.b.fieldOf("chance").forGetter(euf::c), czj.b.fieldOf("enchantment").forGetter(euf::d)).apply($$0, euf::new)
   );

   @Override
   public eua b() {
      return eub.e;
   }

   @Override
   public Set<eth<?>> a() {
      return ImmutableSet.of(etk.d);
   }

   public boolean a(eqo $$0) {
      bsd $$1 = $$0.c(etk.d);
      int $$3;
      if ($$1 instanceof bsy $$2) {
         $$3 = czl.a(this.c, $$2);
      } else {
         $$3 = 0;
      }

      return $$0.b().i() < this.b.a($$3);
   }

   public static etz.a a(jl.a $$0, float $$1, float $$2) {
      jl.b<czj> $$3 = $$0.b(lr.aK);
      return () -> new euf(new czq.e($$1, $$2), $$3.b(czo.s));
   }

   public czq c() {
      return this.b;
   }

   public jj<czj> d() {
      return this.c;
   }
}
