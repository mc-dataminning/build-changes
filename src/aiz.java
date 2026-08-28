import java.util.UUID;

public record aiz(String b, UUID c) implements yv<aix> {
   public static final ym<vl, aiz> a = yv.a(aiz::a, aiz::new);

   private aiz(vl $$0) {
      this($$0.d(16), $$0.n());
   }

   private void a(vl $$0) {
      $$0.a(this.b, 16);
      $$0.a(this.c);
   }

   @Override
   public yx<aiz> a() {
      return aiv.g;
   }

   public void a(aix $$0) {
      $$0.a(this);
   }

   public UUID e() {
      return this.c;
   }
}
