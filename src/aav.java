import java.util.List;

public record aav(List<jd> c) implements aai {
   public static final yw<vv, aav> a = aai.a(aav::a, aav::new);
   public static final aai.b<aav> b = aai.a("debug/raids");

   private aav(vv $$0) {
      this($$0.a(jd.b));
   }

   private void a(vv $$0) {
      $$0.a(this.c, jd.b);
   }

   @Override
   public aai.b<aav> a() {
      return b;
   }

   public List<jd> b() {
      return this.c;
   }
}
