import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dgh extends dde {
   public static final MapCodec<dgh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ld.e.q().fieldOf("potted").forGetter($$0x -> $$0x.e), u()).apply($$0, dgh::new)
   );
   private static final Map<dde, dde> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final eui c = dde.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final dde e;

   @Override
   public MapCodec<dgh> a() {
      return a;
   }

   public dgh(dde $$0, dqg.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return c;
   }

   @Override
   protected bpo a(csz $$0, dqh $$1, dad $$2, in $$3, clh $$4, bpl $$5, etl $$6) {
      dqh $$8 = ($$0.f() instanceof cqx $$7 ? d.getOrDefault($$7.d(), ddg.a) : ddg.a).n();
      if ($$8.i()) {
         return bpo.d;
      } else if (!this.k()) {
         return bpo.b;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, dva.c, $$3);
         $$4.a(avm.ah);
         $$0.a(1, $$4);
         return bpo.a($$2.B);
      }
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      if (this.k()) {
         return bpm.b;
      } else {
         csz $$5 = new csz(this.e);
         if (!$$3.i($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, ddg.fR.n(), 3);
         $$1.a($$3, dva.c, $$2);
         return bpm.a($$1.B);
      }
   }

   @Override
   public csz a(dag $$0, in $$1, dqh $$2) {
      return this.k() ? super.a($$0, $$1, $$2) : new csz(this.e);
   }

   private boolean k() {
      return this.e == ddg.a;
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      return $$1 == is.a && !$$0.a($$3, $$4) ? ddg.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public dde b() {
      return this.e;
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }
}
