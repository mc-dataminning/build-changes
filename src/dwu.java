import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dwu extends dly {
   public static final MapCodec<dwu> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(duo.a.b.fieldOf("kind").forGetter(dly::b), t()).apply($$0, dwu::new));
   public static final ecc<jb> d = drd.e;
   private static final Map<jb, fgk> b = fgh.c(dnc.c(8.0, 8.0, 16.0));

   @Override
   public MapCodec<? extends dwu> a() {
      return c;
   }

   protected dwu(duo.a $$0, ebd.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(d, jb.c));
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public ebe a(ddr $$0) {
      ebe $$1 = super.a($$0);
      djb $$2 = $$0.q();
      iv $$3 = $$0.a();
      jb[] $$4 = $$0.f();

      for (jb $$5 : $$4) {
         if ($$5.o().d()) {
            jb $$6 = $$5.g();
            $$1 = $$1.b(d, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
