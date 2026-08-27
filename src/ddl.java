import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class ddl extends dbn {
   public static final MapCodec<ddl> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lc.e.q().fieldOf("candle").forGetter($$0x -> $$0x.k), u()).apply($$0, ddl::new)
   );
   public static final dqp d = dbn.b;
   protected static final float e = 1.0F;
   protected static final ety f = dcv.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final ety g = dcv.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final ety h = etv.a(f, g);
   private static final Map<ddk, ddl> i = Maps.newHashMap();
   private static final Iterable<etf> j = ImmutableList.of(new etf(0.5, 1.0, 0.5));
   private final ddk k;

   @Override
   public MapCodec<ddl> a() {
      return c;
   }

   protected ddl(dcv $$0, dpx.d $$1) {
      super($$1);
      this.k(this.E.b().a(d, Boolean.valueOf(false)));
      if ($$0 instanceof ddk $$2) {
         i.put($$2, this);
         this.k = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + ddk.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<etf> b(dpy $$0) {
      return j;
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return h;
   }

   @Override
   protected bos a(csd $$0, dpy $$1, czu $$2, im $$3, ckl $$4, bop $$5, etb $$6) {
      if ($$0.a(csg.os) || $$0.a(csg.tX)) {
         return bos.e;
      } else if (a($$6) && $$0.d() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return bos.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      boq $$5 = ddh.a($$1, $$2, dcx.eg.n(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(etb $$0) {
      return $$0.e().d - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(d);
   }

   @Override
   public csd a(czx $$0, im $$1, dpy $$2) {
      return new csd(dcx.eg);
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      return $$1 == ir.a && !$$0.a($$3, $$4) ? dcx.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected int a(dpy $$0, czu $$1, im $$2) {
      return ddh.d;
   }

   @Override
   protected boolean d_(dpy $$0) {
      return true;
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }

   public static dpy a(ddk $$0) {
      return i.get($$0).n();
   }

   public static boolean g(dpy $$0) {
      return $$0.a(avo.bk, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
