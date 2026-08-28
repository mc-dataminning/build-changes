import java.util.List;

public class acl implements zc<abr> {
   public static final yt<wg, acl> a = zc.a(acl::a, acl::new);
   private final int b;
   private final int c;
   private final List<cxy> d;
   private final cxy e;

   public acl(int $$0, int $$1, kb<cxy> $$2, cxy $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = kb.a($$2.size(), cxy.k);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.d.set($$4, $$2.get($$4).v());
      }

      this.e = $$3.v();
   }

   private acl(wg $$0) {
      this.b = $$0.x();
      this.c = $$0.l();
      this.d = cxy.j.decode($$0);
      this.e = cxy.h.decode($$0);
   }

   private void a(wg $$0) {
      $$0.f(this.b);
      $$0.c(this.c);
      cxy.j.encode($$0, this.d);
      cxy.h.encode($$0, this.e);
   }

   @Override
   public ze<acl> a() {
      return agk.t;
   }

   public void a(abr $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<cxy> e() {
      return this.d;
   }

   public cxy f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
