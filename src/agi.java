import javax.annotation.Nullable;

public class agi implements yb<aez> {
   public static final xs<uu, agi> a = yb.a(agi::a, agi::new);
   private final agi.a b;
   @Nullable
   private final ajh c;

   public agi(agi.a $$0, @Nullable ajh $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static agi a(af $$0) {
      return new agi(agi.a.a, $$0.a());
   }

   public static agi b() {
      return new agi(agi.a.b, null);
   }

   private agi(uu $$0) {
      this.b = $$0.b(agi.a.class);
      if (this.b == agi.a.a) {
         this.c = $$0.q();
      } else {
         this.c = null;
      }
   }

   private void a(uu $$0) {
      $$0.a(this.b);
      if (this.b == agi.a.a) {
         $$0.a(this.c);
      }
   }

   @Override
   public yd<agi> a() {
      return aex.bO;
   }

   public void a(aez $$0) {
      $$0.a(this);
   }

   public agi.a e() {
      return this.b;
   }

   @Nullable
   public ajh f() {
      return this.c;
   }

   public static enum a {
      a,
      b;
   }
}
