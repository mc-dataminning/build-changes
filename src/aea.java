import java.util.UUID;
import javax.annotation.Nullable;

public record aea(UUID b, int c, @Nullable xo d, xv.a e, @Nullable xc f, xg g, wy.a h) implements zj<aby> {
   public static final za<wn, aea> a = zj.a(aea::a, aea::new);

   private aea(wn $$0) {
      this($$0.n(), $$0.l(), $$0.c(xo::a), new xv.a($$0), vy.a($$0, xe.d), xg.a($$0), wy.a.a.decode($$0));
   }

   private void a(wn $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d, xo::a);
      this.e.a($$0);
      vy.a($$0, this.f, xe.d);
      xg.a($$0, this.g);
      wy.a.a.encode($$0, this.h);
   }

   @Override
   public zl<aea> a() {
      return agr.ab;
   }

   public void a(aby $$0) {
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
   public xo f() {
      return this.d;
   }

   public xv.a g() {
      return this.e;
   }

   @Nullable
   public xc h() {
      return this.f;
   }

   public xg i() {
      return this.g;
   }

   public wy.a j() {
      return this.h;
   }
}
