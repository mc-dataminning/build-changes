import java.util.List;

public class acz implements zp<ace> {
   public static final zg<wt, acz> a = zp.a(acz::a, acz::new);
   private final int b;
   private final int c;
   private final List<cwb> d;
   private final cwb e;

   public acz(int $$0, int $$1, jz<cwb> $$2, cwb $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = jz.a($$2.size(), cwb.k);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.d.set($$4, $$2.get($$4).v());
      }

      this.e = $$3.v();
   }

   private acz(wt $$0) {
      this.b = $$0.x();
      this.c = $$0.l();
      this.d = cwb.j.decode($$0);
      this.e = cwb.h.decode($$0);
   }

   private void a(wt $$0) {
      $$0.f(this.b);
      $$0.c(this.c);
      cwb.j.encode($$0, this.d);
      cwb.h.encode($$0, this.e);
   }

   @Override
   public zr<acz> a() {
      return agt.u;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<cwb> e() {
      return this.d;
   }

   public cwb f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
