import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eeg implements eek {
   public static final Codec<eeg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dtc.b.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dtc.b.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bpf.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bpf.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, eeg::new)
   );
   private final dtc b;
   private final dtc c;
   private final bpf d;
   private final bpf e;

   public eeg(dtc $$0, dtc $$1, bpf $$2, bpf $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public dtc a() {
      return this.b;
   }

   public dtc b() {
      return this.c;
   }

   public bpf c() {
      return this.d;
   }

   public bpf d() {
      return this.e;
   }
}
