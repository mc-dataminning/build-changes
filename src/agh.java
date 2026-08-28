import javax.annotation.Nullable;

public class agh implements zv<ach> {
   public static final zm<wl, agh> a = zv.a(agh::a, agh::new);
   private final int b;
   @Nullable
   private final ur c;

   public agh(int $$0, @Nullable ur $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private agh(wl $$0) {
      this.b = $$0.l();
      this.c = $$0.o();
   }

   private void a(wl $$0) {
      $$0.c(this.b);
      $$0.a((vo)this.c);
   }

   @Override
   public zx<agh> a() {
      return agt.aX;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   @Nullable
   public ur e() {
      return this.c;
   }

   @Override
   public boolean c() {
      return true;
   }
}
