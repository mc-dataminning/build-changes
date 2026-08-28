import java.util.UUID;
import javax.annotation.Nullable;

public record aeh(int b, UUID c, int d, @Nullable xs e, xz.a f, @Nullable xg g, xk h, xc.a i) implements zo<acf> {
   public static final ze<wp, aeh> a = zo.a(aeh::a, aeh::new);

   private aeh(wp $$0) {
      this($$0.l(), $$0.n(), $$0.l(), $$0.c(xs::a), new xz.a($$0), vy.a($$0, xi.d), xk.a($$0), xc.a.a.decode($$0));
   }

   private void a(wp $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.c(this.d);
      $$0.a(this.e, xs::a);
      this.f.a($$0);
      vy.a($$0, this.g, xi.d);
      xk.a($$0, this.h);
      xc.a.a.encode($$0, this.i);
   }

   @Override
   public zq<aeh> a() {
      return agy.ab;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   @Override
   public boolean c() {
      return true;
   }

   public UUID e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   @Nullable
   public xs g() {
      return this.e;
   }

   public xz.a h() {
      return this.f;
   }

   @Nullable
   public xg i() {
      return this.g;
   }

   public xk j() {
      return this.h;
   }

   public xc.a k() {
      return this.i;
   }
}
