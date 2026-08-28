import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dhl extends dfn {
   public static final MapCodec<dhl> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lu.e.q().fieldOf("candle").forGetter($$0x -> $$0x.k), u()).apply($$0, dhl::new)
   );
   public static final dur d = dfn.b;
   protected static final float e = 1.0F;
   protected static final eyx f = dgv.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final eyx g = dgv.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final eyx h = eyu.a(f, g);
   private static final Map<dhk, dhl> i = Maps.newHashMap();
   private static final Iterable<eye> j = ImmutableList.of(new eye(0.5, 1.0, 0.5));
   private final dhk k;

   @Override
   public MapCodec<dhl> a() {
      return c;
   }

   protected dhl(dgv $$0, dtz.d $$1) {
      super($$1);
      this.l(this.E.b().b(d, Boolean.valueOf(false)));
      if ($$0 instanceof dhk $$2) {
         i.put($$2, this);
         this.k = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + dhk.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<eye> b(dua $$0) {
      return j;
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return h;
   }

   @Override
   protected brk a(cvl $$0, dua $$1, dds $$2, je $$3, cnp $$4, brj $$5, eya $$6) {
      if ($$0.a(cvo.ot) || $$0.a(cvo.tY)) {
         return brk.e;
      } else if (a($$6) && $$0.f() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return brk.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      brk $$5 = dhh.a($$1, $$2, dgx.eg.o(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(eya $$0) {
      return $$0.e().e - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(d);
   }

   @Override
   public cvl a(ddv $$0, je $$1, dua $$2) {
      return new cvl(dgx.eg);
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      return $$1 == jj.a && !$$0.a($$3, $$4) ? dgx.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected int a(dua $$0, dds $$1, je $$2) {
      return dhh.d;
   }

   @Override
   protected boolean c_(dua $$0) {
      return true;
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return false;
   }

   public static dua a(dhk $$0) {
      return i.get($$0).o();
   }

   public static boolean h(dua $$0) {
      return $$0.a(aws.bl, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
