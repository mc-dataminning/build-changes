import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Supplier;

public class dje extends dff {
   public static final MapCodec<dje> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(lq.e.r().fieldOf("host").forGetter(dje::b), u()).apply($$0, dje::new));
   private final dff b;
   private static final Map<dff, dff> c = Maps.newIdentityHashMap();
   private static final Map<dsh, dsh> d = Maps.newIdentityHashMap();
   private static final Map<dsh, dsh> e = Maps.newIdentityHashMap();

   @Override
   public MapCodec<? extends dje> a() {
      return a;
   }

   public dje(dff $$0, dsg.d $$1) {
      super($$1.e($$0.x() / 2.0F).f(0.75F));
      this.b = $$0;
      c.put($$0, this);
   }

   public dff b() {
      return this.b;
   }

   public static boolean m(dsh $$0) {
      return c.containsKey($$0.b());
   }

   private void a(aqk $$0, ja $$1) {
      cju $$2 = bsj.aM.a((dcd)$$0);
      if ($$2 != null) {
         $$2.b((double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, 0.0F, 0.0F);
         $$0.b($$2);
         $$2.R();
      }
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, cua $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$1.ab().b(dbz.h) && !czl.a($$3, avx.t)) {
         this.a($$1, $$2);
      }
   }

   public static dsh n(dsh $$0) {
      return a(d, $$0, () -> c.get($$0.b()).o());
   }

   public dsh o(dsh $$0) {
      return a(e, $$0, () -> this.b().o());
   }

   private static dsh a(Map<dsh, dsh> $$0, dsh $$1, Supplier<dsh> $$2) {
      return $$0.computeIfAbsent($$1, $$1x -> {
         dsh $$2x = $$2.get();

         for (dtk $$3 : $$1x.B()) {
            $$2x = $$2x.b($$3) ? $$2x.a($$3, $$1x.c($$3)) : $$2x;
         }

         return $$2x;
      });
   }
}
