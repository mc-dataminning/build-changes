import java.util.Optional;

public class afq implements zo<acd> {
   public static final zf<ws, afq> a = zo.a(afq::a, afq::new);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   private final String e;
   private final xh f;
   private final fap.a g;
   private final Optional<yx> h;
   private final int i;

   public afq(fae $$0, int $$1) {
      this.e = $$0.b();
      this.f = $$0.d();
      this.g = $$0.h();
      this.h = Optional.ofNullable($$0.f());
      this.i = $$1;
   }

   private afq(ws $$0) {
      this.e = $$0.p();
      this.i = $$0.readByte();
      if (this.i != 0 && this.i != 2) {
         this.f = xg.a;
         this.g = fap.a.a;
         this.h = Optional.empty();
      } else {
         this.f = xj.d.decode($$0);
         this.g = $$0.b(fap.a.class);
         this.h = yz.d.decode($$0);
      }
   }

   private void a(ws $$0) {
      $$0.a(this.e);
      $$0.l(this.i);
      if (this.i == 0 || this.i == 2) {
         xj.d.encode($$0, this.f);
         $$0.a(this.g);
         yz.d.encode($$0, this.h);
      }
   }

   @Override
   public zq<afq> a() {
      return ags.aJ;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.e;
   }

   public xh e() {
      return this.f;
   }

   public int f() {
      return this.i;
   }

   public fap.a g() {
      return this.g;
   }

   public Optional<yx> h() {
      return this.h;
   }
}
