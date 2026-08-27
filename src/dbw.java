import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dbw extends dde {
   public static final MapCodec<dbw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ake.a(ld.f).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               ake.a(ld.f).fieldOf("stem").forGetter($$0x -> $$0x.f),
               ake.a(ld.G).fieldOf("seed").forGetter($$0x -> $$0x.g),
               u()
            )
            .apply($$0, dbw::new)
   );
   public static final dqs b = dgr.aE;
   protected static final float c = 2.0F;
   private static final Map<ir, ety> d = Maps.newEnumMap(
      ImmutableMap.of(
         ir.d,
         dcv.a(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         ir.e,
         dcv.a(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         ir.c,
         dcv.a(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         ir.f,
         dcv.a(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );
   private final ake<dcv> e;
   private final ake<dcv> f;
   private final ake<cry> g;

   @Override
   public MapCodec<dbw> a() {
      return a;
   }

   protected dbw(ake<dcv> $$0, ake<dcv> $$1, ake<cry> $$2, dpx.d $$3) {
      super($$3);
      this.k(this.E.b().a(b, ir.c));
      this.f = $$0;
      this.e = $$1;
      this.g = $$2;
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if (!$$2.a(this.e) && $$1 == $$0.c(b)) {
         Optional<dcv> $$6 = $$3.H_().d(ld.f).e(this.f);
         if ($$6.isPresent()) {
            return $$6.get().n().b(dkr.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean b(dpy $$0, cza $$1, im $$2) {
      return $$0.a(dcx.cC);
   }

   @Override
   public csd a(czx $$0, im $$1, dpy $$2) {
      return new csd((czt)DataFixUtils.orElse($$0.H_().d(ld.G).e(this.g), this));
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
