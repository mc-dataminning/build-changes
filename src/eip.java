import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eip implements eit {
   public static final Codec<eip> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dxo.a.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dxo.a.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bsf.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bsf.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, eip::new)
   );
   private final dxo b;
   private final dxo c;
   private final bsf d;
   private final bsf e;

   public eip(dxo $$0, dxo $$1, bsf $$2, bsf $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dxo a() {
      return this.b;
   }

   public dxo b() {
      return this.c;
   }

   public bsf c() {
      return this.d;
   }

   public bsf d() {
      return this.e;
   }
}
