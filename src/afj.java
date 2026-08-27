import javax.annotation.Nullable;

public class afj implements yz<abk> {
   public static final yq<vs, afj> a = yz.a(afj::a, afj::new);
   private final int b;
   @Nullable
   private final ty c;

   public afj(int $$0, @Nullable ty $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private afj(vs $$0) {
      this.b = $$0.l();
      this.c = $$0.o();
   }

   private void a(vs $$0) {
      $$0.c(this.b);
      $$0.a((uv)this.c);
   }

   @Override
   public zb<afj> a() {
      return afv.aX;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   @Nullable
   public ty e() {
      return this.c;
   }

   @Override
   public boolean c() {
      return true;
   }
}
