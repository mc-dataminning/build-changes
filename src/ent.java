import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ent(List<ent.a> c, eok d) {
   public static final Codec<ent> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ent.a.a.listOf().fieldOf("structures").forGetter(ent::a), eok.b.fieldOf("placement").forGetter(ent::b)).apply($$0, ent::new)
   );
   public static final Codec<jr<ent>> b = akr.a(mc.aW, a);

   public ent(jr<enn> $$0, eok $$1) {
      this(List.of(new ent.a($$0, 1)), $$1);
   }

   public static ent.a a(jr<enn> $$0, int $$1) {
      return new ent.a($$0, $$1);
   }

   public static ent.a a(jr<enn> $$0) {
      return new ent.a($$0, 1);
   }

   public List<ent.a> a() {
      return this.c;
   }

   public eok b() {
      return this.d;
   }

   public static record a(jr<enn> b, int c) {
      public static final Codec<ent.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(enn.b.fieldOf("structure").forGetter(ent.a::a), ayi.m.fieldOf("weight").forGetter(ent.a::b)).apply($$0, ent.a::new)
      );

      public jr<enn> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
