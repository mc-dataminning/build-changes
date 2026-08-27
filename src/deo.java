import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class deo extends dcq {
   public static final MapCodec<deo> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(le.e.q().fieldOf("candle").forGetter($$0x -> $$0x.k), u()).apply($$0, deo::new)
   );
   public static final drs d = dcq.b;
   protected static final float e = 1.0F;
   protected static final evd f = ddy.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final evd g = ddy.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final evd h = eva.a(f, g);
   private static final Map<den, deo> i = Maps.newHashMap();
   private static final Iterable<euk> j = ImmutableList.of(new euk(0.5, 1.0, 0.5));
   private final den k;

   @Override
   public MapCodec<deo> a() {
      return c;
   }

   protected deo(ddy $$0, dra.d $$1) {
      super($$1);
      this.k(this.E.b().a(d, Boolean.valueOf(false)));
      if ($$0 instanceof den $$2) {
         i.put($$2, this);
         this.k = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + den.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<euk> b(drb $$0) {
      return j;
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return h;
   }

   @Override
   protected bpw a(cto $$0, drb $$1, dax $$2, io $$3, clw $$4, bpt $$5, eug $$6) {
      if ($$0.a(ctr.os) || $$0.a(ctr.tX)) {
         return bpw.e;
      } else if (a($$6) && $$0.e() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return bpw.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      bpu $$5 = dek.a($$1, $$2, dea.eg.n(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(eug $$0) {
      return $$0.e().d - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(d);
   }

   @Override
   public cto a(dba $$0, io $$1, drb $$2) {
      return new cto(dea.eg);
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      return $$1 == it.a && !$$0.a($$3, $$4) ? dea.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected int a(drb $$0, dax $$1, io $$2) {
      return dek.d;
   }

   @Override
   protected boolean c_(drb $$0) {
      return true;
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }

   public static drb a(den $$0) {
      return i.get($$0).n();
   }

   public static boolean g(drb $$0) {
      return $$0.a(avw.bk, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
