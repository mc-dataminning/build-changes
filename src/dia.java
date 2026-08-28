import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dia extends dex {
   public static final MapCodec<dia> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lp.e.q().fieldOf("potted").forGetter($$0x -> $$0x.e), u()).apply($$0, dia::new)
   );
   private static final Map<dex, dex> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final ewi c = dex.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final dex e;

   @Override
   public MapCodec<dia> a() {
      return a;
   }

   public dia(dex $$0, drz.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return c;
   }

   @Override
   protected bqu a(cun $$0, dsa $$1, dbw $$2, iz $$3, cmv $$4, bqr $$5, evl $$6) {
      dsa $$8 = ($$0.g() instanceof csl $$7 ? d.getOrDefault($$7.d(), dez.a) : dez.a).o();
      if ($$8.i()) {
         return bqu.d;
      } else if (!this.m()) {
         return bqu.b;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, dwt.c, $$3);
         $$4.a(awj.ah);
         $$0.a(1, $$4);
         return bqu.a($$2.B);
      }
   }

   @Override
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      if (this.m()) {
         return bqs.c;
      } else {
         cun $$5 = new cun(this.e);
         if (!$$3.i($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, dez.fR.o(), 3);
         $$1.a($$3, dwt.c, $$2);
         return bqs.a($$1.B);
      }
   }

   @Override
   public cun a(dbz $$0, iz $$1, dsa $$2) {
      return this.m() ? super.a($$0, $$1, $$2) : new cun(this.e);
   }

   private boolean m() {
      return this.e == dez.a;
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !$$0.a($$3, $$4) ? dez.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public dex b() {
      return this.e;
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
      return false;
   }
}
