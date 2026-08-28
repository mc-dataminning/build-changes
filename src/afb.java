import java.util.Optional;

public class afb implements yw<abl> {
   public static final yn<wa, afb> a = yw.a(afb::a, afb::new);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   private final String e;
   private final wp f;
   private final fdf.a g;
   private final Optional<yf> h;
   private final int i;

   public afb(fcu $$0, int $$1) {
      this.e = $$0.b();
      this.f = $$0.d();
      this.g = $$0.h();
      this.h = Optional.ofNullable($$0.f());
      this.i = $$1;
   }

   private afb(wa $$0) {
      this.e = $$0.p();
      this.i = $$0.readByte();
      if (this.i != 0 && this.i != 2) {
         this.f = wo.a;
         this.g = fdf.a.a;
         this.h = Optional.empty();
      } else {
         this.f = wr.d.decode($$0);
         this.g = $$0.b(fdf.a.class);
         this.h = yh.d.decode($$0);
      }
   }

   private void a(wa $$0) {
      $$0.a(this.e);
      $$0.l(this.i);
      if (this.i == 0 || this.i == 2) {
         wr.d.encode($$0, this.f);
         $$0.a(this.g);
         yh.d.encode($$0, this.h);
      }
   }

   @Override
   public yy<afb> a() {
      return agd.aL;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.e;
   }

   public wp e() {
      return this.f;
   }

   public int f() {
      return this.i;
   }

   public fdf.a g() {
      return this.g;
   }

   public Optional<yf> h() {
      return this.h;
   }
}
