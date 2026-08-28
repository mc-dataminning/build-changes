import javax.annotation.Nullable;

public class afs implements yw<abl> {
   public static final yn<vl, afs> a = yw.a(afs::a, afs::new);
   private final int b;
   @Nullable
   private final tq c;

   public afs(int $$0, @Nullable tq $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private afs(vl $$0) {
      this.b = $$0.l();
      this.c = $$0.o();
   }

   private void a(vl $$0) {
      $$0.c(this.b);
      $$0.a((un)this.c);
   }

   @Override
   public yy<afs> a() {
      return age.bb;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   @Nullable
   public tq e() {
      return this.c;
   }

   @Override
   public boolean c() {
      return true;
   }
}
