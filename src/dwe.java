import com.mojang.serialization.MapCodec;

public class dwe extends dpb {
   public static final MapCodec<dwe> a = b(dwe::new);
   public static final int b = 1;
   public static final ecg c = ebw.at;
   private static final fgm[] g = dne.a(1, $$0 -> dne.b(6.0, 0.0, (double)(6 + $$0 * 4)));
   private static final int h = 1;

   @Override
   public MapCodec<dwe> a() {
      return a;
   }

   public dwe(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(c);
   }

   @Override
   public fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return g[this.h($$0)];
   }

   @Override
   protected ecg b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected djy d() {
      return dae.wt;
   }

   @Override
   public ebg b(int $$0) {
      return $$0 == 2 ? dng.cc.m() : super.b($$0);
   }

   @Override
   public void b(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(djz $$0) {
      return 1;
   }
}
