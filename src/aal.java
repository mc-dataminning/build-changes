import java.util.List;

public record aal(int c, io d, List<aal.a> e) implements aaf {
   public static final yv<vx, aal> a = aaf.a(aal::a, aal::new);
   public static final aaf.b<aal> b = aaf.a("debug/goal_selector");

   private aal(vx $$0) {
      this($$0.readInt(), $$0.e(), $$0.a(aal.a::new));
   }

   private void a(vx $$0) {
      $$0.p(this.c);
      $$0.a(this.d);
      $$0.a(this.e, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public aaf.b<aal> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public io c() {
      return this.d;
   }

   public List<aal.a> d() {
      return this.e;
   }

   public static record a(int a, boolean b, String c) {
      public a(vx $$0) {
         this($$0.readInt(), $$0.readBoolean(), $$0.d(255));
      }

      public void a(vx $$0) {
         $$0.p(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
