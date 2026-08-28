import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eio {
   public static final Codec<eio> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dxw.c).fieldOf("height").forGetter(eio::a), lu.e.q().fieldOf("block").orElse(dgx.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, eio::new)
   );
   private final dgv b;
   private final int c;

   public eio(int $$0, dgv $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dua b() {
      return this.b.o();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + lu.e.b(this.b);
   }
}
