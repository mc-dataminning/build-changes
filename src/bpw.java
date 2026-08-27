import java.util.List;

public enum bpw {
   a(bpw.a.c),
   b(bpw.a.b),
   c(bpw.a.c),
   d(bpw.a.d);

   private final bpw.a e;

   private bpw(bpw.a $$0) {
      this.e = $$0;
   }

   public List<esa> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<esa> a = List.of(esa.b);
      bpw.a b = ($$0, $$1) -> a;
      bpw.a c = ($$0, $$1) -> List.of(new esa(0.0, (double)$$1, 0.0));
      bpw.a d = ($$0, $$1) -> List.of(new esa(0.0, (double)$$1 / 2.0, 0.0));

      List<esa> create(float var1, float var2);
   }
}
