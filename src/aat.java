import java.util.List;

public record aat(akl<dax> c, ehb d, List<aat.a> e) implements aaf {
   public static final yv<vx, aat> a = aaf.a(aat::a, aat::new);
   public static final aaf.b<aat> b = aaf.a("debug/structures");

   private aat(vx $$0) {
      this($$0.a(lf.aS), b($$0), $$0.a(aat.a::new));
   }

   private void a(vx $$0) {
      $$0.b(this.c);
      a($$0, this.d);
      $$0.a(this.e, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public aaf.b<aat> a() {
      return b;
   }

   static ehb b(vx $$0) {
      return new ehb($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(vx $$0, ehb $$1) {
      $$0.p($$1.h());
      $$0.p($$1.i());
      $$0.p($$1.j());
      $$0.p($$1.k());
      $$0.p($$1.l());
      $$0.p($$1.m());
   }

   public akl<dax> b() {
      return this.c;
   }

   public ehb c() {
      return this.d;
   }

   public List<aat.a> d() {
      return this.e;
   }

   public static record a(ehb a, boolean b) {
      public a(vx $$0) {
         this(aat.b($$0), $$0.readBoolean());
      }

      public void a(vx $$0) {
         aat.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
