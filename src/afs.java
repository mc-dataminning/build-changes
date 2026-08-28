import java.util.Optional;

public class afs implements zv<ach> {
   public static final zm<wz, afs> a = zv.a(afs::a, afs::new);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   private final String e;
   private final xo f;
   private final ewx.a g;
   private final Optional<ze> h;
   private final int i;

   public afs(ewm $$0, int $$1) {
      this.e = $$0.b();
      this.f = $$0.d();
      this.g = $$0.h();
      this.h = Optional.ofNullable($$0.f());
      this.i = $$1;
   }

   private afs(wz $$0) {
      this.e = $$0.p();
      this.i = $$0.readByte();
      if (this.i != 0 && this.i != 2) {
         this.f = xn.a;
         this.g = ewx.a.a;
         this.h = Optional.empty();
      } else {
         this.f = xq.d.decode($$0);
         this.g = $$0.b(ewx.a.class);
         this.h = zg.d.decode($$0);
      }
   }

   private void a(wz $$0) {
      $$0.a(this.e);
      $$0.k(this.i);
      if (this.i == 0 || this.i == 2) {
         xq.d.encode($$0, this.f);
         $$0.a(this.g);
         zg.d.encode($$0, this.h);
      }
   }

   @Override
   public zx<afs> a() {
      return agt.aI;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.e;
   }

   public xo e() {
      return this.f;
   }

   public int f() {
      return this.i;
   }

   public ewx.a g() {
      return this.g;
   }

   public Optional<ze> h() {
      return this.h;
   }
}
