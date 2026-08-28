import java.util.List;

public enum bsh {
   a(bsh.a.c),
   b(bsh.a.b),
   c(bsh.a.c),
   d(bsh.a.d);

   private final bsh.a e;

   private bsh(final bsh.a $$0) {
      this.e = $$0;
   }

   public List<ewf> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<ewf> a = List.of(ewf.b);
      bsh.a b = ($$0, $$1) -> a;
      bsh.a c = ($$0, $$1) -> List.of(new ewf(0.0, (double)$$1, 0.0));
      bsh.a d = ($$0, $$1) -> List.of(new ewf(0.0, (double)$$1 / 2.0, 0.0));

      List<ewf> create(float var1, float var2);
   }
}
