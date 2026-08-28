import java.util.List;

public record abk(List<iz> c) implements aax {
   public static final zn<wm, abk> a = aax.a(abk::a, abk::new);
   public static final aax.b<abk> b = aax.a("debug/raids");

   private abk(wm $$0) {
      this($$0.a(iz.b));
   }

   private void a(wm $$0) {
      $$0.a(this.c, iz.b);
   }

   @Override
   public aax.b<abk> a() {
      return b;
   }

   public List<iz> b() {
      return this.c;
   }
}
