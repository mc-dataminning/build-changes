import javax.annotation.Nullable;

public class aib implements zk<agq> {
   public static final zb<wa, aib> a = zk.a(aib::a, aib::new);
   private final aib.a b;
   @Nullable
   private final alc c;

   public aib(aib.a $$0, @Nullable alc $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static aib a(ag $$0) {
      return new aib(aib.a.a, $$0.a());
   }

   public static aib b() {
      return new aib(aib.a.b, null);
   }

   private aib(wa $$0) {
      this.b = $$0.b(aib.a.class);
      if (this.b == aib.a.a) {
         this.c = $$0.q();
      } else {
         this.c = null;
      }
   }

   private void a(wa $$0) {
      $$0.a(this.b);
      if (this.b == aib.a.a) {
         $$0.a(this.c);
      }
   }

   @Override
   public zm<aib> a() {
      return ago.bT;
   }

   public void a(agq $$0) {
      $$0.a(this);
   }

   public aib.a e() {
      return this.b;
   }

   @Nullable
   public alc f() {
      return this.c;
   }

   public static enum a {
      a,
      b;
   }
}
