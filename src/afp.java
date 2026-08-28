import java.util.Optional;

public class afp implements zs<ace> {
   public static final zj<ww, afp> a = zs.a(afp::a, afp::new);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   private final String e;
   private final xl f;
   private final ewt.a g;
   private final Optional<zb> h;
   private final int i;

   public afp(ewi $$0, int $$1) {
      this.e = $$0.b();
      this.f = $$0.d();
      this.g = $$0.h();
      this.h = Optional.ofNullable($$0.f());
      this.i = $$1;
   }

   private afp(ww $$0) {
      this.e = $$0.p();
      this.i = $$0.readByte();
      if (this.i != 0 && this.i != 2) {
         this.f = xk.a;
         this.g = ewt.a.a;
         this.h = Optional.empty();
      } else {
         this.f = xn.d.decode($$0);
         this.g = $$0.b(ewt.a.class);
         this.h = zd.d.decode($$0);
      }
   }

   private void a(ww $$0) {
      $$0.a(this.e);
      $$0.k(this.i);
      if (this.i == 0 || this.i == 2) {
         xn.d.encode($$0, this.f);
         $$0.a(this.g);
         zd.d.encode($$0, this.h);
      }
   }

   @Override
   public zu<afp> a() {
      return agq.aI;
   }

   public void a(ace $$0) {
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

   public ewt.a g() {
      return this.g;
   }

   public Optional<zb> h() {
      return this.h;
   }
}
