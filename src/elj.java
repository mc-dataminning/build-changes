import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record elj(elb b, List<elj.a> c) {
   public static final Codec<elj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(elb.a.fieldOf("fallback").forGetter(elj::a), elj.a.a.listOf().fieldOf("rules").forGetter(elj::b)).apply($$0, elj::new)
   );

   public static elj a(elb $$0) {
      return new elj($$0, List.of());
   }

   public static elj a(dkm $$0) {
      return a(elb.a($$0));
   }

   public dxv a(dig $$0, bam $$1, jh $$2) {
      for (elj.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public elb a() {
      return this.b;
   }

   public List<elj.a> b() {
      return this.c;
   }

   public static record a(eex b, elb c) {
      public static final Codec<elj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eex.b.fieldOf("if_true").forGetter(elj.a::a), elb.a.fieldOf("then").forGetter(elj.a::b)).apply($$0, elj.a::new)
      );

      public eex a() {
         return this.b;
      }

      public elb b() {
         return this.c;
      }
   }
}
