import java.util.List;

public record abc(ala<dds> c, ekg d, List<abc.a> e) implements aan {
   public static final zb<wa, abc> a = aan.a(abc::a, abc::new);
   public static final aan.b<abc> b = aan.a("debug/structures");

   private abc(wa $$0) {
      this($$0.a(lv.ba), b($$0), $$0.a(abc.a::new));
   }

   private void a(wa $$0) {
      $$0.b(this.c);
      a($$0, this.d);
      $$0.a(this.e, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public aan.b<abc> a() {
      return b;
   }

   static ekg b(wa $$0) {
      return new ekg($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(wa $$0, ekg $$1) {
      $$0.q($$1.h());
      $$0.q($$1.i());
      $$0.q($$1.j());
      $$0.q($$1.k());
      $$0.q($$1.l());
      $$0.q($$1.m());
   }

   public ala<dds> b() {
      return this.c;
   }

   public ekg c() {
      return this.d;
   }

   public List<abc.a> d() {
      return this.e;
   }

   public static record a(ekg a, boolean b) {
      public a(wa $$0) {
         this(abc.b($$0), $$0.readBoolean());
      }

      public void a(wa $$0) {
         abc.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
