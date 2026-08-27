import java.util.Optional;

public class aar implements wk<yd> {
   private final ur a;
   private final Optional<byte[]> b;
   private final boolean c;

   public aar(ur $$0, Optional<byte[]> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public aar(tu $$0) {
      this.a = $$0.m();
      this.b = $$0.b(tu::b);
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(tu $$0) {
      $$0.a(this.a);
      $$0.a(this.b, tu::a);
      $$0.a(this.c);
   }

   public void a(yd $$0) {
      $$0.a(this);
   }

   public ur a() {
      return this.a;
   }

   public Optional<byte[]> d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
