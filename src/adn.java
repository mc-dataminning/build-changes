import javax.annotation.Nullable;

public class adn implements xz<aai> {
   public static final xq<us, adn> a = xz.a(adn::a, adn::new);
   private final int b;
   private final int c;

   public adn(bof $$0, @Nullable bof $$1) {
      this.b = $$0.aj();
      this.c = $$1 != null ? $$1.aj() : 0;
   }

   private adn(us $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
   }

   private void a(us $$0) {
      $$0.p(this.b);
      $$0.p(this.c);
   }

   @Override
   public yb<adn> a() {
      return aet.aD;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
