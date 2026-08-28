import java.util.List;

public record aas(List<jj> c) implements aaf {
   public static final yt<vr, aas> a = aaf.a(aas::a, aas::new);
   public static final aaf.b<aas> b = aaf.a("debug/raids");

   private aas(vr $$0) {
      this($$0.a(jj.b));
   }

   private void a(vr $$0) {
      $$0.a(this.c, jj.b);
   }

   @Override
   public aaf.b<aas> a() {
      return b;
   }

   public List<jj> b() {
      return this.c;
   }
}
