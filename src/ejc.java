import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejc {
   public static final Codec<ejc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dyk.c).fieldOf("height").forGetter(ejc::a), lu.e.q().fieldOf("block").orElse(dhl.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, ejc::new)
   );
   private final dhj b;
   private final int c;

   public ejc(int $$0, dhj $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public duo b() {
      return this.b.o();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + lu.e.b(this.b);
   }
}
