import java.util.List;

public record aap(List<in> c) implements aac {
   public static final ys<vu, aap> a = aac.a(aap::a, aap::new);
   public static final aac.b<aap> b = aac.a("debug/raids");

   private aap(vu $$0) {
      this($$0.a(in.b));
   }

   private void a(vu $$0) {
      $$0.a(this.c, in.b);
   }

   @Override
   public aac.b<aap> a() {
      return b;
   }

   public List<in> b() {
      return this.c;
   }
}
