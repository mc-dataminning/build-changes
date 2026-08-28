import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emj {
   public static final Codec<emj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, ebm.c).fieldOf("height").forGetter(emj::a), mb.e.q().fieldOf("block").orElse(dkg.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, emj::new)
   );
   private final dke b;
   private final int c;

   public emj(int $$0, dke $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dxq b() {
      return this.b.m();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + mb.e.b(this.b);
   }
}
