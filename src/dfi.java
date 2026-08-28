import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfi {
   public static final Codec<dfi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awf.b.fieldOf("sound").forGetter($$0x -> $$0x.c),
               Codec.INT.fieldOf("tick_delay").forGetter($$0x -> $$0x.d),
               Codec.INT.fieldOf("block_search_extent").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.fieldOf("offset").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dfi::new)
   );
   public static final dfi b = new dfi(awg.h, 6000, 8, 2.0);
   private final jo<awf> c;
   private final int d;
   private final int e;
   private final double f;

   public dfi(jo<awf> $$0, int $$1, int $$2, double $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public jo<awf> a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }
}
