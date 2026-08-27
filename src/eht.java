import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eht(ehw b) implements ehw {
   public static final Codec<eht> a = RecordCodecBuilder.create($$0 -> $$0.group(ehy.a.fieldOf("term").forGetter(eht::c)).apply($$0, eht::new));

   @Override
   public ehx b() {
      return ehy.b;
   }

   public boolean a(eex $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<ehf<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(efg $$0) {
      ehw.super.a($$0);
      this.b.a($$0);
   }

   public static ehw.a a(ehw.a $$0) {
      eht $$1 = new eht($$0.build());
      return () -> $$1;
   }

   public ehw c() {
      return this.b;
   }
}
