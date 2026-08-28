import java.util.List;

public enum btp {
   a(btp.a.c),
   b(btp.a.b),
   c(btp.a.c),
   d(btp.a.d);

   private final btp.a e;

   private btp(final btp.a $$0) {
      this.e = $$0;
   }

   public List<eys> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<eys> a = List.of(eys.c);
      btp.a b = ($$0, $$1) -> a;
      btp.a c = ($$0, $$1) -> List.of(new eys(0.0, (double)$$1, 0.0));
      btp.a d = ($$0, $$1) -> List.of(new eys(0.0, (double)$$1 / 2.0, 0.0));

      List<eys> create(float var1, float var2);
   }
}
