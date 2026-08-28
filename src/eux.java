import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eux(eva b) implements eva {
   public static final MapCodec<eux> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(eva.e.fieldOf("term").forGetter(eux::c)).apply($$0, eux::new));

   @Override
   public evb b() {
      return evc.a;
   }

   public boolean a(erp $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<eui<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(erv $$0) {
      eva.super.a($$0);
      this.b.a($$0);
   }

   public static eva.a a(eva.a $$0) {
      eux $$1 = new eux($$0.build());
      return () -> $$1;
   }

   public eva c() {
      return this.b;
   }
}
