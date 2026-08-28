import java.util.Optional;

public class afi implements zd<abs> {
   public static final yu<wh, afi> a = zd.a(afi::a, afi::new);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   private final String e;
   private final ww f;
   private final ffe.a g;
   private final Optional<ym> h;
   private final int i;

   public afi(fet $$0, int $$1) {
      this.e = $$0.b();
      this.f = $$0.d();
      this.g = $$0.h();
      this.h = Optional.ofNullable($$0.f());
      this.i = $$1;
   }

   private afi(wh $$0) {
      this.e = $$0.p();
      this.i = $$0.readByte();
      if (this.i != 0 && this.i != 2) {
         this.f = wv.a;
         this.g = ffe.a.a;
         this.h = Optional.empty();
      } else {
         this.f = wy.d.decode($$0);
         this.g = $$0.b(ffe.a.class);
         this.h = yo.d.decode($$0);
      }
   }

   private void a(wh $$0) {
      $$0.a(this.e);
      $$0.l(this.i);
      if (this.i == 0 || this.i == 2) {
         wy.d.encode($$0, this.f);
         $$0.a(this.g);
         yo.d.encode($$0, this.h);
      }
   }

   @Override
   public zf<afi> a() {
      return agl.aM;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.e;
   }

   public ww e() {
      return this.f;
   }

   public int f() {
      return this.i;
   }

   public ffe.a g() {
      return this.g;
   }

   public Optional<ym> h() {
      return this.h;
   }
}
