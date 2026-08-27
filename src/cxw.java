import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public record cxw(List<cxw.a> c, float d, int e) {
   public static final Codec<cxw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cxw.a.a.listOf().fieldOf("rules").forGetter(cxw::a),
               axu.a(Codec.FLOAT, "default_mining_speed", 1.0F).forGetter(cxw::b),
               axu.a(axu.i, "damage_per_block", Integer.valueOf(1)).forGetter(cxw::c)
            )
            .apply($$0, cxw::new)
   );
   public static final zc<wp, cxw> b = zc.a(cxw.a.b.a(za.a()), cxw::a, za.i, cxw::b, za.g, cxw::c, cxw::new);

   public float a(dtc $$0) {
      for (cxw.a $$1 : this.c) {
         if ($$1.d.isPresent() && $$0.a($$1.c)) {
            return $$1.d.get();
         }
      }

      return this.d;
   }

   public boolean b(dtc $$0) {
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

   public static record a(je<dfc> c, Optional<Float> d, Optional<Boolean> e) {
      public static final Codec<cxw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jp.a(li.f).fieldOf("blocks").forGetter(cxw.a::a),
                  axu.a(axu.k, "speed").forGetter(cxw.a::b),
                  axu.a(Codec.BOOL, "correct_for_drops").forGetter(cxw.a::c)
               )
               .apply($$0, cxw.a::new)
      );
      public static final zc<wp, cxw.a> b = zc.a(za.c(li.f), cxw.a::a, za.i.a(za::a), cxw.a::b, za.b.a(za::a), cxw.a::c, cxw.a::new);

      public static cxw.a a(List<dfc> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.of(true));
      }

      public static cxw.a a(awt<dfc> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.of(true));
      }

      public static cxw.a a(awt<dfc> $$0) {
         return a($$0, Optional.empty(), Optional.of(false));
      }

      public static cxw.a b(awt<dfc> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.empty());
      }

      public static cxw.a b(List<dfc> $$0, float $$1) {
         return a($$0, Optional.of($$1), Optional.empty());
      }

      private static cxw.a a(awt<dfc> $$0, Optional<Float> $$1, Optional<Boolean> $$2) {
         return new cxw.a(lh.e.a($$0), $$1, $$2);
      }

      private static cxw.a a(List<dfc> $$0, Optional<Float> $$1, Optional<Boolean> $$2) {
         return new cxw.a(je.a($$0.stream().map(dfc::r).collect(Collectors.toList())), $$1, $$2);
      }

      public je<dfc> a() {
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
