import java.util.UUID;
import javax.annotation.Nullable;

public record ady(UUID b, int c, @Nullable xm d, xt.a e, @Nullable xa f, xe g, ww.a h) implements zh<abw> {
   public static final yy<wl, ady> a = zh.a(ady::a, ady::new);

   private ady(wl $$0) {
      this($$0.n(), $$0.l(), $$0.c(xm::a), new xt.a($$0), vw.a($$0, xc.d), xe.a($$0), ww.a.a.decode($$0));
   }

   private void a(wl $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d, xm::a);
      this.e.a($$0);
      vw.a($$0, this.f, xc.d);
      xe.a($$0, this.g);
      ww.a.a.encode($$0, this.h);
   }

   @Override
   public zj<ady> a() {
      return agp.ab;
   }

   public void a(abw $$0) {
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
   public xm f() {
      return this.d;
   }

   public xt.a g() {
      return this.e;
   }

   @Nullable
   public xa h() {
      return this.f;
   }

   public xe i() {
      return this.g;
   }

   public ww.a j() {
      return this.h;
   }
}
