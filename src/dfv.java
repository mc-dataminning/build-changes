import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dfv extends ddx {
   public static final MapCodec<dfv> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lq.e.r().fieldOf("candle").forGetter($$0x -> $$0x.k), u()).apply($$0, dfv::new)
   );
   public static final dsy d = ddx.b;
   protected static final float e = 1.0F;
   protected static final ews f = dff.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final ews g = dff.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final ews h = ewp.a(f, g);
   private static final Map<dfu, dfv> i = Maps.newHashMap();
   private static final Iterable<evz> j = ImmutableList.of(new evz(0.5, 1.0, 0.5));
   private final dfu k;

   @Override
   public MapCodec<dfv> a() {
      return c;
   }

   protected dfv(dff $$0, dsg.d $$1) {
      super($$1);
      this.k(this.E.b().a(d, Boolean.valueOf(false)));
      if ($$0 instanceof dfu $$2) {
         i.put($$2, this);
         this.k = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + dfu.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<evz> b(dsh $$0) {
      return j;
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return h;
   }

   @Override
   protected bqf a(cua $$0, dsh $$1, dcd $$2, ja $$3, cmh $$4, bqc $$5, evv $$6) {
      if ($$0.a(cud.os) || $$0.a(cud.tX)) {
         return bqf.e;
      } else if (a($$6) && $$0.e() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return bqf.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      bqd $$5 = dfr.a($$1, $$2, dfh.eg.o(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(evv $$0) {
      return $$0.e().d - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(d);
   }

   @Override
   public cua a(dcg $$0, ja $$1, dsh $$2) {
      return new cua(dfh.eg);
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      return $$1 == jf.a && !$$0.a($$3, $$4) ? dfh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected int a(dsh $$0, dcd $$1, ja $$2) {
      return dfr.d;
   }

   @Override
   protected boolean c_(dsh $$0) {
      return true;
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }

   public static dsh a(dfu $$0) {
      return i.get($$0).o();
   }

   public static boolean g(dsh $$0) {
      return $$0.a(avu.bk, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
