import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record euk(evb b) implements euf {
   public static final MapCodec<euk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(evc.a.fieldOf("chance").forGetter(euk::c)).apply($$0, euk::new));

   @Override
   public eug b() {
      return euh.d;
   }

   public boolean a(equ $$0) {
      float $$1 = this.b.b($$0);
      return $$0.b().i() < $$1;
   }

   public static euf.a a(float $$0) {
      return () -> new euk(euy.a($$0));
   }

   public static euf.a a(evb $$0) {
      return () -> new euk($$0);
   }

   public evb c() {
      return this.b;
   }
}
