import java.util.Objects;
import javax.annotation.Nullable;

public class emo {
   private final emw a;
   private final String b;
   private final emz c;
   private vf d;
   private vf e;
   private emz.a f;
   private boolean g;
   @Nullable
   private wv h;

   public emo(emw $$0, String $$1, emz $$2, vf $$3, emz.a $$4, boolean $$5, @Nullable wv $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = this.i();
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   public emw a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public emz c() {
      return this.c;
   }

   public vf d() {
      return this.d;
   }

   public boolean e() {
      return this.g;
   }

   @Nullable
   public wv f() {
      return this.h;
   }

   public wv a(wv $$0) {
      return Objects.requireNonNullElse(this.h, $$0);
   }

   private vf i() {
      return vi.a((vf)this.d.f().a($$0 -> $$0.a(new vl(vl.a.a, vf.b(this.b)))));
   }

   public vf g() {
      return this.e;
   }

   public void a(vf $$0) {
      this.d = $$0;
      this.e = this.i();
      this.a.b(this);
   }

   public emz.a h() {
      return this.f;
   }

   public void a(emz.a $$0) {
      this.f = $$0;
      this.a.b(this);
   }

   public void a(boolean $$0) {
      this.g = $$0;
      this.a.b(this);
   }

   public void b(@Nullable wv $$0) {
      this.h = $$0;
      this.a.b(this);
   }
}
