import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtt extends dpy implements dll {
   public static final MapCodec<dtt> h = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cxq.q.fieldOf("color").forGetter(dtt::b), t()).apply($$0, dtt::new));
   private final cxq i;

   @Override
   public MapCodec<dtt> a() {
      return h;
   }

   public dtt(cxq $$0, dzn.d $$1) {
      super($$1);
      this.i = $$0;
      this.l(
         this.B
            .b()
            .b(a, Boolean.valueOf(false))
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
      );
   }

   @Override
   public cxq b() {
      return this.i;
   }
}
