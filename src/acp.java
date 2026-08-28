import java.util.List;

public class acp implements zg<abu> {
   public static final yx<wk, acp> a = zg.a(acp::a, acp::new);
   private final int b;
   private final int c;
   private final List<cuq> d;
   private final cuq e;

   public acp(int $$0, int $$1, jv<cuq> $$2, cuq $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = jv.a($$2.size(), cuq.l);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.d.set($$4, $$2.get($$4).s());
      }

      this.e = $$3.s();
   }

   private acp(wk $$0) {
      this.b = $$0.readUnsignedByte();
      this.c = $$0.l();
      this.d = cuq.j.decode($$0);
      this.e = cuq.h.decode($$0);
   }

   private void a(wk $$0) {
      $$0.k(this.b);
      $$0.c(this.c);
      cuq.j.encode($$0, this.d);
      cuq.h.encode($$0, this.e);
   }

   @Override
   public zi<acp> a() {
      return agg.u;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<cuq> e() {
      return this.d;
   }

   public cuq f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
