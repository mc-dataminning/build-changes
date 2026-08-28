import javax.annotation.Nullable;

public class aig implements zp<agv> {
   public static final zg<wf, aig> a = zp.a(aig::a, aig::new);
   private final aig.a b;
   @Nullable
   private final ali c;

   public aig(aig.a $$0, @Nullable ali $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static aig a(ah $$0) {
      return new aig(aig.a.a, $$0.a());
   }

   public static aig b() {
      return new aig(aig.a.b, null);
   }

   private aig(wf $$0) {
      this.b = $$0.b(aig.a.class);
      if (this.b == aig.a.a) {
         this.c = $$0.q();
      } else {
         this.c = null;
      }
   }

   private void a(wf $$0) {
      $$0.a(this.b);
      if (this.b == aig.a.a) {
         $$0.a(this.c);
      }
   }

   @Override
   public zr<aig> a() {
      return agt.bT;
   }

   public void a(agv $$0) {
      $$0.a(this);
   }

   public aig.a e() {
      return this.b;
   }

   @Nullable
   public ali f() {
      return this.c;
   }

   public static enum a {
      a,
      b;
   }
}
