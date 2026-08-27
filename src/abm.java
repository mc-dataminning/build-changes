import java.util.Optional;

public class abm implements xd<yx> {
   private final vd a;
   private final Optional<byte[]> b;
   private final boolean c;

   public abm(vd $$0, Optional<byte[]> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public abm(ug $$0) {
      this.a = $$0.m();
      this.b = $$0.b(ug::b);
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(ug $$0) {
      $$0.a(this.a);
      $$0.a(this.b, ug::a);
      $$0.a(this.c);
   }

   public void a(yx $$0) {
      $$0.a(this);
   }

   public vd a() {
      return this.a;
   }

   public Optional<byte[]> d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
