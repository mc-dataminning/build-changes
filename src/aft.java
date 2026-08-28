import java.util.Optional;

public class aft implements zw<aci> {
   public static final zn<xa, aft> a = zw.a(aft::a, aft::new);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   private final String e;
   private final xp f;
   private final ewy.a g;
   private final Optional<zf> h;
   private final int i;

   public aft(ewn $$0, int $$1) {
      this.e = $$0.b();
      this.f = $$0.d();
      this.g = $$0.h();
      this.h = Optional.ofNullable($$0.f());
      this.i = $$1;
   }

   private aft(xa $$0) {
      this.e = $$0.p();
      this.i = $$0.readByte();
      if (this.i != 0 && this.i != 2) {
         this.f = xo.a;
         this.g = ewy.a.a;
         this.h = Optional.empty();
      } else {
         this.f = xr.d.decode($$0);
         this.g = $$0.b(ewy.a.class);
         this.h = zh.d.decode($$0);
      }
   }

   private void a(xa $$0) {
      $$0.a(this.e);
      $$0.k(this.i);
      if (this.i == 0 || this.i == 2) {
         xr.d.encode($$0, this.f);
         $$0.a(this.g);
         zh.d.encode($$0, this.h);
      }
   }

   @Override
   public zy<aft> a() {
      return agu.aI;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.e;
   }

   public xp e() {
      return this.f;
   }

   public int f() {
      return this.i;
   }

   public ewy.a g() {
      return this.g;
   }

   public Optional<zf> h() {
      return this.h;
   }
}
