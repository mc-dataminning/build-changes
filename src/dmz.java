import com.mojang.serialization.MapCodec;

public class dmz extends dpb {
   public static final MapCodec<dmz> a = b(dmz::new);
   public static final int b = 3;
   public static final ecg c = ebw.av;
   private static final fgm[] g = dne.a(3, $$0 -> dne.b(16.0, 0.0, (double)(2 + $$0 * 2)));

   @Override
   public MapCodec<dmz> a() {
      return a;
   }

   public dmz(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected ecg b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected djy d() {
      return dae.ww;
   }

   @Override
   protected void b(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(djz $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(c);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return g[this.h($$0)];
   }
}
