import java.util.List;

public class abv implements yp<aba> {
   public static final yg<vt, abv> a = yp.a(abv::a, abv::new);
   private final int b;
   private final int c;
   private final List<crs> d;
   private final crs e;

   public abv(int $$0, int $$1, iw<crs> $$2, crs $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = iw.a($$2.size(), crs.i);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.d.set($$4, $$2.get($$4).r());
      }

      this.e = $$3.r();
   }

   private abv(vt $$0) {
      this.b = $$0.readUnsignedByte();
      this.c = $$0.l();
      this.d = crs.g.decode($$0);
      this.e = crs.e.decode($$0);
   }

   private void a(vt $$0) {
      $$0.k(this.b);
      $$0.c(this.c);
      crs.g.encode($$0, this.d);
      crs.e.encode($$0, this.e);
   }

   @Override
   public yr<abv> a() {
      return afl.u;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<crs> e() {
      return this.d;
   }

   public crs f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
