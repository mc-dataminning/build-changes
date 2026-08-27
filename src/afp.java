import javax.annotation.Nullable;

public class afp implements ze<abq> {
   public static final yv<vx, afp> a = ze.a(afp::a, afp::new);
   private final int b;
   @Nullable
   private final ud c;

   public afp(int $$0, @Nullable ud $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private afp(vx $$0) {
      this.b = $$0.l();
      this.c = $$0.o();
   }

   private void a(vx $$0) {
      $$0.c(this.b);
      $$0.a((va)this.c);
   }

   @Override
   public zg<afp> a() {
      return agb.aX;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   @Nullable
   public ud e() {
      return this.c;
   }

   @Override
   public boolean c() {
      return true;
   }
}
