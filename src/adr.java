import java.util.UUID;
import javax.annotation.Nullable;

public record adr(UUID b, int c, @Nullable xj d, xq.a e, @Nullable wx f, xb g, wt.a h) implements ze<abq> {
   public static final yv<wi, adr> a = ze.a(adr::a, adr::new);

   private adr(wi $$0) {
      this($$0.n(), $$0.l(), $$0.c(xj::a), new xq.a($$0), vx.a($$0, wz.d), xb.a($$0), wt.a.a.decode($$0));
   }

   private void a(wi $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d, xj::a);
      this.e.a($$0);
      vx.a($$0, this.f, wz.d);
      xb.a($$0, this.g);
      wt.a.a.encode($$0, this.h);
   }

   @Override
   public zg<adr> a() {
      return agc.aa;
   }

   public void a(abq $$0) {
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
   public xj f() {
      return this.d;
   }

   public xq.a g() {
      return this.e;
   }

   @Nullable
   public wx h() {
      return this.f;
   }

   public xb i() {
      return this.g;
   }

   public wt.a j() {
      return this.h;
   }
}
