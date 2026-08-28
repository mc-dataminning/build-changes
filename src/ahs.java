import javax.annotation.Nullable;

public class ahs implements zg<agi> {
   public static final yx<vw, ahs> a = zg.a(ahs::a, ahs::new);
   private final ahs.a b;
   @Nullable
   private final akr c;

   public ahs(ahs.a $$0, @Nullable akr $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static ahs a(ag $$0) {
      return new ahs(ahs.a.a, $$0.a());
   }

   public static ahs b() {
      return new ahs(ahs.a.b, null);
   }

   private ahs(vw $$0) {
      this.b = $$0.b(ahs.a.class);
      if (this.b == ahs.a.a) {
         this.c = $$0.q();
      } else {
         this.c = null;
      }
   }

   private void a(vw $$0) {
      $$0.a(this.b);
      if (this.b == ahs.a.a) {
         $$0.a(this.c);
      }
   }

   @Override
   public zi<ahs> a() {
      return agg.bQ;
   }

   public void a(agi $$0) {
      $$0.a(this);
   }

   public ahs.a e() {
      return this.b;
   }

   @Nullable
   public akr f() {
      return this.c;
   }

   public static enum a {
      a,
      b;
   }
}
