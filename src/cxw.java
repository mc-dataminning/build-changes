import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public record cxw(List<cxw.a> c, float d, int e) {
   public static final Codec<cxw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cxw.a.a.listOf().fieldOf("rules").forGetter(cxw::a),
               Codec.FLOAT.optionalFieldOf("default_mining_speed", 1.0F).forGetter(cxw::b),
               ayh.k.optionalFieldOf("damage_per_block", 1).forGetter(cxw::c)
            )
            .apply($$0, cxw::new)
   );
   public static final zn<xa, cxw> b = zn.a(cxw.a.b.a(zl.a()), cxw::a, zl.i, cxw::b, zl.g, cxw::c, cxw::new);

   public float a(dse $$0) {
      for (cxw.a $$1 : this.c) {
         if ($$1.d.isPresent() && $$0.a($$1.c)) {
            return $$1.d.get();
         }
      }

      return this.d;
   }

   public boolean b(dse $$0) {
      for (cxw.a $$1 : this.c) {
         if ($$1.e.isPresent() && $$0.a($$1.c)) {
            return $$1.e.get();
         }
      }

      return false;
   }

   public List<cxw.a> a() {
      return this.c;
   }

   public float b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public static record a(jm<dfb> c, Optional<Float> d, Optional<Boolean> e) {
      public static final Codec<cxw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jx.a(lq.f).fieldOf("blocks").forGetter(cxw.a::a),
                  ayh.m.optionalFieldOf("speed").forGetter(cxw.a::b),
                  Codec.BOOL.optionalFieldOf("correct_for_drops").forGetter(cxw.a::c)
               )
               .apply($$0, cxw.a::new)
      );
      public static final zn<xa, cxw.a> b = zn.a(zl.c(lq.f), cxw.a::a, zl.i.a(zl::a), cxw.a::b, zl.b.a(zl::a), cxw.a::c, cxw.a::new);

      public static cxw.a a(List<dfb> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.of(true));
      }

      public static cxw.a a(axf<dfb> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.of(true));
      }

      public static cxw.a a(axf<dfb> $$0) {
         return a($$0, Optional.empty(), Optional.of(false));
      }

      public static cxw.a b(axf<dfb> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.empty());
      }

      public static cxw.a b(List<dfb> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.empty());
      }

      private static cxw.a a(axf<dfb> $$0, Optional<Float> $$1, Optional<Boolean> $$2) {
         return new cxw.a(lp.e.a($$0), $$1, $$2);
      }

      private static cxw.a a(List<dfb> $$0, Optional<Float> $$1, Optional<Boolean> $$2) {
         return new cxw.a(jm.a($$0.stream().map(dfb::s).collect(Collectors.toList())), $$1, $$2);
      }

      public jm<dfb> a() {
         return this.c;
      }

      public Optional<Float> b() {
         return this.d;
      }

      public Optional<Boolean> c() {
         return this.e;
      }
   }
}
