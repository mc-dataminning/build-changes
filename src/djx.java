import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class djx extends dfy {
   public static final MapCodec<djx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(lt.e.r().fieldOf("host").forGetter(djx::b), u()).apply($$0, djx::new));
   private final dfy b;
   private static final Map<dfy, dfy> c = Maps.newIdentityHashMap();
   private static final Map<dtc, dtc> d = Maps.newIdentityHashMap();
   private static final Map<dtc, dtc> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends djx> a() {
      return a;
   }

   public djx(dfy $$0, dtb.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public dfy b() {
      return this.b;
   }

   public static boolean m(dtc $$0) {
      return c.containsKey($$0.b());
   }

   private void a(aqu $$0, jd $$1) {
      ckk $$2 = bsx.aM.a((dcw)$$0);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.T();
      }
   }

   @Override
   protected void a(dtc $$0, aqu $$1, jd $$2, cuq $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.ab().b(dcs.h) && !dae.a($$3, awh.t)) {
         this.a($$1, $$2);
      }
   }

   public static dtc n(dtc $$0) {
      return a(d, $$0, () -> c.get($$0.b()).o());
   }

   public dtc o(dtc $$0) {
      return a(e, $$0, () -> this.b().o());
   }

   private static dtc a(Map<dtc, dtc> $$0, dtc $$1, Supplier<dtc> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dtc $$2x = $$2.get();

         for (duf $$3 : $$1x.B()) {
            $$2x = $$2x.b($$3) ? $$2x.a($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
