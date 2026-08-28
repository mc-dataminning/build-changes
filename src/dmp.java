import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class dmp extends dxa {
   public static final MapCodec<dmp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               alq.a(mi.i).fieldOf("fruit").forGetter($$0x -> $$0x.d),
               alq.a(mi.i).fieldOf("stem").forGetter($$0x -> $$0x.e),
               alq.a(mi.K).fieldOf("seed").forGetter($$0x -> $$0x.f),
               t()
            )
            .apply($$0, dmp::new)
   );
   public static final eco<jc> b = drp.e;
   private static final Map<jc, fgw> c = fgt.c(dno.a(4.0, 0.0, 10.0, 0.0, 10.0));
   private final alq<dno> d;
   private final alq<dno> e;
   private final alq<dag> f;

   @Override
   public MapCodec<dmp> a() {
      return a;
   }

   protected dmp(alq<dno> $$0, alq<dno> $$1, alq<dag> $$2, ebp.d $$3) {
      super($$3);
      this.l(this.C.b().b(b, jc.c));
      this.e = $$0;
      this.d = $$1;
      this.f = $$2;
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return c.get($$0.c(b));
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if (!$$6.a(this.d) && $$4 == $$0.c(b)) {
         Optional<dno> $$8 = $$1.J_().f(mi.i).f(this.e);
         if ($$8.isPresent()) {
            return $$8.get().m().c(dvu.c, Integer.valueOf(7));
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean b(ebq $$0, djn $$1, iw $$2) {
      return $$0.a(dnq.cN);
   }

   @Override
   protected dak a(dkm $$0, iw $$1, ebq $$2, boolean $$3) {
      return new dak((dki)DataFixUtils.orElse($$0.J_().f(mi.K).f(this.f), this));
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebq a(ebq $$0, dsr $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b);
   }
}
