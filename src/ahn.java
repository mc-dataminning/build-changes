import javax.annotation.Nullable;

public class ahn implements ze<agd> {
   public static final yv<vx, ahn> a = ze.a(ahn::a, ahn::new);
   private final ahn.a b;
   @Nullable
   private final akm c;

   public ahn(ahn.a $$0, @Nullable akm $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static ahn a(af $$0) {
      return new ahn(ahn.a.a, $$0.a());
   }

   public static ahn b() {
      return new ahn(ahn.a.b, null);
   }

   private ahn(vx $$0) {
      this.b = $$0.b(ahn.a.class);
      if (this.b == ahn.a.a) {
         this.c = $$0.q();
      } else {
         this.c = null;
      }
   }

   private void a(vx $$0) {
      $$0.a(this.b);
      if (this.b == ahn.a.a) {
         $$0.a(this.c);
      }
   }

   @Override
   public zg<ahn> a() {
      return agb.bP;
   }

   public void a(agd $$0) {
      $$0.a(this);
   }

   public ahn.a e() {
      return this.b;
   }

   @Nullable
   public akm f() {
      return this.c;
   }

   public static enum a {
      a,
      b;
   }
}
