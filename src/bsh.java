import com.google.common.collect.ImmutableMap;

public class bsh extends brg<bpq> {
   public static final int c = 100;
   private final bmn d;
   private final atx e;

   public bsh(bmn $$0, atx $$1) {
      super(ImmutableMap.of(byr.n, bys.c, byr.T, bys.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(apf $$0, bpq $$1, long $$2) {
      return !$$1.aC();
   }

   protected void b(apf $$0, bpq $$1, long $$2) {
      $$1.p(true);
      $$1.b(bpz.g);
   }

   protected void c(apf $$0, bpq $$1, long $$2) {
      if ($$1.aC()) {
         $$1.g($$1.dp().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, atz.g, 2.0F, 1.0F);
      }

      $$1.p(false);
      $$1.b(bpz.a);
      $$1.dP().b(byr.T);
      $$1.dP().a(byr.S, this.d.a($$0.z));
   }
}
