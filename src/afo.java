import javax.annotation.Nullable;

public class afo implements zs<ach> {
   public static final zj<wi, afo> a = zs.a(afo::a, afo::new);
   private final int b;
   private final int c;

   public afo(bui $$0, @Nullable bui $$1) {
      this.b = $$0.as();
      this.c = $$1 != null ? $$1.as() : 0;
   }

   private afo(wi $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
   }

   private void a(wi $$0) {
      $$0.q(this.b);
      $$0.q(this.c);
   }

   @Override
   public zu<afo> a() {
      return agw.aD;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
