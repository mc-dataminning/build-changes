import java.util.OptionalInt;

public record fhg(int a, int b, OptionalInt c, OptionalInt d, boolean e) {
   public fhg a(int $$0, int $$1) {
      return new fhg($$0, $$1, this.c, this.d, this.e);
   }

   public fhg a(boolean $$0) {
      return new fhg(this.a, this.b, this.c, this.d, $$0);
   }
}
