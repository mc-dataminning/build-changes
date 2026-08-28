import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dws extends dlv {
   public static final MapCodec<dws> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyy.q.fieldOf("color").forGetter(dlv::b), t()).apply($$0, dws::new));
   public static final ece<jc> b = drf.e;
   private static final Map<jc, fgm> c = fgj.c(dne.a(16.0, 0.0, 12.5, 14.0, 16.0));

   @Override
   public MapCodec<dws> a() {
      return a;
   }

   public dws(cyy $$0, ebf.d $$1) {
      super($$0, $$1);
      this.l(this.C.b().b(b, jc.c));
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      return $$4 == $$0.c(b).g() && !$$0.a($$1, $$3) ? dng.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public ebg a(ddt $$0) {
      ebg $$1 = this.m();
      dkc $$2 = $$0.q();
      iw $$3 = $$0.a();
      jc[] $$4 = $$0.f();

      for (jc $$5 : $$4) {
         if ($$5.o().d()) {
            jc $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
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
      $$0.a(b);
   }
}
