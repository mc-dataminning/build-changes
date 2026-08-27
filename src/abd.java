import java.util.List;

public class abd implements xz<aai> {
   public static final xq<vd, abd> a = xz.a(abd::a, abd::new);
   private final int b;
   private final int c;
   private final List<cpq> d;
   private final cpq e;

   public abd(int $$0, int $$1, iu<cpq> $$2, cpq $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = iu.a($$2.size(), cpq.h);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.d.set($$4, $$2.get($$4).q());
      }

      this.e = $$3.q();
   }

   private abd(vd $$0) {
      this.b = $$0.readUnsignedByte();
      this.c = $$0.l();
      this.d = cpq.g.decode($$0);
      this.e = cpq.f.decode($$0);
   }

   private void a(vd $$0) {
      $$0.k(this.b);
      $$0.c(this.c);
      cpq.g.encode($$0, this.d);
      cpq.f.encode($$0, this.e);
   }

   @Override
   public yb<abd> a() {
      return aet.u;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<cpq> e() {
      return this.d;
   }

   public cpq f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
