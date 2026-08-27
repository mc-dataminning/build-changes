import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cwz extends csm implements css {
   public static final dga a = dfq.aP;
   protected final eab b;
   private final List<ead> e;
   public static final ehx c = csm.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<ha> d = ImmutableList.of(ha.a, ha.d, ha.c, ha.f, ha.e);

   protected cwz(eab $$0, dez.d $$1) {
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
   public ehx c(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return $$3.a(c, $$2, true) && $$0.c(a) == 0 && $$3.a($$1.b_($$2.c()), $$0.u()) ? c : ehu.a();
   }

   @Override
   public boolean e_(dfa $$0) {
      return $$0.u().f();
   }

   @Override
   public void b(dfa $$0, akk $$1, gu $$2, aru $$3) {
      $$0.u().b($$1, $$2, $$3);
   }

   @Override
   public boolean c(dfa $$0, cos $$1, gu $$2) {
      return false;
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      return !this.b.a(apq.b);
   }

   @Override
   public ead c_(dfa $$0) {
      int $$1 = $$0.c(a);
      return this.e.get(Math.min($$1, 8));
   }

   @Override
   public boolean a(dfa $$0, dfa $$1, ha $$2) {
      return $$1.u().a().a(this.b);
   }

   @Override
   public cyr b_(dfa $$0) {
      return cyr.a;
   }

   @Override
   public List<ciy> a(dfa $$0, ecn.a $$1) {
      return Collections.emptyList();
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return ehu.a();
   }

   @Override
   public void b(dfa $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.b.a((cpp)$$1));
      }
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if ($$0.u().b() || $$2.u().b()) {
         $$3.a($$4, $$0.u().a(), this.b.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, csm $$3, gu $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.b.a((cpp)$$1));
      }
   }

   private boolean a(cpm $$0, gu $$1, dfa $$2) {
      if (this.b.a(apq.b)) {
         boolean $$3 = $$0.a_($$1.d()).a(csn.dY);
         UnmodifiableIterator var5 = d.iterator();

         while (var5.hasNext()) {
            ha $$4 = (ha)var5.next();
            gu $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(apq.a)) {
               csm $$6 = $$0.b_($$1).b() ? csn.co : csn.m;
               $$0.b($$1, $$6.n());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(csn.mW)) {
               $$0.b($$1, csn.dZ.n());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(cpn $$0, gu $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a);
   }

   @Override
   public ciy a(@Nullable cbn $$0, cpn $$1, gu $$2, dfa $$3) {
      if ($$3.c(a) == 0) {
         $$1.a($$2, csn.a.n(), 11);
         return new ciy(this.b.a());
      } else {
         return ciy.b;
      }
   }

   @Override
   public Optional<aov> am_() {
      return this.b.j();
   }
}
