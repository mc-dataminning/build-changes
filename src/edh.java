import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record edh(ecz b, List<edh.a> c) {
   public static final Codec<edh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ecz.a.fieldOf("fallback").forGetter(edh::a), edh.a.a.listOf().fieldOf("rules").forGetter(edh::b)).apply($$0, edh::new)
   );

   public static edh a(ecz $$0) {
      return new edh($$0, List.of());
   }

   public static edh a(dcv $$0) {
      return a(ecz.a($$0));
   }

   public dpy a(dap $$0, ayd $$1, im $$2) {
      for (edh.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public ecz a() {
      return this.b;
   }

   public List<edh.a> b() {
      return this.c;
   }

   public static record a(dwx b, ecz c) {
      public static final Codec<edh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dwx.b.fieldOf("if_true").forGetter(edh.a::a), ecz.a.fieldOf("then").forGetter(edh.a::b)).apply($$0, edh.a::new)
      );

      public dwx a() {
         return this.b;
      }

      public ecz b() {
         return this.c;
      }
   }
}
