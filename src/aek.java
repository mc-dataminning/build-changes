import java.util.Optional;

public class aek implements yp<aba> {
   public static final yg<vt, aek> a = yp.a(aek::a, aek::new);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   private final String e;
   private final wi f;
   private final etq.a g;
   private final Optional<xy> h;
   private final int i;

   public aek(etf $$0, int $$1) {
      this.e = $$0.b();
      this.f = $$0.d();
      this.g = $$0.h();
      this.h = Optional.ofNullable($$0.f());
      this.i = $$1;
   }

   private aek(vt $$0) {
      this.e = $$0.p();
      this.i = $$0.readByte();
      if (this.i != 0 && this.i != 2) {
         this.f = wh.a;
         this.g = etq.a.a;
         this.h = Optional.empty();
      } else {
         this.f = wk.d.decode($$0);
         this.g = $$0.b(etq.a.class);
         this.h = ya.d.decode($$0);
      }
   }

   private void a(vt $$0) {
      $$0.a(this.e);
      $$0.k(this.i);
      if (this.i == 0 || this.i == 2) {
         wk.d.encode($$0, this.f);
         $$0.a(this.g);
         ya.d.encode($$0, this.h);
      }
   }

   @Override
   public yr<aek> a() {
      return afl.aI;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.e;
   }

   public wi e() {
      return this.f;
   }

   public int f() {
      return this.i;
   }

   public etq.a g() {
      return this.g;
   }

   public Optional<xy> h() {
      return this.h;
   }
}
