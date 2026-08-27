import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class cua extends cpn implements cpt {
   public static final ddb a = dcr.aP;
   protected final dxc b;
   private final List<dxe> e;
   public static final efb c = cpn.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<ha> d = ImmutableList.of(ha.a, ha.d, ha.c, ha.f, ha.e);

   protected cua(dxc $$0, dca.d $$1) {
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
   public efb c(dcb $$0, cls $$1, gu $$2, een $$3) {
      return $$3.a(c, $$2, true) && $$0.c(a) == 0 && $$3.a($$1.b_($$2.c()), $$0.u()) ? c : eey.a();
   }

   @Override
   public boolean e_(dcb $$0) {
      return $$0.u().f();
   }

   @Override
   public void b(dcb $$0, aif $$1, gu $$2, apf $$3) {
      $$0.u().b($$1, $$2, $$3);
   }

   @Override
   public boolean c(dcb $$0, cls $$1, gu $$2) {
      return false;
   }

   @Override
   public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
      return !this.b.a(anb.b);
   }

   @Override
   public dxe c_(dcb $$0) {
      int $$1 = $$0.c(a);
      return this.e.get(Math.min($$1, 8));
   }

   @Override
   public boolean a(dcb $$0, dcb $$1, ha $$2) {
      return $$1.u().a().a(this.b);
   }

   @Override
   public cvs b_(dcb $$0) {
      return cvs.a;
   }

   @Override
   public List<cfz> a(dcb $$0, dzq.a $$1) {
      return Collections.emptyList();
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return eey.a();
   }

   @Override
   public void b(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.b.a((cmp)$$1));
      }
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      if ($$0.u().b() || $$2.u().b()) {
         $$3.a($$4, $$0.u().a(), this.b.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, cpn $$3, gu $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.b.a((cmp)$$1));
      }
   }

   private boolean a(cmm $$0, gu $$1, dcb $$2) {
      if (this.b.a(anb.b)) {
         boolean $$3 = $$0.a_($$1.d()).a(cpo.dY);
         UnmodifiableIterator var5 = d.iterator();

         while (var5.hasNext()) {
            ha $$4 = (ha)var5.next();
            gu $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(anb.a)) {
               cpn $$6 = $$0.b_($$1).b() ? cpo.co : cpo.m;
               $$0.b($$1, $$6.n());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(cpo.mW)) {
               $$0.b($$1, cpo.dZ.n());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(cmn $$0, gu $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(a);
   }

   @Override
   public cfz c(cmn $$0, gu $$1, dcb $$2) {
      if ($$2.c(a) == 0) {
         $$0.a($$1, cpo.a.n(), 11);
         return new cfz(this.b.a());
      } else {
         return cfz.b;
      }
   }

   @Override
   public Optional<amg> am_() {
      return this.b.j();
   }
}
