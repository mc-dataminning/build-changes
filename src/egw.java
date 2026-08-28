import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egw {
   public static final Codec<egw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dwf.c).fieldOf("height").forGetter(egw::a), lq.e.r().fieldOf("block").orElse(dfj.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, egw::new)
   );
   private final dfh b;
   private final int c;

   public egw(int $$0, dfh $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dsk b() {
      return this.b.o();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + lq.e.b(this.b);
   }
}
