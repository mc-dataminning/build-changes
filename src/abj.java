import java.util.List;

public record abj(List<iz> c) implements aaw {
   public static final zm<wl, abj> a = aaw.a(abj::a, abj::new);
   public static final aaw.b<abj> b = aaw.a("debug/raids");

   private abj(wl $$0) {
      this($$0.a(iz.b));
   }

   private void a(wl $$0) {
      $$0.a(this.c, iz.b);
   }

   @Override
   public aaw.b<abj> a() {
      return b;
   }

   public List<iz> b() {
      return this.c;
   }
}
