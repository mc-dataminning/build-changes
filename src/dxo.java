import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxo {
   public static final Codec<dxo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dmy.c).fieldOf("height").forGetter(dxo::a), kd.e.q().fieldOf("block").orElse(cxa.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, dxo::new)
   );
   private final cwy b;
   private final int c;

   public dxo(int $$0, cwy $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public djp b() {
      return this.b.o();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + kd.e.b(this.b);
   }
}
