import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dlu extends djv {
   public static final MapCodec<dlu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(drl.a.fieldOf("wood_type").forGetter(djv::d), u()).apply($$0, dlu::new));
   public static final dqs b = dgr.aE;
   public static final ety c = dcv.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final ety d = dcv.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final ety e = etv.a(c, dcv.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final ety i = etv.a(d, dcv.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<ir, ety> j = Maps.newEnumMap(ImmutableMap.of(ir.c, e, ir.d, e, ir.f, i, ir.e, i));

   @Override
   public MapCodec<dlu> a() {
      return a;
   }

   public dlu(drl $$0, dpx.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, ir.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected bos a(csd $$0, dpy $$1, czu $$2, im $$3, ckl $$4, bop $$5, etb $$6) {
      if ($$2.c_($$3) instanceof don $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return bos.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(dpy $$0, ckl $$1, etb $$2, don $$3, csd $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.f() instanceof crq && !this.a($$2, $$0);
   }

   private boolean a(etb $$0, dpy $$1) {
      return $$0.b().o() == $$1.c(b).o();
   }

   @Override
   public String g() {
      return this.p().a();
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return j.get($$0.c(b));
   }

   @Override
   protected ety b_(dpy $$0, cza $$1, im $$2) {
      return this.a($$0, $$1, $$2, etk.a());
   }

   @Override
   protected ety b(dpy $$0, cza $$1, im $$2, etk $$3) {
      switch ((ir)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(dpy $$0, czx $$1, im $$2) {
      ir $$3 = $$0.c(b).h();
      ir $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(czx $$0, dpy $$1, im $$2, ir $$3) {
      dpy $$4 = $$0.a_($$2);
      return $$4.a(avo.az) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dkw.a);
   }

   @Nullable
   @Override
   public dpy a(cvl $$0) {
      dpy $$1 = this.n();
      elr $$2 = $$0.q().b_($$0.a());
      czx $$3 = $$0.q();
      im $$4 = $$0.a();

      for (ir $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            ir $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == els.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      return $$1.o() == $$0.c(b).h().o() && !$$0.a($$3, $$4) ? dcx.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dpy $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dpy a(dpy $$0, dhs $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b, f);
   }

   @Override
   public dnd a(im $$0, dpy $$1) {
      return new doa($$0, $$1);
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dnd> dne<T> a(czu $$0, dpy $$1, dnf<T> $$2) {
      return a($$2, dnf.i, don::a);
   }
}
