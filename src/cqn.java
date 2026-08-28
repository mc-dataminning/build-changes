import java.util.Arrays;

public enum cqn {
   a(0, awn.CL, awn.CT),
   b(40, awn.CK, awn.CU),
   c(80, awn.CM, awn.CU);

   private static final cqn[] d = ag.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final awm f;
   private final awm g;

   private cqn(final int $$0, final awm $$1, final awm $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public awm b() {
      return this.f;
   }

   public awm c() {
      return this.g;
   }

   public static cqn a(int $$0) {
      for (cqn $$1 : d) {
         if ($$0 >= $$1.e) {
            return $$1;
         }
      }

      return a;
   }

   public boolean d() {
      return this == c;
   }
}
