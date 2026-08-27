import javax.annotation.Nullable;

public class acy implements xg<zb> {
   private final int a;
   @Nullable
   private final so b;

   public acy(int $$0, @Nullable so $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public acy(uj $$0) {
      this.a = $$0.n();
      this.b = $$0.q();
   }

   @Override
   public void a(uj $$0) {
      $$0.c(this.a);
      $$0.a((tl)this.b);
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   @Nullable
   public so d() {
      return this.b;
   }

   @Override
   public boolean b() {
      return true;
   }
}
