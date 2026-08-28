import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class drs extends dno {
   public static final MapCodec<drs> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(mh.e.q().fieldOf("host").forGetter(drs::b), t()).apply($$0, drs::new));
   private final dno b;
   private static final Map<dno, dno> c = Maps.newIdentityHashMap();
   private static final Map<ebq, ebq> d = Maps.newIdentityHashMap();
   private static final Map<ebq, ebq> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends drs> a() {
      return a;
   }

   public drs(dno $$0, ebp.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public dno b() {
      return this.b;
   }

   public static boolean o(ebq $$0) {
      return c.containsKey($$0.b());
   }

   private void a(asb $$0, iw $$1) {
      cpr $$2 = bxn.bf.a($$0, bxm.k);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.U();
      }
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, dak $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.O().c(dkf.i) && !dgz.a($$3, axp.t)) {
         this.a($$1, $$2);
      }
   }

   public static ebq p(ebq $$0) {
      return a(d, $$0, () -> c.get($$0.b()).m());
   }

   public ebq q(ebq $$0) {
      return a(e, $$0, () -> this.b().m());
   }

   private static ebq a(Map<ebq, ebq> $$0, ebq $$1, Supplier<ebq> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         ebq $$2x = $$2.get();

         for (ect $$3 : $$1x.F()) {
            $$2x = $$2x.b($$3) ? $$2x.b($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
