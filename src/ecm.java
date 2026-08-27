import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ecm(List<ecm.a> c, edd d) {
   public static final Codec<ecm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ecm.a.a.listOf().fieldOf("structures").forGetter(ecm::a), edd.b.fieldOf("placement").forGetter(ecm::b)).apply($$0, ecm::new)
   );
   public static final Codec<il<ecm>> b = aiy.a(ki.aG, a);

   public ecm(il<ecg> $$0, edd $$1) {
      this(List.of(new ecm.a($$0, 1)), $$1);
   }

   public static ecm.a a(il<ecg> $$0, int $$1) {
      return new ecm.a($$0, $$1);
   }

   public static ecm.a a(il<ecg> $$0) {
      return new ecm.a($$0, 1);
   }

   public List<ecm.a> a() {
      return this.c;
   }

   public edd b() {
      return this.d;
   }

   public static record a(il<ecg> b, int c) {
      public static final Codec<ecm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ecg.b.fieldOf("structure").forGetter(ecm.a::a), avu.j.fieldOf("weight").forGetter(ecm.a::b)).apply($$0, ecm.a::new)
      );

      public il<ecg> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
