import java.util.UUID;
import javax.annotation.Nullable;

public record aeh(UUID b, int c, @Nullable xv d, yc.a e, @Nullable xj f, xn g, xf.a h) implements zq<acf> {
   public static final zh<wu, aeh> a = zq.a(aeh::a, aeh::new);

   private aeh(wu $$0) {
      this($$0.n(), $$0.l(), $$0.c(xv::a), new yc.a($$0), wg.a($$0, xl.d), xn.a($$0), xf.a.a.decode($$0));
   }

   private void a(wu $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d, xv::a);
      this.e.a($$0);
      wg.a($$0, this.f, xl.d);
      xn.a($$0, this.g);
      xf.a.a.encode($$0, this.h);
   }

   @Override
   public zs<aeh> a() {
      return agu.ab;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   @Override
   public boolean c() {
      return true;
   }

   public int e() {
      return this.c;
   }

   @Nullable
   public xv f() {
      return this.d;
   }

   public yc.a g() {
      return this.e;
   }

   @Nullable
   public xj h() {
      return this.f;
   }

   public xn i() {
      return this.g;
   }

   public xf.a j() {
      return this.h;
   }
}
