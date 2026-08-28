import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emw implements enb {
   public static final Codec<emw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ebq.a.fieldOf("contents").forGetter($$0x -> $$0x.b),
               ebq.a.fieldOf("rim").forGetter($$0x -> $$0x.c),
               buh.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               buh.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, emw::new)
   );
   private final ebq b;
   private final ebq c;
   private final buh d;
   private final buh e;

   public emw(ebq $$0, ebq $$1, buh $$2, buh $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public ebq a() {
      return this.b;
   }

   public ebq b() {
      return this.c;
   }

   public buh c() {
      return this.d;
   }

   public buh d() {
      return this.e;
   }
}
