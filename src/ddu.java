import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class ddu extends dbw {
   public static final MapCodec<ddu> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ld.e.q().fieldOf("candle").forGetter($$0x -> $$0x.k), u()).apply($$0, ddu::new)
   );
   public static final dqy d = dbw.b;
   protected static final float e = 1.0F;
   protected static final eui f = dde.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final eui g = dde.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final eui h = euf.a(f, g);
   private static final Map<ddt, ddu> i = Maps.newHashMap();
   private static final Iterable<etp> j = ImmutableList.of(new etp(0.5, 1.0, 0.5));
   private final ddt k;

   @Override
   public MapCodec<ddu> a() {
      return c;
   }

   protected ddu(dde $$0, dqg.d $$1) {
      super($$1);
      this.k(this.E.b().a(d, Boolean.valueOf(false)));
      if ($$0 instanceof ddt $$2) {
         i.put($$2, this);
         this.k = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + ddt.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<etp> b(dqh $$0) {
      return j;
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return h;
   }

   @Override
   protected bpo a(csz $$0, dqh $$1, dad $$2, in $$3, clh $$4, bpl $$5, etl $$6) {
      if ($$0.a(ctc.os) || $$0.a(ctc.tX)) {
         return bpo.e;
      } else if (a($$6) && $$0.d() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return bpo.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      bpm $$5 = ddq.a($$1, $$2, ddg.eg.n(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(etl $$0) {
      return $$0.e().d - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(d);
   }

   @Override
   public csz a(dag $$0, in $$1, dqh $$2) {
      return new csz(ddg.eg);
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      return $$1 == is.a && !$$0.a($$3, $$4) ? ddg.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected int a(dqh $$0, dad $$1, in $$2) {
      return ddq.d;
   }

   @Override
   protected boolean c_(dqh $$0) {
      return true;
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }

   public static dqh a(ddt $$0) {
      return i.get($$0).n();
   }

   public static boolean g(dqh $$0) {
      return $$0.a(avr.bk, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
