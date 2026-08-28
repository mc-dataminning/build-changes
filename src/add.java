import java.util.List;

public class add implements zw<aci> {
   public static final zn<xa, add> a = zw.a(add::a, add::new);
   private final int b;
   private final int c;
   private final List<cup> d;
   private final cup e;

   public add(int $$0, int $$1, jr<cup> $$2, cup $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = jr.a($$2.size(), cup.l);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.d.set($$4, $$2.get($$4).s());
      }

      this.e = $$3.s();
   }

   private add(xa $$0) {
      this.b = $$0.readUnsignedByte();
      this.c = $$0.l();
      this.d = cup.j.decode($$0);
      this.e = cup.h.decode($$0);
   }

   private void a(xa $$0) {
      $$0.k(this.b);
      $$0.c(this.c);
      cup.j.encode($$0, this.d);
      cup.h.encode($$0, this.e);
   }

   @Override
   public zy<add> a() {
      return agu.u;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<cup> e() {
      return this.d;
   }

   public cup f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
