import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class fgy extends ezc {
   public static final String a = "scoreboard";
   private final fgx b;

   public fgy(fgx $$0) {
      this.b = $$0;
   }

   public void a(fgy.a $$0) {
      $$0.a().forEach(this.b::a);
      $$0.b().forEach(this.b::a);
      $$0.c().forEach(($$0x, $$1) -> {
         fgp $$2 = this.b.a($$1);
         this.b.a($$0x, $$2);
      });
      $$0.d().forEach(this.b::a);
   }

   public fgy.a a() {
      Map<fgo, String> $$0 = new EnumMap<>(fgo.class);

      for (fgo $$1 : fgo.values()) {
         fgp $$2 = this.b.a($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2.c());
         }
      }

      return new fgy.a(this.b.b().stream().map(fgp::a).toList(), this.b.g(), $$0, this.b.f().stream().map(fgs::a).toList());
   }

   public static record a(List<fgp.a> b, List<fgx.a> c, Map<fgo, String> d, List<fgs.a> e) {
      public static final Codec<fgy.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  fgp.a.a.listOf().optionalFieldOf("Objectives", List.of()).forGetter(fgy.a::a),
                  fgx.a.a.listOf().optionalFieldOf("PlayerScores", List.of()).forGetter(fgy.a::b),
                  Codec.unboundedMap(fgo.t, Codec.STRING).optionalFieldOf("DisplaySlots", Map.of()).forGetter(fgy.a::c),
                  fgs.a.a.listOf().optionalFieldOf("Teams", List.of()).forGetter(fgy.a::d)
               )
               .apply($$0, fgy.a::new)
      );

      public List<fgp.a> a() {
         return this.b;
      }

      public List<fgx.a> b() {
         return this.c;
      }

      public Map<fgo, String> c() {
         return this.d;
      }

      public List<fgs.a> d() {
         return this.e;
      }
   }
}
