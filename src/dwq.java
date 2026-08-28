import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dwq extends dlt {
   public static final MapCodec<dwq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyw.q.fieldOf("color").forGetter(dlt::b), t()).apply($$0, dwq::new));
   public static final ecc<jb> b = drd.e;
   private static final Map<jb, fgk> c = fgh.c(dnc.a(16.0, 0.0, 12.5, 14.0, 16.0));

   @Override
   public MapCodec<dwq> a() {
      return a;
   }

   public dwq(cyw $$0, ebd.d $$1) {
      super($$0, $$1);
      this.l(this.C.b().b(b, jb.c));
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      return $$4 == $$0.c(b).g() && !$$0.a($$1, $$3) ? dne.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public ebe a(ddr $$0) {
      ebe $$1 = this.m();
      dka $$2 = $$0.q();
      iv $$3 = $$0.a();
      jb[] $$4 = $$0.f();

      for (jb $$5 : $$4) {
         if ($$5.o().d()) {
            jb $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b);
   }
}
