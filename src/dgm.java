import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dgm extends deo {
   public static final MapCodec<dgm> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lt.e.r().fieldOf("candle").forGetter($$0x -> $$0x.k), u()).apply($$0, dgm::new)
   );
   public static final dtr d = deo.b;
   protected static final float e = 1.0F;
   protected static final exp f = dfw.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final exp g = dfw.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final exp h = exm.a(f, g);
   private static final Map<dgl, dgm> i = Maps.newHashMap();
   private static final Iterable<eww> j = ImmutableList.of(new eww(0.5, 1.0, 0.5));
   private final dgl k;

   @Override
   public MapCodec<dgm> a() {
      return c;
   }

   protected dgm(dfw $$0, dsz.d $$1) {
      super($$1);
      this.k(this.E.b().a(d, Boolean.valueOf(false)));
      if ($$0 instanceof dgl $$2) {
         i.put($$2, this);
         this.k = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + dgl.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<eww> b(dta $$0) {
      return j;
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return h;
   }

   @Override
   protected bqs a(cuo $$0, dta $$1, dcu $$2, jd $$3, cmv $$4, bqp $$5, ews $$6) {
      if ($$0.a(cur.os) || $$0.a(cur.tX)) {
         return bqs.e;
      } else if (a($$6) && $$0.e() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return bqs.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      bqq $$5 = dgi.a($$1, $$2, dfy.eg.o(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(ews $$0) {
      return $$0.e().d - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(d);
   }

   @Override
   public cuo a(dcx $$0, jd $$1, dta $$2) {
      return new cuo(dfy.eg);
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      return $$1 == ji.a && !$$0.a($$3, $$4) ? dfy.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected int a(dta $$0, dcu $$1, jd $$2) {
      return dgi.d;
   }

   @Override
   protected boolean c_(dta $$0) {
      return true;
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }

   public static dta a(dgl $$0) {
      return i.get($$0).o();
   }

   public static boolean g(dta $$0) {
      return $$0.a(awd.bk, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
