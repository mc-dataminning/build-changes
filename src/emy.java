import java.util.Objects;
import javax.annotation.Nullable;

public class emy {
   private final eng a;
   private final String b;
   private final enj c;
   private vg d;
   private vg e;
   private enj.a f;
   private boolean g;
   @Nullable
   private ww h;

   public emy(eng $$0, String $$1, enj $$2, vg $$3, enj.a $$4, boolean $$5, @Nullable ww $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = this.i();
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   public eng a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public enj c() {
      return this.c;
   }

   public vg d() {
      return this.d;
   }

   public boolean e() {
      return this.g;
   }

   @Nullable
   public ww f() {
      return this.h;
   }

   public ww a(ww $$0) {
      return Objects.requireNonNullElse(this.h, $$0);
   }

   private vg i() {
      return vj.a((vg)this.d.f().a($$0 -> $$0.a(new vm(vm.a.a, vg.b(this.b)))));
   }

   public vg g() {
      return this.e;
   }

   public void a(vg $$0) {
      this.d = $$0;
      this.e = this.i();
      this.a.b(this);
   }

   public enj.a h() {
      return this.f;
   }

   public void a(enj.a $$0) {
      this.f = $$0;
      this.a.b(this);
   }

   public void a(boolean $$0) {
      this.g = $$0;
      this.a.b(this);
   }

   public void b(@Nullable ww $$0) {
      this.h = $$0;
      this.a.b(this);
   }
}
