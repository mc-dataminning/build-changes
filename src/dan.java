import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class dan extends cwp {
   public static final MapCodec<dan> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kd.e.q().fieldOf("host").forGetter(dan::b), u()).apply($$0, dan::new));
   private final cwp b;
   private static final Map<cwp, cwp> c = Maps.newIdentityHashMap();
   private static final Map<djg, djg> d = Maps.newIdentityHashMap();
   private static final Map<djg, djg> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends dan> a() {
      return a;
   }

   public dan(cwp $$0, djf.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public cwp b() {
      return this.b;
   }

   public static boolean h(djg $$0) {
      return c.containsKey($$0.b());
   }

   private void a(and $$0, hx $$1) {
      ccv $$2 = bly.aJ.a((cto)$$0);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.S();
      }
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, cmx $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.Z().b(ctk.h) && crk.a(crm.v, $$3) == 0) {
         this.a($$1, $$2);
      }
   }

   public static djg n(djg $$0) {
      return a(d, $$0, () -> c.get($$0.b()).o());
   }

   public djg o(djg $$0) {
      return a(e, $$0, () -> this.b().o());
   }

   private static djg a(Map<djg, djg> $$0, djg $$1, Supplier<djg> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         djg $$2x = $$2.get();

         for (dkj $$3 : $$1x.B()) {
            $$2x = $$2x.b($$3) ? $$2x.a($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
