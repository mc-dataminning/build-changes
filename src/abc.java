import java.util.List;

public record abc(int c, iz d, List<abc.a> e) implements aaw {
   public static final zm<wl, abc> a = aaw.a(abc::a, abc::new);
   public static final aaw.b<abc> b = aaw.a("debug/goal_selector");

   private abc(wl $$0) {
      this($$0.readInt(), $$0.e(), $$0.a(abc.a::new));
   }

   private void a(wl $$0) {
      $$0.p(this.c);
      $$0.a(this.d);
      $$0.a(this.e, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public aaw.b<abc> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public iz c() {
      return this.d;
   }

   public List<abc.a> d() {
      return this.e;
   }

   public static record a(int a, boolean b, String c) {
      public a(wl $$0) {
         this($$0.readInt(), $$0.readBoolean(), $$0.d(255));
      }

      public void a(wl $$0) {
         $$0.p(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
