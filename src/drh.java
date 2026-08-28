import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drh extends drg {
   public static final MapCodec<drh> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(mg.e.q().fieldOf("host").forGetter(drg::b), t()).apply($$0, drh::new));

   @Override
   public MapCodec<drh> a() {
      return b;
   }

   public drh(dnc $$0, ebd.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(dtv.d, jb.a.b));
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return dtv.b($$0, $$1);
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(dtv.d);
   }

   @Override
   public ebe a(ddr $$0) {
      return this.m().b(dtv.d, $$0.k().o());
   }
}
