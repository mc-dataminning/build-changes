import javax.annotation.Nullable;

public class acf implements xd<yx> {
   public static final int a = 0;
   public static final int b = 1;
   public static final int c = 2;
   private final String d;
   private final vd e;
   private final emt.a f;
   @Nullable
   private final wt g;
   private final int h;

   public acf(emi $$0, int $$1) {
      this.d = $$0.b();
      this.e = $$0.d();
      this.f = $$0.h();
      this.g = $$0.f();
      this.h = $$1;
   }

   public acf(ug $$0) {
      this.d = $$0.s();
      this.h = $$0.readByte();
      if (this.h != 0 && this.h != 2) {
         this.e = vc.a;
         this.f = emt.a.a;
         this.g = null;
      } else {
         this.e = $$0.m();
         this.f = $$0.b(emt.a.class);
         this.g = $$0.c(wv::a);
      }
   }

   @Override
   public void a(ug $$0) {
      $$0.a(this.d);
      $$0.k(this.h);
      if (this.h == 0 || this.h == 2) {
         $$0.a(this.e);
         $$0.a(this.f);
         $$0.a(this.g, wv::a);
      }
   }

   public void a(yx $$0) {
      $$0.a(this);
   }

   public String a() {
      return this.d;
   }

   public vd d() {
      return this.e;
   }

   public int e() {
      return this.h;
   }

   public emt.a f() {
      return this.f;
   }

   @Nullable
   public wt g() {
      return this.g;
   }
}
