import java.util.List;

public record aaw(List<jd> c) implements aaj {
   public static final yx<vw, aaw> a = aaj.a(aaw::a, aaw::new);
   public static final aaj.b<aaw> b = aaj.a("debug/raids");

   private aaw(vw $$0) {
      this($$0.a(jd.b));
   }

   private void a(vw $$0) {
      $$0.a(this.c, jd.b);
   }

   @Override
   public aaj.b<aaw> a() {
      return b;
   }

   public List<jd> b() {
      return this.c;
   }
}
