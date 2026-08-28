import java.util.UUID;

public record ajn(String b, UUID c) implements zp<ajl> {
   public static final zg<wf, ajn> a = zp.a(ajn::a, ajn::new);

   private ajn(wf $$0) {
      this($$0.d(16), $$0.n());
   }

   private void a(wf $$0) {
      $$0.a(this.b, 16);
      $$0.a(this.c);
   }

   @Override
   public zr<ajn> a() {
      return ajj.g;
   }

   public void a(ajl $$0) {
      $$0.a(this);
   }

   public UUID e() {
      return this.c;
   }
}
