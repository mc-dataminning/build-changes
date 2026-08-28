import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejr {
   public static final Codec<ejr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dyz.c).fieldOf("height").forGetter(ejr::a), lx.e.q().fieldOf("block").orElse(dia.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, ejr::new)
   );
   private final dhy b;
   private final int c;

   public ejr(int $$0, dhy $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dvd b() {
      return this.b.m();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + lx.e.b(this.b);
   }
}
