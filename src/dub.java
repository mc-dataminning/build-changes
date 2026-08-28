import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dub extends dqf implements dlr {
   public static final MapCodec<dub> h = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cxw.q.fieldOf("color").forGetter(dub::b), t()).apply($$0, dub::new));
   private final cxw i;

   @Override
   public MapCodec<dub> a() {
      return h;
   }

   public dub(cxw $$0, dzy.d $$1) {
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
   public cxw b() {
      return this.i;
   }
}
