import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eeg {
   public static final Codec<eeg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.intRange(0, dtq.c).fieldOf("height").forGetter(eeg::a), lc.e.q().fieldOf("block").orElse(dcx.a).forGetter($$0x -> $$0x.b().b()))
            .apply($$0, eeg::new)
   );
   private final dcv b;
   private final int c;

   public eeg(int $$0, dcv $$1) {
      this.c = $$0;
      this.b = $$1;
   }

   public int a() {
      return this.c;
   }

   public dpy b() {
      return this.b.n();
   }

   @Override
   public String toString() {
      return (this.c != 1 ? this.c + "*" : "") + lc.e.b(this.b);
   }
}
