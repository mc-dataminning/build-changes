import java.util.UUID;
import javax.annotation.Nullable;

public record aeu(UUID b, int c, @Nullable yh d, yo.a e, @Nullable xv f, xz g, xr.a h) implements aac<acr> {
   public static final zt<xg, aeu> a = aac.a(aeu::a, aeu::new);

   private aeu(xg $$0) {
      this($$0.n(), $$0.l(), $$0.c(yh::a), new yo.a($$0), ws.a($$0, xx.d), xz.a($$0), xr.a.a.decode($$0));
   }

   private void a(xg $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d, yh::a);
      this.e.a($$0);
      ws.a($$0, this.f, xx.d);
      xz.a($$0, this.g);
      xr.a.a.encode($$0, this.h);
   }

   @Override
   public aae<aeu> a() {
      return ahk.ab;
   }

   public void a(acr $$0) {
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
   public yh f() {
      return this.d;
   }

   public yo.a g() {
      return this.e;
   }

   @Nullable
   public xv h() {
      return this.f;
   }

   public xz i() {
      return this.g;
   }

   public xr.a j() {
      return this.h;
   }
}
