import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ehr(List<ehr.a> c, eii d) {
   public static final Codec<ehr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ehr.a.a.listOf().fieldOf("structures").forGetter(ehr::a), eii.b.fieldOf("placement").forGetter(ehr::b)).apply($$0, ehr::new)
   );
   public static final Codec<ix<ehr>> b = akj.a(lf.aL, a);

   public ehr(ix<ehl> $$0, eii $$1) {
      this(List.of(new ehr.a($$0, 1)), $$1);
   }

   public static ehr.a a(ix<ehl> $$0, int $$1) {
      return new ehr.a($$0, $$1);
   }

   public static ehr.a a(ix<ehl> $$0) {
      return new ehr.a($$0, 1);
   }

   public List<ehr.a> a() {
      return this.c;
   }

   public eii b() {
      return this.d;
   }

   public static record a(ix<ehl> b, int c) {
      public static final Codec<ehr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ehl.b.fieldOf("structure").forGetter(ehr.a::a), axn.j.fieldOf("weight").forGetter(ehr.a::b)).apply($$0, ehr.a::new)
      );

      public ix<ehl> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
