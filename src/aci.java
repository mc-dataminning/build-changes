import javax.annotation.Nullable;

public class aci implements xf<za> {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   private final String d;
   private final vf e;
   private final ena.a f;
   @Nullable
   private final wv g;
   private final int h;

   public aci(emp $$0, int $$1) {
      this.d = $$0.b();
      this.e = $$0.d();
      this.f = $$0.h();
      this.g = $$0.f();
      this.h = $$1;
   }

   public aci(ui $$0) {
      this.d = $$0.s();
      this.h = $$0.readByte();
      if (this.h != 0 && this.h != 2) {
         this.e = ve.a;
         this.f = ena.a.a;
         this.g = null;
      } else {
         this.e = $$0.m();
         this.f = $$0.b(ena.a.class);
         this.g = $$0.c(wx::a);
      }
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.d);
      $$0.k(this.h);
      if (this.h == 0 || this.h == 2) {
         $$0.a(this.e);
         $$0.a(this.f);
         $$0.a(this.g, wx::a);
      }
   }

   public void a(za $$0) {
      $$0.a(this);
   }

   public String a() {
      return this.d;
   }

   public vf d() {
      return this.e;
   }

   public int e() {
      return this.h;
   }

   public ena.a f() {
      return this.f;
   }

   @Nullable
   public wv g() {
      return this.g;
   }
}
