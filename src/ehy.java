import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehy implements eic {
   public static final Codec<ehy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dwx.a.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dwx.a.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bro.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bro.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ehy::new)
   );
   private final dwx b;
   private final dwx c;
   private final bro d;
   private final bro e;

   public ehy(dwx $$0, dwx $$1, bro $$2, bro $$3) {
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

   public bro c() {
      return this.d;
   }

   public bro d() {
      return this.e;
   }
}
