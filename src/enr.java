import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record enr(List<enr.a> c, eoi d) {
   public static final Codec<enr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(enr.a.a.listOf().fieldOf("structures").forGetter(enr::a), eoi.b.fieldOf("placement").forGetter(enr::b)).apply($$0, enr::new)
   );
   public static final Codec<jr<enr>> b = akr.a(mc.aW, a);

   public enr(jr<enl> $$0, eoi $$1) {
      this(List.of(new enr.a($$0, 1)), $$1);
   }

   public static enr.a a(jr<enl> $$0, int $$1) {
      return new enr.a($$0, $$1);
   }

   public static enr.a a(jr<enl> $$0) {
      return new enr.a($$0, 1);
   }

   public List<enr.a> a() {
      return this.c;
   }

   public eoi b() {
      return this.d;
   }

   public static record a(jr<enl> b, int c) {
      public static final Codec<enr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(enl.b.fieldOf("structure").forGetter(enr.a::a), ayi.m.fieldOf("weight").forGetter(enr.a::b)).apply($$0, enr.a::new)
      );

      public jr<enl> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
