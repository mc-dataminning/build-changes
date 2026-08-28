import java.util.Optional;

public class afo implements zj<aby> {
   public static final za<wn, afo> a = zj.a(afo::a, afo::new);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   private final String e;
   private final xc f;
   private final fha.a g;
   private final Optional<ys> h;
   private final int i;

   public afo(fgp $$0, int $$1) {
      this.e = $$0.c();
      this.f = $$0.e();
      this.g = $$0.i();
      this.h = Optional.ofNullable($$0.g());
      this.i = $$1;
   }

   private afo(wn $$0) {
      this.e = $$0.p();
      this.i = $$0.readByte();
      if (this.i != 0 && this.i != 2) {
         this.f = xb.a;
         this.g = fha.a.a;
         this.h = Optional.empty();
      } else {
         this.f = xe.d.decode($$0);
         this.g = $$0.b(fha.a.class);
         this.h = yu.d.decode($$0);
      }
   }

   private void a(wn $$0) {
      $$0.a(this.e);
      $$0.l(this.i);
      if (this.i == 0 || this.i == 2) {
         xe.d.encode($$0, this.f);
         $$0.a(this.g);
         yu.d.encode($$0, this.h);
      }
   }

   @Override
   public zl<afo> a() {
      return agr.aM;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.e;
   }

   public xc e() {
      return this.f;
   }

   public int f() {
      return this.i;
   }

   public fha.a g() {
      return this.g;
   }

   public Optional<ys> h() {
      return this.h;
   }
}
