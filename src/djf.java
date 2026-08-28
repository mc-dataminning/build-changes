import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djf extends dje {
   public static final MapCodec<djf> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(lq.e.r().fieldOf("host").forGetter(dje::b), u()).apply($$0, djf::new));

   @Override
   public MapCodec<djf> a() {
      return b;
   }

   public djf(dff $$0, dsg.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(dlr.i, jf.a.b));
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      return dlr.b($$0, $$1);
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(dlr.i);
   }

   @Override
   public dsh a(cxk $$0) {
      return this.o().a(dlr.i, $$0.k().o());
   }
}
