import javax.annotation.Nullable;

public class afa implements zg<abu> {
   public static final yx<vw, afa> a = zg.a(afa::a, afa::new);
   private final int b;
   private final int c;

   public afa(bsr $$0, @Nullable bsr $$1) {
      this.b = $$0.an();
      this.c = $$1 != null ? $$1.an() : 0;
   }

   private afa(vw $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
   }

   private void a(vw $$0) {
      $$0.p(this.b);
      $$0.p(this.c);
   }

   @Override
   public zi<afa> a() {
      return agg.aD;
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
