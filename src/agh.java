import javax.annotation.Nullable;

public class agh implements zp<ace> {
   public static final zg<wf, agh> a = zp.a(agh::a, agh::new);
   private final int b;
   @Nullable
   private final uk c;

   public agh(int $$0, @Nullable uk $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private agh(wf $$0) {
      this.b = $$0.l();
      this.c = $$0.o();
   }

   private void a(wf $$0) {
      $$0.c(this.b);
      $$0.a((vh)this.c);
   }

   @Override
   public zr<agh> a() {
      return agt.aY;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   @Nullable
   public uk e() {
      return this.c;
   }

   @Override
   public boolean c() {
      return true;
   }
}
