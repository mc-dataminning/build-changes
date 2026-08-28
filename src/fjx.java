import java.util.OptionalInt;

public record fjx(int a, int b, OptionalInt c, OptionalInt d, boolean e) {
   public fjx a(int $$0, int $$1) {
      return new fjx($$0, $$1, this.c, this.d, this.e);
   }

   public fjx a(boolean $$0) {
      return new fjx(this.a, this.b, this.c, this.d, $$0);
   }
}
