import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dii extends dgh implements dnx {
   public static final MapCodec<dii> a = b(dii::new);
   public static final dur b = duq.C;
   private static final int d = 3;
   protected static final eyx c = dgv.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dii> a() {
      return a;
   }

   public dii(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b);
   }

   @Override
   public dre a(je $$0, dua $$1) {
      return new drq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dre> drf<T> a(dds $$0, dua $$1, drg<T> $$2) {
      return a($$2, drg.z, $$0.B ? drq::a : drq::b);
   }

   @Override
   protected dnc a_(dua $$0) {
      return dnc.b;
   }

   @Override
   protected eqb b_(dua $$0) {
      return $$0.c(b) ? eqc.c.a(false) : super.b_($$0);
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eqc.c, eqc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return c;
   }

   @Nullable
   @Override
   public dua a(cyw $$0) {
      eqb $$1 = $$0.q().b_($$0.a());
      return this.o().b(b, Boolean.valueOf($$1.a(awy.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return false;
   }
}
