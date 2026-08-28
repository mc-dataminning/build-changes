import java.util.List;

public record aam(List<ji> c) implements zz {
   public static final yn<vl, aam> a = zz.a(aam::a, aam::new);
   public static final zz.b<aam> b = zz.a("debug/raids");

   private aam(vl $$0) {
      this($$0.a(ji.b));
   }

   private void a(vl $$0) {
      $$0.a(this.c, ji.b);
   }

   @Override
   public zz.b<aam> a() {
      return b;
   }

   public List<ji> b() {
      return this.c;
   }
}
