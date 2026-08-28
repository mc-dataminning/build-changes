import javax.annotation.Nullable;

public class agn implements zr<acg> {
   public static final zi<wh, agn> a = zr.a(agn::a, agn::new);
   private final int b;
   @Nullable
   private final um c;

   public agn(int $$0, @Nullable um $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private agn(wh $$0) {
      this.b = $$0.l();
      this.c = $$0.o();
   }

   private void a(wh $$0) {
      $$0.c(this.b);
      $$0.a((vj)this.c);
   }

   @Override
   public zt<agn> a() {
      return agz.bb;
   }

   public void a(acg $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   @Nullable
   public um e() {
      return this.c;
   }

   @Override
   public boolean c() {
      return true;
   }
}
