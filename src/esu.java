import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record esu(etg b, epe c) implements esl {
   public static final MapCodec<esu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eth.a.fieldOf("value").forGetter(esu::c), epe.a.fieldOf("range").forGetter(esu::d)).apply($$0, esu::new)
   );

   @Override
   public esm b() {
      return esn.t;
   }

   @Override
   public Set<eru<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(epf $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static esl.a a(etg $$0, epe $$1) {
      return () -> new esu($$0, $$1);
   }

   public etg c() {
      return this.b;
   }

   public epe d() {
      return this.c;
   }
}
