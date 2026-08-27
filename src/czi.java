import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class czi extends cxk {
   public static final MapCodec<czi> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kf.e.q().fieldOf("candle").forGetter($$0x -> $$0x.k), u()).apply($$0, czi::new)
   );
   public static final dma d = cxk.b;
   protected static final float e = 1.0F;
   protected static final eos f = cys.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final eos g = cys.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final eos h = eop.a(f, g);
   private static final Map<czh, czi> i = Maps.newHashMap();
   private static final Iterable<enz> j = ImmutableList.of(new enz(0.5, 1.0, 0.5));
   private final czh k;

   @Override
   public MapCodec<czi> a() {
      return c;
   }

   protected czi(cys $$0, dli.d $$1) {
      super($$1);
      this.k(this.E.b().a(d, Boolean.valueOf(false)));
      if ($$0 instanceof czh $$2) {
         i.put($$2, this);
         this.k = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + czh.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<enz> b(dlj $$0) {
      return j;
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return h;
   }

   @Override
   protected bly a(cpd $$0, dlj $$1, cvr $$2, hz $$3, chl $$4, blv $$5, env $$6) {
      if ($$0.a(cpg.or) || $$0.a(cpg.tV)) {
         return bly.e;
      } else if (a($$6) && $$0.b() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return bly.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      blw $$5 = cze.a($$1, $$2, cyu.eg.o(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(env $$0) {
      return $$0.e().d - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(d);
   }

   @Override
   public cpd a(cvu $$0, hz $$1, dlj $$2) {
      return new cpd(cyu.eg);
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      return $$1 == ie.a && !$$0.a($$3, $$4) ? cyu.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected int a(dlj $$0, cvr $$1, hz $$2) {
      return cze.d;
   }

   @Override
   protected boolean d_(dlj $$0) {
      return true;
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return false;
   }

   public static dlj a(czh $$0) {
      return i.get($$0).o();
   }

   public static boolean g(dlj $$0) {
      return $$0.a(aua.bj, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
