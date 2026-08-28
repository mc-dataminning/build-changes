import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnc extends dmh {
   public static final MapCodec<dnc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dtx.a.fieldOf("wood_type").forGetter(dmh::d), u()).apply($$0, dnc::new));
   public static final dtk b = dta.ba;

   @Override
   public MapCodec<dnc> a() {
      return a;
   }

   public dnc(dtx $$0, dsj.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public dsk a(cxm $$0) {
      eoh $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Integer.valueOf(dtq.a($$0.i() + 180.0F))).a(f, Boolean.valueOf($$1.a() == eoi.c));
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      return $$1 == jf.a && !this.a($$0, $$3, $$4) ? dfj.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dsk $$0) {
      return dtq.b($$0.c(b));
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dsk a(dsk $$0, dke $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b, f);
   }
}
