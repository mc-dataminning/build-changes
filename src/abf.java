import java.util.List;

public record abf(List<jh> c) implements aas {
   public static final zg<wf, abf> a = aas.a(abf::a, abf::new);
   public static final aas.b<abf> b = aas.a("debug/raids");

   private abf(wf $$0) {
      this($$0.a(jh.b));
   }

   private void a(wf $$0) {
      $$0.a(this.c, jh.b);
   }

   @Override
   public aas.b<abf> a() {
      return b;
   }

   public List<jh> b() {
      return this.c;
   }
}
