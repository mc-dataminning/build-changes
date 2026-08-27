import com.google.common.base.Predicates;
import com.mojang.serialization.MapCodec;

public class cyy extends cwj {
   public static final MapCodec<cyy> a = b(cyy::new);
   public static final dju b = dae.aE;
   public static final djr c = djq.h;
   protected static final emf d = cwj.a(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
   protected static final emf e = cwj.a(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
   protected static final emf f = emc.a(d, e);
   private static djf g;

   @Override
   public MapCodec<cyy> a() {
      return a;
   }

   public cyy(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(dja $$0) {
      return true;
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return $$0.c(c) ? f : d;
   }

   @Override
   public dja a(cpa $$0) {
      return this.o().a(b, $$0.g().g()).a(c, Boolean.valueOf(false));
   }

   @Override
   public boolean d_(dja $$0) {
      return true;
   }

   @Override
   public int a(dja $$0, cti $$1, hx $$2) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b, c);
   }

   public static djf b() {
      if (g == null) {
         g = djg.a()
            .a("?vvv?", ">???<", ">???<", ">???<", "?^^^?")
            .a('?', dje.a(djj.a))
            .a('^', dje.a(djj.a(cwl.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ic.d))))
            .a('>', dje.a(djj.a(cwl.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ic.e))))
            .a('v', dje.a(djj.a(cwl.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ic.c))))
            .a('<', dje.a(djj.a(cwl.fy).a(c, Predicates.equalTo(true)).a(b, Predicates.equalTo(ic.f))))
            .b();
      }

      return g;
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return false;
   }
}
