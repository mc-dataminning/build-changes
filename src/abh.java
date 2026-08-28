import java.util.List;

public record abh(List<jh> c) implements aau {
   public static final zi<wh, abh> a = aau.a(abh::a, abh::new);
   public static final aau.b<abh> b = aau.a("debug/raids");

   private abh(wh $$0) {
      this($$0.a(jh.b));
   }

   private void a(wh $$0) {
      $$0.a(this.c, jh.b);
   }

   @Override
   public aau.b<abh> a() {
      return b;
   }

   public List<jh> b() {
      return this.c;
   }
}
