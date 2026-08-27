import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eur(euu b) implements euu {
   public static final Codec<eur> a = RecordCodecBuilder.create($$0 -> $$0.group(euw.a.fieldOf("term").forGetter(eur::c)).apply($$0, eur::new));

   @Override
   public euv b() {
      return euw.c;
   }

   public boolean a(erp $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<eud<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(erv $$0) {
      euu.super.a($$0);
      this.b.a($$0);
   }

   public static euu.a a(euu.a $$0) {
      eur $$1 = new eur($$0.build());
      return () -> $$1;
   }

   public euu c() {
      return this.b;
   }
}
