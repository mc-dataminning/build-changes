import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cwb(List<cwb.a> d) {
   public static final cwb a = new cwb(List.of());
   public static final Codec<cwb> b = cwb.a.a.listOf().xmap(cwb::new, cwb::a);
   public static final ys<wf, cwb> c = cwb.a.b.a(yq.a()).a(cwb::new, cwb::a);

   public cwb a(cwb.a $$0) {
      return new cwb(ac.a(this.d, $$0));
   }

   public List<cwb.a> a() {
      return this.d;
   }

   public static record a(iw<bqr> c, int d) {
      public static final Codec<cwb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ld.d.r().fieldOf("id").forGetter(cwb.a::b), Codec.INT.optionalFieldOf("duration", 160).forGetter(cwb.a::c)).apply($$0, cwb.a::new)
      );
      public static final ys<wf, cwb.a> b = ys.a(yq.b(le.R), cwb.a::b, yq.f, cwb.a::c, cwb.a::new);

      public bqt a() {
         return new bqt(this.c, this.d);
      }

      public iw<bqr> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
