import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djh extends djg {
   public static final MapCodec<djh> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(lq.e.r().fieldOf("host").forGetter(djg::b), u()).apply($$0, djh::new));

   @Override
   public MapCodec<djh> a() {
      return b;
   }

   public djh(dfh $$0, dsj.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(dlt.i, jf.a.b));
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      return dlt.b($$0, $$1);
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(dlt.i);
   }

   @Override
   public dsk a(cxm $$0) {
      return this.o().a(dlt.i, $$0.k().o());
   }
}
