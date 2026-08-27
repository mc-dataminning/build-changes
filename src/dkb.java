import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dkb extends djg {
   public static final MapCodec<dkb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dqv.a.fieldOf("wood_type").forGetter(djg::d), u()).apply($$0, dkb::new));
   public static final dqi b = dpy.ba;

   @Override
   public MapCodec<dkb> a() {
      return a;
   }

   public dkb(dqv $$0, dph.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public dpi a(cux $$0) {
      elb $$1 = $$0.q().b_($$0.a());
      return this.n().a(b, Integer.valueOf(dqo.a($$0.i() + 180.0F))).a(f, Boolean.valueOf($$1.a() == elc.c));
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      return $$1 == ij.a && !this.a($$0, $$3, $$4) ? dcj.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dpi $$0) {
      return dqo.b($$0.c(b));
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b, f);
   }
}
