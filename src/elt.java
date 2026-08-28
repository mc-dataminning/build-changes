import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class elt implements elx {
   public static final Codec<elt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eao.a.fieldOf("contents").forGetter($$0x -> $$0x.b),
               eao.a.fieldOf("rim").forGetter($$0x -> $$0x.c),
               btl.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               btl.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, elt::new)
   );
   private final eao b;
   private final eao c;
   private final btl d;
   private final btl e;

   public elt(eao $$0, eao $$1, btl $$2, btl $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public eao a() {
      return this.b;
   }

   public eao b() {
      return this.c;
   }

   public btl c() {
      return this.d;
   }

   public btl d() {
      return this.e;
   }
}
