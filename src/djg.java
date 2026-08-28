import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class djg extends dfh {
   public static final MapCodec<djg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(lq.e.r().fieldOf("host").forGetter(djg::b), u()).apply($$0, djg::new));
   private final dfh b;
   private static final Map<dfh, dfh> c = Maps.newIdentityHashMap();
   private static final Map<dsk, dsk> d = Maps.newIdentityHashMap();
   private static final Map<dsk, dsk> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends djg> a() {
      return a;
   }

   public djg(dfh $$0, dsj.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public dfh b() {
      return this.b;
   }

   public static boolean m(dsk $$0) {
      return c.containsKey($$0.b());
   }

   private void a(aqm $$0, ja $$1) {
      cjx $$2 = bsm.aM.a((dcf)$$0);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.R();
      }
   }

   @Override
   protected void a(dsk $$0, aqm $$1, ja $$2, cuc $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.ab().b(dcb.h) && !czn.a($$3, avz.t)) {
         this.a($$1, $$2);
      }
   }

   public static dsk n(dsk $$0) {
      return a(d, $$0, () -> c.get($$0.b()).o());
   }

   public dsk o(dsk $$0) {
      return a(e, $$0, () -> this.b().o());
   }

   private static dsk a(Map<dsk, dsk> $$0, dsk $$1, Supplier<dsk> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dsk $$2x = $$2.get();

         for (dtn $$3 : $$1x.B()) {
            $$2x = $$2x.b($$3) ? $$2x.a($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
