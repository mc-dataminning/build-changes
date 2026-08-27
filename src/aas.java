import java.util.List;

public record aas(List<io> c) implements aaf {
   public static final yv<vx, aas> a = aaf.a(aas::a, aas::new);
   public static final aaf.b<aas> b = aaf.a("debug/raids");

   private aas(vx $$0) {
      this($$0.a(io.b));
   }

   private void a(vx $$0) {
      $$0.a(this.c, io.b);
   }

   @Override
   public aaf.b<aas> a() {
      return b;
   }

   public List<io> b() {
      return this.c;
   }
}
