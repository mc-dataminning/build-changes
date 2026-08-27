import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class cyr extends cut {
   public static final MapCodec<cyr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(jy.f.q().fieldOf("host").forGetter(cyr::b), t()).apply($$0, cyr::new));
   private final cut b;
   private static final Map<cut, cut> c = Maps.newIdentityHashMap();
   private static final Map<dgw, dgw> d = Maps.newIdentityHashMap();
   private static final Map<dgw, dgw> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends cyr> a() {
      return a;
   }

   public cyr(cut $$0, dgv.d $$1) {
      super($$1.e($$0.w() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public cut b() {
      return this.b;
   }

   public static boolean h(dgw $$0) {
      return c.containsKey($$0.b());
   }

   private void a(ama $$0, ht $$1) {
      cbh $$2 = bkm.aI.a((crs)$$0);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.Q();
      }
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, clb $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.X().b(cro.h) && cpo.a(cpq.v, $$3) == 0) {
         this.a($$1, $$2);
      }
   }

   public static dgw n(dgw $$0) {
      return a(d, $$0, () -> c.get($$0.b()).o());
   }

   public dgw o(dgw $$0) {
      return a(e, $$0, () -> this.b().o());
   }

   private static dgw a(Map<dgw, dgw> $$0, dgw $$1, Supplier<dgw> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dgw $$2x = $$2.get();

         for (dhz $$3 : $$1x.B()) {
            $$2x = $$2x.b($$3) ? $$2x.a($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
