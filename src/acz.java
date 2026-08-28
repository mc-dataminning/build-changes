import java.util.List;

public class acz implements zs<ace> {
   public static final zj<ww, acz> a = zs.a(acz::a, acz::new);
   private final int b;
   private final int c;
   private final List<cuk> d;
   private final cuk e;

   public acz(int $$0, int $$1, jr<cuk> $$2, cuk $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = jr.a($$2.size(), cuk.l);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.d.set($$4, $$2.get($$4).s());
      }

      this.e = $$3.s();
   }

   private acz(ww $$0) {
      this.b = $$0.readUnsignedByte();
      this.c = $$0.l();
      this.d = cuk.j.decode($$0);
      this.e = cuk.h.decode($$0);
   }

   private void a(ww $$0) {
      $$0.k(this.b);
      $$0.c(this.c);
      cuk.j.encode($$0, this.d);
      cuk.h.encode($$0, this.e);
   }

   @Override
   public zu<acz> a() {
      return agq.u;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<cuk> e() {
      return this.d;
   }

   public cuk f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
