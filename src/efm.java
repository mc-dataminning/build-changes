import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record efm(efp b) implements efp {
   public static final Codec<efm> a = RecordCodecBuilder.create($$0 -> $$0.group(efr.a.fieldOf("term").forGetter(efm::c)).apply($$0, efm::new));

   @Override
   public efq b() {
      return efr.b;
   }

   public boolean a(ecq $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<eey<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(ecz $$0) {
      efp.super.a($$0);
      this.b.a($$0);
   }

   public static efp.a a(efp.a $$0) {
      efm $$1 = new efm($$0.build());
      return () -> $$1;
   }

   public efp c() {
      return this.b;
   }
}
