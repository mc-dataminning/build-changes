import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ekb(eke b) implements eke {
   public static final Codec<ekb> a = RecordCodecBuilder.create($$0 -> $$0.group(ekg.a.fieldOf("term").forGetter(ekb::c)).apply($$0, ekb::new));

   @Override
   public ekf b() {
      return ekg.b;
   }

   public boolean a(ehf $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<ejn<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(eho $$0) {
      eke.super.a($$0);
      this.b.a($$0);
   }

   public static eke.a a(eke.a $$0) {
      ekb $$1 = new ekb($$0.build());
      return () -> $$1;
   }

   public eke c() {
      return this.b;
   }
}
