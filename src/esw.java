import java.util.Objects;
import javax.annotation.Nullable;

public class esw {
   private final ete a;
   private final String b;
   private final eth c;
   private wg d;
   private wg e;
   private eth.a f;
   private boolean g;
   @Nullable
   private xw h;

   public esw(ete $$0, String $$1, eth $$2, wg $$3, eth.a $$4, boolean $$5, @Nullable xw $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = this.i();
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   public ete a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public eth c() {
      return this.c;
   }

   public wg d() {
      return this.d;
   }

   public boolean e() {
      return this.g;
   }

   @Nullable
   public xw f() {
      return this.h;
   }

   public xw a(xw $$0) {
      return Objects.requireNonNullElse(this.h, $$0);
   }

   private wg i() {
      return wj.a((wg)this.d.f().a($$0 -> $$0.a(new wm(wm.a.a, wg.b(this.b)))));
   }

   public wg g() {
      return this.e;
   }

   public void a(wg $$0) {
      this.d = $$0;
      this.e = this.i();
      this.a.b(this);
   }

   public eth.a h() {
      return this.f;
   }

   public void a(eth.a $$0) {
      this.f = $$0;
      this.a.b(this);
   }

   public void a(boolean $$0) {
      this.g = $$0;
      this.a.b(this);
   }

   public void b(@Nullable xw $$0) {
      this.h = $$0;
      this.a.b(this);
   }
}
