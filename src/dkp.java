import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dkp extends dhm {
   public static final MapCodec<dkp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lv.e.q().fieldOf("potted").forGetter($$0x -> $$0x.e), t()).apply($$0, dkp::new)
   );
   private static final Map<dhm, dhm> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final ezq c = dhm.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final dhm e;

   @Override
   public MapCodec<dkp> a() {
      return a;
   }

   public dkp(dhm $$0, dur.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return c;
   }

   @Override
   protected brs a(cvs $$0, dus $$1, dej $$2, jf $$3, cnx $$4, brr $$5, eys $$6) {
      dus $$8 = ($$0.h() instanceof ctu $$7 ? d.getOrDefault($$7.d(), dho.a) : dho.a).n();
      if ($$8.l()) {
         return brs.f;
      } else if (!this.l()) {
         return brs.c;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, dzp.c, $$3);
         $$4.a(awq.ah);
         $$0.a(1, $$4);
         return brs.a;
      }
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      if (this.l()) {
         return brs.c;
      } else {
         cvs $$5 = new cvs(this.e);
         if (!$$3.j($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, dho.fR.n(), 3);
         $$1.a($$3, dzp.c, $$2);
         return brs.a;
      }
   }

   @Override
   public cvs a(dem $$0, jf $$1, dus $$2) {
      return this.l() ? super.a($$0, $$1, $$2) : new cvs(this.e);
   }

   private boolean l() {
      return this.e == dho.a;
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      return $$1 == jk.a && !$$0.a($$3, $$4) ? dho.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public dhm b() {
      return this.e;
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }
}
