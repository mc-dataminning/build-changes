import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egl implements egp {
   public static final Codec<egl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dvj.a.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dvj.a.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bri.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bri.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, egl::new)
   );
   private final dvj b;
   private final dvj c;
   private final bri d;
   private final bri e;

   public egl(dvj $$0, dvj $$1, bri $$2, bri $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dvj a() {
      return this.b;
   }

   public dvj b() {
      return this.c;
   }

   public bri c() {
      return this.d;
   }

   public bri d() {
      return this.e;
   }
}
