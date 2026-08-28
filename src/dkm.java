import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dkm extends dhj {
   public static final MapCodec<dkm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lu.e.q().fieldOf("potted").forGetter($$0x -> $$0x.e), u()).apply($$0, dkm::new)
   );
   private static final Map<dhj, dhj> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final ezm c = dhj.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final dhj e;

   @Override
   public MapCodec<dkm> a() {
      return a;
   }

   public dkm(dhj $$0, dun.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return c;
   }

   @Override
   protected brp a(cvp $$0, duo $$1, deg $$2, je $$3, cnu $$4, bro $$5, eyo $$6) {
      duo $$8 = ($$0.h() instanceof ctr $$7 ? d.getOrDefault($$7.d(), dhl.a) : dhl.a).o();
      if ($$8.l()) {
         return brp.f;
      } else if (!this.l()) {
         return brp.c;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, dzl.c, $$3);
         $$4.a(awo.ah);
         $$0.a(1, $$4);
         return brp.a;
      }
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      if (this.l()) {
         return brp.c;
      } else {
         cvp $$5 = new cvp(this.e);
         if (!$$3.j($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, dhl.fR.o(), 3);
         $$1.a($$3, dzl.c, $$2);
         return brp.a;
      }
   }

   @Override
   public cvp a(dej $$0, je $$1, duo $$2) {
      return this.l() ? super.a($$0, $$1, $$2) : new cvp(this.e);
   }

   private boolean l() {
      return this.e == dhl.a;
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      return $$1 == jj.a && !$$0.a($$3, $$4) ? dhl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public dhj b() {
      return this.e;
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }
}
