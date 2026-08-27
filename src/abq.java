import java.util.Optional;

public class abq implements xg<zb> {
   private final vg a;
   private final Optional<byte[]> b;
   private final boolean c;

   public abq(vg $$0, Optional<byte[]> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public abq(uj $$0) {
      this.a = $$0.m();
      this.b = $$0.b(uj::b);
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(uj $$0) {
      $$0.a(this.a);
      $$0.a(this.b, uj::a);
      $$0.a(this.c);
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public vg a() {
      return this.a;
   }

   public Optional<byte[]> d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
