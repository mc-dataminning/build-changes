import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class cai extends bwx<coc> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public cai() {
      super(ImmutableMap.of(cei.c, cej.a, cei.n, cej.c));
   }

   protected boolean b(arq $$0, coc $$1) {
      if ($$0.aa() - this.e < 300L) {
         return false;
      } else if ($$0.A.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.aa();
         jp $$2 = $$1.ee().c(cei.c).get();
         return $$2.a() == $$0.ag() && $$2.b().a($$1.dw(), 1.73);
      }
   }

   protected void a(arq $$0, coc $$1, long $$2) {
      bwg<coc> $$3 = $$1.ee();
      $$3.a(cei.J, $$2);
      $$3.c(cei.c).ifPresent($$1x -> $$3.a(cei.n, new bxa($$1x.b())));
      $$1.gK();
      this.a($$0, $$1);
      if ($$1.gJ()) {
         $$1.gI();
      }
   }

   protected void a(arq $$0, coc $$1) {
   }

   protected boolean b(arq $$0, coc $$1, long $$2) {
      Optional<jp> $$3 = $$1.ee().c(cei.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jp $$4 = $$3.get();
         return $$4.a() == $$0.ag() && $$4.b().a($$1.dw(), 1.73);
      }
   }
}
