import javax.annotation.Nullable;

public class agi implements zw<aci> {
   public static final zn<wm, agi> a = zw.a(agi::a, agi::new);
   private final int b;
   @Nullable
   private final us c;

   public agi(int $$0, @Nullable us $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private agi(wm $$0) {
      this.b = $$0.l();
      this.c = $$0.o();
   }

   private void a(wm $$0) {
      $$0.c(this.b);
      $$0.a((vp)this.c);
   }

   @Override
   public zy<agi> a() {
      return agu.aX;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   @Nullable
   public us e() {
      return this.c;
   }

   @Override
   public boolean c() {
      return true;
   }
}
