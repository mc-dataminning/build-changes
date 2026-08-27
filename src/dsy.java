import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsy {
   public static final Codec<dsy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dii.c).fieldOf("height").forGetter(dsy::a), jb.f.q().fieldOf("block").orElse(csm.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, dsy::new)
   );
   private final csl b;
   private final int c;

   public dsy(int $$0, csl $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dez b() {
      return this.b.n();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + jb.f.b(this.b);
   }
}
