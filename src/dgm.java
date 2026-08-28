import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgm extends def {
   public static final MapCodec<dgm> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgj.a.forGetter($$0x -> $$0x.f), u()).apply($$0, dgm::new));
   private final deu f;

   @Override
   public MapCodec<dgm> a() {
      return e;
   }

   protected dgm(deu $$0, drw.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      this.a($$0, (dbu)$$1, $$2);
   }

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.f.n().a(d, Boolean.valueOf(false)).a(c, $$0.c(c)), 2);
      }
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$1.g() == $$0.c(c) && !$$0.a($$3, $$4)) {
         return dew.a.n();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, enr.c, enr.c.a($$3));
         }

         this.a($$0, $$3, $$4);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
