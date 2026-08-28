import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class cvv extends cvx {
   private final axq<cvu> a;

   public cvv(axq<cvu> $$0, cvx.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public void a(cwb $$0, cvx.b $$1, List<xi> $$2, cxt $$3) {
      super.a($$0, $$1, $$2, $$3);
      js.a $$4 = $$1.a();
      if ($$4 != null) {
         Optional<jq<cvu>> $$5 = this.a($$0, $$4);
         if ($$5.isPresent()) {
            xw $$6 = $$5.get().a().d().f();
            xl.a($$6, yf.a.a(n.h));
            $$2.add($$6);
         }
      }
   }

   public static cwb a(cvx $$0, jq<cvu> $$1) {
      cwb $$2 = new cwb($$0);
      $$2.b(ku.Z, $$1);
      return $$2;
   }

   @Override
   public bsd a(dfb $$0, com $$1, bsc $$2) {
      cwb $$3 = $$1.b($$2);
      Optional<? extends jq<cvu>> $$4 = this.a($$3, $$1.dZ());
      if ($$4.isPresent()) {
         cvu $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gF().a($$3, azk.d($$5.b() * 20.0F));
         $$1.b(awv.c.b(this));
         return bsd.c;
      } else {
         return bsd.d;
      }
   }

   @Override
   public int a(cwb $$0, bva $$1) {
      Optional<jq<cvu>> $$2 = this.a($$0, $$1.dZ());
      return $$2.<Integer>map($$0x -> azk.d(((cvu)$$0x.a()).b() * 20.0F)).orElse(0);
   }

   private Optional<jq<cvu>> a(cwb $$0, js.a $$1) {
      jq<cvu> $$2 = $$0.a(ku.Z);
      if ($$2 != null) {
         return Optional.of($$2);
      } else {
         Optional<ju.c<cvu>> $$3 = $$1.d(lz.I).a(this.a);
         if ($$3.isPresent()) {
            Iterator<jq<cvu>> $$4 = $$3.get().iterator();
            if ($$4.hasNext()) {
               return Optional.of($$4.next());
            }
         }

         return Optional.empty();
      }
   }

   @Override
   public cwd b(cwb $$0) {
      return cwd.i;
   }

   private static void a(dfb $$0, com $$1, cvu $$2) {
      awk $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, awm.c, $$4, 1.0F);
      $$0.a(eag.B, $$1.dv(), eag.a.a($$1));
   }
}
