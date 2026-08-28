import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ele implements eli {
   public static final Codec<ele> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dzz.a.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dzz.a.fieldOf("rim").forGetter($$0x -> $$0x.c),
               btg.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               btg.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ele::new)
   );
   private final dzz b;
   private final dzz c;
   private final btg d;
   private final btg e;

   public ele(dzz $$0, dzz $$1, btg $$2, btg $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dzz a() {
      return this.b;
   }

   public dzz b() {
      return this.c;
   }

   public btg c() {
      return this.d;
   }

   public btg d() {
      return this.e;
   }
}
