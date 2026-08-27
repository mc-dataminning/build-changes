import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class deq extends crx {
   public static final dfs a = des.a;
   public static final dfw<dga> b = des.b;

   public deq(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hb.c).a(b, dga.a));
   }

   @Nullable
   @Override
   public dck a(gv $$0, dey $$1) {
      return null;
   }

   public static dck a(gv $$0, dey $$1, dey $$2, hb $$3, boolean $$4, boolean $$5) {
      return new deu($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dck> dcl<T> a(cpk $$0, dey $$1, dcm<T> $$2) {
      return a($$2, dcm.k, deu::a);
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dck $$5 = $$1.c_($$2);
         if ($$5 instanceof deu) {
            ((deu)$$5).j();
         }
      }
   }

   @Override
   public void a(cpl $$0, gv $$1, dey $$2) {
      gv $$3 = $$1.a($$2.c(a).g());
      dey $$4 = $$0.a_($$3);
      if ($$4.b() instanceof der && $$4.c(der.b)) {
         $$0.a($$3, false);
      }
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bgo.b;
      } else {
         return bgo.d;
      }
   }

   @Override
   public List<ciw> a(dey $$0, ecn.a $$1) {
      deu $$2 = this.a($$1.a(), gv.a($$1.a(eet.f)));
      return $$2 == null ? Collections.emptyList() : $$2.i().a($$1);
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return ehv.a();
   }

   @Override
   public ehy c(dey $$0, coq $$1, gv $$2, ehk $$3) {
      deu $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : ehv.a();
   }

   @Nullable
   private deu a(coq $$0, gv $$1) {
      dck $$2 = $$0.c_($$1);
      return $$2 instanceof deu ? (deu)$$2 : null;
   }

   @Override
   public ciw a(coq $$0, gv $$1, dey $$2) {
      return ciw.b;
   }

   @Override
   public dey a(dey $$0, cyw $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dey a(dey $$0, cxf $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a, b);
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return false;
   }
}
