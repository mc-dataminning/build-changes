import java.util.BitSet;
import javax.annotation.Nullable;

public class adm implements zl<abw> {
   public static final zc<we, adm> a = zl.a(adm::a, adm::new);
   private final int b;
   private final int c;
   private final adn d;

   public adm(dbh $$0, eot $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      this.b = $$0.e;
      this.c = $$0.f;
      this.d = new adn($$0, $$1, $$2, $$3);
   }

   private adm(we $$0) {
      this.b = $$0.l();
      this.c = $$0.l();
      this.d = new adn($$0, this.b, this.c);
   }

   private void a(we $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      this.d.a($$0);
   }

   @Override
   public zn<adm> a() {
      return agj.O;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public adn f() {
      return this.d;
   }
}
