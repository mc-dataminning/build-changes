import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtc implements dtg {
   public static final Codec<dtc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dip.b.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dip.b.fieldOf("rim").forGetter($$0x -> $$0x.c),
               biq.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               biq.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dtc::new)
   );
   private final dip b;
   private final dip c;
   private final biq d;
   private final biq e;

   public dtc(dip $$0, dip $$1, biq $$2, biq $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dip a() {
      return this.b;
   }

   public dip b() {
      return this.c;
   }

   public biq c() {
      return this.d;
   }

   public biq d() {
      return this.e;
   }
}
