import java.util.Optional;

public class afe implements zf<abt> {
   public static final yw<wj, afe> a = zf.a(afe::a, afe::new);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   private final String e;
   private final wy f;
   private final eyd.a g;
   private final Optional<yo> h;
   private final int i;

   public afe(exs $$0, int $$1) {
      this.e = $$0.b();
      this.f = $$0.d();
      this.g = $$0.h();
      this.h = Optional.ofNullable($$0.f());
      this.i = $$1;
   }

   private afe(wj $$0) {
      this.e = $$0.p();
      this.i = $$0.readByte();
      if (this.i != 0 && this.i != 2) {
         this.f = wx.a;
         this.g = eyd.a.a;
         this.h = Optional.empty();
      } else {
         this.f = xa.d.decode($$0);
         this.g = $$0.b(eyd.a.class);
         this.h = yq.d.decode($$0);
      }
   }

   private void a(wj $$0) {
      $$0.a(this.e);
      $$0.k(this.i);
      if (this.i == 0 || this.i == 2) {
         xa.d.encode($$0, this.f);
         $$0.a(this.g);
         yq.d.encode($$0, this.h);
      }
   }

   @Override
   public zh<afe> a() {
      return agf.aI;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.e;
   }

   public wy e() {
      return this.f;
   }

   public int f() {
      return this.i;
   }

   public eyd.a g() {
      return this.g;
   }

   public Optional<yo> h() {
      return this.h;
   }
}
