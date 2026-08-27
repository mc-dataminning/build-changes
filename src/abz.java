import java.util.List;

public record abz(abz.a b, List<String> c) implements yp<aba> {
   public static final yg<vi, abz> a = yp.a(abz::a, abz::new);

   private abz(vi $$0) {
      this($$0.b(abz.a.class), $$0.a(vi::p));
   }

   private void a(vi $$0) {
      $$0.a(this.b);
      $$0.a(this.c, vi::a);
   }

   @Override
   public yr<abz> a() {
      return afl.y;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public List<String> e() {
      return this.c;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
