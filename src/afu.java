import java.util.Optional;

public class afu implements zs<ach> {
   public static final zj<ww, afu> a = zs.a(afu::a, afu::new);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   private final String e;
   private final xl f;
   private final faz.a g;
   private final Optional<zb> h;
   private final int i;

   public afu(fao $$0, int $$1) {
      this.e = $$0.b();
      this.f = $$0.d();
      this.g = $$0.h();
      this.h = Optional.ofNullable($$0.f());
      this.i = $$1;
   }

   private afu(ww $$0) {
      this.e = $$0.p();
      this.i = $$0.readByte();
      if (this.i != 0 && this.i != 2) {
         this.f = xk.a;
         this.g = faz.a.a;
         this.h = Optional.empty();
      } else {
         this.f = xn.d.decode($$0);
         this.g = $$0.b(faz.a.class);
         this.h = zd.d.decode($$0);
      }
   }

   private void a(ww $$0) {
      $$0.a(this.e);
      $$0.l(this.i);
      if (this.i == 0 || this.i == 2) {
         xn.d.encode($$0, this.f);
         $$0.a(this.g);
         zd.d.encode($$0, this.h);
      }
   }

   @Override
   public zu<afu> a() {
      return agw.aJ;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.e;
   }

   public xl e() {
      return this.f;
   }

   public int f() {
      return this.i;
   }

   public faz.a g() {
      return this.g;
   }

   public Optional<zb> h() {
      return this.h;
   }
}
