import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecz implements edd {
   public static final Codec<ecz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dsd.b.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dsd.b.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bqa.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bqa.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ecz::new)
   );
   private final dsd b;
   private final dsd c;
   private final bqa d;
   private final bqa e;

   public ecz(dsd $$0, dsd $$1, bqa $$2, bqa $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dsd a() {
      return this.b;
   }

   public dsd b() {
      return this.c;
   }

   public bqa c() {
      return this.d;
   }

   public bqa d() {
      return this.e;
   }
}
