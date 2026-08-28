import java.util.Optional;

public class afb implements yv<abk> {
   public static final ym<vz, afb> a = yv.a(afb::a, afb::new);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   private final String e;
   private final wo f;
   private final fcg.a g;
   private final Optional<ye> h;
   private final int i;

   public afb(fbv $$0, int $$1) {
      this.e = $$0.b();
      this.f = $$0.d();
      this.g = $$0.h();
      this.h = Optional.ofNullable($$0.f());
      this.i = $$1;
   }

   private afb(vz $$0) {
      this.e = $$0.p();
      this.i = $$0.readByte();
      if (this.i != 0 && this.i != 2) {
         this.f = wn.a;
         this.g = fcg.a.a;
         this.h = Optional.empty();
      } else {
         this.f = wq.d.decode($$0);
         this.g = $$0.b(fcg.a.class);
         this.h = yg.d.decode($$0);
      }
   }

   private void a(vz $$0) {
      $$0.a(this.e);
      $$0.l(this.i);
      if (this.i == 0 || this.i == 2) {
         wq.d.encode($$0, this.f);
         $$0.a(this.g);
         yg.d.encode($$0, this.h);
      }
   }

   @Override
   public yx<afb> a() {
      return agd.aM;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.e;
   }

   public wo e() {
      return this.f;
   }

   public int f() {
      return this.i;
   }

   public fcg.a g() {
      return this.g;
   }

   public Optional<ye> h() {
      return this.h;
   }
}
