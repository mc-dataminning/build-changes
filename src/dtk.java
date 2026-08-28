import com.mojang.serialization.MapCodec;

public class dtk extends dlu {
   public static final MapCodec<dtk> b = b(dtk::new);
   public static final eaf c = eae.E;

   @Override
   protected MapCodec<? extends dtk> a() {
      return b;
   }

   protected dtk(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, Boolean.valueOf(false)));
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      return $$4 == ja.b ? $$0.b(c, Boolean.valueOf(o($$6))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dzo a(dcl $$0) {
      dzo $$1 = $$0.q().a_($$0.a().d());
      return this.m().b(c, Boolean.valueOf(o($$1)));
   }

   protected static boolean o(dzo $$0) {
      return $$0.a(axa.bB);
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(c);
   }
}
