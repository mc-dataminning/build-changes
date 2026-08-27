import com.google.common.collect.ImmutableMap;

public class bsi extends brh<bpr> {
   public static final int c = 100;
   private final bmo d;
   private final atx e;

   public bsi(bmo $$0, atx $$1) {
      super(ImmutableMap.of(bys.n, byt.c, bys.T, byt.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(apf $$0, bpr $$1, long $$2) {
      return !$$1.aC();
   }

   protected void b(apf $$0, bpr $$1, long $$2) {
      $$1.p(true);
      $$1.b(bqa.g);
   }

   protected void c(apf $$0, bpr $$1, long $$2) {
      if ($$1.aC()) {
         $$1.g($$1.dp().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, atz.g, 2.0F, 1.0F);
      }

      $$1.p(false);
      $$1.b(bqa.a);
      $$1.dP().b(bys.T);
      $$1.dP().a(bys.S, this.d.a($$0.z));
   }
}
