import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpd extends dfz implements ctf {
   public static final MapCodec<dpd> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(csw.q.fieldOf("color").forGetter(dpd::b), u()).apply($$0, dpd::new));
   private final csw d;

   @Override
   public MapCodec<dpd> a() {
      return c;
   }

   protected dpd(csw $$0, dsk.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public csw b() {
      return this.d;
   }

   @Override
   public bso m() {
      return bso.g;
   }

   @Override
   public jj<avg> n() {
      return avh.og;
   }
}
