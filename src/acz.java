import java.util.UUID;
import javax.annotation.Nullable;

public record acz(UUID b, int c, @Nullable ws d, wz.a e, @Nullable wg f, wk g, wc.a h) implements yn<aay> {
   public static final ye<vr, acz> a = yn.a(acz::a, acz::new);

   private acz(vr $$0) {
      this($$0.n(), $$0.l(), $$0.c(ws::a), new wz.a($$0), vg.a($$0, wi.d), wk.a($$0), wc.a.a.decode($$0));
   }

   private void a(vr $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d, ws::a);
      this.e.a($$0);
      vg.a($$0, this.f, wi.d);
      wk.a($$0, this.g);
      wc.a.a.encode($$0, this.h);
   }

   @Override
   public yp<acz> a() {
      return afj.aa;
   }

   public void a(aay $$0) {
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
   public ws f() {
      return this.d;
   }

   public wz.a g() {
      return this.e;
   }

   @Nullable
   public wg h() {
      return this.f;
   }

   public wk i() {
      return this.g;
   }

   public wc.a j() {
      return this.h;
   }
}
