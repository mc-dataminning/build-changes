import java.util.UUID;

public record aaf(UUID b, aaf.a c) implements zh<aaa> {
   public static final yy<vw, aaf> a = zh.a(aaf::a, aaf::new);

   private aaf(vw $$0) {
      this($$0.n(), $$0.b(aaf.a.class));
   }

   private void a(vw $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zj<aaf> a() {
      return zz.p;
   }

   public void a(aaa $$0) {
      $$0.a(this);
   }

   public aaf.a e() {
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
