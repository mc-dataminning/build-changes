import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eiu(eir b, eir c) implements eir {
   public static final Codec<eiu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eis.a.fieldOf("min").forGetter(eiu::c), eis.a.fieldOf("max").forGetter(eiu::d)).apply($$0, eiu::new)
   );

   @Override
   public eiq b() {
      return eis.c;
   }

   public static eiu a(float $$0, float $$1) {
      return new eiu(eip.a($$0), eip.a($$1));
   }

   @Override
   public int a(eex $$0) {
      return atm.a($$0.b(), this.b.a($$0), this.c.a($$0));
   }

   @Override
   public float b(eex $$0) {
      return atm.a($$0.b(), this.b.b($$0), this.c.b($$0));
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
