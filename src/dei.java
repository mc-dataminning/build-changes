import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dei extends daq implements cwh {
   public static final MapCodec<dei> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(clm.q.fieldOf("color").forGetter(dei::b), u()).apply($$0, dei::new));
   private final clm k;

   @Override
   public MapCodec<dei> a() {
      return j;
   }

   public dei(clm $$0, djg.d $$1) {
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
   public clm b() {
      return this.k;
   }
}
