import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class did extends dfa {
   public static final MapCodec<did> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lp.e.q().fieldOf("potted").forGetter($$0x -> $$0x.e), u()).apply($$0, did::new)
   );
   private static final Map<dfa, dfa> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final ewl c = dfa.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final dfa e;

   @Override
   public MapCodec<did> a() {
      return a;
   }

   public did(dfa $$0, dsc.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return c;
   }

   @Override
   protected bqx a(cuq $$0, dsd $$1, dbz $$2, iz $$3, cmy $$4, bqu $$5, evo $$6) {
      dsd $$8 = ($$0.g() instanceof cso $$7 ? d.getOrDefault($$7.d(), dfc.a) : dfc.a).o();
      if ($$8.i()) {
         return bqx.d;
      } else if (!this.m()) {
         return bqx.b;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, dww.c, $$3);
         $$4.a(awk.ah);
         $$0.a(1, $$4);
         return bqx.a($$2.B);
      }
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      if (this.m()) {
         return bqv.c;
      } else {
         cuq $$5 = new cuq(this.e);
         if (!$$3.i($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, dfc.fR.o(), 3);
         $$1.a($$3, dww.c, $$2);
         return bqv.a($$1.B);
      }
   }

   @Override
   public cuq a(dcc $$0, iz $$1, dsd $$2) {
      return this.m() ? super.a($$0, $$1, $$2) : new cuq(this.e);
   }

   private boolean m() {
      return this.e == dfc.a;
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !$$0.a($$3, $$4) ? dfc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public dfa b() {
      return this.e;
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return false;
   }
}
