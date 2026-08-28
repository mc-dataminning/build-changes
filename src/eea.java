import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eea implements eee {
   public static final Codec<eea> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dta.b.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dta.b.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bpv.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bpv.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, eea::new)
   );
   private final dta b;
   private final dta c;
   private final bpv d;
   private final bpv e;

   public eea(dta $$0, dta $$1, bpv $$2, bpv $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dta a() {
      return this.b;
   }

   public dta b() {
      return this.c;
   }

   public bpv c() {
      return this.d;
   }

   public bpv d() {
      return this.e;
   }
}
