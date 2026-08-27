import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record efc(eff b) implements eff {
   public static final Codec<efc> a = RecordCodecBuilder.create($$0 -> $$0.group(efh.a.fieldOf("term").forGetter(efc::c)).apply($$0, efc::new));

   @Override
   public efg b() {
      return efh.b;
   }

   public boolean a(ecg $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<eeo<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(ecp $$0) {
      eff.super.a($$0);
      this.b.a($$0);
   }

   public static eff.a a(eff.a $$0) {
      efc $$1 = new efc($$0.build());
      return () -> $$1;
   }

   public eff c() {
      return this.b;
   }
}
