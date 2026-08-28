import javax.annotation.Nullable;

public class afi implements zj<aby> {
   public static final za<vy, afi> a = zj.a(afi::a, afi::new);
   private final int b;
   private final int c;

   public afi(bwv $$0, @Nullable bwv $$1) {
      this.b = $$0.ao();
      this.c = $$1 != null ? $$1.ao() : 0;
   }

   private afi(vy $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
   }

   private void a(vy $$0) {
      $$0.q(this.b);
      $$0.q(this.c);
   }

   @Override
   public zl<afi> a() {
      return agr.aG;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
