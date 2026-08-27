import javax.annotation.Nullable;

public class agw implements yp<afn> {
   public static final yg<vi, agw> a = yp.a(agw::a, agw::new);
   private final agw.a b;
   @Nullable
   private final ajv c;

   public agw(agw.a $$0, @Nullable ajv $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static agw a(af $$0) {
      return new agw(agw.a.a, $$0.a());
   }

   public static agw b() {
      return new agw(agw.a.b, null);
   }

   private agw(vi $$0) {
      this.b = $$0.b(agw.a.class);
      if (this.b == agw.a.a) {
         this.c = $$0.q();
      } else {
         this.c = null;
      }
   }

   private void a(vi $$0) {
      $$0.a(this.b);
      if (this.b == agw.a.a) {
         $$0.a(this.c);
      }
   }

   @Override
   public yr<agw> a() {
      return afl.bO;
   }

   public void a(afn $$0) {
      $$0.a(this);
   }

   public agw.a e() {
      return this.b;
   }

   @Nullable
   public ajv f() {
      return this.c;
   }

   public static enum a {
      a,
      b;
   }
}
