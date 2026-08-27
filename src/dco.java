import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dco extends daq {
   public static final MapCodec<dco> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kr.e.q().fieldOf("candle").forGetter($$0x -> $$0x.k), u()).apply($$0, dco::new)
   );
   public static final dpq d = daq.b;
   protected static final float e = 1.0F;
   protected static final est f = dby.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final est g = dby.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final est h = esq.a(f, g);
   private static final Map<dcn, dco> i = Maps.newHashMap();
   private static final Iterable<esa> j = ImmutableList.of(new esa(0.5, 1.0, 0.5));
   private final dcn k;

   @Override
   public MapCodec<dco> a() {
      return c;
   }

   protected dco(dby $$0, doy.d $$1) {
      super($$1);
      this.k(this.E.b().a(d, Boolean.valueOf(false)));
      if ($$0 instanceof dcn $$2) {
         i.put($$2, this);
         this.k = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + dcn.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<esa> b(doz $$0) {
      return j;
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return h;
   }

   @Override
   protected boc a(crj $$0, doz $$1, cyx $$2, ib $$3, cjt $$4, bnz $$5, erw $$6) {
      if ($$0.a(crm.or) || $$0.a(crm.tW)) {
         return boc.e;
      } else if (a($$6) && $$0.d() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return boc.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      boa $$5 = dck.a($$1, $$2, dca.eg.n(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(erw $$0) {
      return $$0.e().d - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(d);
   }

   @Override
   public crj a(cza $$0, ib $$1, doz $$2) {
      return new crj(dca.eg);
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      return $$1 == ih.a && !$$0.a($$3, $$4) ? dca.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected int a(doz $$0, cyx $$1, ib $$2) {
      return dck.d;
   }

   @Override
   protected boolean d_(doz $$0) {
      return true;
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return false;
   }

   public static doz a(dcn $$0) {
      return i.get($$0).n();
   }

   public static boolean g(doz $$0) {
      return $$0.a(avc.bk, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
