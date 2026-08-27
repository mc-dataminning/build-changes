import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djg extends djf {
   public static final MapCodec<djg> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(lh.e.q().fieldOf("host").forGetter(djf::b), u()).apply($$0, djg::new));

   @Override
   public MapCodec<djg> a() {
      return b;
   }

   public djg(dfc $$0, dtb.d $$1) {
      super($$0, $$1);
      this.k(this.n().a(dmc.i, iw.a.b));
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      return dmc.b($$0, $$1);
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(dmc.i);
   }

   @Override
   public dtc a(cyd $$0) {
      return this.n().a(dmc.i, $$0.k().o());
   }
}
