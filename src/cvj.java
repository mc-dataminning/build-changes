import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class cvj extends ctk {
   public static final MapCodec<cvj> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jy.f.q().fieldOf("candle").forGetter($$0x -> $$0x.k), t()).apply($$0, cvj::new)
   );
   public static final dhn d = ctk.b;
   protected static final float e = 1.0F;
   protected static final ekb f = cut.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final ekb g = cut.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final ekb h = ejy.a(f, g);
   private static final Map<cut, cvj> i = Maps.newHashMap();
   private static final Iterable<eji> j = ImmutableList.of(new eji(0.5, 1.0, 0.5));
   private final cut k;

   @Override
   public MapCodec<cvj> a() {
      return c;
   }

   protected cvj(cut $$0, dgv.d $$1) {
      super($$1);
      this.k(this.E.b().a(d, Boolean.valueOf(false)));
      i.put($$0, this);
      this.k = $$0;
   }

   @Override
   protected Iterable<eji> b(dgw $$0) {
      return j;
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return h;
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      clb $$6 = $$3.b($$4);
      if ($$6.a(cle.nE) || $$6.a(cle.tg)) {
         return biq.d;
      } else if (a($$5) && $$3.b($$4).b() && $$0.c(d)) {
         a($$3, $$0, $$1, $$2);
         return biq.a($$1.B);
      } else {
         biq $$7 = cvf.a($$1, $$2, cuv.eg.o(), $$3);
         if ($$7.a()) {
            c($$0, $$1, $$2);
         }

         return $$7;
      }
   }

   private static boolean a(eje $$0) {
      return $$0.e().d - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(d);
   }

   @Override
   public clb a(crv $$0, ht $$1, dgw $$2) {
      return new clb(cuv.eg);
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      return $$1 == hx.a && !$$0.a($$3, $$4) ? cuv.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public int a(dgw $$0, crs $$1, ht $$2) {
      return cvf.d;
   }

   @Override
   public boolean d_(dgw $$0) {
      return true;
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }

   public static dgw a(cut $$0) {
      return i.get($$0).o();
   }

   public static boolean g(dgw $$0) {
      return $$0.a(arc.bj, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
