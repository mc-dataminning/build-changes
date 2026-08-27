import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eee implements eek {
   public static final Codec<eee> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dtc.b.fieldOf("state").forGetter($$0x -> $$0x.d),
               bpf.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b),
               bpf.b(1, 20).fieldOf("height").forGetter($$0x -> $$0x.c)
            )
            .apply($$0, eee::new)
   );
   private final bpf b;
   private final bpf c;
   private final dtc d;

   public eee(dtc $$0, bpf $$1, bpf $$2) {
      this.b = $$1;
      this.c = $$2;
      this.d = $$0;
   }

   public bpf a() {
      return this.b;
   }

   public bpf b() {
      return this.c;
   }

   public dtc c() {
      return this.d;
   }
}
