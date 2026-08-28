import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class ffw extends eya {
   public static final String a = "scoreboard";
   private final ffv b;

   public ffw(ffv $$0) {
      this.b = $$0;
   }

   public void a(ffw.a $$0) {
      $$0.a().forEach(this.b::a);
      $$0.b().forEach(this.b::a);
      $$0.c().forEach(($$0x, $$1) -> {
         ffn $$2 = this.b.a($$1);
         this.b.a($$0x, $$2);
      });
      $$0.d().forEach(this.b::a);
   }

   public ffw.a a() {
      Map<ffm, String> $$0 = new EnumMap<>(ffm.class);

      for (ffm $$1 : ffm.values()) {
         ffn $$2 = this.b.a($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2.c());
         }
      }

      return new ffw.a(this.b.b().stream().map(ffn::a).toList(), this.b.g(), $$0, this.b.f().stream().map(ffq::a).toList());
   }

   public static record a(List<ffn.a> b, List<ffv.a> c, Map<ffm, String> d, List<ffq.a> e) {
      public static final Codec<ffw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ffn.a.a.listOf().optionalFieldOf("Objectives", List.of()).forGetter(ffw.a::a),
                  ffv.a.a.listOf().optionalFieldOf("PlayerScores", List.of()).forGetter(ffw.a::b),
                  Codec.unboundedMap(ffm.t, Codec.STRING).optionalFieldOf("DisplaySlots", Map.of()).forGetter(ffw.a::c),
                  ffq.a.a.listOf().optionalFieldOf("Teams", List.of()).forGetter(ffw.a::d)
               )
               .apply($$0, ffw.a::new)
      );

      public List<ffn.a> a() {
         return this.b;
      }

      public List<ffv.a> b() {
         return this.c;
      }

      public Map<ffm, String> c() {
         return this.d;
      }

      public List<ffq.a> d() {
         return this.e;
      }
   }
}
