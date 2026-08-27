import java.util.Arrays;

public enum cla {
   a(0, avo.Cb, avo.Cj),
   b(40, avo.Ca, avo.Ck),
   c(80, avo.Cc, avo.Ck);

   private static final cla[] d = ad.a(values(), $$0 -> Arrays.sort($$0, ($$0x, $$1) -> Integer.compare($$1.e, $$0x.e)));
   private final int e;
   private final avn f;
   private final avn g;

   private cla(int $$0, avn $$1, avn $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public int a() {
      return this.e;
   }

   public avn b() {
      return this.f;
   }

   public avn c() {
      return this.g;
   }

   public static cla a(int $$0) {
      for (cla $$1 : d) {
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
