import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dcx extends czf implements cuw {
   public static final MapCodec<dcx> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ckc.q.fieldOf("color").forGetter(dcx::b), u()).apply($$0, dcx::new));
   private final ckc k;

   @Override
   public MapCodec<dcx> a() {
      return j;
   }

   public dcx(ckc $$0, dhm.d $$1) {
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
   public ckc b() {
      return this.k;
   }
}
