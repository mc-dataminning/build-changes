import java.util.UUID;
import javax.annotation.Nullable;

public record aeg(UUID b, int c, @Nullable xu d, yb.a e, @Nullable xi f, xm g, xe.a h) implements zp<ace> {
   public static final zg<wt, aeg> a = zp.a(aeg::a, aeg::new);

   private aeg(wt $$0) {
      this($$0.n(), $$0.l(), $$0.c(xu::a), new yb.a($$0), wf.a($$0, xk.d), xm.a($$0), xe.a.a.decode($$0));
   }

   private void a(wt $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d, xu::a);
      this.e.a($$0);
      wf.a($$0, this.f, xk.d);
      xm.a($$0, this.g);
      xe.a.a.encode($$0, this.h);
   }

   @Override
   public zr<aeg> a() {
      return agt.ab;
   }

   public void a(ace $$0) {
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
   public xu f() {
      return this.d;
   }

   public yb.a g() {
      return this.e;
   }

   @Nullable
   public xi h() {
      return this.f;
   }

   public xm i() {
      return this.g;
   }

   public xe.a j() {
      return this.h;
   }
}
