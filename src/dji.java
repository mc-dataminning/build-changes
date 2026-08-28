import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dji extends djh {
   public static final MapCodec<dji> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(lq.e.r().fieldOf("host").forGetter(djh::b), u()).apply($$0, dji::new));

   @Override
   public MapCodec<dji> a() {
      return b;
   }

   public dji(dfi $$0, dsk.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(dlu.i, jf.a.b));
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      return dlu.b($$0, $$1);
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(dlu.i);
   }

   @Override
   public dsl a(cxn $$0) {
      return this.o().a(dlu.i, $$0.k().o());
   }
}
