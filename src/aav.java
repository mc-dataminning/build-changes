import java.util.Optional;

public class aav implements wo<yh> {
   private final uv a;
   private final Optional<byte[]> b;
   private final boolean c;

   public aav(uv $$0, Optional<byte[]> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public aav(ty $$0) {
      this.a = $$0.m();
      this.b = $$0.b(ty::b);
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(ty $$0) {
      $$0.a(this.a);
      $$0.a(this.b, ty::a);
      $$0.a(this.c);
   }

   public void a(yh $$0) {
      $$0.a(this);
   }

   public uv a() {
      return this.a;
   }

   public Optional<byte[]> d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
