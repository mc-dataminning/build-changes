import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ejb extends eir {
   public static final Codec<ejb> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  atx.a(Codec.unboundedMap(kd.f.r(), ela.a), "enchantments", Map.of()).forGetter($$0x -> $$0x.b),
                  Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, ejb::new)
   );
   private final Map<ih<crr>, ekz> b;
   private final boolean c;

   ejb(List<eke> $$0, Map<ih<crr>, ekz> $$1, boolean $$2) {
      super($$0);
      this.b = Map.copyOf($$1);
      this.c = $$2;
   }

   @Override
   public eit b() {
      return eiu.f;
   }

   @Override
   public Set<ejn<?>> a() {
      return this.b.values().stream().flatMap($$0 -> $$0.a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cng a(cng $$0, ehf $$1) {
      Object2IntMap<crr> $$2 = new Object2IntOpenHashMap();
      this.b.forEach(($$2x, $$3) -> $$2.put((crr)$$2x.a(), $$3.a($$1)));
      if ($$0.d() == cnj.qO) {
         cng $$3 = new cng(cnj.us);
         $$2.forEach(($$1x, $$2x) -> cmd.a($$3, new cru($$1x, $$2x)));
         return $$3;
      } else {
         Map<crr, Integer> $$4 = crt.a($$0);
         if (this.c) {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$4.getOrDefault($$1x, 0) + $$2x, 0)));
         } else {
            $$2.forEach(($$1x, $$2x) -> a($$4, $$1x, Math.max($$2x, 0)));
         }

         crt.a($$4, $$0);
         return $$0;
      }
   }

   private static void a(Map<crr, Integer> $$0, crr $$1, int $$2) {
      if ($$2 == 0) {
         $$0.remove($$1);
      } else {
         $$0.put($$1, $$2);
      }
   }

   public static class a extends eir.a<ejb.a> {
      private final Builder<ih<crr>, ekz> a = ImmutableMap.builder();
      private final boolean b;

      public a() {
         this(false);
      }

      public a(boolean $$0) {
         this.b = $$0;
      }

      protected ejb.a a() {
         return this;
      }

      public ejb.a a(crr $$0, ekz $$1) {
         this.a.put($$0.j(), $$1);
         return this;
      }

      @Override
      public eis b() {
         return new ejb(this.g(), this.a.build(), this.b);
      }
   }
}
