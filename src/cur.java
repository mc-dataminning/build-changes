import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cur(List<cur.a> d) {
   public static final cur a = new cur(List.of());
   public static final Codec<cur> b = cur.a.a.listOf().xmap(cur::new, cur::a);
   public static final yg<vt, cur> c = cur.a.b.a(ye.a()).a(cur::new, cur::a);

   public cur a(cur.a $$0) {
      return new cur(ac.a(this.d, $$0));
   }

   public List<cur.a> a() {
      return this.d;
   }

   public static record a(in<bpk> c, int d) {
      public static final Codec<cur.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kt.d.r().fieldOf("id").forGetter(cur.a::b), Codec.INT.optionalFieldOf("duration", 160).forGetter(cur.a::c)).apply($$0, cur.a::new)
      );
      public static final yg<vt, cur.a> b = yg.a(ye.b(ku.R), cur.a::b, ye.f, cur.a::c, cur.a::new);

      public bpm a() {
         return new bpm(this.c, this.d);
      }

      public in<bpk> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
