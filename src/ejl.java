import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ejl(ejo b) implements ejo {
   public static final Codec<ejl> a = RecordCodecBuilder.create($$0 -> $$0.group(ejq.a.fieldOf("term").forGetter(ejl::c)).apply($$0, ejl::new));

   @Override
   public ejp b() {
      return ejq.b;
   }

   public boolean a(egp $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<eix<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(egy $$0) {
      ejo.super.a($$0);
      this.b.a($$0);
   }

   public static ejo.a a(ejo.a $$0) {
      ejl $$1 = new ejl($$0.build());
      return () -> $$1;
   }

   public ejo c() {
      return this.b;
   }
}
