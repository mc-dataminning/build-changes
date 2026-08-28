import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ezp(ezs b) implements ezs {
   public static final MapCodec<ezp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ezs.e.fieldOf("term").forGetter(ezp::c)).apply($$0, ezp::new));

   @Override
   public ezt b() {
      return ezu.a;
   }

   public boolean a(ewh $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<eza<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(ewn $$0) {
      ezs.super.a($$0);
      this.b.a($$0);
   }

   public static ezs.a a(ezs.a $$0) {
      ezp $$1 = new ezp($$0.build());
      return () -> $$1;
   }

   public ezs c() {
      return this.b;
   }
}
