import java.util.List;

public record add(add.a b, List<String> c) implements zp<ace> {
   public static final zg<wf, add> a = zp.a(add::a, add::new);

   private add(wf $$0) {
      this($$0.b(add.a.class), $$0.a(wf::p));
   }

   private void a(wf $$0) {
      $$0.a(this.b);
      $$0.a(this.c, wf::a);
   }

   @Override
   public zr<add> a() {
      return agt.y;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public List<String> e() {
      return this.c;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
