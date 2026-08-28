import javax.annotation.Nullable;

public class aii implements zl<agr> {
   public static final zc<wb, aii> a = zl.a(aii::a, aii::new);
   private final int b;
   private final String c;
   private final boolean d;

   public aii(int $$0, String $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aii(wb $$0) {
      this.b = $$0.l();
      this.c = $$0.p();
      this.d = $$0.readBoolean();
   }

   private void a(wb $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zn<aii> a() {
      return agp.bY;
   }

   public void a(agr $$0) {
      $$0.a(this);
   }

   @Nullable
   public ddj a(dej $$0) {
      btr $$1 = $$0.a(this.b);
      return $$1 instanceof cqe ? ((cqe)$$1).F() : null;
   }

   public String b() {
      return this.c;
   }

   public boolean e() {
      return this.d;
   }
}
