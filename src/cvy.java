import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cvy extends ctm implements daz {
   public static final MapCodec<cvy> a = b(cvy::new);
   public static final afw b = new afw("sherds");
   private static final eiy d = cua.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dgv e = dgr.R;
   public static final dgs c = dgr.bw;
   private static final dgs f = dgr.C;

   @Override
   public MapCodec<cvy> a() {
      return a;
   }

   protected cvy(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, hx.c).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, ebf.c, ebf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dgb a(cmr $$0) {
      ebe $$1 = $$0.q().b_($$0.a());
      return this.o().a(e, $$0.g()).a(f, Boolean.valueOf($$1.a() == ebf.c)).a(c, Boolean.valueOf(false));
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      if (!($$1.c_($$2) instanceof dem $$6)) {
         return bib.d;
      } else {
         ckj var13 = $$3.b($$4);
         ckj $$9 = $$6.v();
         if (!var13.b() && ($$9.b() || ckj.c($$9, var13) && $$9.L() < $$9.g())) {
            $$6.a(dem.b.a);
            $$3.b(aqn.c.b(var13.d()));
            ckj $$10 = $$3.f() ? var13.c(1) : var13.a(1);
            float $$11;
            if ($$6.ai_()) {
               $$6.b($$10);
               $$11 = (float)$$10.L() / (float)$$10.g();
            } else {
               $$9.g(1);
               $$11 = (float)$$9.L() / (float)$$9.g();
            }

            $$1.a(null, $$2, aqd.fu, aqe.e, 1.0F, 0.7F + 0.5F * $$11);
            if ($$1 instanceof alq $$13) {
               $$13.a(js.aR, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.c($$2, this);
         } else {
            $$1.a(null, $$2, aqd.fv, aqe.e, 1.0F, 1.0F);
            $$6.a(dem.b.b);
         }

         $$1.a($$3, dkl.c, $$2);
         return bib.a;
      }
   }

   @Override
   public void a(cqz $$0, ht $$1, dgb $$2, @Nullable bkj $$3, ckj $$4) {
      if ($$0.B) {
         $$0.a($$1, ddz.O).ifPresent($$1x -> $$1x.a($$4));
      }
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return false;
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return d;
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public ddx a(ht $$0, dgb $$1) {
      return new dem($$0, $$1);
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      bhx.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public List<ckj> a(dgb $$0, edo.a $$1) {
      ddx $$2 = $$1.b(eft.h);
      if ($$2 instanceof dem $$3) {
         $$1.a(b, $$1x -> $$3.i().a().map(cke::al_).forEach($$1x));
      }

      return super.a($$0, $$1);
   }

   @Override
   public dgb a(cqz $$0, ht $$1, dgb $$2, ccx $$3) {
      ckj $$4 = $$3.eS();
      dgb $$5 = $$2;
      if ($$4.a(ara.aT) && !cov.f($$4)) {
         $$5 = $$2.a(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   public ebe c_(dgb $$0) {
      return $$0.c(f) ? ebf.c.a(false) : super.c_($$0);
   }

   @Override
   public dbl m(dgb $$0) {
      return $$0.c(c) ? dbl.aY : dbl.aX;
   }

   @Override
   public void a(ckj $$0, @Nullable cqf $$1, List<ui> $$2, cma $$3) {
      super.a($$0, $$1, $$2, $$3);
      dem.a $$4 = dem.a.b(cic.a($$0));
      if (!$$4.equals(dem.a.a)) {
         $$2.add(uh.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new ckj($$1x, 1).y().e().a(n.h)));
      }
   }

   @Override
   public void a(cqz $$0, dgb $$1, eib $$2, cdp $$3) {
      ht $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.ag().a(aqv.g)) {
         $$0.a($$4, $$1.a(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public ckj a(crc $$0, ht $$1, dgb $$2) {
      return $$0.c_($$1) instanceof dem $$3 ? $$3.j() : super.a($$0, $$1, $$2);
   }

   @Override
   public boolean d_(dgb $$0) {
      return true;
   }

   @Override
   public int a(dgb $$0, cqz $$1, ht $$2) {
      return cfp.a($$1.c_($$2));
   }
}
