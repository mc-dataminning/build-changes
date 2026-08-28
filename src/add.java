import java.util.List;

public class add implements zw<aci> {
   public static final zn<xa, add> a = zw.a(add::a, add::new);
   private final int b;
   private final int c;
   private final List<cur> d;
   private final cur e;

   public add(int $$0, int $$1, jr<cur> $$2, cur $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = jr.a($$2.size(), cur.l);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.d.set($$4, $$2.get($$4).s());
      }

      this.e = $$3.s();
   }

   private add(xa $$0) {
      this.b = $$0.readUnsignedByte();
      this.c = $$0.l();
      this.d = cur.j.decode($$0);
      this.e = cur.h.decode($$0);
   }

   private void a(xa $$0) {
      $$0.k(this.b);
      $$0.c(this.c);
      cur.j.encode($$0, this.d);
      cur.h.encode($$0, this.e);
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

   public List<cur> e() {
      return this.d;
   }

   public cur f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
