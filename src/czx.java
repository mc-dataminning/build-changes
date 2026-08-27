import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class czx extends cvz {
   public static final MapCodec<czx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kb.e.q().fieldOf("host").forGetter(czx::b), u()).apply($$0, czx::new));
   private final cvz b;
   private static final Map<cvz, cvz> c = Maps.newIdentityHashMap();
   private static final Map<dip, dip> d = Maps.newIdentityHashMap();
   private static final Map<dip, dip> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends czx> a() {
      return a;
   }

   public czx(cvz $$0, dio.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public cvz b() {
      return this.b;
   }

   public static boolean h(dip $$0) {
      return c.containsKey($$0.b());
   }

   private void a(amp $$0, hv $$1) {
      ccg $$2 = blj.aJ.a((csy)$$0);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.S();
      }
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, cmh $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.Y().b(csu.h) && cqu.a(cqw.v, $$3) == 0) {
         this.a($$1, $$2);
      }
   }

   public static dip n(dip $$0) {
      return a(d, $$0, () -> c.get($$0.b()).o());
   }

   public dip o(dip $$0) {
      return a(e, $$0, () -> this.b().o());
   }

   private static dip a(Map<dip, dip> $$0, dip $$1, Supplier<dip> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dip $$2x = $$2.get();

         for (djs $$3 : $$1x.B()) {
            $$2x = $$2x.b($$3) ? $$2x.a($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
