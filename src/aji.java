import java.util.UUID;

public record aji(String b, UUID c) implements zs<ajg> {
   public static final zj<wl, aji> a = zs.a(aji::a, aji::new);

   private aji(wl $$0) {
      this($$0.d(16), $$0.n());
   }

   private void a(wl $$0) {
      $$0.a(this.b, 16);
      $$0.a(this.c);
   }

   @Override
   public zu<aji> a() {
      return aje.g;
   }

   public void a(ajg $$0) {
      $$0.a(this);
   }

   public UUID e() {
      return this.c;
   }
}
