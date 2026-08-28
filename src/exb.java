import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record exb(exs b) implements eww {
   public static final MapCodec<exb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ext.a.fieldOf("chance").forGetter(exb::c)).apply($$0, exb::new));

   @Override
   public ewx b() {
      return ewy.d;
   }

   public boolean a(etl $$0) {
      float $$1 = this.b.b($$0);
      return $$0.b().i() < $$1;
   }

   public static eww.a a(float $$0) {
      return () -> new exb(exp.a($$0));
   }

   public static eww.a a(exs $$0) {
      return () -> new exb($$0);
   }

   public exs c() {
      return this.b;
   }
}
