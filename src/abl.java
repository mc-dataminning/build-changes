import java.util.List;

public record abl(ale<dca> c, eie d, List<abl.a> e) implements aax {
   public static final zn<wm, abl> a = aax.a(abl::a, abl::new);
   public static final aax.b<abl> b = aax.a("debug/structures");

   private abl(wm $$0) {
      this($$0.a(lq.aS), b($$0), $$0.a(abl.a::new));
   }

   private void a(wm $$0) {
      $$0.b(this.c);
      a($$0, this.d);
      $$0.a(this.e, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public aax.b<abl> a() {
      return b;
   }

   static eie b(wm $$0) {
      return new eie($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(wm $$0, eie $$1) {
      $$0.p($$1.h());
      $$0.p($$1.i());
      $$0.p($$1.j());
      $$0.p($$1.k());
      $$0.p($$1.l());
      $$0.p($$1.m());
   }

   public ale<dca> b() {
      return this.c;
   }

   public eie c() {
      return this.d;
   }

   public List<abl.a> d() {
      return this.e;
   }

   public static record a(eie a, boolean b) {
      public a(wm $$0) {
         this(abl.b($$0), $$0.readBoolean());
      }

      public void a(wm $$0) {
         abl.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
