import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dqf extends dlr {
   public static final MapCodec<dqf> a = b(dqf::new);
   public static final ebf<ja> b = eax.S;
   public static final eay c = eax.i;
   private final Function<eah, ffk> d;
   private final Map<ja, ffk> e;

   @Override
   public MapCodec<dqf> a() {
      return a;
   }

   public dqf(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, ja.a).b(c, Boolean.valueOf(true)));
      ffk $$1 = dmf.b(12.0, 11.0, 16.0);
      this.d = this.b($$1);
      this.e = ImmutableMap.builderWithExpectedSize(5).putAll(ffh.c(ffh.a($$1, dmf.a(4.0, 8.0, 10.0, 0.0, 4.0)))).put(ja.a, $$1).build();
   }

   private Function<eah, ffk> b(ffk $$0) {
      ffk $$1 = ffh.a(dmf.b(16.0, 10.0, 16.0), dmf.b(8.0, 4.0, 10.0));
      ffk $$2 = ffh.a($$1, $$0, feu.e);
      Map<ja, ffk> $$3 = ffh.d(dmf.a(4.0, 4.0, 8.0, 0.0, 8.0), new feq(8.0, 6.0, 8.0).c(0.0625));
      return this.a($$2x -> ffh.a($$2, ffh.a($$3.get($$2x.c(b)), ffh.b(), feu.i)), new ebk[]{c});
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return this.d.apply($$0);
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2) {
      return this.e.get($$0.c(b));
   }

   @Override
   public eah a(dcw $$0) {
      ja $$1 = $$0.k().g();
      return this.m().b(b, $$1.o() == ja.a.b ? ja.a : $$1).b(c, Boolean.valueOf(true));
   }

   @Override
   public dxf a(iu $$0, eah $$1) {
      return new dyi($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxf> dxg<T> a(dja $$0, eah $$1, dxh<T> $$2) {
      return $$0.C ? null : a($$2, dxh.s, dyi::a);
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, eah $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dyi $$5) {
         $$3.a($$5);
         $$3.a(awx.ad);
      }

      return bud.a;
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, dmf $$3, @Nullable exw $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(dja $$0, iu $$1, eah $$2) {
      boolean $$3 = !$$0.D($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, boolean $$3) {
      btz.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(eah $$0) {
      return true;
   }

   @Override
   protected int a(eah $$0, dja $$1, iu $$2) {
      return cuv.a($$1.c_($$2));
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eah a(eah $$0, dri $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, bwf $$3) {
      dxf $$4 = $$1.c_($$2);
      if ($$4 instanceof dyi) {
         dyi.a($$1, $$2, $$0, $$3, (dyi)$$4);
      }
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return false;
   }
}
