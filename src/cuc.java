import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cuc implements csv, csz {
   protected final int a;
   protected final int b;
   protected final dld[][] c;
   protected boolean d;
   protected final ctp e;
   private final Supplier<ih<cuo>> f;

   public cuc(ctp $$0, hx $$1, hx $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.I_().d(ke.at).f(cuv.b));
      this.a = iz.a($$1.u());
      this.b = iz.a($$1.w());
      int $$3 = iz.a($$2.u());
      int $$4 = iz.a($$2.w());
      this.c = new dld[$$3 - this.a + 1][$$4 - this.b + 1];
      dlh $$5 = $$0.L();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = iz.a($$1.u()); $$8 <= iz.a($$2.u()); $$8++) {
         for (int $$9 = iz.a($$1.w()); $$9 <= iz.a($$2.w()); $$9++) {
            dld $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private dld d(hx $$0) {
      return this.a(iz.a($$0.u()), iz.a($$0.w()));
   }

   private dld a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         dld $$4 = this.c[$$2][$$3];
         return (dld)($$4 != null ? $$4 : new dlk(this.e, new csw($$0, $$1), this.f.get()));
      } else {
         return new dlk(this.e, new csw($$0, $$1), this.f.get());
      }
   }

   @Override
   public dky D_() {
      return this.e.D_();
   }

   @Override
   public csv c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<emm> c(@Nullable blv $$0, elo $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dgv c_(hx $$0) {
      dld $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public djh a_(hx $$0) {
      if (this.s($$0)) {
         return cws.a.o();
      } else {
         dld $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public eer b_(hx $$0) {
      if (this.s($$0)) {
         return ees.a.g();
      } else {
         dld $$1 = this.d($$0);
         return $$1.b_($$0);
      }
   }

   @Override
   public int J_() {
      return this.e.J_();
   }

   @Override
   public int K_() {
      return this.e.K_();
   }

   public bgs a() {
      return this.e.af();
   }
}
