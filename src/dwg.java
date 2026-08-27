import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dwg(List<dwg.a> c, dwx d) {
   public static final Codec<dwg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dwg.a.a.listOf().fieldOf("structures").forGetter(dwg::a), dwx.b.fieldOf("placement").forGetter(dwg::b)).apply($$0, dwg::new)
   );
   public static final Codec<ib<dwg>> b = afs.a(jz.aC, a);

   public dwg(ib<dwa> $$0, dwx $$1) {
      this(List.of(new dwg.a($$0, 1)), $$1);
   }

   public static dwg.a a(ib<dwa> $$0, int $$1) {
      return new dwg.a($$0, $$1);
   }

   public static dwg.a a(ib<dwa> $$0) {
      return new dwg.a($$0, 1);
   }

   public List<dwg.a> a() {
      return this.c;
   }

   public dwx b() {
      return this.d;
   }

   public static record a(ib<dwa> b, int c) {
      public static final Codec<dwg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dwa.b.fieldOf("structure").forGetter(dwg.a::a), asg.j.fieldOf("weight").forGetter(dwg.a::b)).apply($$0, dwg.a::new)
      );

      public ib<dwa> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
