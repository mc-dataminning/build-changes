import java.util.List;

public record acp(acp.a b, List<String> c) implements ze<abq> {
   public static final yv<vx, acp> a = ze.a(acp::a, acp::new);

   private acp(vx $$0) {
      this($$0.b(acp.a.class), $$0.a(vx::p));
   }

   private void a(vx $$0) {
      $$0.a(this.b);
      $$0.a(this.c, vx::a);
   }

   @Override
   public zg<acp> a() {
      return agc.y;
   }

   public void a(abq $$0) {
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
