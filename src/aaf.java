import java.util.List;

public record aaf(int c, ji d, List<aaf.a> e) implements zz {
   public static final yn<vl, aaf> a = zz.a(aaf::a, aaf::new);
   public static final zz.b<aaf> b = zz.a("debug/goal_selector");

   private aaf(vl $$0) {
      this($$0.readInt(), $$0.e(), $$0.a(aaf.a::new));
   }

   private void a(vl $$0) {
      $$0.q(this.c);
      $$0.a(this.d);
      $$0.a(this.e, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zz.b<aaf> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public ji c() {
      return this.d;
   }

   public List<aaf.a> d() {
      return this.e;
   }

   public static record a(int a, boolean b, String c) {
      public a(vl $$0) {
         this($$0.readInt(), $$0.readBoolean(), $$0.d(255));
      }

      public void a(vl $$0) {
         $$0.q(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
