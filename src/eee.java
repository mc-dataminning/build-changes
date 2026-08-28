import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eee implements eei {
   public static final Codec<eee> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dtc.b.fieldOf("contents").forGetter($$0x -> $$0x.b),
               dtc.b.fieldOf("rim").forGetter($$0x -> $$0x.c),
               bpw.b(0, 16).fieldOf("size").forGetter($$0x -> $$0x.d),
               bpw.b(0, 16).fieldOf("rim_size").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, eee::new)
   );
   private final dtc b;
   private final dtc c;
   private final bpw d;
   private final bpw e;

   public eee(dtc $$0, dtc $$1, bpw $$2, bpw $$3) {
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

   public bpw c() {
      return this.d;
   }

   public bpw d() {
      return this.e;
   }
}
