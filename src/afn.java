import java.util.Optional;

public class afn implements zl<aca> {
   public static final zc<wp, afn> a = zl.a(afn::a, afn::new);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   private final String e;
   private final xe f;
   private final fae.a g;
   private final Optional<yu> h;
   private final int i;

   public afn(ezt $$0, int $$1) {
      this.e = $$0.b();
      this.f = $$0.d();
      this.g = $$0.h();
      this.h = Optional.ofNullable($$0.f());
      this.i = $$1;
   }

   private afn(wp $$0) {
      this.e = $$0.p();
      this.i = $$0.readByte();
      if (this.i != 0 && this.i != 2) {
         this.f = xd.a;
         this.g = fae.a.a;
         this.h = Optional.empty();
      } else {
         this.f = xg.d.decode($$0);
         this.g = $$0.b(fae.a.class);
         this.h = yw.d.decode($$0);
      }
   }

   private void a(wp $$0) {
      $$0.a(this.e);
      $$0.l(this.i);
      if (this.i == 0 || this.i == 2) {
         xg.d.encode($$0, this.f);
         $$0.a(this.g);
         yw.d.encode($$0, this.h);
      }
   }

   @Override
   public zn<afn> a() {
      return agp.aJ;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.e;
   }

   public xe e() {
      return this.f;
   }

   public int f() {
      return this.i;
   }

   public fae.a g() {
      return this.g;
   }

   public Optional<yu> h() {
      return this.h;
   }
}
