import java.util.List;

public record aav(List<iv> c) implements aai {
   public static final yw<vu, aav> a = aai.a(aav::a, aav::new);
   public static final aai.b<aav> b = aai.a("debug/raids");

   private aav(vu $$0) {
      this($$0.a(iv.b));
   }

   private void a(vu $$0) {
      $$0.a(this.c, iv.b);
   }

   @Override
   public aai.b<aav> a() {
      return b;
   }

   public List<iv> b() {
      return this.c;
   }
}
