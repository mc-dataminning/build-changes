import java.util.List;

public class aci implements zb<abn> {
   public static final ys<wf, aci> a = zb.a(aci::a, aci::new);
   private final int b;
   private final int c;
   private final List<cua> d;
   private final cua e;

   public aci(int $$0, int $$1, js<cua> $$2, cua $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = js.a($$2.size(), cua.l);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.d.set($$4, $$2.get($$4).s());
      }

      this.e = $$3.s();
   }

   private aci(wf $$0) {
      this.b = $$0.readUnsignedByte();
      this.c = $$0.l();
      this.d = cua.j.decode($$0);
      this.e = cua.h.decode($$0);
   }

   private void a(wf $$0) {
      $$0.k(this.b);
      $$0.c(this.c);
      cua.j.encode($$0, this.d);
      cua.h.encode($$0, this.e);
   }

   @Override
   public zd<aci> a() {
      return afz.u;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<cua> e() {
      return this.d;
   }

   public cua f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
