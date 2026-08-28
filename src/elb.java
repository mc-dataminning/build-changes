import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record elb(ekt b, List<elb.a> c) {
   public static final Codec<elb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ekt.a.fieldOf("fallback").forGetter(elb::a), elb.a.a.listOf().fieldOf("rules").forGetter(elb::b)).apply($$0, elb::new)
   );

   public static elb a(ekt $$0) {
      return new elb($$0, List.of());
   }

   public static elb a(dke $$0) {
      return a(ekt.a($$0));
   }

   public dxn a(dhy $$0, bam $$1, jh $$2) {
      for (elb.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public ekt a() {
      return this.b;
   }

   public List<elb.a> b() {
      return this.c;
   }

   public static record a(eep b, ekt c) {
      public static final Codec<elb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eep.b.fieldOf("if_true").forGetter(elb.a::a), ekt.a.fieldOf("then").forGetter(elb.a::b)).apply($$0, elb.a::new)
      );

      public eep a() {
         return this.b;
      }

      public ekt b() {
         return this.c;
      }
   }
}
