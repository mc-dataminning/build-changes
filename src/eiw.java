import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eiw(List<eiw.a> c, ejn d) {
   public static final Codec<eiw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eiw.a.a.listOf().fieldOf("structures").forGetter(eiw::a), ejn.b.fieldOf("placement").forGetter(eiw::b)).apply($$0, eiw::new)
   );
   public static final Codec<jj<eiw>> b = akg.a(lr.aS, a);

   public eiw(jj<eiq> $$0, ejn $$1) {
      this(List.of(new eiw.a($$0, 1)), $$1);
   }

   public static eiw.a a(jj<eiq> $$0, int $$1) {
      return new eiw.a($$0, $$1);
   }

   public static eiw.a a(jj<eiq> $$0) {
      return new eiw.a($$0, 1);
   }

   public List<eiw.a> a() {
      return this.c;
   }

   public ejn b() {
      return this.d;
   }

   public static record a(jj<eiq> b, int c) {
      public static final Codec<eiw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eiq.b.fieldOf("structure").forGetter(eiw.a::a), axm.l.fieldOf("weight").forGetter(eiw.a::b)).apply($$0, eiw.a::new)
      );

      public jj<eiq> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
