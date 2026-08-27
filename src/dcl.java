import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dcl extends cyt implements cuk {
   public static final MapCodec<dcl> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cjp.q.fieldOf("color").forGetter(dcl::b), t()).apply($$0, dcl::new));
   private final cjp k;

   @Override
   public MapCodec<dcl> a() {
      return j;
   }

   public dcl(cjp $$0, dgv.d $$1) {
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
   public cjp b() {
      return this.k;
   }
}
