import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dhb extends ddy {
   public static final MapCodec<dhb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(le.e.q().fieldOf("potted").forGetter($$0x -> $$0x.e), u()).apply($$0, dhb::new)
   );
   private static final Map<ddy, ddy> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final evd c = ddy.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final ddy e;

   @Override
   public MapCodec<dhb> a() {
      return a;
   }

   public dhb(ddy $$0, dra.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return c;
   }

   @Override
   protected bpw a(cto $$0, drb $$1, dax $$2, io $$3, clw $$4, bpt $$5, eug $$6) {
      drb $$8 = ($$0.g() instanceof crm $$7 ? d.getOrDefault($$7.d(), dea.a) : dea.a).n();
      if ($$8.i()) {
         return bpw.d;
      } else if (!this.l()) {
         return bpw.b;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, dvu.c, $$3);
         $$4.a(avr.ah);
         $$0.a(1, $$4);
         return bpw.a($$2.B);
      }
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      if (this.l()) {
         return bpu.b;
      } else {
         cto $$5 = new cto(this.e);
         if (!$$3.i($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, dea.fR.n(), 3);
         $$1.a($$3, dvu.c, $$2);
         return bpu.a($$1.B);
      }
   }

   @Override
   public cto a(dba $$0, io $$1, drb $$2) {
      return this.l() ? super.a($$0, $$1, $$2) : new cto(this.e);
   }

   private boolean l() {
      return this.e == dea.a;
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      return $$1 == it.a && !$$0.a($$3, $$4) ? dea.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ddy b() {
      return this.e;
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }
}
