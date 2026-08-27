import javax.annotation.Nullable;

public class aac implements wo<yh> {
   private final int a;
   private final chy<?> b;
   private final uv c;

   public aac(int $$0, chy<?> $$1, uv $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public aac(ty $$0) {
      this.a = $$0.n();
      this.b = $$0.a(kc.s);
      this.c = $$0.m();
   }

   @Override
   public void a(ty $$0) {
      $$0.c(this.a);
      $$0.a(kc.s, this.b);
      $$0.a(this.c);
   }

   public void a(yh $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   @Nullable
   public chy<?> d() {
      return this.b;
   }

   public uv e() {
      return this.c;
   }
}
