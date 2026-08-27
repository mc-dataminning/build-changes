import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dls extends dbm {
   public static final MapCodec<dls> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cqw.q.fieldOf("color").forGetter(dbm::b), u()).apply($$0, dls::new));
   public static final dqs b = dgr.aE;
   private static final Map<ir, ety> c = Maps.newEnumMap(
      ImmutableMap.of(
         ir.c,
         dcv.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         ir.d,
         dcv.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         ir.e,
         dcv.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         ir.f,
         dcv.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dls> a() {
      return a;
   }

   public dls(cqw $$0, dpx.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, ir.c));
   }

   @Override
   public String g() {
      return this.p().a();
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? dcx.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dpy a(cvl $$0) {
      dpy $$1 = this.n();
      czx $$2 = $$0.q();
      im $$3 = $$0.a();
      ir[] $$4 = $$0.f();

      for (ir $$5 : $$4) {
         if ($$5.o().d()) {
            ir $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
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
      $$0.a(b);
   }
}
