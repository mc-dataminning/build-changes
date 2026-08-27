import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class das extends cye implements dfs {
   public static final MapCodec<das> a = b(das::new);
   public static final aiy b = new aiy("sherds");
   private static final eos d = cys.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dmd e = dlz.R;
   public static final dma c = dlz.bw;
   private static final dma f = dlz.C;

   @Override
   public MapCodec<das> a() {
      return a;
   }

   protected das(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, ie.c).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, egx.c, egx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dlj a(crk $$0) {
      egw $$1 = $$0.q().b_($$0.a());
      return this.o().a(e, $$0.g()).a(f, Boolean.valueOf($$1.a() == egx.c)).a(c, Boolean.valueOf(false));
   }

   @Override
   protected bly a(cpd $$0, dlj $$1, cvr $$2, hz $$3, chl $$4, blv $$5, env $$6) {
      if ($$2.c_($$3) instanceof djn $$7) {
         if ($$2.B) {
            return bly.b;
         } else {
            cpd $$9 = $$7.x();
            if (!$$0.b() && ($$9.b() || cpd.c($$9, $$0) && $$9.M() < $$9.g())) {
               $$7.a(djn.b.a);
               $$4.b(atv.c.b($$0.d()));
               cpd $$10 = $$4.f() ? $$0.c(1) : $$0.a(1);
               float $$11;
               if ($$7.aj_()) {
                  $$7.b($$10);
                  $$11 = (float)$$10.M() / (float)$$10.g();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.M() / (float)$$9.g();
               }

               $$2.a(null, $$3, atl.gl, atm.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof aow $$13) {
                  $$13.a(jz.aU, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, dpw.c, $$3);
               return bly.a;
            } else {
               return bly.d;
            }
         }
      } else {
         return bly.e;
      }
   }

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      if ($$1.c_($$2) instanceof djn $$5) {
         $$1.a(null, $$2, atl.gm, atm.e, 1.0F, 1.0F);
         $$5.a(djn.b.b);
         $$1.a($$3, dpw.c, $$2);
         return blw.a;
      } else {
         return blw.d;
      }
   }

   @Override
   public void a(cvr $$0, hz $$1, dlj $$2, @Nullable boi $$3, cpd $$4) {
      if ($$0.B) {
         $$0.a($$1, diz.O).ifPresent($$1x -> $$1x.a($$4));
      }
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return false;
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return d;
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public dix a(hz $$0, dlj $$1) {
      return new djn($$0, $$1);
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      bls.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected List<cpd> a(dlj $$0, eji.a $$1) {
      dix $$2 = $$1.b(eln.h);
      if ($$2 instanceof djn $$3) {
         $$1.a(b, $$1x -> $$3.m().a().map(coy::ao_).forEach($$1x));
      }

      return super.a($$0, $$1);
   }

   @Override
   public dlj a(cvr $$0, hz $$1, dlj $$2, chl $$3) {
      cpd $$4 = $$3.eT();
      dlj $$5 = $$2;
      if ($$4.a(aui.aY) && !ctn.f($$4)) {
         $$5 = $$2.a(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected egw c_(dlj $$0) {
      return $$0.c(f) ? egx.c.a(false) : super.c_($$0);
   }

   @Override
   protected dge h_(dlj $$0) {
      return $$0.c(c) ? dge.bc : dge.bb;
   }

   @Override
   public void a(cpd $$0, @Nullable cux $$1, List<vq> $$2, cqu $$3) {
      super.a($$0, $$1, $$2, $$3);
      djn.a $$4 = djn.a.b(cmw.a($$0));
      if (!$$4.equals(djn.a.a)) {
         $$2.add(vp.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new cpd($$1x, 1).z().e().a(n.h)));
      }
   }

   @Override
   protected void a(cvr $$0, dlj $$1, env $$2, cid $$3) {
      hz $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, $$1.a(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public cpd a(cvu $$0, hz $$1, dlj $$2) {
      return $$0.c_($$1) instanceof djn $$3 ? $$3.w() : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean d_(dlj $$0) {
      return true;
   }

   @Override
   protected int a(dlj $$0, cvr $$1, hz $$2) {
      return ckf.a($$1.c_($$2));
   }
}
