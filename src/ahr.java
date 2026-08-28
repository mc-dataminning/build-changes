import javax.annotation.Nullable;

public class ahr implements zf<agh> {
   public static final yw<vv, ahr> a = zf.a(ahr::a, ahr::new);
   private final ahr.a b;
   @Nullable
   private final akq c;

   public ahr(ahr.a $$0, @Nullable akq $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static ahr a(ag $$0) {
      return new ahr(ahr.a.a, $$0.a());
   }

   public static ahr b() {
      return new ahr(ahr.a.b, null);
   }

   private ahr(vv $$0) {
      this.b = $$0.b(ahr.a.class);
      if (this.b == ahr.a.a) {
         this.c = $$0.q();
      } else {
         this.c = null;
      }
   }

   private void a(vv $$0) {
      $$0.a(this.b);
      if (this.b == ahr.a.a) {
         $$0.a(this.c);
      }
   }

   @Override
   public zh<ahr> a() {
      return agf.bQ;
   }

   public void a(agh $$0) {
      $$0.a(this);
   }

   public ahr.a e() {
      return this.b;
   }

   @Nullable
   public akq f() {
      return this.c;
   }

   public static enum a {
      a,
      b;
   }
}
