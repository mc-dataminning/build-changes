import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eow extends eox {
   public static final MapCodec<eow> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ayu.m.fieldOf("tries").orElse(128).forGetter($$0x -> $$0x.b),
               ayu.l.fieldOf("radius").orElse(2).forGetter($$0x -> $$0x.c),
               ayu.l.fieldOf("height").orElse(1).forGetter($$0x -> $$0x.d),
               eod.a.fieldOf("block_state_provider").forGetter($$0x -> $$0x.e)
            )
            .apply($$0, eow::new)
   );
   private final int b;
   private final int c;
   private final int d;
   private final eod e;

   public eow(int $$0, int $$1, int $$2, eod $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   protected eoy<?> a() {
      return eoy.i;
   }

   @Override
   public void a(eox.a $$0) {
      List<iv> $$1 = elk.a($$0);
      if (!$$1.isEmpty()) {
         iv $$2 = $$1.getFirst();
         int $$3 = $$2.v();
         int $$4 = $$2.u();
         int $$5 = $$2.u();
         int $$6 = $$2.w();
         int $$7 = $$2.w();

         for (iv $$8 : $$1) {
            if ($$8.v() == $$3) {
               $$4 = Math.min($$4, $$8.u());
               $$5 = Math.max($$5, $$8.u());
               $$6 = Math.min($$6, $$8.w());
               $$7 = Math.max($$7, $$8.w());
            }
         }

         azv $$9 = $$0.b();
         erf $$10 = new erf($$4, $$3, $$6, $$5, $$3, $$7).c(this.c, this.d, this.c);
         iv.a $$11 = new iv.a();

         for (int $$12 = 0; $$12 < this.b; $$12++) {
            $$11.d($$9.a($$10.h(), $$10.k()), $$9.a($$10.i(), $$10.l()), $$9.a($$10.j(), $$10.m()));
            this.a($$0, $$11);
         }
      }
   }

   private void a(eox.a $$0, iv $$1) {
      iv $$2 = $$1.d();
      if ($$0.a().a($$2, $$0x -> $$0x.l() || $$0x.a(dmt.fx)) && $$0.a($$1, eas.a::s)) {
         $$0.a($$2, this.e.a($$0.b(), $$2));
      }
   }
}
