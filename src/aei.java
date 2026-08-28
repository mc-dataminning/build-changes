import java.util.UUID;
import javax.annotation.Nullable;

public record aei(UUID b, int c, @Nullable ya d, yh.a e, @Nullable xo f, xs g, xk.a h) implements zv<ach> {
   public static final zm<wz, aei> a = zv.a(aei::a, aei::new);

   private aei(wz $$0) {
      this($$0.n(), $$0.l(), $$0.c(ya::a), new yh.a($$0), wl.a($$0, xq.d), xs.a($$0), xk.a.a.decode($$0));
   }

   private void a(wz $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d, ya::a);
      this.e.a($$0);
      wl.a($$0, this.f, xq.d);
      xs.a($$0, this.g);
      xk.a.a.encode($$0, this.h);
   }

   @Override
   public zx<aei> a() {
      return agt.aa;
   }

   public void a(ach $$0) {
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
   public ya f() {
      return this.d;
   }

   public yh.a g() {
      return this.e;
   }

   @Nullable
   public xo h() {
      return this.f;
   }

   public xs i() {
      return this.g;
   }

   public xk.a j() {
      return this.h;
   }
}
