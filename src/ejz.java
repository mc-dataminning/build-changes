import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ejz(List<ejz.a> c, ekq d) {
   public static final Codec<ejz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ejz.a.a.listOf().fieldOf("structures").forGetter(ejz::a), ekq.b.fieldOf("placement").forGetter(ejz::b)).apply($$0, ejz::new)
   );
   public static final Codec<ja<ejz>> b = akp.a(li.aL, a);

   public ejz(ja<ejt> $$0, ekq $$1) {
      this(List.of(new ejz.a($$0, 1)), $$1);
   }

   public static ejz.a a(ja<ejt> $$0, int $$1) {
      return new ejz.a($$0, $$1);
   }

   public static ejz.a a(ja<ejt> $$0) {
      return new ejz.a($$0, 1);
   }

   public List<ejz.a> a() {
      return this.c;
   }

   public ekq b() {
      return this.d;
   }

   public static record a(ja<ejt> b, int c) {
      public static final Codec<ejz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ejt.b.fieldOf("structure").forGetter(ejz.a::a), axu.j.fieldOf("weight").forGetter(ejz.a::b)).apply($$0, ejz.a::new)
      );

      public ja<ejt> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
