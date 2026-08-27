import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class cts extends crt {
   public static final MapCodec<cts> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jb.f.q().fieldOf("candle").forGetter($$0x -> $$0x.k), t()).apply($$0, cts::new)
   );
   public static final dfu d = crt.b;
   protected static final float e = 1.0F;
   protected static final eia f = ctc.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final eia g = ctc.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final eia h = ehx.a(f, g);
   private static final Map<ctc, cts> i = Maps.newHashMap();
   private static final Iterable<ehh> j = ImmutableList.of(new ehh(0.5, 1.0, 0.5));
   private final ctc k;

   @Override
   public MapCodec<cts> a() {
      return c;
   }

   protected cts(ctc $$0, dfc.d $$1) {
      super($$1);
      this.k(this.E.b().a(d, Boolean.valueOf(false)));
      i.put($$0, this);
      this.k = $$0;
   }

   @Override
   protected Iterable<ehh> b(dfd $$0) {
      return j;
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return h;
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      cjl $$6 = $$3.b($$4);
      if ($$6.a(cjo.nE) || $$6.a(cjo.tf)) {
         return bhe.d;
      } else if (a($$5) && $$3.b($$4).b() && $$0.c(d)) {
         a($$3, $$0, $$1, $$2);
         return bhe.a($$1.B);
      } else {
         bhe $$7 = cto.a($$1, $$2, cte.eg.o(), $$3);
         if ($$7.a()) {
            c($$0, $$1, $$2);
         }

         return $$7;
      }
   }

   private static boolean a(ehd $$0) {
      return $$0.e().d - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(d);
   }

   @Override
   public cjl a(cqe $$0, gw $$1, dfd $$2) {
      return new cjl(cte.eg);
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      return $$1 == ha.a && !$$0.a($$3, $$4) ? cte.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public int a(dfd $$0, cqb $$1, gw $$2) {
      return cto.d;
   }

   @Override
   public boolean d_(dfd $$0) {
      return true;
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return false;
   }

   public static dfd a(ctc $$0) {
      return i.get($$0).o();
   }

   public static boolean g(dfd $$0) {
      return $$0.a(apv.bj, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
