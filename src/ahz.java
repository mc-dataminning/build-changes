import javax.annotation.Nullable;

public class ahz implements zc<agm> {
   public static final yt<vr, ahz> a = zc.a(ahz::a, ahz::new);
   private final ahz.a b;
   @Nullable
   private final ald c;

   public ahz(ahz.a $$0, @Nullable ald $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static ahz a(ai $$0) {
      return new ahz(ahz.a.a, $$0.a());
   }

   public static ahz b() {
      return new ahz(ahz.a.b, null);
   }

   private ahz(vr $$0) {
      this.b = $$0.b(ahz.a.class);
      if (this.b == ahz.a.a) {
         this.c = $$0.q();
      } else {
         this.c = null;
      }
   }

   private void a(vr $$0) {
      $$0.a(this.b);
      if (this.b == ahz.a.a) {
         $$0.a(this.c);
      }
   }

   @Override
   public ze<ahz> a() {
      return agk.bZ;
   }

   public void a(agm $$0) {
      $$0.a(this);
   }

   public ahz.a e() {
      return this.b;
   }

   @Nullable
   public ald f() {
      return this.c;
   }

   public static enum a {
      a,
      b;
   }
}
