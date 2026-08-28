import java.util.Optional;

public class afr implements zp<ace> {
   public static final zg<wt, afr> a = zp.a(afr::a, afr::new);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   private final String e;
   private final xi f;
   private final fav.a g;
   private final Optional<yy> h;
   private final int i;

   public afr(fak $$0, int $$1) {
      this.e = $$0.b();
      this.f = $$0.d();
      this.g = $$0.h();
      this.h = Optional.ofNullable($$0.f());
      this.i = $$1;
   }

   private afr(wt $$0) {
      this.e = $$0.p();
      this.i = $$0.readByte();
      if (this.i != 0 && this.i != 2) {
         this.f = xh.a;
         this.g = fav.a.a;
         this.h = Optional.empty();
      } else {
         this.f = xk.d.decode($$0);
         this.g = $$0.b(fav.a.class);
         this.h = za.d.decode($$0);
      }
   }

   private void a(wt $$0) {
      $$0.a(this.e);
      $$0.l(this.i);
      if (this.i == 0 || this.i == 2) {
         xk.d.encode($$0, this.f);
         $$0.a(this.g);
         za.d.encode($$0, this.h);
      }
   }

   @Override
   public zr<afr> a() {
      return agt.aJ;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.e;
   }

   public xi e() {
      return this.f;
   }

   public int f() {
      return this.i;
   }

   public fav.a g() {
      return this.g;
   }

   public Optional<yy> h() {
      return this.h;
   }
}
