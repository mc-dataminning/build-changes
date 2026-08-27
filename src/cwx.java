import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cwx extends csk implements csq {
   public static final dfy a = dfo.aP;
   protected final dzz b;
   private final List<eab> e;
   public static final ehy c = csk.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<hb> d = ImmutableList.of(hb.a, hb.d, hb.c, hb.f, hb.e);

   protected cwx(dzz $$0, dex.d $$1) {
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
   public ehy c(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return $$3.a(c, $$2, true) && $$0.c(a) == 0 && $$3.a($$1.b_($$2.c()), $$0.u()) ? c : ehv.a();
   }

   @Override
   public boolean e_(dey $$0) {
      return $$0.u().f();
   }

   @Override
   public void b(dey $$0, aki $$1, gv $$2, art $$3) {
      $$0.u().b($$1, $$2, $$3);
   }

   @Override
   public boolean c(dey $$0, coq $$1, gv $$2) {
      return false;
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return !this.b.a(apo.b);
   }

   @Override
   public eab c_(dey $$0) {
      int $$1 = $$0.c(a);
      return this.e.get(Math.min($$1, 8));
   }

   @Override
   public boolean a(dey $$0, dey $$1, hb $$2) {
      return $$1.u().a().a(this.b);
   }

   @Override
   public cyp b_(dey $$0) {
      return cyp.a;
   }

   @Override
   public List<ciw> a(dey $$0, ecn.a $$1) {
      return Collections.emptyList();
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return ehv.a();
   }

   @Override
   public void b(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.b.a((cpn)$$1));
      }
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$0.u().b() || $$2.u().b()) {
         $$3.a($$4, $$0.u().a(), this.b.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, csk $$3, gv $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.b.a((cpn)$$1));
      }
   }

   private boolean a(cpk $$0, gv $$1, dey $$2) {
      if (this.b.a(apo.b)) {
         boolean $$3 = $$0.a_($$1.d()).a(csl.dY);
         UnmodifiableIterator var5 = d.iterator();

         while (var5.hasNext()) {
            hb $$4 = (hb)var5.next();
            gv $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(apo.a)) {
               csk $$6 = $$0.b_($$1).b() ? csl.co : csl.m;
               $$0.b($$1, $$6.n());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(csl.mW)) {
               $$0.b($$1, csl.dZ.n());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(cpl $$0, gv $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a);
   }

   @Override
   public ciw a(@Nullable cbl $$0, cpl $$1, gv $$2, dey $$3) {
      if ($$3.c(a) == 0) {
         $$1.a($$2, csl.a.n(), 11);
         return new ciw(this.b.a());
      } else {
         return ciw.b;
      }
   }

   @Override
   public Optional<aot> am_() {
      return this.b.j();
   }
}
