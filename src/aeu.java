import java.util.Optional;

public class aeu implements yz<abk> {
   public static final yq<wd, aeu> a = yz.a(aeu::a, aeu::new);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   private final String e;
   private final ws f;
   private final eum.a g;
   private final Optional<yi> h;
   private final int i;

   public aeu(eub $$0, int $$1) {
      this.e = $$0.b();
      this.f = $$0.d();
      this.g = $$0.h();
      this.h = Optional.ofNullable($$0.f());
      this.i = $$1;
   }

   private aeu(wd $$0) {
      this.e = $$0.p();
      this.i = $$0.readByte();
      if (this.i != 0 && this.i != 2) {
         this.f = wr.a;
         this.g = eum.a.a;
         this.h = Optional.empty();
      } else {
         this.f = wu.d.decode($$0);
         this.g = $$0.b(eum.a.class);
         this.h = yk.d.decode($$0);
      }
   }

   private void a(wd $$0) {
      $$0.a(this.e);
      $$0.k(this.i);
      if (this.i == 0 || this.i == 2) {
         wu.d.encode($$0, this.f);
         $$0.a(this.g);
         yk.d.encode($$0, this.h);
      }
   }

   @Override
   public zb<aeu> a() {
      return afv.aI;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.e;
   }

   public ws e() {
      return this.f;
   }

   public int f() {
      return this.i;
   }

   public eum.a g() {
      return this.g;
   }

   public Optional<yi> h() {
      return this.h;
   }
}
