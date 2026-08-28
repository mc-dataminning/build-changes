import java.util.UUID;
import javax.annotation.Nullable;

public record adu(UUID b, int c, @Nullable xi d, xp.a e, @Nullable ww f, xa g, ws.a h) implements zd<abs> {
   public static final yu<wh, adu> a = zd.a(adu::a, adu::new);

   private adu(wh $$0) {
      this($$0.n(), $$0.l(), $$0.c(xi::a), new xp.a($$0), vs.a($$0, wy.d), xa.a($$0), ws.a.a.decode($$0));
   }

   private void a(wh $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d, xi::a);
      this.e.a($$0);
      vs.a($$0, this.f, wy.d);
      xa.a($$0, this.g);
      ws.a.a.encode($$0, this.h);
   }

   @Override
   public zf<adu> a() {
      return agl.ab;
   }

   public void a(abs $$0) {
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
   public xi f() {
      return this.d;
   }

   public xp.a g() {
      return this.e;
   }

   @Nullable
   public ww h() {
      return this.f;
   }

   public xa i() {
      return this.g;
   }

   public ws.a j() {
      return this.h;
   }
}
