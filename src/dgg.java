import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgg extends dco implements cyf {
   public static final MapCodec<dgg> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cnn.q.fieldOf("color").forGetter(dgg::b), u()).apply($$0, dgg::new));
   private final cnn k;

   @Override
   public MapCodec<dgg> a() {
      return j;
   }

   public dgg(cnn $$0, dle.d $$1) {
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
   public cnn b() {
      return this.k;
   }
}
