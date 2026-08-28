import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eiu implements eiy {
   public static final Codec<eiu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dxq.a.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dxq.a.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bsd.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bsd.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, eiu::new)
   );
   private final dxq b;
   private final dxq c;
   private final bsd d;
   private final bsd e;

   public eiu(dxq $$0, dxq $$1, bsd $$2, bsd $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dxq a() {
      return this.b;
   }

   public dxq b() {
      return this.c;
   }

   public bsd c() {
      return this.d;
   }

   public bsd d() {
      return this.e;
   }
}
