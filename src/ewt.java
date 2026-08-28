import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ewt(eww b) implements eww {
   public static final MapCodec<ewt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(eww.e.fieldOf("term").forGetter(ewt::c)).apply($$0, ewt::new));

   @Override
   public ewx b() {
      return ewy.a;
   }

   public boolean a(etl $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<ewe<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(etr $$0) {
      eww.super.a($$0);
      this.b.a($$0);
   }

   public static eww.a a(eww.a $$0) {
      ewt $$1 = new ewt($$0.build());
      return () -> $$1;
   }

   public eww c() {
      return this.b;
   }
}
