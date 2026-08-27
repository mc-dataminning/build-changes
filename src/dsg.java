import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dsg(List<dsg.a> c, dsx d) {
   public static final Codec<dsg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dsg.a.a.listOf().fieldOf("structures").forGetter(dsg::a), dsx.b.fieldOf("placement").forGetter(dsg::b)).apply($$0, dsg::new)
   );
   public static final Codec<he<dsg>> b = acm.a(jc.aB, a);

   public dsg(he<dsa> $$0, dsx $$1) {
      this(List.of(new dsg.a($$0, 1)), $$1);
   }

   public static dsg.a a(he<dsa> $$0, int $$1) {
      return new dsg.a($$0, $$1);
   }

   public static dsg.a a(he<dsa> $$0) {
      return new dsg.a($$0, 1);
   }

   public List<dsg.a> a() {
      return this.c;
   }

   public dsx b() {
      return this.d;
   }

   public static record a(he<dsa> b, int c) {
      public static final Codec<dsg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dsa.b.fieldOf("structure").forGetter(dsg.a::a), aoi.j.fieldOf("weight").forGetter(dsg.a::b)).apply($$0, dsg.a::new)
      );

      public he<dsa> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
