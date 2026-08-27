import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class cxx extends cua {
   public static final MapCodec<cxx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(jy.f.q().fieldOf("host").forGetter(cxx::b), t()).apply($$0, cxx::new));
   private final cua b;
   private static final Map<cua, cua> c = Maps.newIdentityHashMap();
   private static final Map<dgb, dgb> d = Maps.newIdentityHashMap();
   private static final Map<dgb, dgb> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends cxx> a() {
      return a;
   }

   public cxx(cua $$0, dga.d $$1) {
      super($$1.e($$0.w() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public cua b() {
      return this.b;
   }

   public static boolean h(dgb $$0) {
      return c.containsKey($$0.b());
   }

   private void a(alq $$0, ht $$1) {
      cas $$2 = bjx.aI.a((cqz)$$0);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.Q();
      }
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ckj $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.X().b(cqv.g) && cov.a(cox.v, $$3) == 0) {
         this.a($$1, $$2);
      }
   }

   public static dgb n(dgb $$0) {
      return a(d, $$0, () -> c.get($$0.b()).o());
   }

   public dgb o(dgb $$0) {
      return a(e, $$0, () -> this.b().o());
   }

   private static dgb a(Map<dgb, dgb> $$0, dgb $$1, Supplier<dgb> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dgb $$2x = $$2.get();

         for (dhe $$3 : $$1x.B()) {
            $$2x = $$2x.b($$3) ? $$2x.a($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
