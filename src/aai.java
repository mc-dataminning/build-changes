import java.util.Optional;

public class aai implements wb<xu> {
   private final ui a;
   private final Optional<byte[]> b;
   private final boolean c;

   public aai(ui $$0, Optional<byte[]> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public aai(tl $$0) {
      this.a = $$0.m();
      this.b = $$0.b(tl::b);
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(tl $$0) {
      $$0.a(this.a);
      $$0.a(this.b, tl::a);
      $$0.a(this.c);
   }

   public void a(xu $$0) {
      $$0.a(this);
   }

   public ui a() {
      return this.a;
   }

   public Optional<byte[]> d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
