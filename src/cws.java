import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cws(List<cws.a> d) {
   public static final cws a = new cws(List.of());
   public static final Codec<cws> b = cws.a.a.listOf().xmap(cws::new, cws::a);
   public static final yv<wi, cws> c = cws.a.b.a(yt.a()).a(cws::new, cws::a);

   public cws a(cws.a $$0) {
      return new cws(ac.a(this.d, $$0));
   }

   public List<cws.a> a() {
      return this.d;
   }

   public static record a(ix<bra> c, int d) {
      public static final Codec<cws.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(le.d.r().fieldOf("id").forGetter(cws.a::b), Codec.INT.lenientOptionalFieldOf("duration", 160).forGetter(cws.a::c))
               .apply($$0, cws.a::new)
      );
      public static final yv<wi, cws.a> b = yv.a(yt.b(lf.R), cws.a::b, yt.f, cws.a::c, cws.a::new);

      public brc a() {
         return new brc(this.c, this.d);
      }

      public ix<bra> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
