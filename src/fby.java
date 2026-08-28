import java.util.Objects;
import javax.annotation.Nullable;

public class fby {
   private final fcg a;
   private final String b;
   private final fcj c;
   private wp d;
   private wp e;
   private fcj.a f;
   private boolean g;
   @Nullable
   private yf h;

   public fby(fcg $$0, String $$1, fcj $$2, wp $$3, fcj.a $$4, boolean $$5, @Nullable yf $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = this.i();
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   public fcg a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public fcj c() {
      return this.c;
   }

   public wp d() {
      return this.d;
   }

   public boolean e() {
      return this.g;
   }

   @Nullable
   public yf f() {
      return this.h;
   }

   public yf a(yf $$0) {
      return Objects.requireNonNullElse(this.h, $$0);
   }

   private wp i() {
      return ws.a((wp)this.d.f().a($$0 -> $$0.a(new wv(wv.a.a, wp.b(this.b)))));
   }

   public wp g() {
      return this.e;
   }

   public void a(wp $$0) {
      this.d = $$0;
      this.e = this.i();
      this.a.b(this);
   }

   public fcj.a h() {
      return this.f;
   }

   public void a(fcj.a $$0) {
      this.f = $$0;
      this.a.b(this);
   }

   public void a(boolean $$0) {
      this.g = $$0;
      this.a.b(this);
   }

   public void b(@Nullable yf $$0) {
      this.h = $$0;
      this.a.b(this);
   }
}
