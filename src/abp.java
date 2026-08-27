import java.util.Optional;

public class abp implements xf<za> {
   private final vf a;
   private final Optional<byte[]> b;
   private final boolean c;

   public abp(vf $$0, Optional<byte[]> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public abp(ui $$0) {
      this.a = $$0.m();
      this.b = $$0.b(ui::b);
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.a);
      $$0.a(this.b, ui::a);
      $$0.a(this.c);
   }

   public void a(za $$0) {
      $$0.a(this);
   }

   public vf a() {
      return this.a;
   }

   public Optional<byte[]> d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
