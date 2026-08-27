import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record efh(efk b) implements efk {
   public static final Codec<efh> a = RecordCodecBuilder.create($$0 -> $$0.group(efm.a.fieldOf("term").forGetter(efh::c)).apply($$0, efh::new));

   @Override
   public efl b() {
      return efm.b;
   }

   public boolean a(ecl $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<eet<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(ecu $$0) {
      efk.super.a($$0);
      this.b.a($$0);
   }

   public static efk.a a(efk.a $$0) {
      efh $$1 = new efh($$0.build());
      return () -> $$1;
   }

   public efk c() {
      return this.b;
   }
}
