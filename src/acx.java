import javax.annotation.Nullable;

public class acx implements xf<za> {
   private final int a;
   @Nullable
   private final sn b;

   public acx(int $$0, @Nullable sn $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public acx(ui $$0) {
      this.a = $$0.n();
      this.b = $$0.q();
   }

   @Override
   public void a(ui $$0) {
      $$0.c(this.a);
      $$0.a((tk)this.b);
   }

   public void a(za $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   @Nullable
   public sn d() {
      return this.b;
   }

   @Override
   public boolean b() {
      return true;
   }
}
