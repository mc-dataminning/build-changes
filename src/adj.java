import java.util.BitSet;
import javax.annotation.Nullable;

public class adj implements zl<abw> {
   public static final zc<wp, adj> a = zl.a(adj::a, adj::new);
   private final int b;
   private final int c;
   private final adi d;
   private final adn e;

   public adj(dvi $$0, eot $$1, @Nullable BitSet $$2, @Nullable BitSet $$3) {
      dbh $$4 = $$0.g();
      this.b = $$4.e;
      this.c = $$4.f;
      this.d = new adi($$0);
      this.e = new adn($$4, $$1, $$2, $$3);
   }

   private adj(wp $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = new adi($$0, this.b, this.c);
      this.e = new adn($$0, this.b, this.c);
   }

   private void a(wp $$0) {
      $$0.p(this.b);
      $$0.p(this.c);
      this.d.a($$0);
      this.e.a($$0);
   }

   @Override
   public zn<adj> a() {
      return agj.L;
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

   public adi f() {
      return this.d;
   }

   public adn g() {
      return this.e;
   }
}
