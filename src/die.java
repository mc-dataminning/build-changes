import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class die extends dbq {
   public static final MapCodec<die> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter(dbq::b), u()).apply($$0, die::new));

   @Override
   public MapCodec<die> a() {
      return e;
   }

   public die(ij<bmz> $$0, int $$1, dle.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public die(List<dgp.a> $$0, dle.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(dlf $$0, cut $$1, hz $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(cyq.dV) || $$0.a(cyq.dW) || $$0.a(cyq.dX);
   }

   @Override
   public void a(dlf $$0, cvn $$1, hz $$2, awo $$3) {
      eol $$4 = this.a($$0, $$1, $$2, enx.a());
      ens $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.c;
      double $$7 = (double)$$2.w() + $$5.e;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(jz.ab, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, bno $$3) {
      if (!$$1.B && $$1.ak() != blr.a) {
         if ($$3 instanceof bog $$4 && !$$4.b($$1.ai().p())) {
            $$4.b(new bnb(bnd.t, 40));
         }
      }
   }
}
