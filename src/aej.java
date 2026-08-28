import java.util.UUID;
import javax.annotation.Nullable;

public record aej(UUID b, int c, @Nullable xx d, ye.a e, @Nullable xl f, xp g, xh.a h) implements zs<ach> {
   public static final zj<ww, aej> a = zs.a(aej::a, aej::new);

   private aej(ww $$0) {
      this($$0.n(), $$0.l(), $$0.c(xx::a), new ye.a($$0), wi.a($$0, xn.d), xp.a($$0), xh.a.a.decode($$0));
   }

   private void a(ww $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d, xx::a);
      this.e.a($$0);
      wi.a($$0, this.f, xn.d);
      xp.a($$0, this.g);
      xh.a.a.encode($$0, this.h);
   }

   @Override
   public zu<aej> a() {
      return agw.ab;
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
   public xx f() {
      return this.d;
   }

   public ye.a g() {
      return this.e;
   }

   @Nullable
   public xl h() {
      return this.f;
   }

   public xp i() {
      return this.g;
   }

   public xh.a j() {
      return this.h;
   }
}
