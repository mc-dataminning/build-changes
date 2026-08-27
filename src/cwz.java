import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class cwz extends cvb {
   public static final MapCodec<cwz> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kd.e.q().fieldOf("candle").forGetter($$0x -> $$0x.k), u()).apply($$0, cwz::new)
   );
   public static final djr d = cvb.b;
   protected static final float e = 1.0F;
   protected static final emf f = cwj.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final emf g = cwj.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final emf h = emc.a(f, g);
   private static final Map<cwj, cwz> i = Maps.newHashMap();
   private static final Iterable<elm> j = ImmutableList.of(new elm(0.5, 1.0, 0.5));
   private final cwj k;

   @Override
   public MapCodec<cwz> a() {
      return c;
   }

   protected cwz(cwj $$0, diz.d $$1) {
      super($$1);
      this.k(this.E.b().a(d, Boolean.valueOf(false)));
      i.put($$0, this);
      this.k = $$0;
   }

   @Override
   protected Iterable<elm> b(dja $$0) {
      return j;
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return h;
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      cmr $$6 = $$3.b($$4);
      if ($$6.a(cmu.op) || $$6.a(cmu.tS)) {
         return bjv.d;
      } else if (a($$5) && $$3.b($$4).b() && $$0.c(d)) {
         a($$3, $$0, $$1, $$2);
         return bjv.a($$1.B);
      } else {
         bjv $$7 = cwv.a($$1, $$2, cwl.eg.o(), $$3);
         if ($$7.a()) {
            c($$0, $$1, $$2);
         }

         return $$7;
      }
   }

   private static boolean a(eli $$0) {
      return $$0.e().d - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(d);
   }

   @Override
   public cmr a(ctl $$0, hx $$1, dja $$2) {
      return new cmr(cwl.eg);
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      return $$1 == ic.a && !$$0.a($$3, $$4) ? cwl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public int a(dja $$0, cti $$1, hx $$2) {
      return cwv.d;
   }

   @Override
   public boolean d_(dja $$0) {
      return true;
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return false;
   }

   public static dja a(cwj $$0) {
      return i.get($$0).o();
   }

   public static boolean g(dja $$0) {
      return $$0.a(asb.bj, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
