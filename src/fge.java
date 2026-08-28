import java.util.OptionalInt;

public record fge(int a, int b, OptionalInt c, OptionalInt d, boolean e) {
   public fge a(int $$0, int $$1) {
      return new fge($$0, $$1, this.c, this.d, this.e);
   }

   public fge a(boolean $$0) {
      return new fge(this.a, this.b, this.c, this.d, $$0);
   }
}
