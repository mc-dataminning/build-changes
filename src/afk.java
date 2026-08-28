import java.util.Optional;

public class afk implements zf<abu> {
   public static final yw<wj, afk> a = zf.a(afk::a, afk::new);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   private final String e;
   private final wy f;
   private final fgk.a g;
   private final Optional<yo> h;
   private final int i;

   public afk(ffz $$0, int $$1) {
      this.e = $$0.c();
      this.f = $$0.e();
      this.g = $$0.i();
      this.h = Optional.ofNullable($$0.g());
      this.i = $$1;
   }

   private afk(wj $$0) {
      this.e = $$0.p();
      this.i = $$0.readByte();
      if (this.i != 0 && this.i != 2) {
         this.f = wx.a;
         this.g = fgk.a.a;
         this.h = Optional.empty();
      } else {
         this.f = xa.d.decode($$0);
         this.g = $$0.b(fgk.a.class);
         this.h = yq.d.decode($$0);
      }
   }

   private void a(wj $$0) {
      $$0.a(this.e);
      $$0.l(this.i);
      if (this.i == 0 || this.i == 2) {
         xa.d.encode($$0, this.f);
         $$0.a(this.g);
         yq.d.encode($$0, this.h);
      }
   }

   @Override
   public zh<afk> a() {
      return agn.aM;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.e;
   }

   public wy e() {
      return this.f;
   }

   public int f() {
      return this.i;
   }

   public fgk.a g() {
      return this.g;
   }

   public Optional<yo> h() {
      return this.h;
   }
}
