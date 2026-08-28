import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmt extends djb implements der {
   public static final MapCodec<dmt> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ctj.q.fieldOf("color").forGetter(dmt::b), u()).apply($$0, dmt::new));
   private final ctj k;

   @Override
   public MapCodec<dmt> a() {
      return j;
   }

   public dmt(ctj $$0, dsc.d $$1) {
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
   public ctj b() {
      return this.k;
   }
}
