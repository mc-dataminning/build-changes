import java.util.List;

public class acu implements zk<abz> {
   public static final zb<wo, acu> a = zk.a(acu::a, acu::new);
   private final int b;
   private final int c;
   private final List<cvl> d;
   private final cvl e;

   public acu(int $$0, int $$1, jw<cvl> $$2, cvl $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = jw.a($$2.size(), cvl.k);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.d.set($$4, $$2.get($$4).u());
      }

      this.e = $$3.u();
   }

   private acu(wo $$0) {
      this.b = $$0.x();
      this.c = $$0.l();
      this.d = cvl.j.decode($$0);
      this.e = cvl.h.decode($$0);
   }

   private void a(wo $$0) {
      $$0.f(this.b);
      $$0.c(this.c);
      cvl.j.encode($$0, this.d);
      cvl.h.encode($$0, this.e);
   }

   @Override
   public zm<acu> a() {
      return ago.u;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<cvl> e() {
      return this.d;
   }

   public cvl f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
