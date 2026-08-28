import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class djh extends dfi {
   public static final MapCodec<djh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(lq.e.r().fieldOf("host").forGetter(djh::b), u()).apply($$0, djh::new));
   private final dfi b;
   private static final Map<dfi, dfi> c = Maps.newIdentityHashMap();
   private static final Map<dsl, dsl> d = Maps.newIdentityHashMap();
   private static final Map<dsl, dsl> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends djh> a() {
      return a;
   }

   public djh(dfi $$0, dsk.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public dfi b() {
      return this.b;
   }

   public static boolean m(dsl $$0) {
      return c.containsKey($$0.b());
   }

   private void a(aqm $$0, ja $$1) {
      cjy $$2 = bsn.aM.a((dcg)$$0);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.R();
      }
   }

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, cud $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.ab().b(dcc.h) && !czo.a($$3, avz.t)) {
         this.a($$1, $$2);
      }
   }

   public static dsl n(dsl $$0) {
      return a(d, $$0, () -> c.get($$0.b()).o());
   }

   public dsl o(dsl $$0) {
      return a(e, $$0, () -> this.b().o());
   }

   private static dsl a(Map<dsl, dsl> $$0, dsl $$1, Supplier<dsl> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dsl $$2x = $$2.get();

         for (dto $$3 : $$1x.B()) {
            $$2x = $$2x.b($$3) ? $$2x.a($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
