import java.util.UUID;
import javax.annotation.Nullable;

public record aeb(UUID b, int c, @Nullable xp d, xw.a e, @Nullable xd f, xh g, wz.a h) implements zk<abz> {
   public static final zb<wo, aeb> a = zk.a(aeb::a, aeb::new);

   private aeb(wo $$0) {
      this($$0.n(), $$0.l(), $$0.c(xp::a), new xw.a($$0), wa.a($$0, xf.d), xh.a($$0), wz.a.a.decode($$0));
   }

   private void a(wo $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d, xp::a);
      this.e.a($$0);
      wa.a($$0, this.f, xf.d);
      xh.a($$0, this.g);
      wz.a.a.encode($$0, this.h);
   }

   @Override
   public zm<aeb> a() {
      return ago.ab;
   }

   public void a(abz $$0) {
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
   public xp f() {
      return this.d;
   }

   public xw.a g() {
      return this.e;
   }

   @Nullable
   public xd h() {
      return this.f;
   }

   public xh i() {
      return this.g;
   }

   public wz.a j() {
      return this.h;
   }
}
