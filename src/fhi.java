import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class fhi extends ezm {
   public static final String a = "scoreboard";
   private final fhh b;

   public fhi(fhh $$0) {
      this.b = $$0;
   }

   public void a(fhi.a $$0) {
      $$0.a().forEach(this.b::a);
      $$0.b().forEach(this.b::a);
      $$0.c().forEach(($$0x, $$1) -> {
         fgz $$2 = this.b.a($$1);
         this.b.a($$0x, $$2);
      });
      $$0.d().forEach(this.b::a);
   }

   public fhi.a a() {
      Map<fgy, String> $$0 = new EnumMap<>(fgy.class);

      for (fgy $$1 : fgy.values()) {
         fgz $$2 = this.b.a($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2.c());
         }
      }

      return new fhi.a(this.b.b().stream().map(fgz::a).toList(), this.b.g(), $$0, this.b.f().stream().map(fhc::a).toList());
   }

   public static record a(List<fgz.a> b, List<fhh.a> c, Map<fgy, String> d, List<fhc.a> e) {
      public static final Codec<fhi.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  fgz.a.a.listOf().optionalFieldOf("Objectives", List.of()).forGetter(fhi.a::a),
                  fhh.a.a.listOf().optionalFieldOf("PlayerScores", List.of()).forGetter(fhi.a::b),
                  Codec.unboundedMap(fgy.t, Codec.STRING).optionalFieldOf("DisplaySlots", Map.of()).forGetter(fhi.a::c),
                  fhc.a.a.listOf().optionalFieldOf("Teams", List.of()).forGetter(fhi.a::d)
               )
               .apply($$0, fhi.a::new)
      );

      public List<fgz.a> a() {
         return this.b;
      }

      public List<fhh.a> b() {
         return this.c;
      }

      public Map<fgy, String> c() {
         return this.d;
      }

      public List<fhc.a> d() {
         return this.e;
      }
   }
}
