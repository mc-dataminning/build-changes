import java.util.UUID;
import javax.annotation.Nullable;

public record adt(UUID b, int c, @Nullable xh d, xo.a e, @Nullable wv f, wz g, wr.a h) implements zc<abr> {
   public static final yt<wg, adt> a = zc.a(adt::a, adt::new);

   private adt(wg $$0) {
      this($$0.n(), $$0.l(), $$0.c(xh::a), new xo.a($$0), vr.a($$0, wx.d), wz.a($$0), wr.a.a.decode($$0));
   }

   private void a(wg $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d, xh::a);
      this.e.a($$0);
      vr.a($$0, this.f, wx.d);
      wz.a($$0, this.g);
      wr.a.a.encode($$0, this.h);
   }

   @Override
   public ze<adt> a() {
      return agk.ab;
   }

   public void a(abr $$0) {
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
   public xh f() {
      return this.d;
   }

   public xo.a g() {
      return this.e;
   }

   @Nullable
   public wv h() {
      return this.f;
   }

   public wz i() {
      return this.g;
   }

   public wr.a j() {
      return this.h;
   }
}
