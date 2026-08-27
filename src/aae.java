import java.util.List;

public record aae(aju<czg> c, efi d, List<aae.a> e) implements zq {
   public static final yg<vi, aae> a = zq.a(aae::a, aae::new);
   public static final zq.b<aae> b = zq.a("debug/structures");

   private aae(vi $$0) {
      this($$0.a(ku.aP), b($$0), $$0.a(aae.a::new));
   }

   private void a(vi $$0) {
      $$0.b(this.c);
      a($$0, this.d);
      $$0.a(this.e, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public zq.b<aae> a() {
      return b;
   }

   static efi b(vi $$0) {
      return new efi($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(vi $$0, efi $$1) {
      $$0.p($$1.h());
      $$0.p($$1.i());
      $$0.p($$1.j());
      $$0.p($$1.k());
      $$0.p($$1.l());
      $$0.p($$1.m());
   }

   public aju<czg> b() {
      return this.c;
   }

   public efi c() {
      return this.d;
   }

   public List<aae.a> d() {
      return this.e;
   }

   public static record a(efi a, boolean b) {
      public a(vi $$0) {
         this(aae.b($$0), $$0.readBoolean());
      }

      public void a(vi $$0) {
         aae.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
