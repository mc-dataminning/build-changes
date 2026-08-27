import java.util.Objects;
import javax.annotation.Nullable;

public class epr {
   private final epz a;
   private final String b;
   private final eqc c;
   private vs d;
   private vs e;
   private eqc.a f;
   private boolean g;
   @Nullable
   private xi h;

   public epr(epz $$0, String $$1, eqc $$2, vs $$3, eqc.a $$4, boolean $$5, @Nullable xi $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = this.i();
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
   }

   public epz a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   public eqc c() {
      return this.c;
   }

   public vs d() {
      return this.d;
   }

   public boolean e() {
      return this.g;
   }

   @Nullable
   public xi f() {
      return this.h;
   }

   public xi a(xi $$0) {
      return Objects.requireNonNullElse(this.h, $$0);
   }

   private vs i() {
      return vv.a((vs)this.d.f().a($$0 -> $$0.a(new vy(vy.a.a, vs.b(this.b)))));
   }

   public vs g() {
      return this.e;
   }

   public void a(vs $$0) {
      this.d = $$0;
      this.e = this.i();
      this.a.b(this);
   }

   public eqc.a h() {
      return this.f;
   }

   public void a(eqc.a $$0) {
      this.f = $$0;
      this.a.b(this);
   }

   public void a(boolean $$0) {
      this.g = $$0;
      this.a.b(this);
   }

   public void b(@Nullable xi $$0) {
      this.h = $$0;
      this.a.b(this);
   }
}
