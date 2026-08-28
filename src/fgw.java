import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class fgw extends eza {
   public static final String a = "scoreboard";
   private final fgv b;

   public fgw(fgv $$0) {
      this.b = $$0;
   }

   public void a(fgw.a $$0) {
      $$0.a().forEach(this.b::a);
      $$0.b().forEach(this.b::a);
      $$0.c().forEach(($$0x, $$1) -> {
         fgn $$2 = this.b.a($$1);
         this.b.a($$0x, $$2);
      });
      $$0.d().forEach(this.b::a);
   }

   public fgw.a a() {
      Map<fgm, String> $$0 = new EnumMap<>(fgm.class);

      for (fgm $$1 : fgm.values()) {
         fgn $$2 = this.b.a($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2.c());
         }
      }

      return new fgw.a(this.b.b().stream().map(fgn::a).toList(), this.b.g(), $$0, this.b.f().stream().map(fgq::a).toList());
   }

   public static record a(List<fgn.a> b, List<fgv.a> c, Map<fgm, String> d, List<fgq.a> e) {
      public static final Codec<fgw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  fgn.a.a.listOf().optionalFieldOf("Objectives", List.of()).forGetter(fgw.a::a),
                  fgv.a.a.listOf().optionalFieldOf("PlayerScores", List.of()).forGetter(fgw.a::b),
                  Codec.unboundedMap(fgm.t, Codec.STRING).optionalFieldOf("DisplaySlots", Map.of()).forGetter(fgw.a::c),
                  fgq.a.a.listOf().optionalFieldOf("Teams", List.of()).forGetter(fgw.a::d)
               )
               .apply($$0, fgw.a::new)
      );

      public List<fgn.a> a() {
         return this.b;
      }

      public List<fgv.a> b() {
         return this.c;
      }

      public Map<fgm, String> c() {
         return this.d;
      }

      public List<fgq.a> d() {
         return this.e;
      }
   }
}
