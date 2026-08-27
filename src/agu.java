import javax.annotation.Nullable;

public class agu implements yn<afl> {
   public static final ye<vg, agu> a = yn.a(agu::a, agu::new);
   private final agu.a b;
   @Nullable
   private final ajt c;

   public agu(agu.a $$0, @Nullable ajt $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static agu a(af $$0) {
      return new agu(agu.a.a, $$0.a());
   }

   public static agu b() {
      return new agu(agu.a.b, null);
   }

   private agu(vg $$0) {
      this.b = $$0.b(agu.a.class);
      if (this.b == agu.a.a) {
         this.c = $$0.q();
      } else {
         this.c = null;
      }
   }

   private void a(vg $$0) {
      $$0.a(this.b);
      if (this.b == agu.a.a) {
         $$0.a(this.c);
      }
   }

   @Override
   public yp<agu> a() {
      return afj.bO;
   }

   public void a(afl $$0) {
      $$0.a(this);
   }

   public agu.a e() {
      return this.b;
   }

   @Nullable
   public ajt f() {
      return this.c;
   }

   public static enum a {
      a,
      b;
   }
}
