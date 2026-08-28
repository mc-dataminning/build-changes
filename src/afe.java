import javax.annotation.Nullable;

public class afe implements zf<abu> {
   public static final yw<vu, afe> a = zf.a(afe::a, afe::new);
   private final int b;
   private final int c;

   public afe(bwd $$0, @Nullable bwd $$1) {
      this.b = $$0.ar();
      this.c = $$1 != null ? $$1.ar() : 0;
   }

   private afe(vu $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
   }

   private void a(vu $$0) {
      $$0.q(this.b);
      $$0.q(this.c);
   }

   @Override
   public zh<afe> a() {
      return agn.aG;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
