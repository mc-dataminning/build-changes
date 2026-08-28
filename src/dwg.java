import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwg extends dpf {
   public static final MapCodec<dwg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(b.forGetter(dpf::c), t()).apply($$0, dwg::new));

   @Override
   public MapCodec<dwg> a() {
      return a;
   }

   public dwg(je<bvf> $$0, float $$1, dzy.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dwg(dca $$0, dzy.d $$1) {
      super($$0, $$1);
   }

   @Override
   protected boolean b(dzz $$0, dib $$1, iu $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dmc.ej) || $$0.a(dmc.ek) || $$0.a(dmc.el);
   }

   @Override
   public void a(dzz $$0, div $$1, iu $$2, azv $$3) {
      ffc $$4 = this.a($$0, $$1, $$2, fen.a());
      fei $$5 = $$4.a().f();
      double $$6 = (double)$$2.u() + $$5.d;
      double $$7 = (double)$$2.w() + $$5.f;

      for (int $$8 = 0; $$8 < 3; $$8++) {
         if ($$3.h()) {
            $$1.a(lx.ah, $$6 + $$3.j() / 5.0, (double)$$2.v() + (0.5 - $$3.j()), $$7 + $$3.j() / 5.0, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, bwd $$3) {
      if ($$1 instanceof arq $$4 && $$1.an() != bty.a && $$3 instanceof bxc $$5 && !$$5.a($$4, $$1.al().r())) {
         $$5.a(this.b());
      }
   }

   @Override
   public bvh b() {
      return new bvh(bvj.t, 40);
   }
}
