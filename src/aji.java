import java.util.UUID;

public record aji(String b, UUID c) implements zk<ajg> {
   public static final zb<wa, aji> a = zk.a(aji::a, aji::new);

   private aji(wa $$0) {
      this($$0.d(16), $$0.n());
   }

   private void a(wa $$0) {
      $$0.a(this.b, 16);
      $$0.a(this.c);
   }

   @Override
   public zm<aji> a() {
      return aje.g;
   }

   public void a(ajg $$0) {
      $$0.a(this);
   }

   public UUID e() {
      return this.c;
   }
}
