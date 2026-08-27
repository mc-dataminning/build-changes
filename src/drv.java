import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drv implements drz {
   public static final Codec<drv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dhi.b.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dhi.b.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bic.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bic.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, drv::new)
   );
   private final dhi b;
   private final dhi c;
   private final bic d;
   private final bic e;

   public drv(dhi $$0, dhi $$1, bic $$2, bic $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dhi a() {
      return this.b;
   }

   public dhi b() {
      return this.c;
   }

   public bic c() {
      return this.d;
   }

   public bic d() {
      return this.e;
   }
}
