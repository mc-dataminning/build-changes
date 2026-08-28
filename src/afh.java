import java.util.Optional;

public class afh implements zc<abr> {
   public static final yt<wg, afh> a = zc.a(afh::a, afh::new);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   private final String e;
   private final wv f;
   private final fec.a g;
   private final Optional<yl> h;
   private final int i;

   public afh(fdr $$0, int $$1) {
      this.e = $$0.b();
      this.f = $$0.d();
      this.g = $$0.h();
      this.h = Optional.ofNullable($$0.f());
      this.i = $$1;
   }

   private afh(wg $$0) {
      this.e = $$0.p();
      this.i = $$0.readByte();
      if (this.i != 0 && this.i != 2) {
         this.f = wu.a;
         this.g = fec.a.a;
         this.h = Optional.empty();
      } else {
         this.f = wx.d.decode($$0);
         this.g = $$0.b(fec.a.class);
         this.h = yn.d.decode($$0);
      }
   }

   private void a(wg $$0) {
      $$0.a(this.e);
      $$0.l(this.i);
      if (this.i == 0 || this.i == 2) {
         wx.d.encode($$0, this.f);
         $$0.a(this.g);
         yn.d.encode($$0, this.h);
      }
   }

   @Override
   public ze<afh> a() {
      return agk.aM;
   }

   public void a(abr $$0) {
      $$0.a(this);
   }

   public String b() {
      return this.e;
   }

   public wv e() {
      return this.f;
   }

   public int f() {
      return this.i;
   }

   public fec.a g() {
      return this.g;
   }

   public Optional<yl> h() {
      return this.h;
   }
}
