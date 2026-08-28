import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class fgd extends eyh {
   public static final String a = "scoreboard";
   private final fgc b;

   public fgd(fgc $$0) {
      this.b = $$0;
   }

   public void a(fgd.a $$0) {
      $$0.a().forEach(this.b::a);
      $$0.b().forEach(this.b::a);
      $$0.c().forEach(($$0x, $$1) -> {
         ffu $$2 = this.b.a($$1);
         this.b.a($$0x, $$2);
      });
      $$0.d().forEach(this.b::a);
   }

   public fgd.a a() {
      Map<fft, String> $$0 = new EnumMap<>(fft.class);

      for (fft $$1 : fft.values()) {
         ffu $$2 = this.b.a($$1);
         if ($$2 != null) {
            $$0.put($$1, $$2.c());
         }
      }

      return new fgd.a(this.b.b().stream().map(ffu::a).toList(), this.b.g(), $$0, this.b.f().stream().map(ffx::a).toList());
   }

   public static record a(List<ffu.a> b, List<fgc.a> c, Map<fft, String> d, List<ffx.a> e) {
      public static final Codec<fgd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ffu.a.a.listOf().optionalFieldOf("Objectives", List.of()).forGetter(fgd.a::a),
                  fgc.a.a.listOf().optionalFieldOf("PlayerScores", List.of()).forGetter(fgd.a::b),
                  Codec.unboundedMap(fft.t, Codec.STRING).optionalFieldOf("DisplaySlots", Map.of()).forGetter(fgd.a::c),
                  ffx.a.a.listOf().optionalFieldOf("Teams", List.of()).forGetter(fgd.a::d)
               )
               .apply($$0, fgd.a::new)
      );

      public List<ffu.a> a() {
         return this.b;
      }

      public List<fgc.a> b() {
         return this.c;
      }

      public Map<fft, String> c() {
         return this.d;
      }

      public List<ffx.a> d() {
         return this.e;
      }
   }
}
