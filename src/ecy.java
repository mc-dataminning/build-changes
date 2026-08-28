import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecy implements edc {
   public static final Codec<ecy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dsc.b.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dsc.b.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bpz.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bpz.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, ecy::new)
   );
   private final dsc b;
   private final dsc c;
   private final bpz d;
   private final bpz e;

   public ecy(dsc $$0, dsc $$1, bpz $$2, bpz $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dsc a() {
      return this.b;
   }

   public dsc b() {
      return this.c;
   }

   public bpz c() {
      return this.d;
   }

   public bpz d() {
      return this.e;
   }
}
