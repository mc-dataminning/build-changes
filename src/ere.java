import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ere(erh b) implements erh {
   public static final Codec<ere> a = RecordCodecBuilder.create($$0 -> $$0.group(erj.a.fieldOf("term").forGetter(ere::c)).apply($$0, ere::new));

   @Override
   public eri b() {
      return erj.b;
   }

   public boolean a(eoa $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<eqq<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(eoj $$0) {
      erh.super.a($$0);
      this.b.a($$0);
   }

   public static erh.a a(erh.a $$0) {
      ere $$1 = new ere($$0.build());
      return () -> $$1;
   }

   public erh c() {
      return this.b;
   }
}
