import java.util.Optional;

public class aey implements zb<abn> {
   public static final ys<wf, aey> a = zb.a(aey::a, aey::new);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   private final String e;
   private final wu f;
   private final exm.a g;
   private final Optional<yk> h;
   private final int i;

   public aey(exb $$0, int $$1) {
      this.e = $$0.b();
      this.f = $$0.d();
      this.g = $$0.h();
      this.h = Optional.ofNullable($$0.f());
      this.i = $$1;
   }

   private aey(wf $$0) {
      this.e = $$0.p();
      this.i = $$0.readByte();
      if (this.i != 0 && this.i != 2) {
         this.f = wt.a;
         this.g = exm.a.a;
         this.h = Optional.empty();
      } else {
         this.f = ww.d.decode($$0);
         this.g = $$0.b(exm.a.class);
         this.h = ym.d.decode($$0);
      }
   }

   private void a(wf $$0) {
      $$0.a(this.e);
      $$0.k(this.i);
      if (this.i == 0 || this.i == 2) {
         ww.d.encode($$0, this.f);
         $$0.a(this.g);
         ym.d.encode($$0, this.h);
      }
   }

   @Override
   public zd<aey> a() {
      return afz.aI;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.e;
   }

   public wu e() {
      return this.f;
   }

   public int f() {
      return this.i;
   }

   public exm.a g() {
      return this.g;
   }

   public Optional<yk> h() {
      return this.h;
   }
}
