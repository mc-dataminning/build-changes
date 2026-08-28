import java.util.Optional;

public class afm implements zh<abw> {
   public static final yy<wl, afm> a = zh.a(afm::a, afm::new);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   private final String e;
   private final xa f;
   private final fgy.a g;
   private final Optional<yq> h;
   private final int i;

   public afm(fgn $$0, int $$1) {
      this.e = $$0.c();
      this.f = $$0.e();
      this.g = $$0.i();
      this.h = Optional.ofNullable($$0.g());
      this.i = $$1;
   }

   private afm(wl $$0) {
      this.e = $$0.p();
      this.i = $$0.readByte();
      if (this.i != 0 && this.i != 2) {
         this.f = wz.a;
         this.g = fgy.a.a;
         this.h = Optional.empty();
      } else {
         this.f = xc.d.decode($$0);
         this.g = $$0.b(fgy.a.class);
         this.h = ys.d.decode($$0);
      }
   }

   private void a(wl $$0) {
      $$0.a(this.e);
      $$0.l(this.i);
      if (this.i == 0 || this.i == 2) {
         xc.d.encode($$0, this.f);
         $$0.a(this.g);
         ys.d.encode($$0, this.h);
      }
   }

   @Override
   public zj<afm> a() {
      return agp.aM;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.e;
   }

   public xa e() {
      return this.f;
   }

   public int f() {
      return this.i;
   }

   public fgy.a g() {
      return this.g;
   }

   public Optional<yq> h() {
      return this.h;
   }
}
