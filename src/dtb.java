import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dtb(dst b, List<dtb.a> c) {
   public static final Codec<dtb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dst.a.fieldOf("fallback").forGetter(dtb::a), dtb.a.a.listOf().fieldOf("rules").forGetter(dtb::b)).apply($$0, dtb::new)
   );

   public static dtb a(dst $$0) {
      return new dtb($$0, List.of());
   }

   public static dtb a(cua $$0) {
      return a(dst.a($$0));
   }

   public dgb a(crt $$0, ate $$1, ht $$2) {
      for (dtb.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public dst a() {
      return this.b;
   }

   public List<dtb.a> b() {
      return this.c;
   }

   public static record a(dmr b, dst c) {
      public static final Codec<dtb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dmr.b.fieldOf("if_true").forGetter(dtb.a::a), dst.a.fieldOf("then").forGetter(dtb.a::b)).apply($$0, dtb.a::new)
      );

      public dmr a() {
         return this.b;
      }

      public dst b() {
         return this.c;
      }
   }
}
