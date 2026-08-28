import java.util.List;

public class acs implements zj<aby> {
   public static final za<wn, acs> a = zj.a(acs::a, acs::new);
   private final int b;
   private final int c;
   private final List<daa> d;
   private final daa e;

   public acs(int $$0, int $$1, jp<daa> $$2, daa $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = jp.a($$2.size(), daa.k);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.d.set($$4, $$2.get($$4).v());
      }

      this.e = $$3.v();
   }

   private acs(wn $$0) {
      this.b = $$0.x();
      this.c = $$0.l();
      this.d = daa.j.decode($$0);
      this.e = daa.h.decode($$0);
   }

   private void a(wn $$0) {
      $$0.f(this.b);
      $$0.c(this.c);
      daa.j.encode($$0, this.d);
      daa.h.encode($$0, this.e);
   }

   @Override
   public zl<acs> a() {
      return agr.t;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<daa> e() {
      return this.d;
   }

   public daa f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
