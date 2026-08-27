import java.util.UUID;
import javax.annotation.Nullable;

public record adb(UUID b, int c, @Nullable wu d, xb.a e, @Nullable wi f, wm g, we.a h) implements yp<aba> {
   public static final yg<vt, adb> a = yp.a(adb::a, adb::new);

   private adb(vt $$0) {
      this($$0.n(), $$0.l(), $$0.c(wu::a), new xb.a($$0), vi.a($$0, wk.d), wm.a($$0), we.a.a.decode($$0));
   }

   private void a(vt $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d, wu::a);
      this.e.a($$0);
      vi.a($$0, this.f, wk.d);
      wm.a($$0, this.g);
      we.a.a.encode($$0, this.h);
   }

   @Override
   public yr<adb> a() {
      return afl.aa;
   }

   public void a(aba $$0) {
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
   public wu f() {
      return this.d;
   }

   public xb.a g() {
      return this.e;
   }

   @Nullable
   public wi h() {
      return this.f;
   }

   public wm i() {
      return this.g;
   }

   public we.a j() {
      return this.h;
   }
}
