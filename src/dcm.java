import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class dcm extends cyo {
   public static final MapCodec<dcm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kf.e.q().fieldOf("host").forGetter(dcm::b), u()).apply($$0, dcm::new));
   private final cyo b;
   private static final Map<cyo, cyo> c = Maps.newIdentityHashMap();
   private static final Map<dlf, dlf> d = Maps.newIdentityHashMap();
   private static final Map<dlf, dlf> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends dcm> a() {
      return a;
   }

   public dcm(cyo $$0, dle.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public cyo b() {
      return this.b;
   }

   public static boolean m(dlf $$0) {
      return c.containsKey($$0.b());
   }

   private void a(aov $$0, hz $$1) {
      ceu $$2 = bnu.aK.a((cvn)$$0);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.S();
      }
   }

   @Override
   protected void a(dlf $$0, aov $$1, hz $$2, coz $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.Z().b(cvj.h) && ctj.a(ctl.v, $$3) == 0) {
         this.a($$1, $$2);
      }
   }

   public static dlf n(dlf $$0) {
      return a(d, $$0, () -> c.get($$0.b()).o());
   }

   public dlf o(dlf $$0) {
      return a(e, $$0, () -> this.b().o());
   }

   private static dlf a(Map<dlf, dlf> $$0, dlf $$1, Supplier<dlf> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dlf $$2x = $$2.get();

         for (dmi $$3 : $$1x.B()) {
            $$2x = $$2x.b($$3) ? $$2x.a($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
