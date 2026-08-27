import java.util.Optional;

public class afa implements ze<abq> {
   public static final yv<wi, afa> a = ze.a(afa::a, afa::new);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   private final String e;
   private final wx f;
   private final evr.a g;
   private final Optional<yn> h;
   private final int i;

   public afa(evg $$0, int $$1) {
      this.e = $$0.b();
      this.f = $$0.d();
      this.g = $$0.h();
      this.h = Optional.ofNullable($$0.f());
      this.i = $$1;
   }

   private afa(wi $$0) {
      this.e = $$0.p();
      this.i = $$0.readByte();
      if (this.i != 0 && this.i != 2) {
         this.f = ww.a;
         this.g = evr.a.a;
         this.h = Optional.empty();
      } else {
         this.f = wz.d.decode($$0);
         this.g = $$0.b(evr.a.class);
         this.h = yp.d.decode($$0);
      }
   }

   private void a(wi $$0) {
      $$0.a(this.e);
      $$0.k(this.i);
      if (this.i == 0 || this.i == 2) {
         wz.d.encode($$0, this.f);
         $$0.a(this.g);
         yp.d.encode($$0, this.h);
      }
   }

   @Override
   public zg<afa> a() {
      return agb.aI;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.e;
   }

   public wx e() {
      return this.f;
   }

   public int f() {
      return this.i;
   }

   public evr.a g() {
      return this.g;
   }

   public Optional<yn> h() {
      return this.h;
   }
}
