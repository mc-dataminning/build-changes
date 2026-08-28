import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emk {
   public static final Codec<emk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, ebq.c).fieldOf("height").forGetter(emk::a), ma.e.q().fieldOf("block").orElse(dko.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, emk::new)
   );
   private final dkm b;
   private final int c;

   public emk(int $$0, dkm $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dxv b() {
      return this.b.m();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + ma.e.b(this.b);
   }
}
