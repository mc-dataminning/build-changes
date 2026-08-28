import java.util.UUID;

public record aai(UUID b, aai.a c) implements zk<aad> {
   public static final zb<wa, aai> a = zk.a(aai::a, aai::new);

   private aai(wa $$0) {
      this($$0.n(), $$0.b(aai.a.class));
   }

   private void a(wa $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zm<aai> a() {
      return aac.p;
   }

   public void a(aad $$0) {
      $$0.a(this);
   }

   public aai.a e() {
      return this.c;
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e,
      f,
      g,
      h;

      public boolean a() {
         return this != d && this != e;
      }
   }
}
