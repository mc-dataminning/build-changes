import java.util.Optional;

public class abc implements wu<yo> {
   private final vb a;
   private final Optional<byte[]> b;
   private final boolean c;

   public abc(vb $$0, Optional<byte[]> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public abc(ue $$0) {
      this.a = $$0.m();
      this.b = $$0.b(ue::b);
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(ue $$0) {
      $$0.a(this.a);
      $$0.a(this.b, ue::a);
      $$0.a(this.c);
   }

   public void a(yo $$0) {
      $$0.a(this);
   }

   public vb a() {
      return this.a;
   }

   public Optional<byte[]> d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
