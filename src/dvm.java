import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvm {
   public static final Codec<dvm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dkw.c).fieldOf("height").forGetter(dvm::a), kc.f.q().fieldOf("block").orElse(cvh.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, dvm::new)
   );
   private final cvf b;
   private final int c;

   public dvm(int $$0, cvf $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dhn b() {
      return this.b.o();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + kc.f.b(this.b);
   }
}
