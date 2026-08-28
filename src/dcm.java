import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dcm implements dbf, dbj {
   protected final int a;
   protected final int b;
   protected final dtz[][] c;
   protected boolean d;
   protected final dbz e;
   private final Supplier<ji<dcy>> f;

   public dcm(dbz $$0, iz $$1, iz $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.H_().d(lq.az).g(ddf.b));
      this.a = kb.a($$1.u());
      this.b = kb.a($$1.w());
      int $$3 = kb.a($$2.u());
      int $$4 = kb.a($$2.w());
      this.c = new dtz[$$3 - this.a + 1][$$4 - this.b + 1];
      dud $$5 = $$0.N();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = kb.a($$1.u()); $$8 <= kb.a($$2.u()); $$8++) {
         for (int $$9 = kb.a($$1.w()); $$9 <= kb.a($$2.w()); $$9++) {
            dtz $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private dtz d(iz $$0) {
      return this.a(kb.a($$0.u()), kb.a($$0.w()));
   }

   private dtz a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         dtz $$4 = this.c[$$2][$$3];
         return (dtz)($$4 != null ? $$4 : new duf(this.e, new dbg($$0, $$1), this.f.get()));
      } else {
         return new duf(this.e, new dbg($$0, $$1), this.f.get());
      }
   }

   @Override
   public dtu C_() {
      return this.e.C_();
   }

   @Override
   public dbf c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<ewl> c(@Nullable bsv $$0, evn $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dpi c_(iz $$0) {
      dtz $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public dsd a_(iz $$0) {
      if (this.s($$0)) {
         return dfc.a.o();
      } else {
         dtz $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public enw b_(iz $$0) {
      if (this.s($$0)) {
         return enx.a.g();
      } else {
         dtz $$1 = this.d($$0);
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

   public bnj a() {
      return this.e.ag();
   }
}
