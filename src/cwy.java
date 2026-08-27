import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cwy extends csl implements csr {
   public static final dfz a = dfp.aP;
   protected final eaa b;
   private final List<eac> e;
   public static final ehw c = csl.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<ha> d = ImmutableList.of(ha.a, ha.d, ha.c, ha.f, ha.e);

   protected cwy(eaa $$0, dey.d $$1) {
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
   public ehw c(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return $$3.a(c, $$2, true) && $$0.c(a) == 0 && $$3.a($$1.b_($$2.c()), $$0.u()) ? c : eht.a();
   }

   @Override
   public boolean e_(dez $$0) {
      return $$0.u().f();
   }

   @Override
   public void b(dez $$0, akk $$1, gu $$2, aru $$3) {
      $$0.u().b($$1, $$2, $$3);
   }

   @Override
   public boolean c(dez $$0, cor $$1, gu $$2) {
      return false;
   }

   @Override
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
      return !this.b.a(apq.b);
   }

   @Override
   public eac c_(dez $$0) {
      int $$1 = $$0.c(a);
      return this.e.get(Math.min($$1, 8));
   }

   @Override
   public boolean a(dez $$0, dez $$1, ha $$2) {
      return $$1.u().a().a(this.b);
   }

   @Override
   public cyq b_(dez $$0) {
      return cyq.a;
   }

   @Override
   public List<cix> a(dez $$0, ecm.a $$1) {
      return Collections.emptyList();
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return eht.a();
   }

   @Override
   public void b(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.b.a((cpo)$$1));
      }
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if ($$0.u().b() || $$2.u().b()) {
         $$3.a($$4, $$0.u().a(), this.b.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, csl $$3, gu $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.b.a((cpo)$$1));
      }
   }

   private boolean a(cpl $$0, gu $$1, dez $$2) {
      if (this.b.a(apq.b)) {
         boolean $$3 = $$0.a_($$1.d()).a(csm.dY);
         UnmodifiableIterator var5 = d.iterator();

         while (var5.hasNext()) {
            ha $$4 = (ha)var5.next();
            gu $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(apq.a)) {
               csl $$6 = $$0.b_($$1).b() ? csm.co : csm.m;
               $$0.b($$1, $$6.n());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(csm.mW)) {
               $$0.b($$1, csm.dZ.n());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(cpm $$0, gu $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a);
   }

   @Override
   public cix a(@Nullable cbm $$0, cpm $$1, gu $$2, dez $$3) {
      if ($$3.c(a) == 0) {
         $$1.a($$2, csm.a.n(), 11);
         return new cix(this.b.a());
      } else {
         return cix.b;
      }
   }

   @Override
   public Optional<aov> al_() {
      return this.b.j();
   }
}
