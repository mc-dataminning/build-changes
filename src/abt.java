import java.util.List;

public class abt implements yn<aay> {
   public static final ye<vr, abt> a = yn.a(abt::a, abt::new);
   private final int b;
   private final int c;
   private final List<crj> d;
   private final crj e;

   public abt(int $$0, int $$1, iu<crj> $$2, crj $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = iu.a($$2.size(), crj.i);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.d.set($$4, $$2.get($$4).r());
      }

      this.e = $$3.r();
   }

   private abt(vr $$0) {
      this.b = $$0.readUnsignedByte();
      this.c = $$0.l();
      this.d = crj.g.decode($$0);
      this.e = crj.e.decode($$0);
   }

   private void a(vr $$0) {
      $$0.k(this.b);
      $$0.c(this.c);
      crj.g.encode($$0, this.d);
      crj.e.encode($$0, this.e);
   }

   @Override
   public yp<abt> a() {
      return afj.u;
   }

   public void a(aay $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<crj> e() {
      return this.d;
   }

   public crj f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
