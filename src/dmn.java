import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmn extends div implements del {
   public static final MapCodec<dmn> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ctd.q.fieldOf("color").forGetter(dmn::b), u()).apply($$0, dmn::new));
   private final ctd k;

   @Override
   public MapCodec<dmn> a() {
      return j;
   }

   public dmn(ctd $$0, drw.d $$1) {
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
   public ctd b() {
      return this.k;
   }
}
