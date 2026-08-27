import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dwa(dvs b, List<dwa.a> c) {
   public static final Codec<dwa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dvs.a.fieldOf("fallback").forGetter(dwa::a), dwa.a.a.listOf().fieldOf("rules").forGetter(dwa::b)).apply($$0, dwa::new)
   );

   public static dwa a(dvs $$0) {
      return new dwa($$0, List.of());
   }

   public static dwa a(cwj $$0) {
      return a(dvs.a($$0));
   }

   public dja a(cud $$0, aup $$1, hx $$2) {
      for (dwa.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public dvs a() {
      return this.b;
   }

   public List<dwa.a> b() {
      return this.c;
   }

   public static record a(dpq b, dvs c) {
      public static final Codec<dwa.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dpq.b.fieldOf("if_true").forGetter(dwa.a::a), dvs.a.fieldOf("then").forGetter(dwa.a::b)).apply($$0, dwa.a::new)
      );

      public dpq a() {
         return this.b;
      }

      public dvs b() {
         return this.c;
      }
   }
}
