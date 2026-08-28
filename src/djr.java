import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djr extends dhs {
   public static final MapCodec<djr> a = b(djr::new);
   public static final dvm<dvk> b = dve.ae;

   @Override
   public MapCodec<? extends djr> a() {
      return a;
   }

   public djr(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dvk.b));
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      dvk $$6 = $$0.c(b);
      if ($$1.o() != jj.a.b || $$6 == dvk.b != ($$1 == jj.b) || $$2.a(this) && $$2.c(b) != $$6) {
         return $$6 == dvk.b && $$1 == jj.a && !$$0.a($$3, $$4) ? dhl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return dhl.a.o();
      }
   }

   @Nullable
   @Override
   public duo a(czk $$0) {
      je $$1 = $$0.a();
      deg $$2 = $$0.q();
      return $$1.v() < $$2.an() && $$2.a_($$1.d()).a($$0) ? super.a($$0) : null;
   }

   @Override
   public void a(deg $$0, je $$1, duo $$2, buk $$3, cvp $$4) {
      je $$5 = $$1.d();
      $$0.a($$5, c($$0, $$5, this.o().b(b, dvk.a)), 3);
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      if ($$0.c(b) != dvk.a) {
         return super.a($$0, $$1, $$2);
      } else {
         duo $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(b) == dvk.b;
      }
   }

   public static void a(deh $$0, duo $$1, je $$2, int $$3) {
      je $$4 = $$2.d();
      $$0.a($$2, c($$0, $$2, $$1.b(b, dvk.b)), $$3);
      $$0.a($$4, c($$0, $$4, $$1.b(b, dvk.a)), $$3);
   }

   public static duo c(dej $$0, je $$1, duo $$2) {
      return $$2.b(dve.C) ? $$2.b(dve.C, Boolean.valueOf($$0.z($$1))) : $$2;
   }

   @Override
   public duo a(deg $$0, je $$1, duo $$2, cnu $$3) {
      if (!$$0.B) {
         if ($$3.f()) {
            b($$0, $$1, $$2, $$3);
         } else {
            a($$2, $$0, $$1, null, $$3, $$3.eW());
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(deg $$0, cnu $$1, je $$2, duo $$3, @Nullable drs $$4, cvp $$5) {
      super.a($$0, $$1, $$2, dhl.a.o(), $$4, $$5);
   }

   protected static void b(deg $$0, je $$1, duo $$2, cnu $$3) {
      dvk $$4 = $$2.c(b);
      if ($$4 == dvk.a) {
         je $$5 = $$1.e();
         duo $$6 = $$0.a_($$5);
         if ($$6.a($$2.b()) && $$6.c(b) == dvk.b) {
            duo $$7 = $$6.y().b(eqq.c) ? dhl.G.o() : dhl.a.o();
            $$0.a($$5, $$7, 35);
            $$0.a($$3, 2001, $$5, dhj.j($$6));
         }
      }
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b);
   }

   @Override
   protected long a(duo $$0, je $$1) {
      return azd.b($$1.u(), $$1.c($$0.c(b) == dvk.b ? 0 : 1).v(), $$1.w());
   }
}
