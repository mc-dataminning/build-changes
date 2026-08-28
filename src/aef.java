import java.util.UUID;
import javax.annotation.Nullable;

public record aef(UUID b, int c, @Nullable xt d, ya.a e, @Nullable xh f, xl g, xd.a h) implements zo<acd> {
   public static final zf<ws, aef> a = zo.a(aef::a, aef::new);

   private aef(ws $$0) {
      this($$0.n(), $$0.l(), $$0.c(xt::a), new ya.a($$0), we.a($$0, xj.d), xl.a($$0), xd.a.a.decode($$0));
   }

   private void a(ws $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d, xt::a);
      this.e.a($$0);
      we.a($$0, this.f, xj.d);
      xl.a($$0, this.g);
      xd.a.a.encode($$0, this.h);
   }

   @Override
   public zq<aef> a() {
      return ags.ab;
   }

   public void a(acd $$0) {
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
   public xt f() {
      return this.d;
   }

   public ya.a g() {
      return this.e;
   }

   @Nullable
   public xh h() {
      return this.f;
   }

   public xl i() {
      return this.g;
   }

   public xd.a j() {
      return this.h;
   }
}
