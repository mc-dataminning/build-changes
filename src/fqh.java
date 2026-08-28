import java.util.Arrays;

public class fqh extends fqf {
   private static final wu a = wu.c("options.sounds.title");

   private static ffq<?>[] a(ffr $$0) {
      return new ffq[]{$$0.W(), $$0.X()};
   }

   public fqh(fnd $$0, ffr $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      this.q.a(this.c.b(avg.a));
      this.q.a(this.J());
      this.q.a(this.c.at());
      this.q.a(a(this.c));
   }

   private ffq<?>[] J() {
      return Arrays.stream(avg.values()).filter($$0 -> $$0 != avg.a).map($$0 -> this.c.b($$0)).toArray(ffq[]::new);
   }
}
