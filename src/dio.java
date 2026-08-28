import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dio extends dgq {
   public static final MapCodec<dio> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lx.e.q().fieldOf("candle").forGetter($$0x -> $$0x.k), t()).apply($$0, dio::new)
   );
   public static final dvu d = dgq.b;
   protected static final float e = 1.0F;
   protected static final fab f = dhy.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final fab g = dhy.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final fab h = ezy.a(f, g);
   private static final Map<din, dio> i = Maps.newHashMap();
   private static final Iterable<ezh> j = ImmutableList.of(new ezh(0.5, 1.0, 0.5));
   private final din k;

   @Override
   public MapCodec<dio> a() {
      return c;
   }

   protected dio(dhy $$0, dvc.d $$1) {
      super($$1);
      this.l(this.F.b().b(d, Boolean.valueOf(false)));
      if ($$0 instanceof din $$2) {
         i.put($$2, this);
         this.k = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + din.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<ezh> b(dvd $$0) {
      return j;
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return h;
   }

   @Override
   protected bry a(cvx $$0, dvd $$1, dev $$2, jg $$3, coh $$4, brx $$5, ezd $$6) {
      if ($$0.a(cwb.ot) || $$0.a(cwb.tY)) {
         return bry.e;
      } else if (a($$6) && $$0.f() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return bry.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      bry $$5 = dik.a($$1, $$2, dia.eg.m(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(ezd $$0) {
      return $$0.g().e - (double)$$0.b().v() > 0.5;
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(d);
   }

   @Override
   public cvx a(dey $$0, jg $$1, dvd $$2) {
      return new cvx(dia.eg);
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      return $$1 == jl.a && !$$0.a($$3, $$4) ? dia.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected int a(dvd $$0, dev $$1, jg $$2) {
      return dik.d;
   }

   @Override
   protected boolean c_(dvd $$0) {
      return true;
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }

   public static dvd a(din $$0) {
      return i.get($$0).m();
   }

   public static boolean h(dvd $$0) {
      return $$0.a(awz.bl, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
