import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cxf extends cur implements dcf {
   public static final MapCodec<cxf> a = b(cxf::new);
   public static final agm b = new agm("sherds");
   private static final eks d = cvf.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dih e = did.R;
   public static final die c = did.bw;
   private static final die f = did.C;

   @Override
   public MapCodec<cxf> a() {
      return a;
   }

   protected cxf(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, ib.c).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, ecy.c, ecy.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dhn a(cnw $$0) {
      ecx $$1 = $$0.q().b_($$0.a());
      return this.o().a(e, $$0.g()).a(f, Boolean.valueOf($$1.a() == ecy.c)).a(c, Boolean.valueOf(false));
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      if (!($$1.c_($$2) instanceof dfy $$6)) {
         return bjb.d;
      } else {
         clo var13 = $$3.b($$4);
         clo $$9 = $$6.x();
         if (!var13.b() && ($$9.b() || clo.c($$9, var13) && $$9.L() < $$9.g())) {
            $$6.a(dfy.b.a);
            $$3.b(arf.c.b(var13.d()));
            clo $$10 = $$3.f() ? var13.c(1) : var13.a(1);
            float $$11;
            if ($$6.aj_()) {
               $$6.b($$10);
               $$11 = (float)$$10.L() / (float)$$10.g();
            } else {
               $$9.g(1);
               $$11 = (float)$$9.L() / (float)$$9.g();
            }

            $$1.a(null, $$2, aqv.fM, aqw.e, 1.0F, 0.7F + 0.5F * $$11);
            if ($$1 instanceof ami $$13) {
               $$13.a(jw.aS, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.c($$2, this);
         } else {
            $$1.a(null, $$2, aqv.fN, aqw.e, 1.0F, 1.0F);
            $$6.a(dfy.b.b);
         }

         $$1.a($$3, dlx.c, $$2);
         return bjb.a;
      }
   }

   @Override
   public void a(csf $$0, hx $$1, dhn $$2, @Nullable bll $$3, clo $$4) {
      if ($$0.B) {
         $$0.a($$1, dfk.O).ifPresent($$1x -> $$1x.a($$4));
      }
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return false;
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return d;
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public dfi a(hx $$0, dhn $$1) {
      return new dfy($$0, $$1);
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      bix.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public List<clo> a(dhn $$0, efi.a $$1) {
      dfi $$2 = $$1.b(ehn.h);
      if ($$2 instanceof dfy $$3) {
         $$1.a(b, $$1x -> $$3.m().a().map(clj::an_).forEach($$1x));
      }

      return super.a($$0, $$1);
   }

   @Override
   public dhn a(csf $$0, hx $$1, dhn $$2, cdz $$3) {
      clo $$4 = $$3.eU();
      dhn $$5 = $$2;
      if ($$4.a(ars.aT) && !cqb.f($$4)) {
         $$5 = $$2.a(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   public ecx c_(dhn $$0) {
      return $$0.c(f) ? ecy.c.a(false) : super.c_($$0);
   }

   @Override
   public dcr m(dhn $$0) {
      return $$0.c(c) ? dcr.bc : dcr.bb;
   }

   @Override
   public void a(clo $$0, @Nullable crl $$1, List<uv> $$2, cnf $$3) {
      super.a($$0, $$1, $$2, $$3);
      dfy.a $$4 = dfy.a.b(cjh.a($$0));
      if (!$$4.equals(dfy.a.a)) {
         $$2.add(uu.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new clo($$1x, 1).y().e().a(n.h)));
      }
   }

   @Override
   public void a(csf $$0, dhn $$1, ejv $$2, cer $$3) {
      hx $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, $$1.a(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public clo a(csi $$0, hx $$1, dhn $$2) {
      return $$0.c_($$1) instanceof dfy $$3 ? $$3.w() : super.a($$0, $$1, $$2);
   }

   @Override
   public boolean d_(dhn $$0) {
      return true;
   }

   @Override
   public int a(dhn $$0, csf $$1, hx $$2) {
      return cgr.a($$1.c_($$2));
   }
}
