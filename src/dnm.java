import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class dnm extends djl {
   public static final MapCodec<dnm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(mb.e.q().fieldOf("host").forGetter(dnm::b), t()).apply($$0, dnm::new));
   private final djl b;
   private static final Map<djl, djl> c = Maps.newIdentityHashMap();
   private static final Map<dww, dww> d = Maps.newIdentityHashMap();
   private static final Map<dww, dww> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends dnm> a() {
      return a;
   }

   public dnm(djl $$0, dwv.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public djl b() {
      return this.b;
   }

   public static boolean o(dww $$0) {
      return c.containsKey($$0.b());
   }

   private void a(ard $$0, ji $$1) {
      cme $$2 = bur.bd.a($$0, buq.k);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.V();
      }
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, cwo $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.O().b(dgd.h) && !dda.a($$3, aws.t)) {
         this.a($$1, $$2);
      }
   }

   public static dww p(dww $$0) {
      return a(d, $$0, () -> c.get($$0.b()).m());
   }

   public dww q(dww $$0) {
      return a(e, $$0, () -> this.b().m());
   }

   private static dww a(Map<dww, dww> $$0, dww $$1, Supplier<dww> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dww $$2x = $$2.get();

         for (dxy $$3 : $$1x.F()) {
            $$2x = $$2x.b($$3) ? $$2x.b($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
