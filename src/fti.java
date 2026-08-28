import java.util.Arrays;

public class fti extends ftg {
   private static final xd a = xd.c("options.sounds.title");

   private static fio<?>[] a(fip $$0) {
      return new fio[]{$$0.Y(), $$0.Z()};
   }

   public fti(fqd $$0, fip $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.d.a(this.c.b(awf.a));
      this.d.a(this.G());
      this.d.a(this.c.av());
      this.d.a(a(this.c));
   }

   private fio<?>[] G() {
      return Arrays.stream(awf.values()).filter($$0 -> $$0 != awf.a).map($$0 -> this.c.b($$0)).toArray(fio[]::new);
   }
}
