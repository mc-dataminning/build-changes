import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ekm(eke b, List<ekm.a> c) {
   public static final Codec<ekm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eke.a.fieldOf("fallback").forGetter(ekm::a), ekm.a.a.listOf().fieldOf("rules").forGetter(ekm::b)).apply($$0, ekm::new)
   );

   public static ekm a(eke $$0) {
      return new ekm($$0, List.of());
   }

   public static ekm a(djn $$0) {
      return a(eke.a($$0));
   }

   public dwy a(dhh $$0, azh $$1, ji $$2) {
      for (ekm.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public eke a() {
      return this.b;
   }

   public List<ekm.a> b() {
      return this.c;
   }

   public static record a(eea b, eke c) {
      public static final Codec<ekm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eea.b.fieldOf("if_true").forGetter(ekm.a::a), eke.a.fieldOf("then").forGetter(ekm.a::b)).apply($$0, ekm.a::new)
      );

      public eea a() {
         return this.b;
      }

      public eke b() {
         return this.c;
      }
   }
}
