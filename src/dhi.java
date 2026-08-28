import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dhi extends dis {
   public static final MapCodec<dhi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lt.e.r().fieldOf("concrete").forGetter($$0x -> $$0x.b), u()).apply($$0, dhi::new)
   );
   private final dfw b;

   @Override
   public MapCodec<dhi> a() {
      return a;
   }

   public dhi(dfw $$0, dsz.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(dcu $$0, jd $$1, dta $$2, dta $$3, cje $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.o(), 3);
      }
   }

   @Override
   public dta a(cyb $$0) {
      dca $$1 = $$0.q();
      jd $$2 = $$0.a();
      dta $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.o() : super.a($$0);
   }

   private static boolean a(dca $$0, jd $$1, dta $$2) {
      return n($$2) || a($$0, $$1);
   }

   private static boolean a(dca $$0, jd $$1) {
      boolean $$2 = false;
      jd.a $$3 = $$1.j();

      for (ji $$4 : ji.values()) {
         dta $$5 = $$0.a_($$3);
         if ($$4 != ji.a || n($$5)) {
            $$3.a($$1, $$4);
            $$5 = $$0.a_($$3);
            if (n($$5) && !$$5.d($$0, $$1, $$4.g())) {
               $$2 = true;
               break;
            }
         }
      }

      return $$2;
   }

   private static boolean n(dta $$0) {
      return $$0.u().a(awj.a);
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      return a($$3, $$4) ? this.b.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int b(dta $$0, dca $$1, jd $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
