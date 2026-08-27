import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cyj extends cvv implements ddj {
   public static final MapCodec<cyj> a = b(cyj::new);
   public static final ahd b = new ahd("sherds");
   private static final emf d = cwj.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dju e = djq.R;
   public static final djr c = djq.bw;
   private static final djr f = djq.C;

   @Override
   public MapCodec<cyj> a() {
      return a;
   }

   protected cyj(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, ic.c).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eel.c, eel.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dja a(cpa $$0) {
      eek $$1 = $$0.q().b_($$0.a());
      return this.o().a(e, $$0.g()).a(f, Boolean.valueOf($$1.a() == eel.c)).a(c, Boolean.valueOf(false));
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      if (!($$1.c_($$2) instanceof dhe $$6)) {
         return bjv.d;
      } else {
         cmr var13 = $$3.b($$4);
         cmr $$9 = $$6.x();
         if (!var13.b() && ($$9.b() || cmr.c($$9, var13) && $$9.L() < $$9.g())) {
            $$6.a(dhe.b.a);
            $$3.b(arw.c.b(var13.d()));
            cmr $$10 = $$3.f() ? var13.c(1) : var13.a(1);
            float $$11;
            if ($$6.ai_()) {
               $$6.b($$10);
               $$11 = (float)$$10.L() / (float)$$10.g();
            } else {
               $$9.g(1);
               $$11 = (float)$$9.L() / (float)$$9.g();
            }

            $$1.a(null, $$2, arm.fV, arn.e, 1.0F, 0.7F + 0.5F * $$11);
            if ($$1 instanceof amz $$13) {
               $$13.a(jx.aU, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.c($$2, this);
         } else {
            $$1.a(null, $$2, arm.fW, arn.e, 1.0F, 1.0F);
            $$6.a(dhe.b.b);
         }

         $$1.a($$3, dnk.c, $$2);
         return bjv.a;
      }
   }

   @Override
   public void a(cti $$0, hx $$1, dja $$2, @Nullable bmf $$3, cmr $$4) {
      if ($$0.B) {
         $$0.a($$1, dgq.O).ifPresent($$1x -> $$1x.a($$4));
      }
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return false;
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return d;
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public dgo a(hx $$0, dja $$1) {
      return new dhe($$0, $$1);
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      bjr.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public List<cmr> a(dja $$0, egv.a $$1) {
      dgo $$2 = $$1.b(eja.h);
      if ($$2 instanceof dhe $$3) {
         $$1.a(b, $$1x -> $$3.m().a().map(cmm::am_).forEach($$1x));
      }

      return super.a($$0, $$1);
   }

   @Override
   public dja a(cti $$0, hx $$1, dja $$2, cfb $$3) {
      cmr $$4 = $$3.eT();
      dja $$5 = $$2;
      if ($$4.a(asj.aT) && !cre.f($$4)) {
         $$5 = $$2.a(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   public eek c_(dja $$0) {
      return $$0.c(f) ? eel.c.a(false) : super.c_($$0);
   }

   @Override
   public ddv m(dja $$0) {
      return $$0.c(c) ? ddv.bc : ddv.bb;
   }

   @Override
   public void a(cmr $$0, @Nullable cso $$1, List<vd> $$2, coi $$3) {
      super.a($$0, $$1, $$2, $$3);
      dhe.a $$4 = dhe.a.b(ckk.a($$0));
      if (!$$4.equals(dhe.a.a)) {
         $$2.add(vc.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new cmr($$1x, 1).y().e().a(n.h)));
      }
   }

   @Override
   public void a(cti $$0, dja $$1, eli $$2, cft $$3) {
      hx $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, $$1.a(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public cmr a(ctl $$0, hx $$1, dja $$2) {
      return $$0.c_($$1) instanceof dhe $$3 ? $$3.w() : super.a($$0, $$1, $$2);
   }

   @Override
   public boolean d_(dja $$0) {
      return true;
   }

   @Override
   public int a(dja $$0, cti $$1, hx $$2) {
      return chu.a($$1.c_($$2));
   }
}
