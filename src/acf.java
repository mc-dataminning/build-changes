import java.util.List;

public class acf implements yz<abk> {
   public static final yq<wd, acf> a = yz.a(acf::a, acf::new);
   private final int b;
   private final int c;
   private final List<csd> d;
   private final csd e;

   public acf(int $$0, int $$1, je<csd> $$2, csd $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = je.a($$2.size(), csd.i);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.d.set($$4, $$2.get($$4).r());
      }

      this.e = $$3.r();
   }

   private acf(wd $$0) {
      this.b = $$0.readUnsignedByte();
      this.c = $$0.l();
      this.d = csd.g.decode($$0);
      this.e = csd.e.decode($$0);
   }

   private void a(wd $$0) {
      $$0.k(this.b);
      $$0.c(this.c);
      csd.g.encode($$0, this.d);
      csd.e.encode($$0, this.e);
   }

   @Override
   public zb<acf> a() {
      return afv.u;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<csd> e() {
      return this.d;
   }

   public csd f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
