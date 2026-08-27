import java.util.Optional;

public class aei implements yn<aay> {
   public static final ye<vr, aei> a = yn.a(aei::a, aei::new);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   private final String e;
   private final wg f;
   private final eth.a g;
   private final Optional<xw> h;
   private final int i;

   public aei(esw $$0, int $$1) {
      this.e = $$0.b();
      this.f = $$0.d();
      this.g = $$0.h();
      this.h = Optional.ofNullable($$0.f());
      this.i = $$1;
   }

   private aei(vr $$0) {
      this.e = $$0.p();
      this.i = $$0.readByte();
      if (this.i != 0 && this.i != 2) {
         this.f = wf.a;
         this.g = eth.a.a;
         this.h = Optional.empty();
      } else {
         this.f = wi.d.decode($$0);
         this.g = $$0.b(eth.a.class);
         this.h = xy.d.decode($$0);
      }
   }

   private void a(vr $$0) {
      $$0.a(this.e);
      $$0.k(this.i);
      if (this.i == 0 || this.i == 2) {
         wi.d.encode($$0, this.f);
         $$0.a(this.g);
         xy.d.encode($$0, this.h);
      }
   }

   @Override
   public yp<aei> a() {
      return afj.aI;
   }

   public void a(aay $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.e;
   }

   public wg e() {
      return this.f;
   }

   public int f() {
      return this.i;
   }

   public eth.a g() {
      return this.g;
   }

   public Optional<xw> h() {
      return this.h;
   }
}
