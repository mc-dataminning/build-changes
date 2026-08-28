import java.util.OptionalInt;

public record fia(int a, int b, OptionalInt c, OptionalInt d, boolean e) {
   public fia a(int $$0, int $$1) {
      return new fia($$0, $$1, this.c, this.d, this.e);
   }

   public fia a(boolean $$0) {
      return new fia(this.a, this.b, this.c, this.d, $$0);
   }
}
