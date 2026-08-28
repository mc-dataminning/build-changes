import javax.annotation.Nullable;

public class afg implements zh<abw> {
   public static final yy<vw, afg> a = zh.a(afg::a, afg::new);
   private final int b;
   private final int c;

   public afg(bwt $$0, @Nullable bwt $$1) {
      this.b = $$0.ao();
      this.c = $$1 != null ? $$1.ao() : 0;
   }

   private afg(vw $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
   }

   private void a(vw $$0) {
      $$0.q(this.b);
      $$0.q(this.c);
   }

   @Override
   public zj<afg> a() {
      return agp.aG;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
