import java.util.Objects;
import javax.annotation.Nullable;

public class eqn {
   private final eqv a;
   private final String b;
   private final eqy c;
   private vu d;
   private vu e;
   private eqy.a f;
   private boolean g;
   @Nullable
   private xk h;

   public eqn(eqv $$0, String $$1, eqy $$2, vu $$3, eqy.a $$4, boolean $$5, @Nullable xk $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = this.i();
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   public eqv a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public eqy c() {
      return this.c;
   }

   public vu d() {
      return this.d;
   }

   public boolean e() {
      return this.g;
   }

   @Nullable
   public xk f() {
      return this.h;
   }

   public xk a(xk $$0) {
      return Objects.requireNonNullElse(this.h, $$0);
   }

   private vu i() {
      return vx.a((vu)this.d.f().a($$0 -> $$0.a(new wa(wa.a.a, vu.b(this.b)))));
   }

   public vu g() {
      return this.e;
   }

   public void a(vu $$0) {
      this.d = $$0;
      this.e = this.i();
      this.a.b(this);
   }

   public eqy.a h() {
      return this.f;
   }

   public void a(eqy.a $$0) {
      this.f = $$0;
      this.a.b(this);
   }

   public void a(boolean $$0) {
      this.g = $$0;
      this.a.b(this);
   }

   public void b(@Nullable xk $$0) {
      this.h = $$0;
      this.a.b(this);
   }
}
