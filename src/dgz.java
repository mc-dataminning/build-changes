import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dgz extends del implements dma {
   public static final MapCodec<dgz> a = b(dgz::new);
   public static final alf b = new alf("sherds");
   private static final ewk d = dez.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dsw e = dss.R;
   public static final dst c = dss.bw;
   private static final dst f = dss.C;

   @Override
   public MapCodec<dgz> a() {
      return a;
   }

   protected dgz(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, je.c).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, enw.c, enw.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dsc a(cya $$0) {
      env $$1 = $$0.q().b_($$0.a());
      return this.o().a(e, $$0.g()).a(f, Boolean.valueOf($$1.a() == enw.c)).a(c, Boolean.valueOf(false));
   }

   @Override
   protected bqw a(cup $$0, dsc $$1, dby $$2, iz $$3, cmx $$4, bqt $$5, evn $$6) {
      if ($$2.c_($$3) instanceof dpx $$7) {
         if ($$2.B) {
            return bqw.b;
         } else {
            cup $$9 = $$7.f();
            if (!$$0.e() && ($$9.e() || cup.c($$9, $$0) && $$9.I() < $$9.j())) {
               $$7.a(dpx.a.a);
               $$4.b(awk.c.b($$0.g()));
               cup $$10 = $$4.f() ? $$0.c(1) : $$0.a(1);
               float $$11;
               if ($$7.c()) {
                  $$7.b($$10);
                  $$11 = (float)$$10.I() / (float)$$10.j();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.I() / (float)$$9.j();
               }

               $$2.a(null, $$3, awa.gy, awb.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof arf $$13) {
                  $$13.a(li.aX, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, dwv.c, $$3);
               return bqw.a;
            } else {
               return bqw.d;
            }
         }
      } else {
         return bqw.e;
      }
   }

   @Override
   protected bqu a(dsc $$0, dby $$1, iz $$2, cmx $$3, evn $$4) {
      if ($$1.c_($$2) instanceof dpx $$5) {
         $$1.a(null, $$2, awa.gz, awb.e, 1.0F, 1.0F);
         $$5.a(dpx.a.b);
         $$1.a($$3, dwv.c, $$2);
         return bqu.a;
      } else {
         return bqu.e;
      }
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      return false;
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return d;
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public dph a(iz $$0, dsc $$1) {
      return new dpx($$0, $$1);
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, dsc $$3, boolean $$4) {
      bqq.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected List<cup> a(dsc $$0, eql.a $$1) {
      dph $$2 = $$1.b(ete.h);
      if ($$2 instanceof dpx $$3) {
         $$1.a(b, $$1x -> {
            for (cuk $$2x : $$3.l().a()) {
               $$1x.accept($$2x.w());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public dsc a(dby $$0, iz $$1, dsc $$2, cmx $$3) {
      cup $$4 = $$3.eX();
      dsc $$5 = $$2;
      if ($$4.a(awy.bw) && !dab.h($$4)) {
         $$5 = $$2.a(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected env b_(dsc $$0) {
      return $$0.c(f) ? enw.c.a(false) : super.b_($$0);
   }

   @Override
   protected dmm g_(dsc $$0) {
      return $$0.c(c) ? dmm.bc : dmm.bb;
   }

   @Override
   public void a(cup $$0, cuk.b $$1, List<xp> $$2, cwi $$3) {
      super.a($$0, $$1, $$2, $$3);
      dql $$4 = $$0.a(km.Z, dql.a);
      if (!$$4.equals(dql.a)) {
         $$2.add(xo.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new cup($$1x.orElse(cus.qL), 1).x().e().a(n.h)));
      }
   }

   @Override
   protected void a(dby $$0, dsc $$1, evn $$2, cnp $$3) {
      iz $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, $$1.a(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public cup a(dcb $$0, iz $$1, dsc $$2) {
      return $$0.c_($$1) instanceof dpx $$3 ? $$3.u() : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(dsc $$0) {
      return true;
   }

   @Override
   protected int a(dsc $$0, dby $$1, iz $$2) {
      return cpu.a($$1.c_($$2));
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
      return $$0.a(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dsc a(dsc $$0, djw $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }
}
