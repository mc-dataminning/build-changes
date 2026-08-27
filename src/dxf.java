import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxf {
   public static final Codec<dxf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dmp.c).fieldOf("height").forGetter(dxf::a), kd.e.q().fieldOf("block").orElse(cwr.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, dxf::new)
   );
   private final cwp b;
   private final int c;

   public dxf(int $$0, cwp $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public djg b() {
      return this.b.o();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + kd.e.b(this.b);
   }
}
