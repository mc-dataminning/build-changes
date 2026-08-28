import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ewb(ewe b) implements ewe {
   public static final MapCodec<ewb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ewe.e.fieldOf("term").forGetter(ewb::c)).apply($$0, ewb::new));

   @Override
   public ewf b() {
      return ewg.a;
   }

   public boolean a(est $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<evm<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(esz $$0) {
      ewe.super.a($$0);
      this.b.a($$0);
   }

   public static ewe.a a(ewe.a $$0) {
      ewb $$1 = new ewb($$0.build());
      return () -> $$1;
   }

   public ewe c() {
      return this.b;
   }
}
