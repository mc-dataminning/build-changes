import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dhx extends deu {
   public static final MapCodec<dhx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lp.e.q().fieldOf("potted").forGetter($$0x -> $$0x.e), u()).apply($$0, dhx::new)
   );
   private static final Map<deu, deu> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final ewf c = deu.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final deu e;

   @Override
   public MapCodec<dhx> a() {
      return a;
   }

   public dhx(deu $$0, drw.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return c;
   }

   @Override
   protected bqr a(cuk $$0, drx $$1, dbt $$2, iz $$3, cms $$4, bqo $$5, evi $$6) {
      drx $$8 = ($$0.g() instanceof csi $$7 ? d.getOrDefault($$7.d(), dew.a) : dew.a).n();
      if ($$8.i()) {
         return bqr.d;
      } else if (!this.m()) {
         return bqr.b;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, dwq.c, $$3);
         $$4.a(awg.ah);
         $$0.a(1, $$4);
         return bqr.a($$2.B);
      }
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      if (this.m()) {
         return bqp.c;
      } else {
         cuk $$5 = new cuk(this.e);
         if (!$$3.i($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, dew.fR.n(), 3);
         $$1.a($$3, dwq.c, $$2);
         return bqp.a($$1.B);
      }
   }

   @Override
   public cuk a(dbw $$0, iz $$1, drx $$2) {
      return this.m() ? super.a($$0, $$1, $$2) : new cuk(this.e);
   }

   private boolean m() {
      return this.e == dew.a;
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !$$0.a($$3, $$4) ? dew.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public deu b() {
      return this.e;
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }
}
