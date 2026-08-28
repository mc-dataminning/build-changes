import javax.annotation.Nullable;

public class ahl implements zb<agb> {
   public static final ys<vr, ahl> a = zb.a(ahl::a, ahl::new);
   private final ahl.a b;
   @Nullable
   private final akk c;

   public ahl(ahl.a $$0, @Nullable akk $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static ahl a(af $$0) {
      return new ahl(ahl.a.a, $$0.a());
   }

   public static ahl b() {
      return new ahl(ahl.a.b, null);
   }

   private ahl(vr $$0) {
      this.b = $$0.b(ahl.a.class);
      if (this.b == ahl.a.a) {
         this.c = $$0.q();
      } else {
         this.c = null;
      }
   }

   private void a(vr $$0) {
      $$0.a(this.b);
      if (this.b == ahl.a.a) {
         $$0.a(this.c);
      }
   }

   @Override
   public zd<ahl> a() {
      return afz.bQ;
   }

   public void a(agb $$0) {
      $$0.a(this);
   }

   public ahl.a e() {
      return this.b;
   }

   @Nullable
   public akk f() {
      return this.c;
   }

   public static enum a {
      a,
      b;
   }
}
