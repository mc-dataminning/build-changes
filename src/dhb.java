import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dhb extends den implements dmc {
   public static final MapCodec<dhb> a = b(dhb::new);
   public static final alf b = new alf("sherds");
   private static final ewm d = dfb.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dsy e = dsu.R;
   public static final dsv c = dsu.bw;
   private static final dsv f = dsu.C;

   @Override
   public MapCodec<dhb> a() {
      return a;
   }

   protected dhb(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, je.c).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eny.c, eny.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dse a(cyc $$0) {
      enx $$1 = $$0.q().b_($$0.a());
      return this.o().a(e, $$0.g()).a(f, Boolean.valueOf($$1.a() == eny.c)).a(c, Boolean.valueOf(false));
   }

   @Override
   protected bqy a(cur $$0, dse $$1, dca $$2, iz $$3, cmz $$4, bqv $$5, evp $$6) {
      if ($$2.c_($$3) instanceof dpz $$7) {
         if ($$2.B) {
            return bqy.b;
         } else {
            cur $$9 = $$7.f();
            if (!$$0.e() && ($$9.e() || cur.c($$9, $$0) && $$9.I() < $$9.j())) {
               $$7.a(dpz.a.a);
               $$4.b(awk.c.b($$0.g()));
               cur $$10 = $$4.f() ? $$0.c(1) : $$0.a(1);
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
               $$2.a($$4, dwx.c, $$3);
               return bqy.a;
            } else {
               return bqy.d;
            }
         }
      } else {
         return bqy.e;
      }
   }

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      if ($$1.c_($$2) instanceof dpz $$5) {
         $$1.a(null, $$2, awa.gz, awb.e, 1.0F, 1.0F);
         $$5.a(dpz.a.b);
         $$1.a($$3, dwx.c, $$2);
         return bqw.a;
      } else {
         return bqw.e;
      }
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
      return false;
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return d;
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public dpj a(iz $$0, dse $$1) {
      return new dpz($$0, $$1);
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      bqs.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected List<cur> a(dse $$0, eqn.a $$1) {
      dpj $$2 = $$1.b(etg.h);
      if ($$2 instanceof dpz $$3) {
         $$1.a(b, $$1x -> {
            for (cum $$2x : $$3.l().a()) {
               $$1x.accept($$2x.w());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public dse a(dca $$0, iz $$1, dse $$2, cmz $$3) {
      cur $$4 = $$3.eX();
      dse $$5 = $$2;
      if ($$4.a(awy.bw) && !dad.h($$4)) {
         $$5 = $$2.a(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected enx b_(dse $$0) {
      return $$0.c(f) ? eny.c.a(false) : super.b_($$0);
   }

   @Override
   protected dmo g_(dse $$0) {
      return $$0.c(c) ? dmo.bc : dmo.bb;
   }

   @Override
   public void a(cur $$0, cum.b $$1, List<xp> $$2, cwk $$3) {
      super.a($$0, $$1, $$2, $$3);
      dqn $$4 = $$0.a(km.Z, dqn.a);
      if (!$$4.equals(dqn.a)) {
         $$2.add(xo.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new cur($$1x.orElse(cuu.qL), 1).x().e().a(n.h)));
      }
   }

   @Override
   protected void a(dca $$0, dse $$1, evp $$2, cnr $$3) {
      iz $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, $$1.a(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public cur a(dcd $$0, iz $$1, dse $$2) {
      return $$0.c_($$1) instanceof dpz $$3 ? $$3.u() : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(dse $$0) {
      return true;
   }

   @Override
   protected int a(dse $$0, dca $$1, iz $$2) {
      return cpw.a($$1.c_($$2));
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
      return $$0.a(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dse a(dse $$0, djy $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }
}
