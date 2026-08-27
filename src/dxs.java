import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxs implements dxw {
   public static final Codec<dxs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dnb.b.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dnb.b.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bmi.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bmi.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dxs::new)
   );
   private final dnb b;
   private final dnb c;
   private final bmi d;
   private final bmi e;

   public dxs(dnb $$0, dnb $$1, bmi $$2, bmi $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dnb a() {
      return this.b;
   }

   public dnb b() {
      return this.c;
   }

   public bmi c() {
      return this.d;
   }

   public bmi d() {
      return this.e;
   }
}
