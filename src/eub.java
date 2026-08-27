import java.util.Objects;
import javax.annotation.Nullable;

public class eub {
   private final euj a;
   private final String b;
   private final eum c;
   private ws d;
   private ws e;
   private eum.a f;
   private boolean g;
   @Nullable
   private yi h;

   public eub(euj $$0, String $$1, eum $$2, ws $$3, eum.a $$4, boolean $$5, @Nullable yi $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = this.i();
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   public euj a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public eum c() {
      return this.c;
   }

   public ws d() {
      return this.d;
   }

   public boolean e() {
      return this.g;
   }

   @Nullable
   public yi f() {
      return this.h;
   }

   public yi a(yi $$0) {
      return Objects.requireNonNullElse(this.h, $$0);
   }

   private ws i() {
      return wv.a((ws)this.d.f().a($$0 -> $$0.a(new wy(wy.a.a, ws.b(this.b)))));
   }

   public ws g() {
      return this.e;
   }

   public void a(ws $$0) {
      this.d = $$0;
      this.e = this.i();
      this.a.b(this);
   }

   public eum.a h() {
      return this.f;
   }

   public void a(eum.a $$0) {
      this.f = $$0;
      this.a.b(this);
   }

   public void a(boolean $$0) {
      this.g = $$0;
      this.a.b(this);
   }

   public void b(@Nullable yi $$0) {
      this.h = $$0;
      this.a.b(this);
   }
}
