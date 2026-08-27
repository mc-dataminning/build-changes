import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dlw extends dbr {
   public static final MapCodec<dlw> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(djx.a.b.fieldOf("kind").forGetter(dbr::b), u()).apply($$0, dlw::new));
   public static final dqs d = dgr.aE;
   private static final Map<ir, ety> b = Maps.newEnumMap(
      ImmutableMap.of(
         ir.c,
         dcv.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         ir.d,
         dcv.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         ir.f,
         dcv.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         ir.e,
         dcv.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends dlw> a() {
      return c;
   }

   protected dlw(djx.a $$0, dpx.d $$1) {
      super($$0, $$1);
      this.k(this.n().a(d, ir.c));
   }

   @Override
   public String g() {
      return this.p().a();
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dpy a(cvl $$0) {
      dpy $$1 = super.a($$0);
      cza $$2 = $$0.q();
      im $$3 = $$0.a();
      ir[] $$4 = $$0.f();

      for (ir $$5 : $$4) {
         if ($$5.o().d()) {
            ir $$6 = $$5.g();
            $$1 = $$1.a(d, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dpy a(dpy $$0, dhs $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
