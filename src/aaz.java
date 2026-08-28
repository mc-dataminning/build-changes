import java.util.List;

public record aaz(alh<djx> c, ert d, List<aaz.a> e) implements aak {
   public static final yy<vw, aaz> a = aak.a(aaz::a, aaz::new);
   public static final aak.b<aaz> b = aak.a("debug/structures");

   private aaz(vw $$0) {
      this($$0.a(mh.bp), b($$0), $$0.a(aaz.a::new));
   }

   private void a(vw $$0) {
      $$0.b(this.c);
      a($$0, this.d);
      $$0.a(this.e, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public aak.b<aaz> a() {
      return b;
   }

   static ert b(vw $$0) {
      return new ert($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(vw $$0, ert $$1) {
      $$0.q($$1.h());
      $$0.q($$1.i());
      $$0.q($$1.j());
      $$0.q($$1.k());
      $$0.q($$1.l());
      $$0.q($$1.m());
   }

   public alh<djx> b() {
      return this.c;
   }

   public ert c() {
      return this.d;
   }

   public List<aaz.a> d() {
      return this.e;
   }

   public static record a(ert a, boolean b) {
      public a(vw $$0) {
         this(aaz.b($$0), $$0.readBoolean());
      }

      public void a(vw $$0) {
         aaz.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
