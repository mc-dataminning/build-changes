import java.util.OptionalInt;

public record fhs(int a, int b, OptionalInt c, OptionalInt d, boolean e) {
   public fhs a(int $$0, int $$1) {
      return new fhs($$0, $$1, this.c, this.d, this.e);
   }

   public fhs a(boolean $$0) {
      return new fhs(this.a, this.b, this.c, this.d, $$0);
   }
}
