import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxk extends csx implements ctd {
   public static final dgl a = dgb.aP;
   protected final eam b;
   private final List<eao> e;
   public static final eii c = csx.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<hc> d = ImmutableList.of(hc.a, hc.d, hc.c, hc.f, hc.e);

   protected cxk(eam $$0, dfk.d $$1) {
      super($$1);
      this.b = $$0;
      this.e = Lists.newArrayList();
      this.e.add($$0.a(false));

      for (int $$2 = 1; $$2 < 8; $$2++) {
         this.e.add($$0.a(8 - $$2, false));
      }

      this.e.add($$0.a(8, true));
      this.k(this.C.b().a(a, Integer.valueOf(0)));
   }

   @Override
   public eii c(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return $$3.a(c, $$2, true) && $$0.c(a) == 0 && $$3.a($$1.b_($$2.c()), $$0.u()) ? c : eif.a();
   }

   @Override
   public boolean e_(dfl $$0) {
      return $$0.u().f();
   }

   @Override
   public void b(dfl $$0, aks $$1, gw $$2, ase $$3) {
      $$0.u().b($$1, $$2, $$3);
   }

   @Override
   public boolean c(dfl $$0, cpd $$1, gw $$2) {
      return false;
   }

   @Override
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
      return !this.b.a(apz.b);
   }

   @Override
   public eao c_(dfl $$0) {
      int $$1 = $$0.c(a);
      return this.e.get(Math.min($$1, 8));
   }

   @Override
   public boolean a(dfl $$0, dfl $$1, hc $$2) {
      return $$1.u().a().a(this.b);
   }

   @Override
   public czc b_(dfl $$0) {
      return czc.a;
   }

   @Override
   public List<cjh> a(dfl $$0, ecy.a $$1) {
      return Collections.emptyList();
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return eif.a();
   }

   @Override
   public void b(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.b.a((cqa)$$1));
      }
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$0.u().b() || $$2.u().b()) {
         $$3.a($$4, $$0.u().a(), this.b.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, csx $$3, gw $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.b.a((cqa)$$1));
      }
   }

   private boolean a(cpx $$0, gw $$1, dfl $$2) {
      if (this.b.a(apz.b)) {
         boolean $$3 = $$0.a_($$1.d()).a(csy.dY);
         UnmodifiableIterator var5 = d.iterator();

         while (var5.hasNext()) {
            hc $$4 = (hc)var5.next();
            gw $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(apz.a)) {
               csx $$6 = $$0.b_($$1).b() ? csy.co : csy.m;
               $$0.b($$1, $$6.n());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(csy.mW)) {
               $$0.b($$1, csy.dZ.n());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(cpy $$0, gw $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a);
   }

   @Override
   public cjh a(@Nullable cbw $$0, cpy $$1, gw $$2, dfl $$3) {
      if ($$3.c(a) == 0) {
         $$1.a($$2, csy.a.n(), 11);
         return new cjh(this.b.a());
      } else {
         return cjh.b;
      }
   }

   @Override
   public Optional<ape> aq_() {
      return this.b.j();
   }
}
