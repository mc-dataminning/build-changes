import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class djv extends dfw {
   public static final MapCodec<djv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(lt.e.r().fieldOf("host").forGetter(djv::b), u()).apply($$0, djv::new));
   private final dfw b;
   private static final Map<dfw, dfw> c = Maps.newIdentityHashMap();
   private static final Map<dta, dta> d = Maps.newIdentityHashMap();
   private static final Map<dta, dta> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends djv> a() {
      return a;
   }

   public djv(dfw $$0, dsz.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public dfw b() {
      return this.b;
   }

   public static boolean m(dta $$0) {
      return c.containsKey($$0.b());
   }

   private void a(aqt $$0, jd $$1) {
      cki $$2 = bsw.aM.a((dcu)$$0);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.R();
      }
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, cuo $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.ab().b(dcq.h) && !dac.a($$3, awg.t)) {
         this.a($$1, $$2);
      }
   }

   public static dta n(dta $$0) {
      return a(d, $$0, () -> c.get($$0.b()).o());
   }

   public dta o(dta $$0) {
      return a(e, $$0, () -> this.b().o());
   }

   private static dta a(Map<dta, dta> $$0, dta $$1, Supplier<dta> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dta $$2x = $$2.get();

         for (dud $$3 : $$1x.B()) {
            $$2x = $$2x.b($$3) ? $$2x.a($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
