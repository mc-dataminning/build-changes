import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsx {
   public static final Codec<dsx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dih.c).fieldOf("height").forGetter(dsx::a), jc.f.q().fieldOf("block").orElse(csl.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, dsx::new)
   );
   private final csk b;
   private final int c;

   public dsx(int $$0, csk $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dey b() {
      return this.b.n();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + jc.f.b(this.b);
   }
}
