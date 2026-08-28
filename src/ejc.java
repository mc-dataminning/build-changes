import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ejc(List<ejc.a> c, ejt d) {
   public static final Codec<ejc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ejc.a.a.listOf().fieldOf("structures").forGetter(ejc::a), ejt.b.fieldOf("placement").forGetter(ejc::b)).apply($$0, ejc::new)
   );
   public static final Codec<jj<ejc>> b = akg.a(lr.aS, a);

   public ejc(jj<eiw> $$0, ejt $$1) {
      this(List.of(new ejc.a($$0, 1)), $$1);
   }

   public static ejc.a a(jj<eiw> $$0, int $$1) {
      return new ejc.a($$0, $$1);
   }

   public static ejc.a a(jj<eiw> $$0) {
      return new ejc.a($$0, 1);
   }

   public List<ejc.a> a() {
      return this.c;
   }

   public ejt b() {
      return this.d;
   }

   public static record a(jj<eiw> b, int c) {
      public static final Codec<ejc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eiw.b.fieldOf("structure").forGetter(ejc.a::a), axo.l.fieldOf("weight").forGetter(ejc.a::b)).apply($$0, ejc.a::new)
      );

      public jj<eiw> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
