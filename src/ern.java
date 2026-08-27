import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ern(erq b) implements erq {
   public static final Codec<ern> a = RecordCodecBuilder.create($$0 -> $$0.group(ers.a.fieldOf("term").forGetter(ern::c)).apply($$0, ern::new));

   @Override
   public err b() {
      return ers.c;
   }

   public boolean a(eol $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<eqz<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(eor $$0) {
      erq.super.a($$0);
      this.b.a($$0);
   }

   public static erq.a a(erq.a $$0) {
      ern $$1 = new ern($$0.build());
      return () -> $$1;
   }

   public erq c() {
      return this.b;
   }
}
