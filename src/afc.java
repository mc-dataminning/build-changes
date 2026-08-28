import java.util.Optional;

public class afc implements yw<abl> {
   public static final yn<wa, afc> a = yw.a(afc::a, afc::new);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   private final String e;
   private final wp f;
   private final fch.a g;
   private final Optional<yf> h;
   private final int i;

   public afc(fbw $$0, int $$1) {
      this.e = $$0.b();
      this.f = $$0.d();
      this.g = $$0.h();
      this.h = Optional.ofNullable($$0.f());
      this.i = $$1;
   }

   private afc(wa $$0) {
      this.e = $$0.p();
      this.i = $$0.readByte();
      if (this.i != 0 && this.i != 2) {
         this.f = wo.a;
         this.g = fch.a.a;
         this.h = Optional.empty();
      } else {
         this.f = wr.d.decode($$0);
         this.g = $$0.b(fch.a.class);
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
   public yy<afc> a() {
      return age.aM;
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

   public fch.a g() {
      return this.g;
   }

   public Optional<yf> h() {
      return this.h;
   }
}
