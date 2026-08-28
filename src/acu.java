import java.util.List;

public record acu(acu.a b, List<String> c) implements zh<abw> {
   public static final yy<vw, acu> a = zh.a(acu::a, acu::new);

   private acu(vw $$0) {
      this($$0.b(acu.a.class), $$0.a(vw::p));
   }

   private void a(vw $$0) {
      $$0.a(this.b);
      $$0.a(this.c, vw::a);
   }

   @Override
   public zj<acu> a() {
      return agp.x;
   }

   public void a(abw $$0) {
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
