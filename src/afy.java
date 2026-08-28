import javax.annotation.Nullable;

public class afy implements zd<abs> {
   public static final yu<vs, afy> a = zd.a(afy::a, afy::new);
   private final int b;
   @Nullable
   private final tx c;

   public afy(int $$0, @Nullable tx $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private afy(vs $$0) {
      this.b = $$0.l();
      this.c = $$0.o();
   }

   private void a(vs $$0) {
      $$0.c(this.b);
      $$0.a((uu)this.c);
   }

   @Override
   public zf<afy> a() {
      return agl.bb;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   @Nullable
   public tx e() {
      return this.c;
   }

   @Override
   public boolean c() {
      return true;
   }
}
