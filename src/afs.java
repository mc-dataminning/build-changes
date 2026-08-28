import java.util.Optional;

public class afs implements zq<acf> {
   public static final zh<wu, afs> a = zq.a(afs::a, afs::new);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   private final String e;
   private final xj f;
   private final fbg.a g;
   private final Optional<yz> h;
   private final int i;

   public afs(fav $$0, int $$1) {
      this.e = $$0.b();
      this.f = $$0.d();
      this.g = $$0.h();
      this.h = Optional.ofNullable($$0.f());
      this.i = $$1;
   }

   private afs(wu $$0) {
      this.e = $$0.p();
      this.i = $$0.readByte();
      if (this.i != 0 && this.i != 2) {
         this.f = xi.a;
         this.g = fbg.a.a;
         this.h = Optional.empty();
      } else {
         this.f = xl.d.decode($$0);
         this.g = $$0.b(fbg.a.class);
         this.h = zb.d.decode($$0);
      }
   }

   private void a(wu $$0) {
      $$0.a(this.e);
      $$0.l(this.i);
      if (this.i == 0 || this.i == 2) {
         xl.d.encode($$0, this.f);
         $$0.a(this.g);
         zb.d.encode($$0, this.h);
      }
   }

   @Override
   public zs<afs> a() {
      return agu.aJ;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.e;
   }

   public xj e() {
      return this.f;
   }

   public int f() {
      return this.i;
   }

   public fbg.a g() {
      return this.g;
   }

   public Optional<yz> h() {
      return this.h;
   }
}
