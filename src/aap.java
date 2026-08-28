import java.util.List;

public record aap(int c, jd d, List<aap.a> e) implements aaj {
   public static final yx<vw, aap> a = aaj.a(aap::a, aap::new);
   public static final aaj.b<aap> b = aaj.a("debug/goal_selector");

   private aap(vw $$0) {
      this($$0.readInt(), $$0.e(), $$0.a(aap.a::new));
   }

   private void a(vw $$0) {
      $$0.p(this.c);
      $$0.a(this.d);
      $$0.a(this.e, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public aaj.b<aap> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public jd c() {
      return this.d;
   }

   public List<aap.a> d() {
      return this.e;
   }

   public static record a(int a, boolean b, String c) {
      public a(vw $$0) {
         this($$0.readInt(), $$0.readBoolean(), $$0.d(255));
      }

      public void a(vw $$0) {
         $$0.p(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
