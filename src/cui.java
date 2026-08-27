import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cui(List<cui.a> d) {
   public static final cui a = new cui(List.of());
   public static final Codec<cui> b = cui.a.a.listOf().xmap(cui::new, cui::a);
   public static final ye<vr, cui> c = cui.a.b.a(yc.a()).a(cui::new, cui::a);

   public cui a(cui.a $$0) {
      return new cui(ac.a(this.d, $$0));
   }

   public List<cui.a> a() {
      return this.d;
   }

   public static record a(il<bpf> c, int d) {
      public static final Codec<cui.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kr.d.r().fieldOf("id").forGetter(cui.a::b), Codec.INT.optionalFieldOf("duration", 160).forGetter(cui.a::c)).apply($$0, cui.a::new)
      );
      public static final ye<vr, cui.a> b = ye.a(yc.b(ks.Q), cui.a::b, yc.f, cui.a::c, cui.a::new);

      public bph a() {
         return new bph(this.c, this.d);
      }

      public il<bpf> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
