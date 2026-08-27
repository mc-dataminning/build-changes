import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eik(eiw b, efb c) implements eib {
   public static final Codec<eik> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eix.a.fieldOf("value").forGetter(eik::c), efb.a.fieldOf("range").forGetter(eik::d)).apply($$0, eik::new)
   );

   @Override
   public eic b() {
      return eid.s;
   }

   @Override
   public Set<ehk<?>> a() {
      return Sets.union(this.b.a(), this.c.a());
   }

   public boolean a(efc $$0) {
      return this.c.b($$0, this.b.a($$0));
   }

   public static eib.a a(eiw $$0, efb $$1) {
      return () -> new eik($$0, $$1);
   }

   public eiw c() {
      return this.b;
   }

   public efb d() {
      return this.c;
   }
}
