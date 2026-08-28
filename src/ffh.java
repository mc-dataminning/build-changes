import java.util.OptionalInt;

public record ffh(int a, int b, OptionalInt c, OptionalInt d, boolean e) {
   public ffh a(int $$0, int $$1) {
      return new ffh($$0, $$1, this.c, this.d, this.e);
   }

   public ffh a(boolean $$0) {
      return new ffh(this.a, this.b, this.c, this.d, $$0);
   }
}
