import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dcl implements dbe, dbi {
   protected final int a;
   protected final int b;
   protected final dty[][] c;
   protected boolean d;
   protected final dby e;
   private final Supplier<ji<dcx>> f;

   public dcl(dby $$0, iz $$1, iz $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.H_().d(lq.az).g(dde.b));
      this.a = kb.a($$1.u());
      this.b = kb.a($$1.w());
      int $$3 = kb.a($$2.u());
      int $$4 = kb.a($$2.w());
      this.c = new dty[$$3 - this.a + 1][$$4 - this.b + 1];
      duc $$5 = $$0.N();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = kb.a($$1.u()); $$8 <= kb.a($$2.u()); $$8++) {
         for (int $$9 = kb.a($$1.w()); $$9 <= kb.a($$2.w()); $$9++) {
            dty $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private dty d(iz $$0) {
      return this.a(kb.a($$0.u()), kb.a($$0.w()));
   }

   private dty a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         dty $$4 = this.c[$$2][$$3];
         return (dty)($$4 != null ? $$4 : new due(this.e, new dbf($$0, $$1), this.f.get()));
      } else {
         return new due(this.e, new dbf($$0, $$1), this.f.get());
      }
   }

   @Override
   public dtt C_() {
      return this.e.C_();
   }

   @Override
   public dbe c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<ewk> c(@Nullable bsu $$0, evm $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dph c_(iz $$0) {
      dty $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public dsc a_(iz $$0) {
      if (this.s($$0)) {
         return dfb.a.o();
      } else {
         dty $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public env b_(iz $$0) {
      if (this.s($$0)) {
         return enw.a.g();
      } else {
         dty $$1 = this.d($$0);
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

   public bni a() {
      return this.e.ag();
   }
}
