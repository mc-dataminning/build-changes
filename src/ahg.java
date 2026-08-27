import javax.annotation.Nullable;

public class ahg implements yz<afx> {
   public static final yq<vs, ahg> a = yz.a(ahg::a, ahg::new);
   private final ahg.a b;
   @Nullable
   private final akf c;

   public ahg(ahg.a $$0, @Nullable akf $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static ahg a(af $$0) {
      return new ahg(ahg.a.a, $$0.a());
   }

   public static ahg b() {
      return new ahg(ahg.a.b, null);
   }

   private ahg(vs $$0) {
      this.b = $$0.b(ahg.a.class);
      if (this.b == ahg.a.a) {
         this.c = $$0.q();
      } else {
         this.c = null;
      }
   }

   private void a(vs $$0) {
      $$0.a(this.b);
      if (this.b == ahg.a.a) {
         $$0.a(this.c);
      }
   }

   @Override
   public zb<ahg> a() {
      return afv.bO;
   }

   public void a(afx $$0) {
      $$0.a(this);
   }

   public ahg.a e() {
      return this.b;
   }

   @Nullable
   public akf f() {
      return this.c;
   }

   public static enum a {
      a,
      b;
   }
}
