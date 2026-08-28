import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnb extends djj implements dez {
   public static final MapCodec<dnb> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(csw.q.fieldOf("color").forGetter(dnb::b), u()).apply($$0, dnb::new));
   private final csw k;

   @Override
   public MapCodec<dnb> a() {
      return j;
   }

   public dnb(csw $$0, dsk.d $$1) {
      super($$1);
      this.k = $$0;
      this.k(
         this.E
            .b()
            .a(a, Boolean.valueOf(false))
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
      );
   }

   @Override
   public csw b() {
      return this.k;
   }
}
