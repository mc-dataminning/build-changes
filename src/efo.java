import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record efo(efr b) implements efr {
   public static final Codec<efo> a = RecordCodecBuilder.create($$0 -> $$0.group(eft.a.fieldOf("term").forGetter(efo::c)).apply($$0, efo::new));

   @Override
   public efs b() {
      return eft.b;
   }

   public boolean a(ecs $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<efa<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(edb $$0) {
      efr.super.a($$0);
      this.b.a($$0);
   }

   public static efr.a a(efr.a $$0) {
      efo $$1 = new efo($$0.build());
      return () -> $$1;
   }

   public efr c() {
      return this.b;
   }
}
