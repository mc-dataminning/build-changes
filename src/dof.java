import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dof extends duo {
   public static final MapCodec<dof> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ecu.a.fieldOf("wood_type").forGetter(duo::d), t()).apply($$0, dof::new));
   public static final ecg b = ebw.bd;
   public static final ebx c = ebw.a;
   private static final fgm e = dne.b(10.0, 0.0, 16.0);
   private static final Map<Integer, fgm> f = fgj.c(dne.a(14.0, 2.0, 0.0, 10.0))
      .entrySet()
      .stream()
      .collect(Collectors.toMap($$0 -> ecm.a($$0.getKey()), Entry::getValue));

   @Override
   public MapCodec<dof> a() {
      return a;
   }

   public dof(ecu $$0, ebf.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.C.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected but a(daa $$0, ebg $$1, djz $$2, iw $$3, crz $$4, bus $$5, ffo $$6) {
      if ($$2.c_($$3) instanceof dzs $$7 && this.a($$4, $$6, $$7, $$0)) {
         return but.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(crz $$0, ffo $$1, dzs $$2, daa $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.h() instanceof czp && $$1.c().equals(jc.a);
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      return $$1.a_($$2.d()).a($$1, $$2.d(), jc.a, dvp.b);
   }

   @Override
   public ebg a(ddt $$0) {
      djz $$1 = $$0.q();
      exq $$2 = $$1.b_($$0.a());
      iw $$3 = $$0.a().d();
      ebg $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(axg.aD);
      jc $$6 = jc.a((double)$$0.i());
      boolean $$7 = !dne.a($$4.g($$1, $$3), jc.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dwu.b)) {
            jc $$8 = $$4.c(dwu.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<jc> $$9 = ecm.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? ecm.a($$6.g()) : ecm.a($$0.i() + 180.0F);
      return this.m().b(c, Boolean.valueOf($$7)).b(b, Integer.valueOf($$10)).b(d, Boolean.valueOf($$2.a() == exr.c));
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return f.getOrDefault($$0.c(b), e);
   }

   @Override
   protected fgm b_(ebg $$0, djd $$1, iw $$2) {
      return this.a($$0, $$1, $$2, ffx.a());
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      return $$4 == jc.b && !this.a($$0, $$1, $$3) ? dng.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(ebg $$0) {
      return ecm.b($$0.c(b));
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dye a(iw $$0, ebg $$1) {
      return new dzf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dye> dyf<T> a(djz $$0, ebg $$1, dyg<T> $$2) {
      return a($$2, dyg.i, dzs::a);
   }
}
