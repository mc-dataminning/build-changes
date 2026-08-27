import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dcg extends dcd {
   public static final MapCodec<dcg> b = b(dcg::new);
   public static final dqs c = dgr.aE;
   private static final Map<ir, ety> e = Maps.newEnumMap(
      ImmutableMap.of(
         ir.c,
         dcv.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         ir.d,
         dcv.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         ir.e,
         dcv.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         ir.f,
         dcv.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends dcg> a() {
      return b;
   }

   protected dcg(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, ir.c).a(d, Boolean.valueOf(true)));
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return e.get($$0.c(c));
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dpy a(dpy $$0, dhs $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, els.c, els.c.a($$3));
      }

      return $$1.g() == $$0.c(c) && !$$0.a($$3, $$4) ? dcx.a.n() : $$0;
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      ir $$3 = $$0.c(c);
      im $$4 = $$2.a($$3.g());
      dpy $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dpy a(cvl $$0) {
      dpy $$1 = super.a($$0);
      czx $$2 = $$0.q();
      im $$3 = $$0.a();
      ir[] $$4 = $$0.f();

      for (ir $$5 : $$4) {
         if ($$5.o().d()) {
            $$1 = $$1.a(c, $$5.g());
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }
}
