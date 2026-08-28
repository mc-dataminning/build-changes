import java.util.List;

public record aav(List<iu> c) implements aai {
   public static final yw<vu, aav> a = aai.a(aav::a, aav::new);
   public static final aai.b<aav> b = aai.a("debug/raids");

   private aav(vu $$0) {
      this($$0.a(iu.b));
   }

   private void a(vu $$0) {
      $$0.a(this.c, iu.b);
   }

   @Override
   public aai.b<aav> a() {
      return b;
   }

   public List<iu> b() {
      return this.c;
   }
}
