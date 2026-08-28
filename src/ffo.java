import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class ffo extends exs {
   public static final String a = "scoreboard";
   private final ffn b;

   public ffo(ffn $$0) {
      this.b = $$0;
   }

   public void a(ffo.a $$0) {
      $$0.a().forEach(this.b::a);
      $$0.b().forEach(this.b::a);
      $$0.c().forEach(($$0x, $$1) -> {
         fff $$2 = this.b.a($$1);
         this.b.a($$0x, $$2);
      });
      $$0.d().forEach(this.b::a);
   }

   public ffo.a a() {
      Map<ffe, String> $$0 = new EnumMap<>(ffe.class);

      for (ffe $$1 : ffe.values()) {
         fff $$2 = this.b.a($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2.c());
         }
      }

      return new ffo.a(this.b.b().stream().map(fff::a).toList(), this.b.g(), $$0, this.b.f().stream().map(ffi::a).toList());
   }

   public static record a(List<fff.a> b, List<ffn.a> c, Map<ffe, String> d, List<ffi.a> e) {
      public static final Codec<ffo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  fff.a.a.listOf().optionalFieldOf("Objectives", List.of()).forGetter(ffo.a::a),
                  ffn.a.a.listOf().optionalFieldOf("PlayerScores", List.of()).forGetter(ffo.a::b),
                  Codec.unboundedMap(ffe.t, Codec.STRING).optionalFieldOf("DisplaySlots", Map.of()).forGetter(ffo.a::c),
                  ffi.a.a.listOf().optionalFieldOf("Teams", List.of()).forGetter(ffo.a::d)
               )
               .apply($$0, ffo.a::new)
      );

      public List<fff.a> a() {
         return this.b;
      }

      public List<ffn.a> b() {
         return this.c;
      }

      public Map<ffe, String> c() {
         return this.d;
      }

      public List<ffi.a> d() {
         return this.e;
      }
   }
}
