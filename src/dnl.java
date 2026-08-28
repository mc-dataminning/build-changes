import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class dnl extends djk {
   public static final MapCodec<dnl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(mb.e.q().fieldOf("host").forGetter(dnl::b), t()).apply($$0, dnl::new));
   private final djk b;
   private static final Map<djk, djk> c = Maps.newIdentityHashMap();
   private static final Map<dwv, dwv> d = Maps.newIdentityHashMap();
   private static final Map<dwv, dwv> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends dnl> a() {
      return a;
   }

   public dnl(djk $$0, dwu.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public djk b() {
      return this.b;
   }

   public static boolean o(dwv $$0) {
      return c.containsKey($$0.b());
   }

   private void a(arc $$0, ji $$1) {
      cmd $$2 = buq.bd.a($$0, bup.k);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.S();
      }
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, cwn $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.O().b(dgc.h) && !dcz.a($$3, awr.t)) {
         this.a($$1, $$2);
      }
   }

   public static dwv p(dwv $$0) {
      return a(d, $$0, () -> c.get($$0.b()).m());
   }

   public dwv q(dwv $$0) {
      return a(e, $$0, () -> this.b().m());
   }

   private static dwv a(Map<dwv, dwv> $$0, dwv $$1, Supplier<dwv> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dwv $$2x = $$2.get();

         for (dxx $$3 : $$1x.F()) {
            $$2x = $$2x.b($$3) ? $$2x.b($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
