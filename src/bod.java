import com.google.common.collect.ImmutableMap;

public class bod extends bnc<bln> {
   public static final int c = 100;
   private final bim d;
   private final aqu e;

   public bod(bim $$0, aqu $$1) {
      super(ImmutableMap.of(bum.n, bun.c, bum.S, bun.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(ami $$0, bln $$1, long $$2) {
      return !$$1.aC();
   }

   protected void b(ami $$0, bln $$1, long $$2) {
      $$1.p(true);
      $$1.b(blx.g);
   }

   protected void c(ami $$0, bln $$1, long $$2) {
      if ($$1.aC()) {
         $$1.g($$1.dq().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, aqw.g, 2.0F, 1.0F);
      }

      $$1.p(false);
      $$1.b(blx.a);
      $$1.dP().b(bum.S);
      $$1.dP().a(bum.R, this.d.a($$0.z));
   }
}
