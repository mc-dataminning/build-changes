import javax.annotation.Nullable;

public class acj implements xg<zb> {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   private final String d;
   private final vg e;
   private final enj.a f;
   @Nullable
   private final ww g;
   private final int h;

   public acj(emy $$0, int $$1) {
      this.d = $$0.b();
      this.e = $$0.d();
      this.f = $$0.h();
      this.g = $$0.f();
      this.h = $$1;
   }

   public acj(uj $$0) {
      this.d = $$0.s();
      this.h = $$0.readByte();
      if (this.h != 0 && this.h != 2) {
         this.e = vf.a;
         this.f = enj.a.a;
         this.g = null;
      } else {
         this.e = $$0.m();
         this.f = $$0.b(enj.a.class);
         this.g = $$0.c(wy::a);
      }
   }

   @Override
   public void a(uj $$0) {
      $$0.a(this.d);
      $$0.k(this.h);
      if (this.h == 0 || this.h == 2) {
         $$0.a(this.e);
         $$0.a(this.f);
         $$0.a(this.g, wy::a);
      }
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public String a() {
      return this.d;
   }

   public vg d() {
      return this.e;
   }

   public int e() {
      return this.h;
   }

   public enj.a f() {
      return this.f;
   }

   @Nullable
   public ww g() {
      return this.g;
   }
}
