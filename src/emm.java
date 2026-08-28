import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emm implements emr {
   public static final Codec<emm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ebg.a.fieldOf("contents").forGetter($$0x -> $$0x.b),
               ebg.a.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bty.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bty.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, emm::new)
   );
   private final ebg b;
   private final ebg c;
   private final bty d;
   private final bty e;

   public emm(ebg $$0, ebg $$1, bty $$2, bty $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public ebg a() {
      return this.b;
   }

   public ebg b() {
      return this.c;
   }

   public bty c() {
      return this.d;
   }

   public bty d() {
      return this.e;
   }
}
