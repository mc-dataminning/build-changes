import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dmr extends dks {
   public static final MapCodec<dmr> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mf.e.q().fieldOf("candle").forGetter($$0x -> $$0x.h), t()).apply($$0, dmr::new)
   );
   public static final eaq d = dks.b;
   private static final ffc e = fez.a(dma.b(2.0, 8.0, 14.0), dma.b(14.0, 0.0, 8.0));
   private static final Map<dmq, dmr> f = Maps.newHashMap();
   private static final Iterable<fei> g = List.of(new fei(8.0, 16.0, 8.0).c(0.0625));
   private final dmq h;

   @Override
   public MapCodec<dmr> a() {
      return c;
   }

   protected dmr(dma $$0, dzy.d $$1) {
      super($$1);
      this.l(this.B.b().b(d, Boolean.valueOf(false)));
      if ($$0 instanceof dmq $$2) {
         f.put($$2, this);
         this.h = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + dmq.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<fei> b(dzz $$0) {
      return g;
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return e;
   }

   @Override
   protected bub a(cyy $$0, dzz $$1, div $$2, iu $$3, cqy $$4, bua $$5, fee $$6) {
      if ($$0.a(czc.pd) || $$0.a(czc.vb)) {
         return bub.e;
      } else if (a($$6) && $$0.f() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return bub.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      bub $$5 = dmn.a($$1, $$2, dmc.eu.m(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(fee $$0) {
      return $$0.g().e - (double)$$0.b().v() > 0.5;
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(d);
   }

   @Override
   protected cyy a(diy $$0, iu $$1, dzz $$2, boolean $$3) {
      return new cyy(dmc.eu);
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      return $$4 == ja.a && !$$0.a($$1, $$3) ? dmc.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected int a(dzz $$0, div $$1, iu $$2) {
      return dmn.d;
   }

   @Override
   protected boolean c_(dzz $$0) {
      return true;
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }

   public static dzz a(dmq $$0) {
      return f.get($$0).m();
   }

   public static boolean h(dzz $$0) {
      return $$0.a(axc.bm, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
