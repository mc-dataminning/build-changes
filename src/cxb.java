import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class cxb extends cua {
   public static final MapCodec<cxb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jy.f.q().fieldOf("potted").forGetter($$0x -> $$0x.e), t()).apply($$0, cxb::new)
   );
   private static final Map<cua, cua> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final eiy c = cua.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final cua e;

   @Override
   public MapCodec<cxb> a() {
      return a;
   }

   public cxb(cua $$0, dga.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return c;
   }

   @Override
   public dae b_(dgb $$0) {
      return dae.c;
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      ckj $$6 = $$3.b($$4);
      cke $$7 = $$6.d();
      dgb $$8 = ($$7 instanceof cic ? d.getOrDefault(((cic)$$7).e(), cuc.a) : cuc.a).o();
      boolean $$9 = $$8.a(cuc.a);
      boolean $$10 = this.g();
      if ($$9 != $$10) {
         if ($$10) {
            $$1.a($$2, $$8, 3);
            $$3.a(aqn.ah);
            if (!$$3.fT().d) {
               $$6.h(1);
            }
         } else {
            ckj $$11 = new ckj(this.e);
            if ($$6.b()) {
               $$3.a($$4, $$11);
            } else if (!$$3.i($$11)) {
               $$3.a($$11, false);
            }

            $$1.a($$2, cuc.fR.o(), 3);
         }

         $$1.a($$3, dkl.c, $$2);
         return bib.a($$1.B);
      } else {
         return bib.b;
      }
   }

   @Override
   public ckj a(crc $$0, ht $$1, dgb $$2) {
      return this.g() ? super.a($$0, $$1, $$2) : new ckj(this.e);
   }

   private boolean g() {
      return this.e == cuc.a;
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      return $$1 == hx.a && !$$0.a($$3, $$4) ? cuc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public cua b() {
      return this.e;
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return false;
   }
}
