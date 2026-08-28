import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dfx extends ddz {
   public static final MapCodec<dfx> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lq.e.r().fieldOf("candle").forGetter($$0x -> $$0x.k), u()).apply($$0, dfx::new)
   );
   public static final dtb d = ddz.b;
   protected static final float e = 1.0F;
   protected static final ewy f = dfh.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final ewy g = dfh.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final ewy h = ewv.a(f, g);
   private static final Map<dfw, dfx> i = Maps.newHashMap();
   private static final Iterable<ewf> j = ImmutableList.of(new ewf(0.5, 1.0, 0.5));
   private final dfw k;

   @Override
   public MapCodec<dfx> a() {
      return c;
   }

   protected dfx(dfh $$0, dsj.d $$1) {
      super($$1);
      this.k(this.E.b().a(d, Boolean.valueOf(false)));
      if ($$0 instanceof dfw $$2) {
         i.put($$2, this);
         this.k = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + dfw.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<ewf> b(dsk $$0) {
      return j;
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return h;
   }

   @Override
   protected bqi a(cuc $$0, dsk $$1, dcf $$2, ja $$3, cmk $$4, bqf $$5, ewb $$6) {
      if ($$0.a(cuf.os) || $$0.a(cuf.tX)) {
         return bqi.e;
      } else if (a($$6) && $$0.e() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return bqi.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      bqg $$5 = dft.a($$1, $$2, dfj.eg.o(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(ewb $$0) {
      return $$0.e().d - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(d);
   }

   @Override
   public cuc a(dci $$0, ja $$1, dsk $$2) {
      return new cuc(dfj.eg);
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      return $$1 == jf.a && !$$0.a($$3, $$4) ? dfj.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected int a(dsk $$0, dcf $$1, ja $$2) {
      return dft.d;
   }

   @Override
   protected boolean c_(dsk $$0) {
      return true;
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return false;
   }

   public static dsk a(dfw $$0) {
      return i.get($$0).o();
   }

   public static boolean g(dsk $$0) {
      return $$0.a(avw.bk, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
