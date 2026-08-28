import java.util.OptionalInt;

public record fip(int a, int b, OptionalInt c, OptionalInt d, boolean e) {
   public fip a(int $$0, int $$1) {
      return new fip($$0, $$1, this.c, this.d, this.e);
   }

   public fip a(boolean $$0) {
      return new fip(this.a, this.b, this.c, this.d, $$0);
   }
}
