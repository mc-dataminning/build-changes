import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class doa extends dma {
   public static final MapCodec<doa> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dtq.a.fieldOf("wood_type").forGetter(dma::d), u()).apply($$0, doa::new));
   public static final dsx b = diw.aE;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<je, ewl> i = Maps.newEnumMap(
      ImmutableMap.of(
         je.c,
         dfa.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         je.d,
         dfa.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         je.f,
         dfa.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         je.e,
         dfa.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<doa> a() {
      return a;
   }

   public doa(dtq $$0, dsc.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, je.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return i.get($$0.c(b));
   }

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dsd a(cyb $$0) {
      dsd $$1 = this.o();
      enw $$2 = $$0.q().b_($$0.a());
      dcc $$3 = $$0.q();
      iz $$4 = $$0.a();
      je[] $$5 = $$0.f();

      for (je $$6 : $$5) {
         if ($$6.o().d()) {
            je $$7 = $$6.g();
            $$1 = $$1.a(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == enx.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? dfc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dsd $$0) {
      return $$0.c(b).p();
   }

   @Override
   public evs m(dsd $$0) {
      ewl $$1 = i.get($$0.c(b));
      return $$1.a().f();
   }

   @Override
   protected dsd a(dsd $$0, dln $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsd a(dsd $$0, djx $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b, f);
   }
}
