import java.util.Optional;

public class afx implements zr<acg> {
   public static final zi<wv, afx> a = zr.a(afx::a, afx::new);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   private final String e;
   private final xk f;
   private final fcz.a g;
   private final Optional<za> h;
   private final int i;

   public afx(fco $$0, int $$1) {
      this.e = $$0.b();
      this.f = $$0.d();
      this.g = $$0.h();
      this.h = Optional.ofNullable($$0.f());
      this.i = $$1;
   }

   private afx(wv $$0) {
      this.e = $$0.p();
      this.i = $$0.readByte();
      if (this.i != 0 && this.i != 2) {
         this.f = xj.a;
         this.g = fcz.a.a;
         this.h = Optional.empty();
      } else {
         this.f = xm.d.decode($$0);
         this.g = $$0.b(fcz.a.class);
         this.h = zc.d.decode($$0);
      }
   }

   private void a(wv $$0) {
      $$0.a(this.e);
      $$0.l(this.i);
      if (this.i == 0 || this.i == 2) {
         xm.d.encode($$0, this.f);
         $$0.a(this.g);
         zc.d.encode($$0, this.h);
      }
   }

   @Override
   public zt<afx> a() {
      return agz.aM;
   }

   public void a(acg $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.e;
   }

   public xk e() {
      return this.f;
   }

   public int f() {
      return this.i;
   }

   public fcz.a g() {
      return this.g;
   }

   public Optional<za> h() {
      return this.h;
   }
}
