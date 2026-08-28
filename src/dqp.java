import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dqp extends dpx {
   public static final MapCodec<dqp> f = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), t()).apply($$0, dqp::new));
   public static final dvm g = dli.aF;
   protected static final float h = 2.5F;
   private static final Map<jk, ezq> i = Maps.newEnumMap(
      ImmutableMap.of(
         jk.c,
         dhm.a(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         jk.d,
         dhm.a(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         jk.e,
         dhm.a(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         jk.f,
         dhm.a(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   @Override
   public MapCodec<dqp> a() {
      return f;
   }

   protected dqp(ls $$0, dur.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(g, jk.c));
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return o($$0);
   }

   public static ezq o(dus $$0) {
      return i.get($$0.c(g));
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      return b($$1, $$2, $$0.c(g));
   }

   public static boolean b(dem $$0, jf $$1, jk $$2) {
      jf $$3 = $$1.a($$2.g());
      dus $$4 = $$0.a_($$3);
      return $$4.c($$0, $$3, $$2);
   }

   @Nullable
   @Override
   public dus a(czn $$0) {
      dus $$1 = this.n();
      dem $$2 = $$0.q();
      jf $$3 = $$0.a();
      jk[] $$4 = $$0.f();

      for (jk $$5 : $$4) {
         if ($$5.o().d()) {
            jk $$6 = $$5.g();
            $$1 = $$1.b(g, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      return $$1.g() == $$0.c(g) && !$$0.a($$3, $$4) ? dho.a.n() : $$0;
   }

   @Override
   public void a(dus $$0, dej $$1, jf $$2, azn $$3) {
      jk $$4 = $$0.c(g);
      double $$5 = (double)$$2.u() + 0.5;
      double $$6 = (double)$$2.v() + 0.7;
      double $$7 = (double)$$2.w() + 0.5;
      double $$8 = 0.22;
      double $$9 = 0.27;
      jk $$10 = $$4.g();
      $$1.a(lo.ae, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
      $$1.a(this.e, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      return $$0.b(g, $$1.a($$0.c(g)));
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(g);
   }
}
