import java.util.Optional;

public class agi implements aac<acr> {
   public static final zt<xg, agi> a = aac.a(agi::a, agi::new);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   private final String e;
   private final xv f;
   private final fda.a g;
   private final Optional<zl> h;
   private final int i;

   public agi(fcp $$0, int $$1) {
      this.e = $$0.b();
      this.f = $$0.d();
      this.g = $$0.h();
      this.h = Optional.ofNullable($$0.f());
      this.i = $$1;
   }

   private agi(xg $$0) {
      this.e = $$0.p();
      this.i = $$0.readByte();
      if (this.i != 0 && this.i != 2) {
         this.f = xu.a;
         this.g = fda.a.a;
         this.h = Optional.empty();
      } else {
         this.f = xx.d.decode($$0);
         this.g = $$0.b(fda.a.class);
         this.h = zn.d.decode($$0);
      }
   }

   private void a(xg $$0) {
      $$0.a(this.e);
      $$0.l(this.i);
      if (this.i == 0 || this.i == 2) {
         xx.d.encode($$0, this.f);
         $$0.a(this.g);
         zn.d.encode($$0, this.h);
      }
   }

   @Override
   public aae<agi> a() {
      return ahk.aM;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.e;
   }

   public xv e() {
      return this.f;
   }

   public int f() {
      return this.i;
   }

   public fda.a g() {
      return this.g;
   }

   public Optional<zl> h() {
      return this.h;
   }
}
