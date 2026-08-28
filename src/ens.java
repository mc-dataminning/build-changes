import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ens(List<ens.a> c, eoj d) {
   public static final Codec<ens> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ens.a.a.listOf().fieldOf("structures").forGetter(ens::a), eoj.b.fieldOf("placement").forGetter(ens::b)).apply($$0, ens::new)
   );
   public static final Codec<jr<ens>> b = akr.a(mc.aW, a);

   public ens(jr<enm> $$0, eoj $$1) {
      this(List.of(new ens.a($$0, 1)), $$1);
   }

   public static ens.a a(jr<enm> $$0, int $$1) {
      return new ens.a($$0, $$1);
   }

   public static ens.a a(jr<enm> $$0) {
      return new ens.a($$0, 1);
   }

   public List<ens.a> a() {
      return this.c;
   }

   public eoj b() {
      return this.d;
   }

   public static record a(jr<enm> b, int c) {
      public static final Codec<ens.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(enm.b.fieldOf("structure").forGetter(ens.a::a), ayi.m.fieldOf("weight").forGetter(ens.a::b)).apply($$0, ens.a::new)
      );

      public jr<enm> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
