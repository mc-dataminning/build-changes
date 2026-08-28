import java.util.List;

public record aap(List<ja> c) implements aac {
   public static final ys<vr, aap> a = aac.a(aap::a, aap::new);
   public static final aac.b<aap> b = aac.a("debug/raids");

   private aap(vr $$0) {
      this($$0.a(ja.b));
   }

   private void a(vr $$0) {
      $$0.a(this.c, ja.b);
   }

   @Override
   public aac.b<aap> a() {
      return b;
   }

   public List<ja> b() {
      return this.c;
   }
}
