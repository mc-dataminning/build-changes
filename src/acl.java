import java.util.List;

public class acl implements ze<abq> {
   public static final yv<wi, acl> a = ze.a(acl::a, acl::new);
   private final int b;
   private final int c;
   private final List<ctq> d;
   private final ctq e;

   public acl(int $$0, int $$1, jg<ctq> $$2, ctq $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = jg.a($$2.size(), ctq.i);

      for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
         this.d.set($$4, $$2.get($$4).s());
      }

      this.e = $$3.s();
   }

   private acl(wi $$0) {
      this.b = $$0.readUnsignedByte();
      this.c = $$0.l();
      this.d = ctq.g.decode($$0);
      this.e = ctq.e.decode($$0);
   }

   private void a(wi $$0) {
      $$0.k(this.b);
      $$0.c(this.c);
      ctq.g.encode($$0, this.d);
      ctq.e.encode($$0, this.e);
   }

   @Override
   public zg<acl> a() {
      return agc.u;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<ctq> e() {
      return this.d;
   }

   public ctq f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
