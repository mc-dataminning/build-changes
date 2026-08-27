import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cwu(List<cwu.a> d) {
   public static final cwu a = new cwu(List.of());
   public static final Codec<cwu> b = cwu.a.a.listOf().xmap(cwu::new, cwu::a);
   public static final yv<wi, cwu> c = cwu.a.b.a(yt.a()).a(cwu::new, cwu::a);

   public cwu a(cwu.a $$0) {
      return new cwu(ac.a(this.d, $$0));
   }

   public List<cwu.a> a() {
      return this.d;
   }

   public static record a(ix<brc> c, int d) {
      public static final Codec<cwu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(le.d.r().fieldOf("id").forGetter(cwu.a::b), Codec.INT.lenientOptionalFieldOf("duration", 160).forGetter(cwu.a::c))
               .apply($$0, cwu.a::new)
      );
      public static final yv<wi, cwu.a> b = yv.a(yt.b(lf.R), cwu.a::b, yt.f, cwu.a::c, cwu.a::new);

      public bre a() {
         return new bre(this.c, this.d);
      }

      public ix<brc> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
