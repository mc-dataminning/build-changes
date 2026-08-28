import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehy implements eic {
   public static final Codec<ehy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dwx.a.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dwx.a.fieldOf("rim").forGetter($$0x -> $$0x.c),
               brp.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               brp.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ehy::new)
   );
   private final dwx b;
   private final dwx c;
   private final brp d;
   private final brp e;

   public ehy(dwx $$0, dwx $$1, brp $$2, brp $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dwx a() {
      return this.b;
   }

   public dwx b() {
      return this.c;
   }

   public brp c() {
      return this.d;
   }

   public brp d() {
      return this.e;
   }
}
