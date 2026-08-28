import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dcj implements dbc, dbg {
   protected final int a;
   protected final int b;
   protected final dtw[][] c;
   protected boolean d;
   protected final dbw e;
   private final Supplier<ji<dcv>> f;

   public dcj(dbw $$0, iz $$1, iz $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.H_().d(lq.az).g(ddc.b));
      this.a = kb.a($$1.u());
      this.b = kb.a($$1.w());
      int $$3 = kb.a($$2.u());
      int $$4 = kb.a($$2.w());
      this.c = new dtw[$$3 - this.a + 1][$$4 - this.b + 1];
      dua $$5 = $$0.N();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = kb.a($$1.u()); $$8 <= kb.a($$2.u()); $$8++) {
         for (int $$9 = kb.a($$1.w()); $$9 <= kb.a($$2.w()); $$9++) {
            dtw $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private dtw d(iz $$0) {
      return this.a(kb.a($$0.u()), kb.a($$0.w()));
   }

   private dtw a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         dtw $$4 = this.c[$$2][$$3];
         return (dtw)($$4 != null ? $$4 : new duc(this.e, new dbd($$0, $$1), this.f.get()));
      } else {
         return new duc(this.e, new dbd($$0, $$1), this.f.get());
      }
   }

   @Override
   public dtr C_() {
      return this.e.C_();
   }

   @Override
   public dbc c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<ewi> c(@Nullable bss $$0, evk $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dpf c_(iz $$0) {
      dtw $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public dsa a_(iz $$0) {
      if (this.s($$0)) {
         return dez.a.o();
      } else {
         dtw $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public ent b_(iz $$0) {
      if (this.s($$0)) {
         return enu.a.g();
      } else {
         dtw $$1 = this.d($$0);
         return $$1.b_($$0);
      }
   }

   @Override
   public int I_() {
      return this.e.I_();
   }

   @Override
   public int J_() {
      return this.e.J_();
   }

   public bng a() {
      return this.e.ag();
   }
}
