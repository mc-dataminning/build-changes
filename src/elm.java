import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class elm implements elq {
   public static final Codec<elm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eah.a.fieldOf("contents").forGetter($$0x -> $$0x.b),
               eah.a.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bti.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bti.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, elm::new)
   );
   private final eah b;
   private final eah c;
   private final bti d;
   private final bti e;

   public elm(eah $$0, eah $$1, bti $$2, bti $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public eah a() {
      return this.b;
   }

   public eah b() {
      return this.c;
   }

   public bti c() {
      return this.d;
   }

   public bti d() {
      return this.e;
   }
}
