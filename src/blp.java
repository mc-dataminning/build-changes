import com.google.common.collect.ImmutableMap;

public class blp extends bko<biy> {
   public static final int c = 100;
   private final bfz d;
   private final aot e;

   public blp(bfz $$0, aot $$1) {
      super(ImmutableMap.of(bry.n, brz.c, bry.S, brz.a), 100);
      this.d = $$0;
      this.e = $$1;
   }

   protected boolean a(aki $$0, biy $$1, long $$2) {
      return !$$1.aA();
   }

   protected void b(aki $$0, biy $$1, long $$2) {
      $$1.p(true);
      $$1.b(bji.g);
   }

   protected void c(aki $$0, biy $$1, long $$2) {
      if ($$1.aA()) {
         $$1.f($$1.dn().d(0.1F, 1.0, 0.1F));
         $$0.a(null, $$1, this.e, aov.g, 2.0F, 1.0F);
      }

      $$1.p(false);
      $$1.b(bji.a);
      $$1.dM().b(bry.S);
      $$1.dM().a(bry.R, this.d.a($$0.z));
   }
}
