import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dut(int b, int c, int d, ih<dys> e) implements dug {
   public static final Codec<dut> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atx.j.fieldOf("tries").orElse(128).forGetter(dut::a),
               atx.i.fieldOf("xz_spread").orElse(7).forGetter(dut::b),
               atx.i.fieldOf("y_spread").orElse(3).forGetter(dut::c),
               dys.b.fieldOf("feature").forGetter(dut::d)
            )
            .apply($$0, dut::new)
   );

   public int a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public ih<dys> d() {
      return this.e;
   }
}
