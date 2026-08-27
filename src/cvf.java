import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cvf(List<cvf.a> d) {
   public static final cvf a = new cvf(List.of());
   public static final Codec<cvf> b = cvf.a.a.listOf().xmap(cvf::new, cvf::a);
   public static final yq<wd, cvf> c = cvf.a.b.a(yo.a()).a(cvf::new, cvf::a);

   public cvf a(cvf.a $$0) {
      return new cvf(ac.a(this.d, $$0));
   }

   public List<cvf.a> a() {
      return this.d;
   }

   public static record a(iv<bpv> c, int d) {
      public static final Codec<cvf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(lc.d.r().fieldOf("id").forGetter(cvf.a::b), Codec.INT.optionalFieldOf("duration", 160).forGetter(cvf.a::c)).apply($$0, cvf.a::new)
      );
      public static final yq<wd, cvf.a> b = yq.a(yo.b(ld.R), cvf.a::b, yo.f, cvf.a::c, cvf.a::new);

      public bpx a() {
         return new bpx(this.c, this.d);
      }

      public iv<bpv> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
