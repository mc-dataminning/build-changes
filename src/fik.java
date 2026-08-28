import java.util.OptionalInt;

public record fik(int a, int b, OptionalInt c, OptionalInt d, boolean e) {
   public fik a(int $$0, int $$1) {
      return new fik($$0, $$1, this.c, this.d, this.e);
   }

   public fik a(boolean $$0) {
      return new fik(this.a, this.b, this.c, this.d, $$0);
   }
}
