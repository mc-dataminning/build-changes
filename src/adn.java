import java.util.BitSet;
import javax.annotation.Nullable;

public class adn implements zj<aby> {
   public static final za<vy, adn> a = zj.a(adn::a, adn::new);
   private final int b;
   private final int c;
   private final ado d;

   public adn(dje $$0, exf $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.b = $$0.h;
      this.c = $$0.i;
      this.d = new ado($$0, $$1, $$2, $$3);
   }

   private adn(vy $$0) {
      this.b = $$0.l();
      this.c = $$0.l();
      this.d = new ado($$0, this.b, this.c);
   }

   private void a(vy $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      this.d.a($$0);
   }

   @Override
   public zl<adn> a() {
      return agr.N;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public ado f() {
      return this.d;
   }
}
