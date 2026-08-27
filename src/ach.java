import java.util.List;

public class ach implements zb<abm> {
   public static final ys<wf, ach> a = zb.a(ach::a, ach::new);
   private final int b;
   private final int c;
   private final List<csz> d;
   private final csz e;

   public ach(int $$0, int $$1, jf<csz> $$2, csz $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = jf.a($$2.size(), csz.i);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.d.set($$4, $$2.get($$4).r());
      }

      this.e = $$3.r();
   }

   private ach(wf $$0) {
      this.b = $$0.readUnsignedByte();
      this.c = $$0.l();
      this.d = csz.g.decode($$0);
      this.e = csz.e.decode($$0);
   }

   private void a(wf $$0) {
      $$0.k(this.b);
      $$0.c(this.c);
      csz.g.encode($$0, this.d);
      csz.e.encode($$0, this.e);
   }

   @Override
   public zd<ach> a() {
      return afx.u;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<csz> e() {
      return this.d;
   }

   public csz f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
