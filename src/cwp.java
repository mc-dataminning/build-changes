import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class cwp extends cur {
   public static final MapCodec<cwp> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kb.e.q().fieldOf("candle").forGetter($$0x -> $$0x.k), u()).apply($$0, cwp::new)
   );
   public static final djg d = cur.b;
   protected static final float e = 1.0F;
   protected static final elu f = cvz.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final elu g = cvz.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final elu h = elr.a(f, g);
   private static final Map<cvz, cwp> i = Maps.newHashMap();
   private static final Iterable<elb> j = ImmutableList.of(new elb(0.5, 1.0, 0.5));
   private final cvz k;

   @Override
   public MapCodec<cwp> a() {
      return c;
   }

   protected cwp(cvz $$0, dio.d $$1) {
      super($$1);
      this.k(this.E.b().a(d, Boolean.valueOf(false)));
      i.put($$0, this);
      this.k = $$0;
   }

   @Override
   protected Iterable<elb> b(dip $$0) {
      return j;
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return h;
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      cmh $$6 = $$3.b($$4);
      if ($$6.a(cmk.op) || $$6.a(cmk.tS)) {
         return bjl.d;
      } else if (a($$5) && $$3.b($$4).b() && $$0.c(d)) {
         a($$3, $$0, $$1, $$2);
         return bjl.a($$1.B);
      } else {
         bjl $$7 = cwl.a($$1, $$2, cwb.eg.o(), $$3);
         if ($$7.a()) {
            c($$0, $$1, $$2);
         }

         return $$7;
      }
   }

   private static boolean a(ekx $$0) {
      return $$0.e().d - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(d);
   }

   @Override
   public cmh a(ctb $$0, hv $$1, dip $$2) {
      return new cmh(cwb.eg);
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      return $$1 == ia.a && !$$0.a($$3, $$4) ? cwb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public int a(dip $$0, csy $$1, hv $$2) {
      return cwl.d;
   }

   @Override
   public boolean d_(dip $$0) {
      return true;
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }

   public static dip a(cvz $$0) {
      return i.get($$0).o();
   }

   public static boolean g(dip $$0) {
      return $$0.a(arr.bj, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
