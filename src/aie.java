import javax.annotation.Nullable;

public class aie implements zh<agr> {
   public static final yy<vw, aie> a = zh.a(aie::a, aie::new);
   private final aie.a b;
   @Nullable
   private final ali c;

   public aie(aie.a $$0, @Nullable ali $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static aie a(aj $$0) {
      return new aie(aie.a.a, $$0.a());
   }

   public static aie b() {
      return new aie(aie.a.b, null);
   }

   private aie(vw $$0) {
      this.b = $$0.b(aie.a.class);
      if (this.b == aie.a.a) {
         this.c = $$0.q();
      } else {
         this.c = null;
      }
   }

   private void a(vw $$0) {
      $$0.a(this.b);
      if (this.b == aie.a.a) {
         $$0.a(this.c);
      }
   }

   @Override
   public zj<aie> a() {
      return agp.bZ;
   }

   public void a(agr $$0) {
      $$0.a(this);
   }

   public aie.a e() {
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
