import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehx implements eib {
   public static final Codec<ehx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dww.a.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dww.a.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bro.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bro.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ehx::new)
   );
   private final dww b;
   private final dww c;
   private final bro d;
   private final bro e;

   public ehx(dww $$0, dww $$1, bro $$2, bro $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dww a() {
      return this.b;
   }

   public dww b() {
      return this.c;
   }

   public bro c() {
      return this.d;
   }

   public bro d() {
      return this.e;
   }
}
