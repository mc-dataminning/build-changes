import java.util.List;

public enum bss {
   a(bss.a.c),
   b(bss.a.b),
   c(bss.a.c),
   d(bss.a.d);

   private final bss.a e;

   private bss(final bss.a $$0) {
      this.e = $$0;
   }

   public List<exa> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<exa> a = List.of(exa.b);
      bss.a b = ($$0, $$1) -> a;
      bss.a c = ($$0, $$1) -> List.of(new exa(0.0, (double)$$1, 0.0));
      bss.a d = ($$0, $$1) -> List.of(new exa(0.0, (double)$$1 / 2.0, 0.0));

      List<exa> create(float var1, float var2);
   }
}
