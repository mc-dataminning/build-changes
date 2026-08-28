import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dms extends dja implements deq {
   public static final MapCodec<dms> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cti.q.fieldOf("color").forGetter(dms::b), u()).apply($$0, dms::new));
   private final cti k;

   @Override
   public MapCodec<dms> a() {
      return j;
   }

   public dms(cti $$0, dsb.d $$1) {
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
   public cti b() {
      return this.k;
   }
}
