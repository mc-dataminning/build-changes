import java.util.OptionalInt;

public record fjz(int a, int b, OptionalInt c, OptionalInt d, boolean e) {
   public fjz a(int $$0, int $$1) {
      return new fjz($$0, $$1, this.c, this.d, this.e);
   }

   public fjz a(boolean $$0) {
      return new fjz(this.a, this.b, this.c, this.d, $$0);
   }
}
