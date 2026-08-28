import java.util.List;

public record aaz(List<iw> c) implements aam {
   public static final za<vy, aaz> a = aam.a(aaz::a, aaz::new);
   public static final aam.b<aaz> b = aam.a("debug/raids");

   private aaz(vy $$0) {
      this($$0.a(iw.b));
   }

   private void a(vy $$0) {
      $$0.a(this.c, iw.b);
   }

   @Override
   public aam.b<aaz> a() {
      return b;
   }

   public List<iw> b() {
      return this.c;
   }
}
