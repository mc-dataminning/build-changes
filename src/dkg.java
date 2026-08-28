import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkg extends dih {
   public static final MapCodec<dkg> a = b(dkg::new);
   public static final dwb<dvz> b = dvt.ae;

   @Override
   public MapCodec<? extends dkg> a() {
      return a;
   }

   public dkg(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dvz.b));
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      dvz $$6 = $$0.c(b);
      if ($$1.o() != jl.a.b || $$6 == dvz.b != ($$1 == jl.b) || $$2.a(this) && $$2.c(b) != $$6) {
         return $$6 == dvz.b && $$1 == jl.a && !$$0.a($$3, $$4) ? dia.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return dia.a.m();
      }
   }

   @Nullable
   @Override
   public dvd a(czm $$0) {
      jg $$1 = $$0.a();
      dev $$2 = $$0.q();
      return $$1.v() < $$2.an() && $$2.a_($$1.d()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(dev $$0, jg $$1, dvd $$2, buv $$3, cvx $$4) {
      jg $$5 = $$1.d();
      $$0.a($$5, c($$0, $$5, this.m().b(b, dvz.a)), 3);
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      if ($$0.c(b) != dvz.a) {
         return super.a($$0, $$1, $$2);
      } else {
         dvd $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(b) == dvz.b;
      }
   }

   public static void a(dew $$0, dvd $$1, jg $$2, int $$3) {
      jg $$4 = $$2.d();
      $$0.a($$2, c($$0, $$2, $$1.b(b, dvz.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.b(b, dvz.a)), $$3);
   }

   public static dvd c(dey $$0, jg $$1, dvd $$2) {
      return $$2.b(dvt.C) ? $$2.b(dvt.C, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public dvd a(dev $$0, jg $$1, dvd $$2, coh $$3) {
      if (!$$0.C) {
         if ($$3.f()) {
            b($$0, $$1, $$2, $$3);
         } else {
            a($$2, $$0, $$1, null, $$3, $$3.fb());
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dev $$0, coh $$1, jg $$2, dvd $$3, @Nullable dsg $$4, cvx $$5) {
      super.a($$0, $$1, $$2, dia.a.m(), $$4, $$5);
   }

   protected static void b(dev $$0, jg $$1, dvd $$2, coh $$3) {
      dvz $$4 = $$2.c(b);
      if ($$4 == dvz.a) {
         jg $$5 = $$1.e();
         dvd $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dvz.b) {
            dvd $$7 = $$6.y().b(erf.c) ? dia.G.m() : dia.a.m();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, dhy.j($$6));
         }
      }
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(dvd $$0, jg $$1) {
      return azj.b($$1.u(), $$1.c($$0.c(b) == dvz.b ? 0 : 1).v(), $$1.w());
   }
}
