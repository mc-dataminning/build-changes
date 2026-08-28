import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ewp(ews b) implements ews {
   public static final MapCodec<ewp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ews.e.fieldOf("term").forGetter(ewp::c)).apply($$0, ewp::new));

   @Override
   public ewt b() {
      return ewu.a;
   }

   public boolean a(eth $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<ewa<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(etn $$0) {
      ews.super.a($$0);
      this.b.a($$0);
   }

   public static ews.a a(ews.a $$0) {
      ewp $$1 = new ewp($$0.build());
      return () -> $$1;
   }

   public ews c() {
      return this.b;
   }
}
