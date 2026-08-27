import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dlv extends djv {
   public static final MapCodec<dlv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(drl.a.fieldOf("wood_type").forGetter(djv::d), u()).apply($$0, dlv::new));
   public static final dqs b = dgr.aE;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<ir, ety> i = Maps.newEnumMap(
      ImmutableMap.of(
         ir.c,
         dcv.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         ir.d,
         dcv.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         ir.f,
         dcv.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         ir.e,
         dcv.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dlv> a() {
      return a;
   }

   public dlv(drl $$0, dpx.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, ir.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public String g() {
      return this.p().a();
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return i.get($$0.c(b));
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dpy a(cvl $$0) {
      dpy $$1 = this.n();
      elr $$2 = $$0.q().b_($$0.a());
      czx $$3 = $$0.q();
      im $$4 = $$0.a();
      ir[] $$5 = $$0.f();

      for (ir $$6 : $$5) {
         if ($$6.o().d()) {
            ir $$7 = $$6.g();
            $$1 = $$1.a(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == els.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? dcx.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dpy $$0) {
      return $$0.c(b).p();
   }

   @Override
   public etf m(dpy $$0) {
      ety $$1 = i.get($$0.c(b));
      return $$1.a().f();
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
}
