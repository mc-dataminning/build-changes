import java.util.UUID;

public record air(String b, UUID c) implements zb<aip> {
   public static final ys<vr, air> a = zb.a(air::a, air::new);

   private air(vr $$0) {
      this($$0.d(16), $$0.n());
   }

   private void a(vr $$0) {
      $$0.a(this.b, 16);
      $$0.a(this.c);
   }

   @Override
   public zd<air> a() {
      return ain.g;
   }

   public void a(aip $$0) {
      $$0.a(this);
   }

   public UUID e() {
      return this.c;
   }
}
