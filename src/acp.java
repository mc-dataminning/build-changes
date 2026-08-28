import java.util.List;

public record acp(acp.a b, List<String> c) implements zc<abr> {
   public static final yt<vr, acp> a = zc.a(acp::a, acp::new);

   private acp(vr $$0) {
      this($$0.b(acp.a.class), $$0.a(vr::p));
   }

   private void a(vr $$0) {
      $$0.a(this.b);
      $$0.a(this.c, vr::a);
   }

   @Override
   public ze<acp> a() {
      return agk.x;
   }

   public void a(abr $$0) {
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
