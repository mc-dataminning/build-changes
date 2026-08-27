import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dlx extends dlf {
   public static final MapCodec<dlx> f = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), u()).apply($$0, dlx::new));
   public static final dqs g = dgr.aE;
   protected static final float h = 2.5F;
   private static final Map<ir, ety> i = Maps.newEnumMap(
      ImmutableMap.of(
         ir.c,
         dcv.a(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         ir.d,
         dcv.a(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         ir.e,
         dcv.a(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         ir.f,
         dcv.a(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   @Override
   public MapCodec<dlx> a() {
      return f;
   }

   protected dlx(kz $$0, dpx.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(g, ir.c));
   }

   @Override
   public String g() {
      return this.p().a();
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return m($$0);
   }

   public static ety m(dpy $$0) {
      return i.get($$0.c(g));
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      return b($$1, $$2, $$0.c(g));
   }

   public static boolean b(czx $$0, im $$1, ir $$2) {
      im $$3 = $$1.a($$2.g());
      dpy $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2);
   }

   @Nullable
   @Override
   public dpy a(cvl $$0) {
      dpy $$1 = this.n();
      czx $$2 = $$0.q();
      im $$3 = $$0.a();
      ir[] $$4 = $$0.f();

      for (ir $$5 : $$4) {
         if ($$5.o().d()) {
            ir $$6 = $$5.g();
            $$1 = $$1.a(g, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      return $$1.g() == $$0.c(g) && !$$0.a($$3, $$4) ? dcx.a.n() : $$0;
   }

   @Override
   public void a(dpy $$0, czu $$1, im $$2, ayd $$3) {
      ir $$4 = $$0.c(g);
      double $$5 = (double)$$2.u() + 0.5;
      double $$6 = (double)$$2.v() + 0.7;
      double $$7 = (double)$$2.w() + 0.5;
      double $$8 = 0.22;
      double $$9 = 0.27;
      ir $$10 = $$4.g();
      $$1.a(kw.ab, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
      $$1.a(this.e, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      return $$0.a(g, $$1.a($$0.c(g)));
   }

   @Override
   protected dpy a(dpy $$0, dhs $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(g);
   }
}
