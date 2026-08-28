import java.util.List;

public record aaq(int c, iv d, List<aaq.a> e) implements aak {
   public static final yy<vw, aaq> a = aak.a(aaq::a, aaq::new);
   public static final aak.b<aaq> b = aak.a("debug/goal_selector");

   private aaq(vw $$0) {
      this($$0.readInt(), $$0.e(), $$0.a(aaq.a::new));
   }

   private void a(vw $$0) {
      $$0.q(this.c);
      $$0.a(this.d);
      $$0.a(this.e, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public aak.b<aaq> a() {
      return b;
   }

   public int b() {
      return this.c;
   }

   public iv c() {
      return this.d;
   }

   public List<aaq.a> d() {
      return this.e;
   }

   public static record a(int a, boolean b, String c) {
      public a(vw $$0) {
         this($$0.readInt(), $$0.readBoolean(), $$0.d(255));
      }

      public void a(vw $$0) {
         $$0.q(this.a);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
