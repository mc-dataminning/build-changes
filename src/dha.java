import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dha extends dem implements dmb {
   public static final MapCodec<dha> a = b(dha::new);
   public static final alf b = new alf("sherds");
   private static final ewl d = dfa.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dsx e = dst.R;
   public static final dsu c = dst.bw;
   private static final dsu f = dst.C;

   @Override
   public MapCodec<dha> a() {
      return a;
   }

   protected dha(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, je.c).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, enx.c, enx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dsd a(cyb $$0) {
      enw $$1 = $$0.q().b_($$0.a());
      return this.o().a(e, $$0.g()).a(f, Boolean.valueOf($$1.a() == enx.c)).a(c, Boolean.valueOf(false));
   }

   @Override
   protected bqx a(cuq $$0, dsd $$1, dbz $$2, iz $$3, cmy $$4, bqu $$5, evo $$6) {
      if ($$2.c_($$3) instanceof dpy $$7) {
         if ($$2.B) {
            return bqx.b;
         } else {
            cuq $$9 = $$7.f();
            if (!$$0.e() && ($$9.e() || cuq.c($$9, $$0) && $$9.I() < $$9.j())) {
               $$7.a(dpy.a.a);
               $$4.b(awk.c.b($$0.g()));
               cuq $$10 = $$4.f() ? $$0.c(1) : $$0.a(1);
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
               $$2.a($$4, dww.c, $$3);
               return bqx.a;
            } else {
               return bqx.d;
            }
         }
      } else {
         return bqx.e;
      }
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      if ($$1.c_($$2) instanceof dpy $$5) {
         $$1.a(null, $$2, awa.gz, awb.e, 1.0F, 1.0F);
         $$5.a(dpy.a.b);
         $$1.a($$3, dww.c, $$2);
         return bqv.a;
      } else {
         return bqv.e;
      }
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return false;
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return d;
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public dpi a(iz $$0, dsd $$1) {
      return new dpy($$0, $$1);
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      bqr.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected List<cuq> a(dsd $$0, eqm.a $$1) {
      dpi $$2 = $$1.b(etf.h);
      if ($$2 instanceof dpy $$3) {
         $$1.a(b, $$1x -> {
            for (cul $$2x : $$3.l().a()) {
               $$1x.accept($$2x.w());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public dsd a(dbz $$0, iz $$1, dsd $$2, cmy $$3) {
      cuq $$4 = $$3.eX();
      dsd $$5 = $$2;
      if ($$4.a(awy.bw) && !dac.h($$4)) {
         $$5 = $$2.a(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected enw b_(dsd $$0) {
      return $$0.c(f) ? enx.c.a(false) : super.b_($$0);
   }

   @Override
   protected dmn g_(dsd $$0) {
      return $$0.c(c) ? dmn.bc : dmn.bb;
   }

   @Override
   public void a(cuq $$0, cul.b $$1, List<xp> $$2, cwj $$3) {
      super.a($$0, $$1, $$2, $$3);
      dqm $$4 = $$0.a(km.Z, dqm.a);
      if (!$$4.equals(dqm.a)) {
         $$2.add(xo.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new cuq($$1x.orElse(cut.qL), 1).x().e().a(n.h)));
      }
   }

   @Override
   protected void a(dbz $$0, dsd $$1, evo $$2, cnq $$3) {
      iz $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, $$1.a(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public cuq a(dcc $$0, iz $$1, dsd $$2) {
      return $$0.c_($$1) instanceof dpy $$3 ? $$3.u() : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(dsd $$0) {
      return true;
   }

   @Override
   protected int a(dsd $$0, dbz $$1, iz $$2) {
      return cpv.a($$1.c_($$2));
   }

   @Override
   protected dsd a(dsd $$0, dln $$1) {
      return $$0.a(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dsd a(dsd $$0, djx $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }
}
