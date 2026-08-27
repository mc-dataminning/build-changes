import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlp extends dfa {
   public static final MapCodec<dlp> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dfa::b), u()).apply($$0, dlp::new));

   @Override
   public MapCodec<dlp> a() {
      return e;
   }

   public dlp(il<bpf> $$0, int $$1, doy.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dlp(cui $$0, doy.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(doz $$0, cyd $$1, ib $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dca.dV) || $$0.a(dca.dW) || $$0.a(dca.dX);
   }

   @Override
   public void a(doz $$0, cyx $$1, ib $$2, axr $$3) {
      est $$4 = this.a($$0, $$1, $$2, esf.a());
      esa $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.c;
      double $$7 = (double)$$2.w() + $$5.e;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(kl.ac, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, bpv $$3) {
      if (!$$1.B && $$1.ak() != bnx.a) {
         if ($$3 instanceof bqo $$4 && !$$4.b($$1.ai().p())) {
            $$4.b(new bph(bpj.t, 40));
         }
      }
   }
}
