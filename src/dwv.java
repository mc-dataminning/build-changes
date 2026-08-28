import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dwv extends duo {
   public static final MapCodec<dwv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ecu.a.fieldOf("wood_type").forGetter(duo::d), t()).apply($$0, dwv::new));
   public static final ece<jc> b = drf.e;
   private static final Map<jc, fgm> c = fgj.c(dne.a(16.0, 4.5, 12.5, 14.0, 16.0));

   @Override
   public MapCodec<dwv> a() {
      return a;
   }

   public dwv(ecu $$0, ebf.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.C.b().b(b, jc.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return c.get($$0.c(b));
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public ebg a(ddt $$0) {
      ebg $$1 = this.m();
      exq $$2 = $$0.q().b_($$0.a());
      dkc $$3 = $$0.q();
      iw $$4 = $$0.a();
      jc[] $$5 = $$0.f();

      for (jc $$6 : $$5) {
         if ($$6.o().d()) {
            jc $$7 = $$6.g();
            $$1 = $$1.b(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.b(d, Boolean.valueOf($$2.a() == exr.c));
            }
         }
      }

      return null;
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      return $$4.g() == $$0.c(b) && !$$0.a($$1, $$3) ? dng.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(ebg $$0) {
      return $$0.c(b).p();
   }

   @Override
   public ffs o(ebg $$0) {
      return c.get($$0.c(b)).a().f();
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
}
