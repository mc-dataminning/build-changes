import java.util.Optional;

public class afm implements zk<abz> {
   public static final zb<wo, afm> a = zk.a(afm::a, afm::new);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   private final String e;
   private final xd f;
   private final ezl.a g;
   private final Optional<yt> h;
   private final int i;

   public afm(eza $$0, int $$1) {
      this.e = $$0.b();
      this.f = $$0.d();
      this.g = $$0.h();
      this.h = Optional.ofNullable($$0.f());
      this.i = $$1;
   }

   private afm(wo $$0) {
      this.e = $$0.p();
      this.i = $$0.readByte();
      if (this.i != 0 && this.i != 2) {
         this.f = xc.a;
         this.g = ezl.a.a;
         this.h = Optional.empty();
      } else {
         this.f = xf.d.decode($$0);
         this.g = $$0.b(ezl.a.class);
         this.h = yv.d.decode($$0);
      }
   }

   private void a(wo $$0) {
      $$0.a(this.e);
      $$0.l(this.i);
      if (this.i == 0 || this.i == 2) {
         xf.d.encode($$0, this.f);
         $$0.a(this.g);
         yv.d.encode($$0, this.h);
      }
   }

   @Override
   public zm<afm> a() {
      return ago.aJ;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.e;
   }

   public xd e() {
      return this.f;
   }

   public int f() {
      return this.i;
   }

   public ezl.a g() {
      return this.g;
   }

   public Optional<yt> h() {
      return this.h;
   }
}
