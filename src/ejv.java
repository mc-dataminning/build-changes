import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ejv(List<ejv.a> c, ekm d) {
   public static final Codec<ejv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ejv.a.a.listOf().fieldOf("structures").forGetter(ejv::a), ekm.b.fieldOf("placement").forGetter(ejv::b)).apply($$0, ejv::new)
   );
   public static final Codec<jm<ejv>> b = akn.a(lu.aT, a);

   public ejv(jm<ejp> $$0, ekm $$1) {
      this(List.of(new ejv.a($$0, 1)), $$1);
   }

   public static ejv.a a(jm<ejp> $$0, int $$1) {
      return new ejv.a($$0, $$1);
   }

   public static ejv.a a(jm<ejp> $$0) {
      return new ejv.a($$0, 1);
   }

   public List<ejv.a> a() {
      return this.c;
   }

   public ekm b() {
      return this.d;
   }

   public static record a(jm<ejp> b, int c) {
      public static final Codec<ejv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ejp.b.fieldOf("structure").forGetter(ejv.a::a), axw.l.fieldOf("weight").forGetter(ejv.a::b)).apply($$0, ejv.a::new)
      );

      public jm<ejp> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
