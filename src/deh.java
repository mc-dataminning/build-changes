import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class deh extends dap implements cwg {
   public static final MapCodec<deh> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cll.q.fieldOf("color").forGetter(deh::b), u()).apply($$0, deh::new));
   private final cll k;

   @Override
   public MapCodec<deh> a() {
      return j;
   }

   public deh(cll $$0, djf.d $$1) {
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
   public cll b() {
      return this.k;
   }
}
