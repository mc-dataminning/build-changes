import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cws extends cuf implements dbt {
   public static final MapCodec<cws> a = b(cws::new);
   public static final agg b = new agg("sherds");
   private static final ekb d = cut.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dhq e = dhm.R;
   public static final dhn c = dhm.bw;
   private static final dhn f = dhm.C;

   @Override
   public MapCodec<cws> a() {
      return a;
   }

   protected cws(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, hx.c).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, ech.c, ech.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dgw a(cnj $$0) {
      ecg $$1 = $$0.q().b_($$0.a());
      return this.o().a(e, $$0.g()).a(f, Boolean.valueOf($$1.a() == ech.c)).a(c, Boolean.valueOf(false));
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      if (!($$1.c_($$2) instanceof dfh $$6)) {
         return biq.d;
      } else {
         clb var13 = $$3.b($$4);
         clb $$9 = $$6.v();
         if (!var13.b() && ($$9.b() || clb.c($$9, var13) && $$9.L() < $$9.g())) {
            $$6.a(dfh.b.a);
            $$3.b(aqx.c.b(var13.d()));
            clb $$10 = $$3.f() ? var13.c(1) : var13.a(1);
            float $$11;
            if ($$6.ai_()) {
               $$6.b($$10);
               $$11 = (float)$$10.L() / (float)$$10.g();
            } else {
               $$9.g(1);
               $$11 = (float)$$9.L() / (float)$$9.g();
            }

            $$1.a(null, $$2, aqn.fw, aqo.e, 1.0F, 0.7F + 0.5F * $$11);
            if ($$1 instanceof ama $$13) {
               $$13.a(js.aS, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.c($$2, this);
         } else {
            $$1.a(null, $$2, aqn.fx, aqo.e, 1.0F, 1.0F);
            $$6.a(dfh.b.b);
         }

         $$1.a($$3, dlg.c, $$2);
         return biq.a;
      }
   }

   @Override
   public void a(crs $$0, ht $$1, dgw $$2, @Nullable bky $$3, clb $$4) {
      if ($$0.B) {
         $$0.a($$1, det.O).ifPresent($$1x -> $$1x.a($$4));
      }
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return d;
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public der a(ht $$0, dgw $$1) {
      return new dfh($$0, $$1);
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      bim.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public List<clb> a(dgw $$0, eer.a $$1) {
      der $$2 = $$1.b(egw.h);
      if ($$2 instanceof dfh $$3) {
         $$1.a(b, $$1x -> $$3.i().a().map(ckw::al_).forEach($$1x));
      }

      return super.a($$0, $$1);
   }

   @Override
   public dgw a(crs $$0, ht $$1, dgw $$2, cdm $$3) {
      clb $$4 = $$3.eS();
      dgw $$5 = $$2;
      if ($$4.a(ark.aT) && !cpo.f($$4)) {
         $$5 = $$2.a(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   public ecg c_(dgw $$0) {
      return $$0.c(f) ? ech.c.a(false) : super.c_($$0);
   }

   @Override
   public dcf m(dgw $$0) {
      return $$0.c(c) ? dcf.aY : dcf.aX;
   }

   @Override
   public void a(clb $$0, @Nullable cqy $$1, List<ur> $$2, cms $$3) {
      super.a($$0, $$1, $$2, $$3);
      dfh.a $$4 = dfh.a.b(ciu.a($$0));
      if (!$$4.equals(dfh.a.a)) {
         $$2.add(uq.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new clb($$1x, 1).y().e().a(n.h)));
      }
   }

   @Override
   public void a(crs $$0, dgw $$1, eje $$2, cee $$3) {
      ht $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, $$1.a(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public clb a(crv $$0, ht $$1, dgw $$2) {
      return $$0.c_($$1) instanceof dfh $$3 ? $$3.j() : super.a($$0, $$1, $$2);
   }

   @Override
   public boolean d_(dgw $$0) {
      return true;
   }

   @Override
   public int a(dgw $$0, crs $$1, ht $$2) {
      return cge.a($$1.c_($$2));
   }
}
