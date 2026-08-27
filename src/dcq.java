import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class dcq extends cys {
   public static final MapCodec<dcq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kf.e.q().fieldOf("host").forGetter(dcq::b), u()).apply($$0, dcq::new));
   private final cys b;
   private static final Map<cys, cys> c = Maps.newIdentityHashMap();
   private static final Map<dlj, dlj> d = Maps.newIdentityHashMap();
   private static final Map<dlj, dlj> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends dcq> a() {
      return a;
   }

   public dcq(cys $$0, dli.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public cys b() {
      return this.b;
   }

   public static boolean m(dlj $$0) {
      return c.containsKey($$0.b());
   }

   private void a(aow $$0, hz $$1) {
      cey $$2 = bnw.aK.a((cvr)$$0);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.S();
      }
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, cpd $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.Z().b(cvn.h) && ctn.a(ctp.v, $$3) == 0) {
         this.a($$1, $$2);
      }
   }

   public static dlj n(dlj $$0) {
      return a(d, $$0, () -> c.get($$0.b()).o());
   }

   public dlj o(dlj $$0) {
      return a(e, $$0, () -> this.b().o());
   }

   private static dlj a(Map<dlj, dlj> $$0, dlj $$1, Supplier<dlj> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dlj $$2x = $$2.get();

         for (dmm $$3 : $$1x.B()) {
            $$2x = $$2x.b($$3) ? $$2x.a($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
