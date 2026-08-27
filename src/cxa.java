import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cxa extends cum implements dca {
   public static final MapCodec<cxa> a = b(cxa::new);
   public static final agi b = new agi("sherds");
   private static final ekn d = cva.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dic e = dhy.R;
   public static final dhz c = dhy.bw;
   private static final dhz f = dhy.C;

   @Override
   public MapCodec<cxa> a() {
      return a;
   }

   protected cxa(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, hx.c).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, ect.c, ect.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dhi a(cnr $$0) {
      ecs $$1 = $$0.q().b_($$0.a());
      return this.o().a(e, $$0.g()).a(f, Boolean.valueOf($$1.a() == ect.c)).a(c, Boolean.valueOf(false));
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      if (!($$1.c_($$2) instanceof dft $$6)) {
         return bix.d;
      } else {
         clj var13 = $$3.b($$4);
         clj $$9 = $$6.v();
         if (!var13.b() && ($$9.b() || clj.c($$9, var13) && $$9.L() < $$9.g())) {
            $$6.a(dft.b.a);
            $$3.b(arb.c.b(var13.d()));
            clj $$10 = $$3.f() ? var13.c(1) : var13.a(1);
            float $$11;
            if ($$6.ai_()) {
               $$6.b($$10);
               $$11 = (float)$$10.L() / (float)$$10.g();
            } else {
               $$9.g(1);
               $$11 = (float)$$9.L() / (float)$$9.g();
            }

            $$1.a(null, $$2, aqr.fM, aqs.e, 1.0F, 0.7F + 0.5F * $$11);
            if ($$1 instanceof ame $$13) {
               $$13.a(js.aS, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
            }

            $$1.c($$2, this);
         } else {
            $$1.a(null, $$2, aqr.fN, aqs.e, 1.0F, 1.0F);
            $$6.a(dft.b.b);
         }

         $$1.a($$3, dls.c, $$2);
         return bix.a;
      }
   }

   @Override
   public void a(csa $$0, ht $$1, dhi $$2, @Nullable blg $$3, clj $$4) {
      if ($$0.B) {
         $$0.a($$1, dff.O).ifPresent($$1x -> $$1x.a($$4));
      }
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return d;
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public dfd a(ht $$0, dhi $$1) {
      return new dft($$0, $$1);
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      bit.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public List<clj> a(dhi $$0, efd.a $$1) {
      dfd $$2 = $$1.b(ehi.h);
      if ($$2 instanceof dft $$3) {
         $$1.a(b, $$1x -> $$3.i().a().map(cle::al_).forEach($$1x));
      }

      return super.a($$0, $$1);
   }

   @Override
   public dhi a(csa $$0, ht $$1, dhi $$2, cdu $$3) {
      clj $$4 = $$3.eU();
      dhi $$5 = $$2;
      if ($$4.a(aro.aT) && !cpw.f($$4)) {
         $$5 = $$2.a(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   public ecs c_(dhi $$0) {
      return $$0.c(f) ? ect.c.a(false) : super.c_($$0);
   }

   @Override
   public dcm m(dhi $$0) {
      return $$0.c(c) ? dcm.bc : dcm.bb;
   }

   @Override
   public void a(clj $$0, @Nullable crg $$1, List<ur> $$2, cna $$3) {
      super.a($$0, $$1, $$2, $$3);
      dft.a $$4 = dft.a.b(cjc.a($$0));
      if (!$$4.equals(dft.a.a)) {
         $$2.add(uq.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new clj($$1x, 1).y().e().a(n.h)));
      }
   }

   @Override
   public void a(csa $$0, dhi $$1, ejq $$2, cem $$3) {
      ht $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, $$1.a(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public clj a(csd $$0, ht $$1, dhi $$2) {
      return $$0.c_($$1) instanceof dft $$3 ? $$3.j() : super.a($$0, $$1, $$2);
   }

   @Override
   public boolean d_(dhi $$0) {
      return true;
   }

   @Override
   public int a(dhi $$0, csa $$1, ht $$2) {
      return cgm.a($$1.c_($$2));
   }
}
