import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cxz extends cvl implements dcz {
   public static final MapCodec<cxz> a = b(cxz::new);
   public static final agt b = new agt("sherds");
   private static final elu d = cvz.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final djj e = djf.R;
   public static final djg c = djf.bw;
   private static final djg f = djf.C;

   @Override
   public MapCodec<cxz> a() {
      return a;
   }

   protected cxz(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, ia.c).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eea.c, eea.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dip a(coq $$0) {
      edz $$1 = $$0.q().b_($$0.a());
      return this.o().a(e, $$0.g()).a(f, Boolean.valueOf($$1.a() == eea.c)).a(c, Boolean.valueOf(false));
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      if (!($$1.c_($$2) instanceof dgt $$6)) {
         return bjl.d;
      } else {
         cmh var13 = $$3.b($$4);
         cmh $$9 = $$6.x();
         if (!var13.b() && ($$9.b() || cmh.c($$9, var13) && $$9.L() < $$9.g())) {
            $$6.a(dgt.b.a);
            $$3.b(arm.c.b(var13.d()));
            cmh $$10 = $$3.f() ? var13.c(1) : var13.a(1);
            float $$11;
            if ($$6.ai_()) {
               $$6.b($$10);
               $$11 = (float)$$10.L() / (float)$$10.g();
            } else {
               $$9.g(1);
               $$11 = (float)$$9.L() / (float)$$9.g();
            }

            $$1.a(null, $$2, arc.fV, ard.e, 1.0F, 0.7F + 0.5F * $$11);
            if ($$1 instanceof amp $$13) {
               $$13.a(jv.aU, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.c($$2, this);
         } else {
            $$1.a(null, $$2, arc.fW, ard.e, 1.0F, 1.0F);
            $$6.a(dgt.b.b);
         }

         $$1.a($$3, dmz.c, $$2);
         return bjl.a;
      }
   }

   @Override
   public void a(csy $$0, hv $$1, dip $$2, @Nullable blv $$3, cmh $$4) {
      if ($$0.B) {
         $$0.a($$1, dgf.O).ifPresent($$1x -> $$1x.a($$4));
      }
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return d;
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public dgd a(hv $$0, dip $$1) {
      return new dgt($$0, $$1);
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      bjh.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public List<cmh> a(dip $$0, egk.a $$1) {
      dgd $$2 = $$1.b(eip.h);
      if ($$2 instanceof dgt $$3) {
         $$1.a(b, $$1x -> $$3.m().a().map(cmc::am_).forEach($$1x));
      }

      return super.a($$0, $$1);
   }

   @Override
   public dip a(csy $$0, hv $$1, dip $$2, cer $$3) {
      cmh $$4 = $$3.eT();
      dip $$5 = $$2;
      if ($$4.a(arz.aT) && !cqu.f($$4)) {
         $$5 = $$2.a(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   public edz c_(dip $$0) {
      return $$0.c(f) ? eea.c.a(false) : super.c_($$0);
   }

   @Override
   public ddl m(dip $$0) {
      return $$0.c(c) ? ddl.bc : ddl.bb;
   }

   @Override
   public void a(cmh $$0, @Nullable cse $$1, List<vb> $$2, cny $$3) {
      super.a($$0, $$1, $$2, $$3);
      dgt.a $$4 = dgt.a.b(cka.a($$0));
      if (!$$4.equals(dgt.a.a)) {
         $$2.add(va.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new cmh($$1x, 1).y().e().a(n.h)));
      }
   }

   @Override
   public void a(csy $$0, dip $$1, ekx $$2, cfj $$3) {
      hv $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, $$1.a(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public cmh a(ctb $$0, hv $$1, dip $$2) {
      return $$0.c_($$1) instanceof dgt $$3 ? $$3.w() : super.a($$0, $$1, $$2);
   }

   @Override
   public boolean d_(dip $$0) {
      return true;
   }

   @Override
   public int a(dip $$0, csy $$1, hv $$2) {
      return chk.a($$1.c_($$2));
   }
}
