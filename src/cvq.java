import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class cvq extends cts {
   public static final MapCodec<cvq> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jy.f.q().fieldOf("candle").forGetter($$0x -> $$0x.k), u()).apply($$0, cvq::new)
   );
   public static final dhz d = cts.b;
   protected static final float e = 1.0F;
   protected static final ekn f = cva.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final ekn g = cva.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final ekn h = ekk.a(f, g);
   private static final Map<cva, cvq> i = Maps.newHashMap();
   private static final Iterable<eju> j = ImmutableList.of(new eju(0.5, 1.0, 0.5));
   private final cva k;

   @Override
   public MapCodec<cvq> a() {
      return c;
   }

   protected cvq(cva $$0, dhh.d $$1) {
      super($$1);
      this.k(this.E.b().a(d, Boolean.valueOf(false)));
      i.put($$0, this);
      this.k = $$0;
   }

   @Override
   protected Iterable<eju> b(dhi $$0) {
      return j;
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return h;
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      clj $$6 = $$3.b($$4);
      if ($$6.a(clm.op) || $$6.a(clm.tR)) {
         return bix.d;
      } else if (a($$5) && $$3.b($$4).b() && $$0.c(d)) {
         a($$3, $$0, $$1, $$2);
         return bix.a($$1.B);
      } else {
         bix $$7 = cvm.a($$1, $$2, cvc.eg.o(), $$3);
         if ($$7.a()) {
            c($$0, $$1, $$2);
         }

         return $$7;
      }
   }

   private static boolean a(ejq $$0) {
      return $$0.e().d - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(d);
   }

   @Override
   public clj a(csd $$0, ht $$1, dhi $$2) {
      return new clj(cvc.eg);
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      return $$1 == hx.a && !$$0.a($$3, $$4) ? cvc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public int a(dhi $$0, csa $$1, ht $$2) {
      return cvm.d;
   }

   @Override
   public boolean d_(dhi $$0) {
      return true;
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }

   public static dhi a(cva $$0) {
      return i.get($$0).o();
   }

   public static boolean g(dhi $$0) {
      return $$0.a(arg.bj, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
