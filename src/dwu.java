import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dwu extends duo {
   public static final MapCodec<dwu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ecu.a.fieldOf("wood_type").forGetter(duo::d), t()).apply($$0, dwu::new));
   public static final ece<jc> b = drf.e;
   private static final Map<jc.a, fgm> c = fgj.a(dne.a(16.0, 4.0, 14.0, 16.0));
   private static final Map<jc.a, fgm> e = fgj.a(fgj.a(c.get(jc.a.c), dne.a(14.0, 2.0, 0.0, 10.0)));

   @Override
   public MapCodec<dwu> a() {
      return a;
   }

   public dwu(ecu $$0, ebf.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.C.b().b(b, jc.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected but a(daa $$0, ebg $$1, djz $$2, iw $$3, crz $$4, bus $$5, ffo $$6) {
      if ($$2.c_($$3) instanceof dzs $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return but.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(ebg $$0, crz $$1, ffo $$2, dzs $$3, daa $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.h() instanceof czp && !this.a($$2, $$0);
   }

   private boolean a(ffo $$0, ebg $$1) {
      return $$0.c().o() == $$1.c(b).o();
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return e.get($$0.c(b).o());
   }

   @Override
   protected fgm b_(ebg $$0, djd $$1, iw $$2) {
      return this.a($$0, $$1, $$2, ffx.a());
   }

   @Override
   protected fgm b(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return c.get($$0.c(b).o());
   }

   public boolean b(ebg $$0, dkc $$1, iw $$2) {
      jc $$3 = $$0.c(b).h();
      jc $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(dkc $$0, ebg $$1, iw $$2, jc $$3) {
      ebg $$4 = $$0.a_($$2);
      return $$4.a(axg.aC) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dvp.a);
   }

   @Nullable
   @Override
   public ebg a(ddt $$0) {
      ebg $$1 = this.m();
      exq $$2 = $$0.q().b_($$0.a());
      dkc $$3 = $$0.q();
      iw $$4 = $$0.a();

      for (jc $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            jc $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.b(d, Boolean.valueOf($$2.a() == exr.c));
            }
         }
      }

      return null;
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      return $$4.o() == $$0.c(b).h().o() && !$$0.a($$1, $$3) ? dng.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(ebg $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b, d);
   }

   @Override
   public dye a(iw $$0, ebg $$1) {
      return new dzf($$0, $$1);
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dye> dyf<T> a(djz $$0, ebg $$1, dyg<T> $$2) {
      return a($$2, dyg.i, dzs::a);
   }
}
