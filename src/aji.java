import java.util.UUID;

public record aji(String b, UUID c) implements zc<ajg> {
   public static final yt<vr, aji> a = zc.a(aji::a, aji::new);

   private aji(vr $$0) {
      this($$0.d(16), $$0.n());
   }

   private void a(vr $$0) {
      $$0.a(this.b, 16);
      $$0.a(this.c);
   }

   @Override
   public ze<aji> a() {
      return aje.g;
   }

   public void a(ajg $$0) {
      $$0.a(this);
   }

   public UUID e() {
      return this.c;
   }
}
