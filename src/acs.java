import java.util.List;

public class acs implements zl<abw> {
   public static final zc<wp, acs> a = zl.a(acs::a, acs::new);
   private final int b;
   private final int c;
   private final List<cuh> d;
   private final cuh e;

   public acs(int $$0, int $$1, jj<cuh> $$2, cuh $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = jj.a($$2.size(), cuh.i);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.d.set($$4, $$2.get($$4).r());
      }

      this.e = $$3.r();
   }

   private acs(wp $$0) {
      this.b = $$0.readUnsignedByte();
      this.c = $$0.l();
      this.d = cuh.g.decode($$0);
      this.e = cuh.e.decode($$0);
   }

   private void a(wp $$0) {
      $$0.k(this.b);
      $$0.c(this.c);
      cuh.g.encode($$0, this.d);
      cuh.e.encode($$0, this.e);
   }

   @Override
   public zn<acs> a() {
      return agj.v;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<cuh> e() {
      return this.d;
   }

   public cuh f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
