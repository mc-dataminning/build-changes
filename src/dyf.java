import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dyf(dxx b, List<dyf.a> c) {
   public static final Codec<dyf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dxx.a.fieldOf("fallback").forGetter(dyf::a), dyf.a.a.listOf().fieldOf("rules").forGetter(dyf::b)).apply($$0, dyf::new)
   );

   public static dyf a(dxx $$0) {
      return new dyf($$0, List.of());
   }

   public static dyf a(cyo $$0) {
      return a(dxx.a($$0));
   }

   public dlf a(cwi $$0, awo $$1, hz $$2) {
      for (dyf.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public dxx a() {
      return this.b;
   }

   public List<dyf.a> b() {
      return this.c;
   }

   public static record a(drv b, dxx c) {
      public static final Codec<dyf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(drv.b.fieldOf("if_true").forGetter(dyf.a::a), dxx.a.fieldOf("then").forGetter(dyf.a::b)).apply($$0, dyf.a::new)
      );

      public drv a() {
         return this.b;
      }

      public dxx b() {
         return this.c;
      }
   }
}
