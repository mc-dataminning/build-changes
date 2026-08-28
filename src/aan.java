import java.util.UUID;

public record aan(UUID b, aan.a c) implements zp<aai> {
   public static final zg<wf, aan> a = zp.a(aan::a, aan::new);

   private aan(wf $$0) {
      this($$0.n(), $$0.b(aan.a.class));
   }

   private void a(wf $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zr<aan> a() {
      return aah.p;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }

   public aan.a e() {
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
