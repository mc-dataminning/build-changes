import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpm implements dpq {
   public static final Codec<dpm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dez.b.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dez.b.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bfv.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bfv.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, dpm::new)
   );
   private final dez b;
   private final dez c;
   private final bfv d;
   private final bfv e;

   public dpm(dez $$0, dez $$1, bfv $$2, bfv $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dez a() {
      return this.b;
   }

   public dez b() {
      return this.c;
   }

   public bfv c() {
      return this.d;
   }

   public bfv d() {
      return this.e;
   }
}
