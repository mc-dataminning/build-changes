import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dcx extends daz {
   public static final MapCodec<dcx> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kt.e.q().fieldOf("candle").forGetter($$0x -> $$0x.k), u()).apply($$0, dcx::new)
   );
   public static final dpz d = daz.b;
   protected static final float e = 1.0F;
   protected static final etc f = dch.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final etc g = dch.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final etc h = esz.a(f, g);
   private static final Map<dcw, dcx> i = Maps.newHashMap();
   private static final Iterable<esj> j = ImmutableList.of(new esj(0.5, 1.0, 0.5));
   private final dcw k;

   @Override
   public MapCodec<dcx> a() {
      return c;
   }

   protected dcx(dch $$0, dph.d $$1) {
      super($$1);
      this.k(this.E.b().a(d, Boolean.valueOf(false)));
      if ($$0 instanceof dcw $$2) {
         i.put($$2, this);
         this.k = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + dcw.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<esj> b(dpi $$0) {
      return j;
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return h;
   }

   @Override
   protected boh a(crs $$0, dpi $$1, czg $$2, id $$3, cka $$4, boe $$5, esf $$6) {
      if ($$0.a(crv.or) || $$0.a(crv.tW)) {
         return boh.e;
      } else if (a($$6) && $$0.d() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return boh.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      bof $$5 = dct.a($$1, $$2, dcj.eg.n(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(esf $$0) {
      return $$0.e().d - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(d);
   }

   @Override
   public crs a(czj $$0, id $$1, dpi $$2) {
      return new crs(dcj.eg);
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      return $$1 == ij.a && !$$0.a($$3, $$4) ? dcj.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected int a(dpi $$0, czg $$1, id $$2) {
      return dct.d;
   }

   @Override
   protected boolean d_(dpi $$0) {
      return true;
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return false;
   }

   public static dpi a(dcw $$0) {
      return i.get($$0).n();
   }

   public static boolean g(dpi $$0) {
      return $$0.a(ave.bk, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
