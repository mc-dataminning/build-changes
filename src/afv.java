import java.util.Optional;

public class afv implements zo<acf> {
   public static final ze<wp, afv> a = zo.a(afv::a, afv::new);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   private final String e;
   private final xg f;
   private final fhk.a g;
   private final Optional<yw> h;
   private final int i;

   public afv(fgz $$0, int $$1) {
      this.e = $$0.c();
      this.f = $$0.e();
      this.g = $$0.i();
      this.h = Optional.ofNullable($$0.g());
      this.i = $$1;
   }

   private afv(wp $$0) {
      this.e = $$0.p();
      this.i = $$0.readByte();
      if (this.i != 0 && this.i != 2) {
         this.f = xf.a;
         this.g = fhk.a.a;
         this.h = Optional.empty();
      } else {
         this.f = xi.d.decode($$0);
         this.g = $$0.b(fhk.a.class);
         this.h = yy.d.decode($$0);
      }
   }

   private void a(wp $$0) {
      $$0.a(this.e);
      $$0.l(this.i);
      if (this.i == 0 || this.i == 2) {
         xi.d.encode($$0, this.f);
         $$0.a(this.g);
         yy.d.encode($$0, this.h);
      }
   }

   @Override
   public zq<afv> a() {
      return agy.aM;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.e;
   }

   public xg e() {
      return this.f;
   }

   public int f() {
      return this.i;
   }

   public fhk.a g() {
      return this.g;
   }

   public Optional<yw> h() {
      return this.h;
   }
}
