import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dfe extends dcq implements dkf {
   public static final MapCodec<dfe> a = b(dfe::new);
   public static final akh b = new akh("sherds");
   private static final eui d = dde.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final drb e = dqx.R;
   public static final dqy c = dqx.bw;
   private static final dqy f = dqx.C;

   @Override
   public MapCodec<dfe> a() {
      return a;
   }

   protected dfe(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, is.c).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, emb.c, emb.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dqh a(cwi $$0) {
      ema $$1 = $$0.q().b_($$0.a());
      return this.n().a(e, $$0.g()).a(f, Boolean.valueOf($$1.a() == emb.c)).a(c, Boolean.valueOf(false));
   }

   @Override
   protected bpo a(csz $$0, dqh $$1, dad $$2, in $$3, clh $$4, bpl $$5, etl $$6) {
      if ($$2.c_($$3) instanceof doc $$7) {
         if ($$2.B) {
            return bpo.b;
         } else {
            csz $$9 = $$7.f();
            if (!$$0.d() && ($$9.d() || csz.c($$9, $$0) && $$9.G() < $$9.i())) {
               $$7.a(doc.a.a);
               $$4.b(avm.c.b($$0.f()));
               csz $$10 = $$4.f() ? $$0.c(1) : $$0.a(1);
               float $$11;
               if ($$7.c()) {
                  $$7.b($$10);
                  $$11 = (float)$$10.G() / (float)$$10.i();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.G() / (float)$$9.i();
               }

               $$2.a(null, $$3, avc.gt, avd.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof aqh $$13) {
                  $$13.a(kx.aU, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, dva.c, $$3);
               return bpo.a;
            } else {
               return bpo.d;
            }
         }
      } else {
         return bpo.e;
      }
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      if ($$1.c_($$2) instanceof doc $$5) {
         $$1.a(null, $$2, avc.gu, avd.e, 1.0F, 1.0F);
         $$5.a(doc.a.b);
         $$1.a($$3, dva.c, $$2);
         return bpm.a;
      } else {
         return bpm.d;
      }
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return d;
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public dnm a(in $$0, dqh $$1) {
      return new doc($$0, $$1);
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      bpi.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected List<csz> a(dqh $$0, eoo.a $$1) {
      dnm $$2 = $$1.b(erc.h);
      if ($$2 instanceof doc $$3) {
         $$1.a(b, $$1x -> {
            for (csu $$2x : $$3.l().a()) {
               $$1x.accept($$2x.v());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public dqh a(dad $$0, in $$1, dqh $$2, clh $$3) {
      csz $$4 = $$3.eV();
      dqh $$5 = $$2;
      if ($$4.a(avz.bx) && !cyh.h($$4)) {
         $$5 = $$2.a(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected ema b_(dqh $$0) {
      return $$0.c(f) ? emb.c.a(false) : super.b_($$0);
   }

   @Override
   protected dkr g_(dqh $$0) {
      return $$0.c(c) ? dkr.bc : dkr.bb;
   }

   @Override
   public void a(csz $$0, @Nullable czj $$1, List<wu> $$2, cuq $$3, @Nullable jk $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      doq $$5 = $$0.a(ka.W, doq.a);
      if (!$$5.equals(doq.a)) {
         $$2.add(wt.a);
         Stream.of($$5.e(), $$5.c(), $$5.d(), $$5.b()).forEach($$1x -> $$2.add(new csz($$1x.orElse(ctc.qL), 1).w().e().a(n.h)));
      }
   }

   @Override
   protected void a(dad $$0, dqh $$1, etl $$2, clz $$3) {
      in $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, $$1.a(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public csz a(dag $$0, in $$1, dqh $$2) {
      return $$0.c_($$1) instanceof doc $$3 ? $$3.t() : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(dqh $$0) {
      return true;
   }

   @Override
   protected int a(dqh $$0, dad $$1, in $$2) {
      return cod.a($$1.c_($$2));
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return $$0.a(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }
}
