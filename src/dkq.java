import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dkq extends djv {
   public static final MapCodec<dkq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(drl.a.fieldOf("wood_type").forGetter(djv::d), u()).apply($$0, dkq::new));
   public static final dqy b = dqo.ba;

   @Override
   public MapCodec<dkq> a() {
      return a;
   }

   public dkq(drl $$0, dpx.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public dpy a(cvl $$0) {
      elr $$1 = $$0.q().b_($$0.a());
      return this.n().a(b, Integer.valueOf(dre.a($$0.i() + 180.0F))).a(f, Boolean.valueOf($$1.a() == els.c));
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      return $$1 == ir.a && !this.a($$0, $$3, $$4) ? dcx.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dpy $$0) {
      return dre.b($$0.c(b));
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dpy a(dpy $$0, dhs $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b, f);
   }
}
