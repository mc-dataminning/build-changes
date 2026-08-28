import java.util.List;

public record aaw(akp<dcu> c, eje d, List<aaw.a> e) implements aai {
   public static final yw<vv, aaw> a = aai.a(aaw::a, aaw::new);
   public static final aai.b<aaw> b = aai.a("debug/structures");

   private aaw(vv $$0) {
      this($$0.a(lu.ba), b($$0), $$0.a(aaw.a::new));
   }

   private void a(vv $$0) {
      $$0.b(this.c);
      a($$0, this.d);
      $$0.a(this.e, ($$1, $$2) -> $$2.a($$0));
   }

   @Override
   public aai.b<aaw> a() {
      return b;
   }

   static eje b(vv $$0) {
      return new eje($$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt(), $$0.readInt());
   }

   static void a(vv $$0, eje $$1) {
      $$0.p($$1.h());
      $$0.p($$1.i());
      $$0.p($$1.j());
      $$0.p($$1.k());
      $$0.p($$1.l());
      $$0.p($$1.m());
   }

   public akp<dcu> b() {
      return this.c;
   }

   public eje c() {
      return this.d;
   }

   public List<aaw.a> d() {
      return this.e;
   }

   public static record a(eje a, boolean b) {
      public a(vv $$0) {
         this(aaw.b($$0), $$0.readBoolean());
      }

      public void a(vv $$0) {
         aaw.a($$0, this.a);
         $$0.a(this.b);
      }
   }
}
