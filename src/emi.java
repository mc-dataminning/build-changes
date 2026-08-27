import java.util.Objects;
import javax.annotation.Nullable;

public class emi {
   private final emq a;
   private final String b;
   private final emt c;
   private vd d;
   private vd e;
   private emt.a f;
   private boolean g;
   @Nullable
   private wt h;

   public emi(emq $$0, String $$1, emt $$2, vd $$3, emt.a $$4, boolean $$5, @Nullable wt $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = this.i();
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   public emq a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public emt c() {
      return this.c;
   }

   public vd d() {
      return this.d;
   }

   public boolean e() {
      return this.g;
   }

   @Nullable
   public wt f() {
      return this.h;
   }

   public wt a(wt $$0) {
      return Objects.requireNonNullElse(this.h, $$0);
   }

   private vd i() {
      return vg.a((vd)this.d.f().a($$0 -> $$0.a(new vj(vj.a.a, vd.b(this.b)))));
   }

   public vd g() {
      return this.e;
   }

   public void a(vd $$0) {
      this.d = $$0;
      this.e = this.i();
      this.a.b(this);
   }

   public emt.a h() {
      return this.f;
   }

   public void a(emt.a $$0) {
      this.f = $$0;
      this.a.b(this);
   }

   public void a(boolean $$0) {
      this.g = $$0;
      this.a.b(this);
   }

   public void b(@Nullable wt $$0) {
      this.h = $$0;
      this.a.b(this);
   }
}
