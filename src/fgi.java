import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class fgi extends eym {
   public static final String a = "scoreboard";
   private final fgh b;

   public fgi(fgh $$0) {
      this.b = $$0;
   }

   public void a(fgi.a $$0) {
      $$0.a().forEach(this.b::a);
      $$0.b().forEach(this.b::a);
      $$0.c().forEach(($$0x, $$1) -> {
         ffz $$2 = this.b.a($$1);
         this.b.a($$0x, $$2);
      });
      $$0.d().forEach(this.b::a);
   }

   public fgi.a a() {
      Map<ffy, String> $$0 = new EnumMap<>(ffy.class);

      for (ffy $$1 : ffy.values()) {
         ffz $$2 = this.b.a($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2.c());
         }
      }

      return new fgi.a(this.b.b().stream().map(ffz::a).toList(), this.b.g(), $$0, this.b.f().stream().map(fgc::a).toList());
   }

   public static record a(List<ffz.a> b, List<fgh.a> c, Map<ffy, String> d, List<fgc.a> e) {
      public static final Codec<fgi.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ffz.a.a.listOf().optionalFieldOf("Objectives", List.of()).forGetter(fgi.a::a),
                  fgh.a.a.listOf().optionalFieldOf("PlayerScores", List.of()).forGetter(fgi.a::b),
                  Codec.unboundedMap(ffy.t, Codec.STRING).optionalFieldOf("DisplaySlots", Map.of()).forGetter(fgi.a::c),
                  fgc.a.a.listOf().optionalFieldOf("Teams", List.of()).forGetter(fgi.a::d)
               )
               .apply($$0, fgi.a::new)
      );

      public List<ffz.a> a() {
         return this.b;
      }

      public List<fgh.a> b() {
         return this.c;
      }

      public Map<ffy, String> c() {
         return this.d;
      }

      public List<fgc.a> d() {
         return this.e;
      }
   }
}
