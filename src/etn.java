import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record etn(etq b) implements etq {
   public static final MapCodec<etn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ets.a.fieldOf("term").forGetter(etn::c)).apply($$0, etn::new));

   @Override
   public etr b() {
      return ets.c;
   }

   public boolean a(eqg $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<esz<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(eqm $$0) {
      etq.super.a($$0);
      this.b.a($$0);
   }

   public static etq.a a(etq.a $$0) {
      etn $$1 = new etn($$0.build());
      return () -> $$1;
   }

   public etq c() {
      return this.b;
   }
}
